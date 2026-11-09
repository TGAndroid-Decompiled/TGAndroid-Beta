package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class jf implements org.telegram.ui.Components.rh0, org.telegram.ui.ActionBar.r1 {
    public final int f46949a;
    public final cn f46950b;
    public final org.telegram.messenger.ij f46951c;

    public jf(cn cnVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f46949a = i7;
        this.f46950b = cnVar;
        this.f46951c = ijVar;
    }

    @Override
    public void d(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f46949a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                cn cnVar = this.f46950b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f46951c.e1());
                    bundle.putLong("report_reaction_from_dialog_id", cnVar.f44504j6);
                }
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                cnVar.P7(true);
                return;
            default:
                cn cnVar2 = this.f46950b;
                cnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f46951c.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", cnVar2.f44504j6);
                }
                cnVar2.presentFragment(new ProfileActivity(bundle2, null));
                cnVar2.P7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cn cnVar = this.f46950b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), cnVar.f44709za)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.ij ijVar = this.f46951c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) ijVar.f23262k.media).poll;
        tL_poll.f26982id = poll.f26982id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = cnVar.getMessagesController().j1(cnVar.f44504j6);
        tL_messages_editMessage.f27040id = ijVar.e1();
        tL_messages_editMessage.flags |= 16384;
        org.telegram.messenger.g0.i3(new zf(cnVar, u1VarArr, cnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(cnVar, u1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
