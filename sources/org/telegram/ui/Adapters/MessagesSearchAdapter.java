package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.RecyclerListView;
public class MessagesSearchAdapter extends RecyclerListView.SelectionAdapter {
    public int flickerCount;
    private boolean isSavedMessages;
    public int loadedCount;
    private Context mContext;
    private final Theme.ResourcesProvider resourcesProvider;
    private int searchType;
    private HashSet<Integer> messageIds = new HashSet<>();
    private ArrayList<MessageObject> searchResultMessages = new ArrayList<>();
    private int currentAccount = UserConfig.selectedAccount;

    public MessagesSearchAdapter(Context context, Theme.ResourcesProvider resourcesProvider, int i, boolean z) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
        this.searchType = i;
        this.isSavedMessages = z;
    }

    @Override
    public void notifyDataSetChanged() {
        int itemCount = getItemCount();
        this.searchResultMessages.clear();
        this.messageIds.clear();
        ArrayList<MessageObject> foundMessageObjects = this.searchType == 0 ? MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects() : HashtagSearchController.getInstance(this.currentAccount).getMessages(this.searchType);
        int i = 0;
        for (int i2 = 0; i2 < foundMessageObjects.size(); i2++) {
            MessageObject messageObject = foundMessageObjects.get(i2);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !this.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                this.searchResultMessages.add(messageObject);
                this.messageIds.add(Integer.valueOf(messageObject.getId()));
            }
        }
        int i3 = this.flickerCount;
        this.loadedCount = this.searchResultMessages.size();
        if (this.searchType != 0) {
            if ((!HashtagSearchController.getInstance(this.currentAccount).isEndReached(this.searchType)) && this.loadedCount != 0) {
                i = Utilities.clamp(HashtagSearchController.getInstance(this.currentAccount).getCount(this.searchType) - this.loadedCount, 3, 0);
            }
            this.flickerCount = i;
        } else {
            if ((!MediaDataController.getInstance(this.currentAccount).searchEndReached()) && this.loadedCount != 0) {
                i = Utilities.clamp(MediaDataController.getInstance(this.currentAccount).getSearchCount() - this.loadedCount, 3, 0);
            }
            this.flickerCount = i;
        }
        int itemCount2 = getItemCount();
        if (itemCount < itemCount2) {
            notifyItemRangeChanged(itemCount - i3, i3);
            notifyItemRangeInserted(itemCount, itemCount2 - itemCount);
            return;
        }
        super.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return this.searchResultMessages.size() + this.flickerCount;
    }

    public Object getItem(int i) {
        if (i < 0 || i >= this.searchResultMessages.size()) {
            return null;
        }
        return this.searchResultMessages.get(i);
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getItemViewType() == 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        DialogCell dialogCell;
        if (i == 0) {
            dialogCell = new DialogCell(null, this.mContext, false, true, this.currentAccount, this.resourcesProvider);
        } else if (i != 1) {
            dialogCell = null;
        } else {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, this.resourcesProvider);
            flickerLoadingView.setIsSingleCell(true);
            flickerLoadingView.setViewType(7);
            dialogCell = flickerLoadingView;
        }
        dialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerListView.Holder(dialogCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        int i3;
        if (viewHolder.getItemViewType() == 0) {
            DialogCell dialogCell = (DialogCell) viewHolder.itemView;
            dialogCell.useSeparator = true;
            dialogCell.isSavedDialog = true;
            MessageObject messageObject = (MessageObject) getItem(i);
            long dialogId = messageObject.getDialogId();
            int i4 = messageObject.messageOwner.date;
            if (this.isSavedMessages) {
                dialogId = messageObject.getSavedDialogId();
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from;
                if (tLRPC$MessageFwdHeader == null || ((i3 = tLRPC$MessageFwdHeader.date) == 0 && tLRPC$MessageFwdHeader.saved_date == 0)) {
                    i2 = tLRPC$Message.date;
                } else if (i3 == 0) {
                    i2 = tLRPC$MessageFwdHeader.saved_date;
                } else {
                    i4 = i3;
                    z = false;
                }
                i4 = i2;
                z = false;
            } else {
                if (messageObject.isOutOwner()) {
                    dialogId = messageObject.getFromChatId();
                }
                z = true;
            }
            dialogCell.setDialog(dialogId, messageObject, i4, z, false);
        }
    }

    @Override
    public int getItemViewType(int i) {
        return i < this.searchResultMessages.size() ? 0 : 1;
    }
}
