package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class qf implements org.telegram.ui.Components.fj0, org.telegram.ui.ActionBar.a2 {

    public final int f41647a;

    public final rn f41648b;

    public final MessageObject f41649c;

    public qf(rn rnVar, MessageObject messageObject, int i10) {
        this.f41647a = i10;
        this.f41648b = rnVar;
        this.f41649c = messageObject;
    }

    @Override
    public void e(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f41647a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                rn rnVar = this.f41648b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f41649c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", rnVar.P5);
                }
                rnVar.presentFragment(new ProfileActivity(bundle, null));
                rnVar.A7(true);
                break;
            default:
                rn rnVar2 = this.f41648b;
                rnVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f41649c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", rnVar2.P5);
                }
                rnVar2.presentFragment(new ProfileActivity(bundle2, null));
                rnVar2.A7(true);
                break;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        rn rnVar = this.f41648b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(rnVar.getParentActivity(), 3, rnVar.f41983aa)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f41649c;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.f22406id = poll.f22406id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = rnVar.getMessagesController().getInputPeer(rnVar.P5);
        tL_messages_editMessage.f22463id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new ng(rnVar, b2VarArr, rnVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new z9(rnVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
