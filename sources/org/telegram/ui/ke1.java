package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class ke1 extends org.telegram.ui.ActionBar.j {
    public final oe1 f38291a;

    public ke1(oe1 oe1Var) {
        this.f38291a = oe1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        int i12;
        String obj;
        int i13;
        oe1 oe1Var = this.f38291a;
        if (i10 == -1) {
            oe1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (oe1Var.f39679e.getText() == null) {
                obj = null;
            } else {
                obj = oe1Var.f39679e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) oe1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(oe1Var.f39679e);
            } else if (!oe1Var.f39682r) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(oe1Var.getParentActivity(), 3, null);
                d2Var.q(500L);
                oe1Var.f39682r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = oe1Var.getMessagesController().getInputPeer(oe1Var.f39676a);
                tL_messages_createForumTopic.title = obj;
                long j10 = oe1Var.f39677b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = oe1Var.B;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.p2) oe1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new yr0(this, obj, d2Var, 11));
            }
        } else if (i10 == 2) {
            if (oe1Var.f39679e.getText() != null) {
                str = oe1Var.f39679e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) oe1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(oe1Var.f39679e);
                return;
            }
            if (!oe1Var.f39684w.title.equals(str) || oe1Var.f39684w.icon_emoji_id != oe1Var.f39677b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = oe1Var.getMessagesController().getInputPeer(oe1Var.f39676a);
                TLRPC.TL_forumTopic tL_forumTopic = oe1Var.f39684w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f20897id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = oe1Var.f39684w.icon_emoji_id;
                long j12 = oe1Var.f39677b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.p2) oe1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new oh.p5(4));
            }
            if (oe1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = oe1Var.f39684w;
                if (tL_forumTopic2.f20897id == 1 && (!r8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = oe1Var.getMessagesController().getInputPeer(oe1Var.f39676a);
                    tL_messages_editForumTopic2.topic_id = oe1Var.f39684w.f20897id;
                    tL_messages_editForumTopic2.hidden = !oe1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.p2) oe1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new oh.p5(4));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = oe1Var.f39684w;
            long j13 = oe1Var.f39677b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (oe1Var.d != null) {
                tL_forumTopic3.hidden = !r8Var2.d.h;
            }
            oe1Var.getMessagesController().getTopicsController().onTopicEdited(oe1Var.f39676a, oe1Var.f39684w);
            oe1Var.finishFragment();
        }
    }
}
