package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ff implements org.telegram.ui.Components.th0, org.telegram.ui.ActionBar.p1 {
    public final int f45267a;
    public final wm f45268b;
    public final org.telegram.messenger.zi f45269c;

    public ff(wm wmVar, org.telegram.messenger.zi ziVar, int i3) {
        this.f45267a = i3;
        this.f45268b = wmVar;
        this.f45269c = ziVar;
    }

    @Override
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f45267a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                wm wmVar = this.f45268b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f45269c.f1());
                    bundle.putLong("report_reaction_from_dialog_id", wmVar.f51376k6);
                }
                wmVar.presentFragment(new ProfileActivity(bundle, null));
                wmVar.O7(true);
                return;
            default:
                wm wmVar2 = this.f45268b;
                wmVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f45269c.f1());
                    bundle2.putLong("report_reaction_from_dialog_id", wmVar2.f51376k6);
                }
                wmVar2.presentFragment(new ProfileActivity(bundle2, null));
                wmVar2.O7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        wm wmVar = this.f45268b;
        org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), wmVar.f51557ya)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.zi ziVar = this.f45269c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) ziVar.f26868k.media).poll;
        tL_poll.f27027id = poll.f27027id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = wmVar.getMessagesController().j1(wmVar.f51376k6);
        tL_messages_editMessage.f27085id = ziVar.f1();
        tL_messages_editMessage.flags |= 16384;
        org.telegram.messenger.g0.i3(new xf(wmVar, s1VarArr, wmVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new y9(wmVar, s1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
