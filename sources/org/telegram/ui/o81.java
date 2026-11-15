package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class o81 extends org.telegram.ui.ActionBar.j {
    public final s81 f49866a;

    public o81(s81 s81Var) {
        this.f49866a = s81Var;
    }

    @Override
    public final void b(int i7) {
        int i10;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        int i11;
        String obj;
        int i12;
        s81 s81Var = this.f49866a;
        if (i7 == -1) {
            s81Var.finishFragment();
            return;
        }
        String str = null;
        if (i7 == 1) {
            if (s81Var.f51149e.getText() == null) {
                obj = null;
            } else {
                obj = s81Var.f51149e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) s81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.E3(s81Var.f51149e);
            } else if (!s81Var.f51152r) {
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, s81Var.getParentActivity(), null);
                t1Var.r(500L);
                s81Var.f51152r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = s81Var.getMessagesController().j1(s81Var.f51146a);
                tL_messages_createForumTopic.title = obj;
                long j3 = s81Var.f51147b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.f22414b.nextLong();
                tL_messages_createForumTopic.icon_color = s81Var.F;
                tL_messages_createForumTopic.flags |= 1;
                i12 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new jo0(this, obj, t1Var, 11));
            }
        } else if (i7 == 2) {
            if (s81Var.f51149e.getText() != null) {
                str = s81Var.f51149e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) s81Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.g0.E3(s81Var.f51149e);
                return;
            }
            if (!s81Var.f51155x.title.equals(str) || s81Var.f51155x.icon_emoji_id != s81Var.f51147b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = s81Var.getMessagesController().j1(s81Var.f51146a);
                TLRPC.TL_forumTopic tL_forumTopic = s81Var.f51155x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f28103id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = s81Var.f51155x.icon_emoji_id;
                long j11 = s81Var.f51147b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new fi.m5(9));
            }
            if (s81Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = s81Var.f51155x;
                if (tL_forumTopic2.f28103id == 1 && (!p8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = s81Var.getMessagesController().j1(s81Var.f51146a);
                    tL_messages_editForumTopic2.topic_id = s81Var.f51155x.f28103id;
                    tL_messages_editForumTopic2.hidden = !s81Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new fi.m5(9));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = s81Var.f51155x;
            long j12 = s81Var.f51147b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (s81Var.d != null) {
                tL_forumTopic3.hidden = !p8Var2.d.h;
            }
            org.telegram.messenger.h00 h00Var = s81Var.getMessagesController().f25386r7;
            long j13 = s81Var.f51146a;
            h00Var.getMessagesStorage().f2(j13, s81Var.f51155x, 35);
            h00Var.y(-j13, true);
            s81Var.finishFragment();
        }
    }
}
