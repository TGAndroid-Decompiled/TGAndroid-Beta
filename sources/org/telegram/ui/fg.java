package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class fg implements org.telegram.ui.Components.wk0, org.telegram.ui.ActionBar.z1 {
    public final int f37771a;
    public final eo f37772b;
    public final MessageObject f37773c;

    public fg(eo eoVar, MessageObject messageObject, int i10) {
        this.f37771a = i10;
        this.f37772b = eoVar;
        this.f37773c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f37771a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                eo eoVar = this.f37772b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f37773c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", eoVar.T5);
                }
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                eoVar.D7(true);
                return;
            default:
                eo eoVar2 = this.f37772b;
                eoVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f37773c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", eoVar2.T5);
                }
                eoVar2.presentFragment(new ProfileActivity(bundle2, null));
                eoVar2.D7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        eo eoVar = this.f37772b;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(eoVar.getParentActivity(), 3, eoVar.f37256ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f37773c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f19829id = poll.f19829id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = eoVar.getMessagesController().getInputPeer(eoVar.T5);
        tL_messages_editMessage.f19886id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new yg(eoVar, a2VarArr, eoVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ea(eoVar, a2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
