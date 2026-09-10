package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements org.telegram.ui.Components.yj0, org.telegram.ui.ActionBar.c2 {
    public final int f31254a;
    public final eo f31255b;
    public final MessageObject f31256c;

    public bg(eo eoVar, MessageObject messageObject, int i10) {
        this.f31254a = i10;
        this.f31255b = eoVar;
        this.f31256c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f31254a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                eo eoVar = this.f31255b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f31256c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", eoVar.T5);
                }
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                eoVar.A7(true);
                return;
            default:
                eo eoVar2 = this.f31255b;
                eoVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f31256c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", eoVar2.T5);
                }
                eoVar2.presentFragment(new ProfileActivity(bundle2, null));
                eoVar2.A7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        eo eoVar = this.f31255b;
        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(eoVar.getParentActivity(), 3, eoVar.f32316ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f31256c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f17221id = poll.f17221id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = eoVar.getMessagesController().getInputPeer(eoVar.T5);
        tL_messages_editMessage.f17278id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new xg(eoVar, d2VarArr, eoVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(eoVar, d2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
