package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class gf implements org.telegram.ui.Components.uh0, org.telegram.ui.ActionBar.q1 {
    public final int f47436a;
    public final an f47437b;
    public final org.telegram.messenger.gj f47438c;

    public gf(an anVar, org.telegram.messenger.gj gjVar, int i7) {
        this.f47436a = i7;
        this.f47437b = anVar;
        this.f47438c = gjVar;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f47436a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                an anVar = this.f47437b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f47438c.e1());
                    bundle.putLong("report_reaction_from_dialog_id", anVar.f45259k6);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                anVar.P7(true);
                return;
            default:
                an anVar2 = this.f47437b;
                anVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f47438c.e1());
                    bundle2.putLong("report_reaction_from_dialog_id", anVar2.f45259k6);
                }
                anVar2.presentFragment(new ProfileActivity(bundle2, null));
                anVar2.P7(true);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        an anVar = this.f47437b;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), anVar.Aa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.gj gjVar = this.f47438c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) gjVar.f23817k.media).poll;
        tL_poll.f28077id = poll.f28077id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = anVar.getMessagesController().j1(anVar.f45259k6);
        tL_messages_editMessage.f28135id = gjVar.e1();
        tL_messages_editMessage.flags |= 16384;
        org.telegram.messenger.g0.i3(new wf(anVar, t1VarArr, anVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(anVar, t1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
