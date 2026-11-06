package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class jf implements org.telegram.ui.Components.qh0, org.telegram.ui.ActionBar.r1 {
    public final int f46947a;
    public final an f46948b;
    public final org.telegram.messenger.ij f46949c;

    public jf(an anVar, org.telegram.messenger.ij ijVar, int i7) {
        this.f46947a = i7;
        this.f46948b = anVar;
        this.f46949c = ijVar;
    }

    @Override
    public void b(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f46947a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                an anVar = this.f46948b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f46949c.f1());
                    bundle.putLong("report_reaction_from_dialog_id", anVar.f43843j6);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                anVar.O7(true);
                return;
            default:
                an anVar2 = this.f46948b;
                anVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f46949c.f1());
                    bundle2.putLong("report_reaction_from_dialog_id", anVar2.f43843j6);
                }
                anVar2.presentFragment(new ProfileActivity(bundle2, null));
                anVar2.O7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        an anVar = this.f46948b;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, anVar.getParentActivity(), anVar.f44023xa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        org.telegram.messenger.ij ijVar = this.f46949c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) ijVar.f23237k.media).poll;
        tL_poll.f26978id = poll.f26978id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = anVar.getMessagesController().j1(anVar.f43843j6);
        tL_messages_editMessage.f27036id = ijVar.f1();
        tL_messages_editMessage.flags |= 16384;
        org.telegram.messenger.g0.i3(new bg(anVar, u1VarArr, anVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(anVar, u1VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
