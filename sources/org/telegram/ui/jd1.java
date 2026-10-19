package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class jd1 extends org.telegram.ui.ActionBar.j {
    public final nd1 f38229a;

    public jd1(nd1 nd1Var) {
        this.f38229a = nd1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.u8 u8Var;
        org.telegram.ui.Cells.u8 u8Var2;
        int i12;
        String obj;
        int i13;
        nd1 nd1Var = this.f38229a;
        if (i10 == -1) {
            nd1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (nd1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = nd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) nd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(nd1Var.e);
            } else if (!nd1Var.f39540r) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(nd1Var.getParentActivity(), 3, null);
                b2Var.r(500L);
                nd1Var.f39540r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = nd1Var.getMessagesController().getInputPeer(nd1Var.f39535a);
                tL_messages_createForumTopic.title = obj;
                long j10 = nd1Var.f39536b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = nd1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.n2) nd1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new tr0(this, obj, b2Var, 11));
            }
        } else if (i10 == 2) {
            if (nd1Var.e.getText() != null) {
                str = nd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) nd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(nd1Var.e);
                return;
            }
            if (!nd1Var.f39542w.title.equals(str) || nd1Var.f39542w.icon_emoji_id != nd1Var.f39536b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = nd1Var.getMessagesController().getInputPeer(nd1Var.f39535a);
                TLRPC.TL_forumTopic tL_forumTopic = nd1Var.f39542w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f20325id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = nd1Var.f39542w.icon_emoji_id;
                long j12 = nd1Var.f39536b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.n2) nd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ci.e6(8));
            }
            if (nd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = nd1Var.f39542w;
                if (tL_forumTopic2.f20325id == 1 && (!u8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = nd1Var.getMessagesController().getInputPeer(nd1Var.f39535a);
                    tL_messages_editForumTopic2.topic_id = nd1Var.f39542w.f20325id;
                    tL_messages_editForumTopic2.hidden = !nd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.n2) nd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ci.e6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = nd1Var.f39542w;
            long j13 = nd1Var.f39536b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (nd1Var.d != null) {
                tL_forumTopic3.hidden = !u8Var2.d.h;
            }
            nd1Var.getMessagesController().getTopicsController().onTopicEdited(nd1Var.f39535a, nd1Var.f39542w);
            nd1Var.finishFragment();
        }
    }
}
