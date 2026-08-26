package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ReactedUsersListView;

public final class ChatActivity$$ExternalSyntheticLambda246 implements ReactedUsersListView.OnProfileSelectedListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final MessageObject f$1;

    public ChatActivity$$ExternalSyntheticLambda246(ChatActivity chatActivity, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = messageObject;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ChatActivity chatActivity = this.f$0;
        chatActivity.getClass();
        AlertDialog[] alertDialogArr = {new AlertDialog(chatActivity.getParentActivity(), 3, chatActivity.themeDelegate)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f$1;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = chatActivity.getMessagesController().getInputPeer(chatActivity.dialog_id);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda338(chatActivity, alertDialogArr, chatActivity.getConnectionsManager().sendRequest(tL_messages_editMessage, new BoostsActivity$$ExternalSyntheticLambda7(chatActivity, alertDialogArr, tL_messages_editMessage, 12)), 2), 500L);
    }

    @Override
    public void onProfileSelected(long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                chatActivity.getClass();
                Bundle bundle = new Bundle();
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f$1.getId());
                    bundle.putLong("report_reaction_from_dialog_id", chatActivity.dialog_id);
                }
                chatActivity.presentFragment(new ProfileActivity(bundle, null));
                chatActivity.closeMenu(true);
                break;
            default:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                Bundle bundle2 = new Bundle();
                if (j > 0) {
                    bundle2.putLong("user_id", j);
                } else {
                    bundle2.putLong("chat_id", -j);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f$1.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", chatActivity2.dialog_id);
                }
                chatActivity2.presentFragment(new ProfileActivity(bundle2, null));
                chatActivity2.closeMenu(true);
                break;
        }
    }
}
