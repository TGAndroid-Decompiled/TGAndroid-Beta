package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements org.telegram.ui.Components.oj0, org.telegram.ui.ActionBar.a2 {
    public final int f31817a;
    public final bo f31818b;
    public final MessageObject f31819c;

    public ag(bo boVar, MessageObject messageObject, int i10) {
        this.f31817a = i10;
        this.f31818b = boVar;
        this.f31819c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f31817a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bo boVar = this.f31818b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f31819c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", boVar.T5);
                }
                boVar.presentFragment(new ProfileActivity(bundle, null));
                boVar.A7(true);
                return;
            default:
                bo boVar2 = this.f31818b;
                boVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f31819c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", boVar2.T5);
                }
                boVar2.presentFragment(new ProfileActivity(bundle2, null));
                boVar2.A7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        bo boVar = this.f31818b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(boVar.getParentActivity(), 3, boVar.f32297ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f31819c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f18138id = poll.f18138id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = boVar.getMessagesController().getInputPeer(boVar.T5);
        tL_messages_editMessage.f18195id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new wg(boVar, b2VarArr, boVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new aa(boVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
