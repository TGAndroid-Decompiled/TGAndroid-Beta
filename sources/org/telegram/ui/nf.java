package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nf implements org.telegram.ui.Components.oj0, org.telegram.ui.ActionBar.b2 {
    public final int f40789a;
    public final tn f40790b;
    public final MessageObject f40791c;

    public nf(tn tnVar, MessageObject messageObject, int i10) {
        this.f40789a = i10;
        this.f40790b = tnVar;
        this.f40791c = messageObject;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f40789a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                tn tnVar = this.f40790b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f40791c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", tnVar.P5);
                }
                tnVar.presentFragment(new ProfileActivity(bundle, null));
                tnVar.A7(true);
                return;
            default:
                tn tnVar2 = this.f40790b;
                tnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f40791c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", tnVar2.P5);
                }
                tnVar2.presentFragment(new ProfileActivity(bundle2, null));
                tnVar2.A7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        tn tnVar = this.f40790b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(tnVar.getParentActivity(), 3, tnVar.f42746aa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f40791c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f22418id = poll.f22418id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = tnVar.getMessagesController().getInputPeer(tnVar.P5);
        tL_messages_editMessage.f22475id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new kg(tnVar, c2VarArr, tnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new x9(tnVar, c2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
