package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class od1 extends org.telegram.ui.ActionBar.j {
    public final sd1 f40164a;

    public od1(sd1 sd1Var) {
        this.f40164a = sd1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.v8 v8Var2;
        int i12;
        String obj;
        int i13;
        sd1 sd1Var = this.f40164a;
        if (i10 == -1) {
            sd1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (sd1Var.e.getText() == null) {
                obj = null;
            } else {
                obj = sd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) sd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(sd1Var.e);
            } else if (!sd1Var.f41355r) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(sd1Var.getParentActivity(), 3, null);
                c2Var.r(500L);
                sd1Var.f41355r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.f41350a);
                tL_messages_createForumTopic.title = obj;
                long j10 = sd1Var.f41351b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = sd1Var.E;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.o2) sd1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new vr0(this, obj, c2Var, 11));
            }
        } else if (i10 == 2) {
            if (sd1Var.e.getText() != null) {
                str = sd1Var.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) sd1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(sd1Var.e);
                return;
            }
            if (!sd1Var.f41357w.title.equals(str) || sd1Var.f41357w.icon_emoji_id != sd1Var.f41351b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.f41350a);
                TLRPC.TL_forumTopic tL_forumTopic = sd1Var.f41357w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f20396id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = sd1Var.f41357w.icon_emoji_id;
                long j12 = sd1Var.f41351b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) sd1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new ci.d6(8));
            }
            if (sd1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = sd1Var.f41357w;
                if (tL_forumTopic2.f20396id == 1 && (!v8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = sd1Var.getMessagesController().getInputPeer(sd1Var.f41350a);
                    tL_messages_editForumTopic2.topic_id = sd1Var.f41357w.f20396id;
                    tL_messages_editForumTopic2.hidden = !sd1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.o2) sd1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new ci.d6(8));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = sd1Var.f41357w;
            long j13 = sd1Var.f41351b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (sd1Var.d != null) {
                tL_forumTopic3.hidden = !v8Var2.d.h;
            }
            sd1Var.getMessagesController().getTopicsController().onTopicEdited(sd1Var.f41350a, sd1Var.f41357w);
            sd1Var.finishFragment();
        }
    }
}
