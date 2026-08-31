package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class ee1 extends org.telegram.ui.ActionBar.j {
    public final ie1 f36569a;

    public ee1(ie1 ie1Var) {
        this.f36569a = ie1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        int i12;
        String obj;
        int i13;
        ie1 ie1Var = this.f36569a;
        if (i10 == -1) {
            ie1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (ie1Var.f37823e.getText() == null) {
                obj = null;
            } else {
                obj = ie1Var.f37823e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) ie1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(ie1Var.f37823e);
            } else if (!ie1Var.f37826r) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ie1Var.getParentActivity(), 3, null);
                d2Var.q(500L);
                ie1Var.f37826r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = ie1Var.getMessagesController().getInputPeer(ie1Var.f37820a);
                tL_messages_createForumTopic.title = obj;
                long j10 = ie1Var.f37821b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = ie1Var.B;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new tr0(this, obj, d2Var, 11));
            }
        } else if (i10 == 2) {
            if (ie1Var.f37823e.getText() != null) {
                str = ie1Var.f37823e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) ie1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(ie1Var.f37823e);
                return;
            }
            if (!ie1Var.f37828w.title.equals(str) || ie1Var.f37828w.icon_emoji_id != ie1Var.f37821b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = ie1Var.getMessagesController().getInputPeer(ie1Var.f37820a);
                TLRPC.TL_forumTopic tL_forumTopic = ie1Var.f37828w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f20895id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = ie1Var.f37828w.icon_emoji_id;
                long j12 = ie1Var.f37821b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new oh.p5(4));
            }
            if (ie1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ie1Var.f37828w;
                if (tL_forumTopic2.f20895id == 1 && (!r8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = ie1Var.getMessagesController().getInputPeer(ie1Var.f37820a);
                    tL_messages_editForumTopic2.topic_id = ie1Var.f37828w.f20895id;
                    tL_messages_editForumTopic2.hidden = !ie1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new oh.p5(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = ie1Var.f37828w;
            long j13 = ie1Var.f37821b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (ie1Var.d != null) {
                tL_forumTopic3.hidden = !r8Var2.d.h;
            }
            ie1Var.getMessagesController().getTopicsController().onTopicEdited(ie1Var.f37820a, ie1Var.f37828w);
            ie1Var.finishFragment();
        }
    }
}
