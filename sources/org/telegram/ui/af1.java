package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class af1 extends org.telegram.ui.ActionBar.k {
    public final ef1 f30996a;

    public af1(ef1 ef1Var) {
        this.f30996a = ef1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.w8 w8Var;
        org.telegram.ui.Cells.w8 w8Var2;
        int i12;
        String obj;
        int i13;
        ef1 ef1Var = this.f30996a;
        if (i10 == -1) {
            ef1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (ef1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = ef1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) ef1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(ef1Var.e);
            } else if (!ef1Var.f32181r) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ef1Var.getParentActivity(), 3, null);
                d2Var.q(500L);
                ef1Var.f32181r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = ef1Var.getMessagesController().getInputPeer(ef1Var.f32176a);
                tL_messages_createForumTopic.title = obj;
                long j3 = ef1Var.f32177b;
                if (j3 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j3;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = ef1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.p2) ef1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new ms0(this, obj, d2Var, 11));
            }
        } else if (i10 == 2) {
            if (ef1Var.e.getText() != null) {
                str = ef1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) ef1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(ef1Var.e);
                return;
            }
            if (!ef1Var.f32183w.title.equals(str) || ef1Var.f32183w.icon_emoji_id != ef1Var.f32177b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = ef1Var.getMessagesController().getInputPeer(ef1Var.f32176a);
                TLRPC.TL_forumTopic tL_forumTopic = ef1Var.f32183w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f17247id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j10 = ef1Var.f32183w.icon_emoji_id;
                long j11 = ef1Var.f32177b;
                if (j10 != j11) {
                    tL_messages_editForumTopic.icon_emoji_id = j11;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) ef1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new bi.g1(4));
            }
            if (ef1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = ef1Var.f32183w;
                if (tL_forumTopic2.f17247id == 1 && (!w8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = ef1Var.getMessagesController().getInputPeer(ef1Var.f32176a);
                    tL_messages_editForumTopic2.topic_id = ef1Var.f32183w.f17247id;
                    tL_messages_editForumTopic2.hidden = !ef1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.p2) ef1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new bi.g1(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = ef1Var.f32183w;
            long j12 = ef1Var.f32177b;
            tL_forumTopic3.icon_emoji_id = j12;
            if (j12 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (ef1Var.d != null) {
                tL_forumTopic3.hidden = !w8Var2.d.h;
            }
            ef1Var.getMessagesController().getTopicsController().onTopicEdited(ef1Var.f32176a, ef1Var.f32183w);
            ef1Var.finishFragment();
        }
    }
}
