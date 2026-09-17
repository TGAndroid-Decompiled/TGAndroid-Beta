package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class cg implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.b2 {
    public final int f32788a;
    public final bo f32789b;
    public final MessageObject f32790c;

    public cg(bo boVar, MessageObject messageObject, int i10) {
        this.f32788a = i10;
        this.f32789b = boVar;
        this.f32790c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f32788a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bo boVar = this.f32789b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f32790c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", boVar.T5);
                }
                boVar.presentFragment(new ProfileActivity(bundle, null));
                boVar.A7(true);
                return;
            default:
                bo boVar2 = this.f32789b;
                boVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f32790c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", boVar2.T5);
                }
                boVar2.presentFragment(new ProfileActivity(bundle2, null));
                boVar2.A7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        bo boVar = this.f32789b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(boVar.getParentActivity(), 3, boVar.f32275ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f32790c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f18147id = poll.f18147id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = boVar.getMessagesController().getInputPeer(boVar.T5);
        tL_messages_editMessage.f18204id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new yg(boVar, c2VarArr, boVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ca(boVar, c2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
