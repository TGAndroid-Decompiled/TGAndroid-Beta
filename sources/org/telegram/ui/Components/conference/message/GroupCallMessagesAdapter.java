package org.telegram.ui.Components.conference.message;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.conference.message.GroupCallMessageCell;

public abstract class GroupCallMessagesAdapter extends RecyclerView.Adapter implements GroupCallMessagesController.CallMessageListener {
    private int currentAccount = -1;
    private TLRPC.InputGroupCall inputGroupCall;
    private boolean isAttachedToRecyclerView;
    private List messages;

    @Override
    public GroupCallMessageCell.VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        GroupCallMessageCell groupCallMessageCell = new GroupCallMessageCell(viewGroup.getContext());
        groupCallMessageCell.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        return new GroupCallMessageCell.VH(groupCallMessageCell);
    }

    @Override
    public void onBindViewHolder(GroupCallMessageCell.VH vh, int i) {
        List list = this.messages;
        if (list == null || list.size() <= i) {
            return;
        }
        ((GroupCallMessageCell) vh.itemView).set((GroupCallMessage) this.messages.get(i));
    }

    @Override
    public int getItemCount() {
        List list = this.messages;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public GroupCallMessage getMessage(int i) {
        List list = this.messages;
        if (list != null && i >= 0 && i < list.size()) {
            return (GroupCallMessage) this.messages.get(i);
        }
        return null;
    }

    @Override
    public void onNewGroupCallMessage(GroupCallMessage groupCallMessage) {
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        this.messages.add(0, groupCallMessage);
        notifyItemInserted(0);
    }

    @Override
    public void onPopGroupCallMessage() {
        List list = this.messages;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.messages.size() - 1;
        this.messages.remove(size);
        notifyItemRemoved(size);
    }

    public void attach() {
        this.isAttachedToRecyclerView = true;
        int i = this.currentAccount;
        if (i == -1 || this.inputGroupCall == null) {
            return;
        }
        this.messages = GroupCallMessagesController.getInstance(i).getCallMessages(this.inputGroupCall.id);
        notifyDataSetChanged();
        GroupCallMessagesController.getInstance(this.currentAccount).subscribeToCallMessages(this.inputGroupCall.id, this);
    }

    public void detach() {
        this.isAttachedToRecyclerView = false;
        int i = this.currentAccount;
        if (i == -1 || this.inputGroupCall == null) {
            return;
        }
        GroupCallMessagesController.getInstance(i).unsubscribeFromCallMessages(this.inputGroupCall.id, this);
    }

    public void setGroupCall(int i, TLRPC.InputGroupCall inputGroupCall) {
        int i2;
        if (this.isAttachedToRecyclerView && (i2 = this.currentAccount) != -1 && this.inputGroupCall != null) {
            GroupCallMessagesController.getInstance(i2).unsubscribeFromCallMessages(this.inputGroupCall.id, this);
        }
        this.currentAccount = i;
        this.inputGroupCall = inputGroupCall;
        if (this.isAttachedToRecyclerView) {
            this.messages = GroupCallMessagesController.getInstance(i).getCallMessages(this.inputGroupCall.id);
            notifyDataSetChanged();
            GroupCallMessagesController.getInstance(i).subscribeToCallMessages(this.inputGroupCall.id, this);
        }
    }
}
