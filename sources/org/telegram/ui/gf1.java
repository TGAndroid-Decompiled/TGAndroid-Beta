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
public final class gf1 extends org.telegram.ui.ActionBar.j {
    public final Context f33556a;
    public final wf1 f33557b;

    public gf1(wf1 wf1Var, Context context) {
        this.f33557b = wf1Var;
        this.f33556a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        tf1 tf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        wf1 wf1Var = this.f33557b;
        TopicsController topicsController = wf1Var.f38971s;
        ArrayList arrayList = wf1Var.f38939b;
        HashSet hashSet = wf1Var.f38937a0;
        long j3 = wf1Var.f38936a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                wf1Var.C0();
                return;
            } else {
                wf1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                wf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                wf1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                xn xnVar = new xn(bundle);
                xnVar.f39430ja = true;
                wf1Var.presentFragment(xnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = wf1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = wf1Var.J;
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
                    long j10 = chatFull.f18084id;
                    i11 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
                    ef1 ef1Var = new ef1(this, this.f33556a, i11, iVar, chatFull.f18084id, wf1Var, j10);
                    ef1Var.f22962l0 = new ai.z1(this, j10, 11);
                    ef1Var.show();
                    return;
                }
                return;
            case 3:
                se1 a02 = se1.a0(j3, 0L);
                wf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ne1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    wf1Var.C0 = true;
                    wf1Var.N0 = true;
                    TopicsController topicsController2 = wf1Var.f38971s;
                    long j11 = wf1Var.f38936a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j11, intValue, z10, wf1Var);
                }
                wf1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    wf1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), wf1Var.B0);
                }
                wf1Var.C0();
                return;
            case 7:
                wf1Var.D0(hashSet, new xz0(this, 19));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        wf1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.f18135id);
                        MessagesController messagesController = wf1Var.getMessagesController();
                        long j12 = -j3;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j12, i15, 0, i12, false, findTopic.f18135id, 0, true, 0);
                        wf1Var.getMessagesStorage().updateRepliesMaxReadId(wf1Var.f38936a, findTopic.f18135id, findTopic.top_message, 0, true);
                    }
                }
                wf1Var.C0();
                return;
            case 9:
            case 10:
                wf1Var.N0 = true;
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
                wf1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = wf1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.e5.s(wf1Var, false, chat, null, false, true, false, false, new kv0(16, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < wf1Var.N.getChildCount()) {
                        View childAt = wf1Var.N.getChildAt(i17);
                        if ((childAt instanceof tf1) && (tL_forumTopic = (tf1Var = (tf1) childAt).N) != null && tL_forumTopic.f18135id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        tf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((nf1) arrayList.get(i13)).f35518c != null && ((nf1) arrayList.get(i13)).f35518c.f18135id == 1) {
                                tL_forumTopic2 = ((nf1) arrayList.get(i13)).f35518c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (wf1Var.f38978x <= 0) {
                        wf1Var.E = true;
                        wf1Var.f38980y = 2;
                    }
                    wf1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (tf1Var != null) {
                        wf1Var.f38941b1 = tf1Var;
                    }
                    wf1Var.N.z1(!tL_forumTopic2.hidden, tf1Var);
                    wf1Var.U0(true, true);
                    if (tf1Var != null) {
                        tf1Var.setTopicIcon(tf1Var.Y4);
                    }
                }
                wf1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(wf1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    w5 w5Var = new w5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wf1Var.X;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                    }
                    wf1Var.presentFragment(w5Var);
                    return;
                }
                wf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                return;
            case 15:
                u31.L(-j3, wf1Var);
                return;
            default:
                return;
        }
    }
}
