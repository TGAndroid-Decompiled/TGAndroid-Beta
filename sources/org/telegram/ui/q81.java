package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class q81 extends org.telegram.ui.ActionBar.j {
    public final v81 f49169a;

    public q81(v81 v81Var) {
        this.f49169a = v81Var;
    }

    @Override
    public final void b(int i7) {
        int i10;
        org.telegram.ui.Cells.q8 q8Var;
        org.telegram.ui.Cells.q8 q8Var2;
        int i11;
        String obj;
        int i12;
        v81 v81Var = this.f49169a;
        if (i7 == -1) {
            v81Var.finishFragment();
            return;
        }
        String str = null;
        if (i7 == 1) {
            if (v81Var.f50598e.getText() == null) {
                obj = null;
            } else {
                obj = v81Var.f50598e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) v81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(v81Var.f50598e);
            } else if (!v81Var.f50601r) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, v81Var.getParentActivity(), null);
                u1Var.r(500L);
                v81Var.f50601r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = v81Var.getMessagesController().j1(v81Var.f50595a);
                tL_messages_createForumTopic.title = obj;
                long j3 = v81Var.f50596b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.f21334b.nextLong();
                tL_messages_createForumTopic.icon_color = v81Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i12 = ((org.telegram.ui.ActionBar.f2) v81Var).currentAccount;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new lo0(this, obj, u1Var, 11));
            }
        } else if (i7 == 2) {
            if (v81Var.f50598e.getText() != null) {
                str = v81Var.f50598e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) v81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(v81Var.f50598e);
                return;
            }
            if (!v81Var.f50604x.title.equals(str) || v81Var.f50604x.icon_emoji_id != v81Var.f50596b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = v81Var.getMessagesController().j1(v81Var.f50595a);
                TLRPC.TL_forumTopic tL_forumTopic = v81Var.f50604x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f27008id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = v81Var.f50604x.icon_emoji_id;
                long j11 = v81Var.f50596b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) v81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new di.u5(9));
            }
            if (v81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = v81Var.f50604x;
                if (tL_forumTopic2.f27008id == 1 && (!q8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = v81Var.getMessagesController().j1(v81Var.f50595a);
                    tL_messages_editForumTopic2.topic_id = v81Var.f50604x.f27008id;
                    tL_messages_editForumTopic2.hidden = !v81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.f2) v81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new di.u5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = v81Var.f50604x;
            long j12 = v81Var.f50596b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (v81Var.d != null) {
                tL_forumTopic3.hidden = !q8Var2.d.h;
            }
            org.telegram.messenger.k00 k00Var = v81Var.getMessagesController().f24877q7;
            long j13 = v81Var.f50595a;
            k00Var.getMessagesStorage().f2(j13, v81Var.f50604x, 35);
            k00Var.y(-j13, true);
            v81Var.finishFragment();
        }
    }
}
