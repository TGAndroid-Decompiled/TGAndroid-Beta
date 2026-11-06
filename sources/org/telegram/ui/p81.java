package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class p81 extends org.telegram.ui.ActionBar.j {
    public final u81 f48718a;

    public p81(u81 u81Var) {
        this.f48718a = u81Var;
    }

    @Override
    public final void b(int i7) {
        int i10;
        org.telegram.ui.Cells.q8 q8Var;
        org.telegram.ui.Cells.q8 q8Var2;
        int i11;
        String obj;
        int i12;
        u81 u81Var = this.f48718a;
        if (i7 == -1) {
            u81Var.finishFragment();
            return;
        }
        String str = null;
        if (i7 == 1) {
            if (u81Var.f50319e.getText() == null) {
                obj = null;
            } else {
                obj = u81Var.f50319e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) u81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(u81Var.f50319e);
            } else if (!u81Var.f50322r) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, u81Var.getParentActivity(), null);
                u1Var.r(500L);
                u81Var.f50322r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = u81Var.getMessagesController().j1(u81Var.f50316a);
                tL_messages_createForumTopic.title = obj;
                long j3 = u81Var.f50317b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.f21331b.nextLong();
                tL_messages_createForumTopic.icon_color = u81Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i12 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new ko0(this, obj, u1Var, 11));
            }
        } else if (i7 == 2) {
            if (u81Var.f50319e.getText() != null) {
                str = u81Var.f50319e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) u81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(u81Var.f50319e);
                return;
            }
            if (!u81Var.f50325x.title.equals(str) || u81Var.f50325x.icon_emoji_id != u81Var.f50317b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = u81Var.getMessagesController().j1(u81Var.f50316a);
                TLRPC.TL_forumTopic tL_forumTopic = u81Var.f50325x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f27004id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = u81Var.f50325x.icon_emoji_id;
                long j11 = u81Var.f50317b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new di.u5(9));
            }
            if (u81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = u81Var.f50325x;
                if (tL_forumTopic2.f27004id == 1 && (!q8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = u81Var.getMessagesController().j1(u81Var.f50316a);
                    tL_messages_editForumTopic2.topic_id = u81Var.f50325x.f27004id;
                    tL_messages_editForumTopic2.hidden = !u81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new di.u5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = u81Var.f50325x;
            long j12 = u81Var.f50317b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (u81Var.d != null) {
                tL_forumTopic3.hidden = !q8Var2.d.h;
            }
            org.telegram.messenger.k00 k00Var = u81Var.getMessagesController().f24862q7;
            long j13 = u81Var.f50316a;
            k00Var.getMessagesStorage().f2(j13, u81Var.f50325x, 35);
            k00Var.y(-j13, true);
            u81Var.finishFragment();
        }
    }
}
