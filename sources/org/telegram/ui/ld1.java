package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class ld1 extends org.telegram.ui.ActionBar.j {
    public final pd1 f38855a;

    public ld1(pd1 pd1Var) {
        this.f38855a = pd1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.u8 u8Var;
        org.telegram.ui.Cells.u8 u8Var2;
        int i12;
        String obj;
        int i13;
        pd1 pd1Var = this.f38855a;
        if (i10 == -1) {
            pd1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (pd1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = pd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) pd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(pd1Var.e);
            } else if (!pd1Var.f40085r) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(pd1Var.getParentActivity(), 3, null);
                b2Var.q(500L);
                pd1Var.f40085r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = pd1Var.getMessagesController().getInputPeer(pd1Var.f40080a);
                tL_messages_createForumTopic.title = obj;
                long j10 = pd1Var.f40081b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = pd1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new vr0(this, obj, b2Var, 11));
            }
        } else if (i10 == 2) {
            if (pd1Var.e.getText() != null) {
                str = pd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) pd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(pd1Var.e);
                return;
            }
            if (!pd1Var.f40087w.title.equals(str) || pd1Var.f40087w.icon_emoji_id != pd1Var.f40081b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = pd1Var.getMessagesController().getInputPeer(pd1Var.f40080a);
                TLRPC.TL_forumTopic tL_forumTopic = pd1Var.f40087w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f20324id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = pd1Var.f40087w.icon_emoji_id;
                long j12 = pd1Var.f40081b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ci.e6(8));
            }
            if (pd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = pd1Var.f40087w;
                if (tL_forumTopic2.f20324id == 1 && (!u8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = pd1Var.getMessagesController().getInputPeer(pd1Var.f40080a);
                    tL_messages_editForumTopic2.topic_id = pd1Var.f40087w.f20324id;
                    tL_messages_editForumTopic2.hidden = !pd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ci.e6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = pd1Var.f40087w;
            long j13 = pd1Var.f40081b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (pd1Var.d != null) {
                tL_forumTopic3.hidden = !u8Var2.d.h;
            }
            pd1Var.getMessagesController().getTopicsController().onTopicEdited(pd1Var.f40080a, pd1Var.f40087w);
            pd1Var.finishFragment();
        }
    }
}
