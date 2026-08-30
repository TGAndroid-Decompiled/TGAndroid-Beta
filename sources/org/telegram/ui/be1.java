package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class be1 extends org.telegram.ui.ActionBar.j {
    public final fe1 f32945a;

    public be1(fe1 fe1Var) {
        this.f32945a = fe1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        int i12;
        String obj;
        int i13;
        fe1 fe1Var = this.f32945a;
        if (i10 == -1) {
            fe1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (fe1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = fe1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) fe1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(fe1Var.e);
            } else if (!fe1Var.f34235r) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(fe1Var.getParentActivity(), 3, null);
                d2Var.q(500L);
                fe1Var.f34235r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = fe1Var.getMessagesController().getInputPeer(fe1Var.f34230a);
                tL_messages_createForumTopic.title = obj;
                long j10 = fe1Var.f34231b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = fe1Var.B;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.p2) fe1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new rr0(this, obj, d2Var, 11));
            }
        } else if (i10 == 2) {
            if (fe1Var.e.getText() != null) {
                str = fe1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) fe1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(fe1Var.e);
                return;
            }
            if (!fe1Var.f34237w.title.equals(str) || fe1Var.f34237w.icon_emoji_id != fe1Var.f34231b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = fe1Var.getMessagesController().getInputPeer(fe1Var.f34230a);
                TLRPC.TL_forumTopic tL_forumTopic = fe1Var.f34237w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f19236id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = fe1Var.f34237w.icon_emoji_id;
                long j12 = fe1Var.f34231b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) fe1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new nh.p5(4));
            }
            if (fe1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = fe1Var.f34237w;
                if (tL_forumTopic2.f19236id == 1 && (!r8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = fe1Var.getMessagesController().getInputPeer(fe1Var.f34230a);
                    tL_messages_editForumTopic2.topic_id = fe1Var.f34237w.f19236id;
                    tL_messages_editForumTopic2.hidden = !fe1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.p2) fe1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new nh.p5(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = fe1Var.f34237w;
            long j13 = fe1Var.f34231b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (fe1Var.d != null) {
                tL_forumTopic3.hidden = !r8Var2.d.h;
            }
            fe1Var.getMessagesController().getTopicsController().onTopicEdited(fe1Var.f34230a, fe1Var.f34237w);
            fe1Var.finishFragment();
        }
    }
}
