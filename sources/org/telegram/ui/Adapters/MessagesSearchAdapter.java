package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Components.RecyclerListView;

public class MessagesSearchAdapter extends RecyclerListView.SelectionAdapter {
    private Context mContext;
    private final Theme.ResourcesProvider resourcesProvider;
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
        this.searchResultMessages = MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects();
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
        View view;
        if (i != 0) {
            view = i != 1 ? null : new LoadingCell(this.mContext);
        } else {
            view = new DialogCell(null, this.mContext, false, true, this.currentAccount, this.resourcesProvider);
        }
        view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new RecyclerListView.Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.getItemViewType() == 0) {
            DialogCell dialogCell = (DialogCell) viewHolder.itemView;
            dialogCell.useSeparator = true;
            MessageObject messageObject = (MessageObject) getItem(i);
            dialogCell.setDialog(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, true);
        }
    }

    @Override
    public int getItemViewType(int i) {
        return i < this.searchResultMessages.size() ? 0 : 1;
    }
}
