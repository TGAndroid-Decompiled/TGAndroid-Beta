package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class jf implements org.telegram.ui.Components.fi0, org.telegram.ui.ActionBar.q1 {
    public final int f48976a;
    public final bn f48977b;
    public final org.telegram.messenger.fj f48978c;

    public jf(bn bnVar, org.telegram.messenger.fj fjVar, int i7) {
        this.f48976a = i7;
        this.f48977b = bnVar;
        this.f48978c = fjVar;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f48976a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bn bnVar = this.f48977b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f48978c.e1());
                    bundle.putLong("report_reaction_from_dialog_id", bnVar.f46099l6);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                bnVar.P7(true);
                return;
            default:
                bn bnVar2 = this.f48977b;
                bnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f48978c.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", bnVar2.f46099l6);
                }
                bnVar2.presentFragment(new ProfileActivity(bundle2, null));
                bnVar2.P7(true);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        bn bnVar = this.f48977b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), bnVar.Ba)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.fj fjVar = this.f48978c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) fjVar.f23993k.media).poll;
        tL_poll.f28457id = poll.f28457id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = bnVar.getMessagesController().l1(bnVar.f46099l6);
        tL_messages_editMessage.f28515id = fjVar.e1();
        tL_messages_editMessage.flags |= 16384;
        org.telegram.messenger.g0.h3(new yf(bnVar, t1VarArr, bnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(bnVar, t1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
