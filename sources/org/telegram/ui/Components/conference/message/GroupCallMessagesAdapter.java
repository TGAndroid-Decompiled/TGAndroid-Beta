package org.telegram.ui.Components.conference.message;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;

public abstract class GroupCallMessagesAdapter extends RecyclerView.Adapter implements GroupCallMessagesController.CallMessageListener {
    public int currentAccount;
    public TLRPC.InputGroupCall inputGroupCall;
    public boolean isAttachedToRecyclerView;
    public List messages;

    @Override
    public final int getItemCount() {
        List list = this.messages;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        GroupCallMessageCell.VH vh = (GroupCallMessageCell.VH) viewHolder;
        List list = this.messages;
        if (list == null || list.size() <= i) {
            return;
        }
        ((GroupCallMessageCell) vh.itemView).set((GroupCallMessage) this.messages.get(i));
    }

    @Override
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        this.messages.add(0, groupCallMessage);
        notifyItemInserted(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.messages;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.messages.size() - 1;
        this.messages.remove(size);
        notifyItemRemoved(size);
    }
}
