package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bg implements org.telegram.ui.Components.tk0, org.telegram.ui.ActionBar.a2 {
    public final int f36308a;
    public final zn f36309b;
    public final MessageObject f36310c;

    public bg(zn znVar, MessageObject messageObject, int i10) {
        this.f36308a = i10;
        this.f36309b = znVar;
        this.f36310c = messageObject;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f36308a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                zn znVar = this.f36309b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f36310c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", znVar.T5);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                znVar.D7(true);
                return;
            default:
                zn znVar2 = this.f36309b;
                znVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j3 > 0) {
                    bundle2.putLong("user_id", j3);
                } else {
                    bundle2.putLong("chat_id", -j3);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f36310c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", znVar2.T5);
                }
                znVar2.presentFragment(new ProfileActivity(bundle2, null));
                znVar2.D7(true);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zn znVar = this.f36309b;
        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(znVar.getParentActivity(), 3, znVar.f44763ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f36310c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f20064id = poll.f20064id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = znVar.getMessagesController().getInputPeer(znVar.T5);
        tL_messages_editMessage.f20121id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new vg(znVar, b2VarArr, znVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new ba(znVar, b2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
