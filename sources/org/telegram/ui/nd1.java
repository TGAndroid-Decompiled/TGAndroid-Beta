package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class nd1 extends org.telegram.ui.ActionBar.j {
    public final rd1 f40702a;

    public nd1(rd1 rd1Var) {
        this.f40702a = rd1Var;
    }

    @Override
    public final void b(int i9) {
        int i10;
        org.telegram.ui.Cells.s8 s8Var;
        org.telegram.ui.Cells.s8 s8Var2;
        int i11;
        String obj;
        int i12;
        rd1 rd1Var = this.f40702a;
        if (i9 == -1) {
            rd1Var.finishFragment();
            return;
        }
        String str = null;
        if (i9 == 1) {
            if (rd1Var.f42372e.getText() == null) {
                obj = null;
            } else {
                obj = rd1Var.f42372e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) rd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(rd1Var.f42372e);
            } else if (!rd1Var.f42375r) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(rd1Var.getParentActivity(), 3, null);
                c2Var.q(500L);
                rd1Var.f42375r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = rd1Var.getMessagesController().getInputPeer(rd1Var.f42369a);
                tL_messages_createForumTopic.title = obj;
                long j10 = rd1Var.f42370b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = rd1Var.A;
                tL_messages_createForumTopic.flags |= 1;
                i12 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_createForumTopic, new kr0(this, obj, c2Var, 11));
            }
        } else if (i9 == 2) {
            if (rd1Var.f42372e.getText() != null) {
                str = rd1Var.f42372e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) rd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(rd1Var.f42372e);
                return;
            }
            if (!rd1Var.f42377w.title.equals(str) || rd1Var.f42377w.icon_emoji_id != rd1Var.f42370b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = rd1Var.getMessagesController().getInputPeer(rd1Var.f42369a);
                TLRPC.TL_forumTopic tL_forumTopic = rd1Var.f42377w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f22432id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = rd1Var.f42377w.icon_emoji_id;
                long j12 = rd1Var.f42370b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editForumTopic, new ih.q5(5));
            }
            if (rd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = rd1Var.f42377w;
                if (tL_forumTopic2.f22432id == 1 && (!s8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = rd1Var.getMessagesController().getInputPeer(rd1Var.f42369a);
                    tL_messages_editForumTopic2.topic_id = rd1Var.f42377w.f22432id;
                    tL_messages_editForumTopic2.hidden = !rd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i11 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic2, new ih.q5(5));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = rd1Var.f42377w;
            long j13 = rd1Var.f42370b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (rd1Var.d != null) {
                tL_forumTopic3.hidden = !s8Var2.d.h;
            }
            rd1Var.getMessagesController().getTopicsController().onTopicEdited(rd1Var.f42369a, rd1Var.f42377w);
            rd1Var.finishFragment();
        }
    }
}
