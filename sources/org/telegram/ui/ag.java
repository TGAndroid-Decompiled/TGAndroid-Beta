package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ag implements org.telegram.ui.Components.bk0, org.telegram.ui.ActionBar.a2 {
    public final int f34810a;
    public final yn f34811b;
    public final MessageObject f34812c;

    public ag(yn ynVar, MessageObject messageObject, int i10) {
        this.f34810a = i10;
        this.f34811b = ynVar;
        this.f34812c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f34810a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                yn ynVar = this.f34811b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f34812c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", ynVar.R5);
                }
                ynVar.presentFragment(new ProfileActivity(bundle, null));
                ynVar.A7(true);
                return;
            default:
                yn ynVar2 = this.f34811b;
                ynVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f34812c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", ynVar2.R5);
                }
                ynVar2.presentFragment(new ProfileActivity(bundle2, null));
                ynVar2.A7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        yn ynVar = this.f34811b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(ynVar.getParentActivity(), 3, ynVar.f43307ca)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f34812c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f20068id = poll.f20068id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = ynVar.getMessagesController().getInputPeer(ynVar.R5);
        tL_messages_editMessage.f20125id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new wg(ynVar, b2VarArr, ynVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ca(ynVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
