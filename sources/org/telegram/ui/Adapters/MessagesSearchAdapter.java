package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageFwdHeader;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Components.RecyclerListView;
public class MessagesSearchAdapter extends RecyclerListView.SelectionAdapter {
    public int loadedCount;
    private Context mContext;
    private final Theme.ResourcesProvider resourcesProvider;
    private HashSet<Integer> messageIds = new HashSet<>();
    private ArrayList<MessageObject> searchResultMessages = new ArrayList<>();
    private int currentAccount = UserConfig.selectedAccount;

    @Override
    public long getItemId(int i) {
        return i;
    }

    public MessagesSearchAdapter(Context context, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.mContext = context;
    }

    @Override
    public void notifyDataSetChanged() {
        this.searchResultMessages.clear();
        this.messageIds.clear();
        ArrayList<MessageObject> foundMessageObjects = MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects();
        for (int i = 0; i < foundMessageObjects.size(); i++) {
            MessageObject messageObject = foundMessageObjects.get(i);
            if ((!messageObject.hasValidGroupId() || messageObject.isPrimaryGroupMessage) && !this.messageIds.contains(Integer.valueOf(messageObject.getId()))) {
                this.searchResultMessages.add(messageObject);
                this.messageIds.add(Integer.valueOf(messageObject.getId()));
            }
        }
        this.loadedCount = this.searchResultMessages.size();
        super.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return this.searchResultMessages.size();
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
        View dialogCell;
        if (i == 0) {
            dialogCell = new DialogCell(null, this.mContext, false, true, this.currentAccount, this.resourcesProvider);
        } else {
            dialogCell = i != 1 ? null : new LoadingCell(this.mContext);
        }
        dialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerListView.Holder(dialogCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long dialogId;
        int i2;
        int i3;
        if (viewHolder.getItemViewType() == 0) {
            DialogCell dialogCell = (DialogCell) viewHolder.itemView;
            dialogCell.useSeparator = true;
            dialogCell.isSavedDialog = true;
            MessageObject messageObject = (MessageObject) getItem(i);
            if (messageObject.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                dialogId = messageObject.getSavedDialogId();
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = tLRPC$Message.fwd_from;
                if (tLRPC$MessageFwdHeader == null || ((i3 = tLRPC$MessageFwdHeader.date) == 0 && tLRPC$MessageFwdHeader.saved_date == 0)) {
                    i2 = tLRPC$Message.date;
                } else {
                    if (i3 == 0) {
                        i2 = tLRPC$MessageFwdHeader.saved_date;
                    }
                    dialogCell.setDialog(dialogId, messageObject, i3, false, false);
                }
            } else {
                dialogId = messageObject.getDialogId();
                i2 = messageObject.messageOwner.date;
            }
            i3 = i2;
            dialogCell.setDialog(dialogId, messageObject, i3, false, false);
        }
    }

    @Override
    public int getItemViewType(int i) {
        return i < this.searchResultMessages.size() ? 0 : 1;
    }
}
