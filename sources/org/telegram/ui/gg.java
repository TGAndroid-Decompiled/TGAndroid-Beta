package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class gg implements org.telegram.ui.Components.pk0, org.telegram.ui.ActionBar.z1 {
    public final int f36190a;
    public final fo f36191b;
    public final MessageObject f36192c;

    public gg(fo foVar, MessageObject messageObject, int i10) {
        this.f36190a = i10;
        this.f36191b = foVar;
        this.f36192c = messageObject;
    }

    @Override
    public void a(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        switch (this.f36190a) {
            case 0:
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                fo foVar = this.f36191b;
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle.putInt("report_reaction_message_id", this.f36192c.getId());
                    bundle.putLong("report_reaction_from_dialog_id", foVar.T5);
                }
                foVar.presentFragment(new ProfileActivity(bundle, null));
                foVar.D7(true);
                return;
            default:
                fo foVar2 = this.f36191b;
                foVar2.getClass();
                Bundle bundle2 = new Bundle();
                if (j10 > 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                if (messagePeerReaction != null && messagePeerReaction.reaction != null) {
                    bundle2.putInt("report_reaction_message_id", this.f36192c.getId());
                    bundle2.putLong("report_reaction_from_dialog_id", foVar2.T5);
                }
                foVar2.presentFragment(new ProfileActivity(bundle2, null));
                foVar2.D7(true);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        fo foVar = this.f36191b;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(foVar.getParentActivity(), 3, foVar.f35633ea)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        MessageObject messageObject = this.f36192c;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media).poll;
        tL_poll.f18942id = poll.f18942id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = foVar.getMessagesController().getInputPeer(foVar.T5);
        tL_messages_editMessage.f18999id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new zg(foVar, a2VarArr, foVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new fa(foVar, a2VarArr, tL_messages_editMessage, 5)), 2), 500L);
    }
}
