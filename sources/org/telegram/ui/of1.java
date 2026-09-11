package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class of1 extends org.telegram.ui.ActionBar.j {
    public final Context f39236a;
    public final eg1 f39237b;

    public of1(eg1 eg1Var, Context context) {
        this.f39237b = eg1Var;
        this.f39236a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        bg1 bg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        eg1 eg1Var = this.f39237b;
        TopicsController topicsController = eg1Var.f36061s;
        ArrayList arrayList = eg1Var.f36028b;
        HashSet hashSet = eg1Var.f36026a0;
        long j3 = eg1Var.f36025a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                eg1Var.C0();
                return;
            } else {
                eg1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                eg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                eg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                co coVar = new co(bundle);
                coVar.f35307ja = true;
                eg1Var.presentFragment(coVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = eg1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = eg1Var.J;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.i iVar = new a0.i();
                    if (chatFull.participants != null) {
                        while (i13 < chatFull.participants.participants.size()) {
                            iVar.k(null, chatFull.participants.participants.get(i13).user_id);
                            i13++;
                        }
                    }
                    long j10 = chatFull.f19870id;
                    i11 = ((org.telegram.ui.ActionBar.n2) eg1Var).currentAccount;
                    mf1 mf1Var = new mf1(this, this.f39236a, i11, iVar, chatFull.f19870id, eg1Var, j10);
                    mf1Var.f24578l0 = new bi.p1(this, j10, 11);
                    mf1Var.show();
                    return;
                }
                return;
            case 3:
                af1 a02 = af1.a0(j3, 0L);
                eg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ve1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    eg1Var.C0 = true;
                    eg1Var.N0 = true;
                    TopicsController topicsController2 = eg1Var.f36061s;
                    long j11 = eg1Var.f36025a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j11, intValue, z10, eg1Var);
                }
                eg1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    eg1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), eg1Var.B0);
                }
                eg1Var.C0();
                return;
            case 7:
                eg1Var.D0(hashSet, new f01(this, 19));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        eg1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.f19921id);
                        MessagesController messagesController = eg1Var.getMessagesController();
                        long j12 = -j3;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j12, i15, 0, i12, false, findTopic.f19921id, 0, true, 0);
                        eg1Var.getMessagesStorage().updateRepliesMaxReadId(eg1Var.f36025a, findTopic.f19921id, findTopic.top_message, 0, true);
                    }
                }
                eg1Var.C0();
                return;
            case 9:
            case 10:
                eg1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    int intValue2 = ((Integer) arrayList3.get(i16)).intValue();
                    if (i10 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    topicsController.toggleCloseTopic(j3, intValue2, z11);
                }
                eg1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = eg1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.e5.s(eg1Var, false, chat, null, false, true, false, false, new qv0(16, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < eg1Var.N.getChildCount()) {
                        View childAt = eg1Var.N.getChildAt(i17);
                        if ((childAt instanceof bg1) && (tL_forumTopic = (bg1Var = (bg1) childAt).N) != null && tL_forumTopic.f19921id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        bg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((vf1) arrayList.get(i13)).f41533c != null && ((vf1) arrayList.get(i13)).f41533c.f19921id == 1) {
                                tL_forumTopic2 = ((vf1) arrayList.get(i13)).f41533c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (eg1Var.f36068x <= 0) {
                        eg1Var.E = true;
                        eg1Var.f36070y = 2;
                    }
                    eg1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (bg1Var != null) {
                        eg1Var.f36030b1 = bg1Var;
                    }
                    eg1Var.N.y1(!tL_forumTopic2.hidden, bg1Var);
                    eg1Var.U0(true, true);
                    if (bg1Var != null) {
                        bg1Var.setTopicIcon(bg1Var.Y4);
                    }
                }
                eg1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(eg1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    v5 v5Var = new v5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = eg1Var.X;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    eg1Var.presentFragment(v5Var);
                    return;
                }
                eg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                return;
            case 15:
                e41.L(-j3, eg1Var);
                return;
            default:
                return;
        }
    }
}
