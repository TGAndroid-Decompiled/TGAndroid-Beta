package org.telegram.ui;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
public final class pd1 extends org.telegram.ui.ActionBar.k {
    public final td1 f41382a;

    public pd1(td1 td1Var) {
        this.f41382a = td1Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        int i12;
        String obj;
        int i13;
        td1 td1Var = this.f41382a;
        if (i10 == -1) {
            td1Var.finishFragment();
            return;
        }
        String str = null;
        if (i10 == 1) {
            if (td1Var.f42663e.getText() == null) {
                obj = null;
            } else {
                obj = td1Var.f42663e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) td1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(td1Var.f42663e);
            } else if (!td1Var.f42666r) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(td1Var.getParentActivity(), 3, null);
                c2Var.q(500L);
                td1Var.f42666r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = td1Var.getMessagesController().getInputPeer(td1Var.f42660a);
                tL_messages_createForumTopic.title = obj;
                long j10 = td1Var.f42661b;
                if (j10 != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j10;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.random.nextLong();
                tL_messages_createForumTopic.icon_color = td1Var.A;
                tL_messages_createForumTopic.flags |= 1;
                i13 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_createForumTopic, new jr0(this, obj, c2Var, 11));
            }
        } else if (i10 == 2) {
            if (td1Var.f42663e.getText() != null) {
                str = td1Var.f42663e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) td1Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                AndroidUtilities.shakeView(td1Var.f42663e);
                return;
            }
            if (!td1Var.f42668w.title.equals(str) || td1Var.f42668w.icon_emoji_id != td1Var.f42661b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = td1Var.getMessagesController().getInputPeer(td1Var.f42660a);
                TLRPC.TL_forumTopic tL_forumTopic = td1Var.f42668w;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.f22444id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j11 = td1Var.f42668w.icon_emoji_id;
                long j12 = td1Var.f42661b;
                if (j11 != j12) {
                    tL_messages_editForumTopic.icon_emoji_id = j12;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editForumTopic, new lh.o5(5));
            }
            if (td1Var.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = td1Var.f42668w;
                if (tL_forumTopic2.f22444id == 1 && (!p8Var.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = td1Var.getMessagesController().getInputPeer(td1Var.f42660a);
                    tL_messages_editForumTopic2.topic_id = td1Var.f42668w.f22444id;
                    tL_messages_editForumTopic2.hidden = !td1Var.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i12 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_editForumTopic2, new lh.o5(5));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = td1Var.f42668w;
            long j13 = td1Var.f42661b;
            tL_forumTopic3.icon_emoji_id = j13;
            if (j13 != 0) {
                tL_forumTopic3.flags |= 1;
            } else {
                tL_forumTopic3.flags &= -2;
            }
            tL_forumTopic3.title = str;
            if (td1Var.d != null) {
                tL_forumTopic3.hidden = !p8Var2.d.h;
            }
            td1Var.getMessagesController().getTopicsController().onTopicEdited(td1Var.f42660a, td1Var.f42668w);
            td1Var.finishFragment();
        }
    }
}
