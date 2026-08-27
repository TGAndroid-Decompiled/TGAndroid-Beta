package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;

public final class od1 extends org.telegram.ui.ActionBar.j {

    public final sd1 f41067a;

    public od1(sd1 sd1Var) {
        this.f41067a = sd1Var;
    }

    @Override
    public final void b(int i10) {
        sd1 sd1Var = this.f41067a;
        if (i10 == -1) {
            sd1Var.finishFragment();
            return;
        }
        if (i10 == 1) {
            String string = sd1Var.f42594e.getText() == null ? null : sd1Var.f42594e.getText().toString();
            if (TextUtils.isEmpty(string)) {
                Vibrator vibrator = (Vibrator) sd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(sd1Var.f42594e);
                return;
            }
            if (sd1Var.f42597r) {
                return;
            }
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(sd1Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            sd1Var.f42597r = true;
            TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
            tL_messages_createForumTopic.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.f42591a);
            tL_messages_createForumTopic.title = string;
            long j10 = sd1Var.f42592b;
            if (j10 != 0) {
                tL_messages_createForumTopic.icon_emoji_id = j10;
                tL_messages_createForumTopic.flags |= 8;
            }
            tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
            tL_messages_createForumTopic.icon_color = sd1Var.A;
            tL_messages_createForumTopic.flags |= 1;
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount).sendRequest(tL_messages_createForumTopic, new lr0(this, string, b2Var, 11));
            return;
        }
        if (i10 == 2) {
            String string2 = sd1Var.f42594e.getText() != null ? sd1Var.f42594e.getText().toString() : null;
            if (TextUtils.isEmpty(string2)) {
                Vibrator vibrator2 = (Vibrator) sd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(sd1Var.f42594e);
                return;
            }
            if (!sd1Var.f42599w.title.equals(string2) || sd1Var.f42599w.icon_emoji_id != sd1Var.f42592b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.f42591a);
                TLRPC.TL_forumTopic tL_forumTopic = sd1Var.f42599w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f22432id;
                if (!tL_forumTopic.title.equals(string2)) {
                    tL_messages_editForumTopic.title = string2;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = sd1Var.f42599w.icon_emoji_id;
                long j12 = sd1Var.f42592b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount).sendRequest(tL_messages_editForumTopic, new jh.m5(5));
            }
            org.telegram.ui.Cells.o8 o8Var = sd1Var.d;
            if (o8Var != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = sd1Var.f42599w;
                if (tL_forumTopic2.f22432id == 1 && (!o8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.f42591a);
                    tL_messages_editForumTopic2.topic_id = sd1Var.f42599w.f22432id;
                    tL_messages_editForumTopic2.hidden = !sd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount).sendRequest(tL_messages_editForumTopic2, new jh.m5(5));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = sd1Var.f42599w;
            long j13 = sd1Var.f42592b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = string2;
            org.telegram.ui.Cells.o8 o8Var2 = sd1Var.d;
            if (o8Var2 != null) {
                tL_forumTopic3.hidden = !o8Var2.d.h;
            }
            sd1Var.getMessagesController().getTopicsController().onTopicEdited(sd1Var.f42591a, sd1Var.f42599w);
            sd1Var.finishFragment();
        }
    }
}
