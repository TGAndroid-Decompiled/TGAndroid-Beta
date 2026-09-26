package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class oe1 extends org.telegram.ui.ActionBar.j {
    public final se1 f36225a;

    public oe1(se1 se1Var) {
        this.f36225a = se1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.v8 v8Var2;
        int i12;
        String obj;
        int i13;
        se1 se1Var = this.f36225a;
        if (i10 == -1) {
            se1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (se1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = se1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) se1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(se1Var.e);
            } else if (!se1Var.f37727r) {
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(se1Var.getParentActivity(), 3, null);
                a2Var.q(500L);
                se1Var.f37727r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = se1Var.getMessagesController().getInputPeer(se1Var.f37722a);
                tL_messages_createForumTopic.title = obj;
                long j3 = se1Var.f37723b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = se1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.m2) se1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new fs0(this, obj, a2Var, 11));
            }
        } else if (i10 == 2) {
            if (se1Var.e.getText() != null) {
                str = se1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) se1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(se1Var.e);
                return;
            }
            if (!se1Var.f37729w.title.equals(str) || se1Var.f37729w.icon_emoji_id != se1Var.f37723b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = se1Var.getMessagesController().getInputPeer(se1Var.f37722a);
                TLRPC.TL_forumTopic tL_forumTopic = se1Var.f37729w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f18387id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = se1Var.f37729w.icon_emoji_id;
                long j11 = se1Var.f37723b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) se1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ai.u7(8));
            }
            if (se1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = se1Var.f37729w;
                if (tL_forumTopic2.f18387id == 1 && (!v8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = se1Var.getMessagesController().getInputPeer(se1Var.f37722a);
                    tL_messages_editForumTopic2.topic_id = se1Var.f37729w.f18387id;
                    tL_messages_editForumTopic2.hidden = !se1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.m2) se1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ai.u7(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = se1Var.f37729w;
            long j12 = se1Var.f37723b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (se1Var.d != null) {
                tL_forumTopic3.hidden = !v8Var2.d.h;
            }
            se1Var.getMessagesController().getTopicsController().onTopicEdited(se1Var.f37722a, se1Var.f37729w);
            se1Var.finishFragment();
        }
    }
}
