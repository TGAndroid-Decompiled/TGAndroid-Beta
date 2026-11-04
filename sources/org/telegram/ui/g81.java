package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class g81 extends org.telegram.ui.ActionBar.j {
    public final l81 f45603a;

    public g81(l81 l81Var) {
        this.f45603a = l81Var;
    }

    @Override
    public final void b(int i3) {
        int i10;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        int i11;
        String obj;
        int i12;
        l81 l81Var = this.f45603a;
        if (i3 == -1) {
            l81Var.finishFragment();
            return;
        }
        String str = null;
        if (i3 == 1) {
            if (l81Var.f47221e.getText() == null) {
                obj = null;
            } else {
                obj = l81Var.f47221e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) l81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(l81Var.f47221e);
            } else if (!l81Var.f47224r) {
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, l81Var.getParentActivity(), null);
                s1Var.r(500L);
                l81Var.f47224r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = l81Var.getMessagesController().j1(l81Var.f47218a);
                tL_messages_createForumTopic.title = obj;
                long j10 = l81Var.f47219b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.f21385b.nextLong();
                tL_messages_createForumTopic.icon_color = l81Var.F;
                tL_messages_createForumTopic.flags |= 1;
                i12 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new co0(this, obj, s1Var, 11));
            }
        } else if (i3 == 2) {
            if (l81Var.f47221e.getText() != null) {
                str = l81Var.f47221e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) l81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(l81Var.f47221e);
                return;
            }
            if (!l81Var.f47227x.title.equals(str) || l81Var.f47227x.icon_emoji_id != l81Var.f47219b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = l81Var.getMessagesController().j1(l81Var.f47218a);
                TLRPC.TL_forumTopic tL_forumTopic = l81Var.f47227x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f27053id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = l81Var.f47227x.icon_emoji_id;
                long j12 = l81Var.f47219b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new ei.u5(9));
            }
            if (l81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = l81Var.f47227x;
                if (tL_forumTopic2.f27053id == 1 && (!p8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = l81Var.getMessagesController().j1(l81Var.f47218a);
                    tL_messages_editForumTopic2.topic_id = l81Var.f47227x.f27053id;
                    tL_messages_editForumTopic2.hidden = !l81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new ei.u5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = l81Var.f47227x;
            long j13 = l81Var.f47219b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (l81Var.d != null) {
                tL_forumTopic3.hidden = !p8Var2.d.h;
            }
            org.telegram.messenger.c00 c00Var = l81Var.getMessagesController().f23102q7;
            long j14 = l81Var.f47218a;
            c00Var.getMessagesStorage().f2(j14, l81Var.f47227x, 35);
            c00Var.y(-j14, true);
            l81Var.finishFragment();
        }
    }
}
