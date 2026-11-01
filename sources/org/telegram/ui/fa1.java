package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class fa1 extends org.telegram.ui.ActionBar.k {
    public final ja1 f37092a;

    public fa1(ja1 ja1Var) {
        this.f37092a = ja1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.s8 s8Var;
        org.telegram.ui.Cells.s8 s8Var2;
        int i12;
        String obj;
        int i13;
        ja1 ja1Var = this.f37092a;
        if (i10 == -1) {
            ja1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (ja1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = ja1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) ja1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.i0.E3(ja1Var.e);
            } else if (!ja1Var.f38327r) {
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, ja1Var.getParentActivity(), null);
                x1Var.r(500L);
                ja1Var.f38327r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = ja1Var.getMessagesController().i1(ja1Var.f38322a);
                tL_messages_createForumTopic.title = obj;
                long j10 = ja1Var.f38323b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.f14520b.nextLong();
                tL_messages_createForumTopic.icon_color = ja1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new tp0(this, obj, x1Var, 11));
            }
        } else if (i10 == 2) {
            if (ja1Var.e.getText() != null) {
                str = ja1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) ja1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                org.telegram.messenger.i0.E3(ja1Var.e);
                return;
            }
            if (!ja1Var.f38330x.title.equals(str) || ja1Var.f38330x.icon_emoji_id != ja1Var.f38323b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = ja1Var.getMessagesController().i1(ja1Var.f38322a);
                TLRPC.TL_forumTopic tL_forumTopic = ja1Var.f38330x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f19846id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = ja1Var.f38330x.icon_emoji_id;
                long j12 = ja1Var.f38323b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ag.c3(4));
            }
            if (ja1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ja1Var.f38330x;
                if (tL_forumTopic2.f19846id == 1 && (!s8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = ja1Var.getMessagesController().i1(ja1Var.f38322a);
                    tL_messages_editForumTopic2.topic_id = ja1Var.f38330x.f19846id;
                    tL_messages_editForumTopic2.hidden = !ja1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ag.c3(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = ja1Var.f38330x;
            long j13 = ja1Var.f38323b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (ja1Var.d != null) {
                tL_forumTopic3.hidden = !s8Var2.d.h;
            }
            org.telegram.messenger.y00 y00Var = ja1Var.getMessagesController().f19234r7;
            long j14 = ja1Var.f38322a;
            y00Var.getMessagesStorage().f2(j14, ja1Var.f38330x, 35);
            y00Var.y(-j14, true);
            ja1Var.finishFragment();
        }
    }
}
