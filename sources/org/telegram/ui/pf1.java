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
public final class pf1 extends org.telegram.ui.ActionBar.j {
    public final Context f36619a;
    public final fg1 f36620b;

    public pf1(fg1 fg1Var, Context context) {
        this.f36620b = fg1Var;
        this.f36619a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        cg1 cg1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        fg1 fg1Var = this.f36620b;
        TopicsController topicsController = fg1Var.f33671s;
        ArrayList arrayList = fg1Var.f33639b;
        HashSet hashSet = fg1Var.f33637a0;
        long j3 = fg1Var.f33636a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                fg1Var.C0();
                return;
            } else {
                fg1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                fg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                fg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bo boVar = new bo(bundle);
                boVar.f32336ja = true;
                fg1Var.presentFragment(boVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = fg1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = fg1Var.J;
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
                    long j10 = chatFull.f18122id;
                    i11 = ((org.telegram.ui.ActionBar.o2) fg1Var).currentAccount;
                    nf1 nf1Var = new nf1(this, this.f36619a, i11, iVar, chatFull.f18122id, fg1Var, j10);
                    nf1Var.f22633l0 = new ai.z1(this, j10, 11);
                    nf1Var.show();
                    return;
                }
                return;
            case 3:
                bf1 a02 = bf1.a0(j3, 0L);
                fg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new we1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    fg1Var.C0 = true;
                    fg1Var.N0 = true;
                    TopicsController topicsController2 = fg1Var.f33671s;
                    long j11 = fg1Var.f33636a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j11, intValue, z10, fg1Var);
                }
                fg1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    fg1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), fg1Var.B0);
                }
                fg1Var.C0();
                return;
            case 7:
                fg1Var.D0(hashSet, new g01(this, 19));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        fg1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.f18173id);
                        MessagesController messagesController = fg1Var.getMessagesController();
                        long j12 = -j3;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j12, i15, 0, i12, false, findTopic.f18173id, 0, true, 0);
                        fg1Var.getMessagesStorage().updateRepliesMaxReadId(fg1Var.f33636a, findTopic.f18173id, findTopic.top_message, 0, true);
                    }
                }
                fg1Var.C0();
                return;
            case 9:
            case 10:
                fg1Var.N0 = true;
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
                fg1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = fg1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.c5.s(fg1Var, false, chat, null, false, true, false, false, new tv0(15, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < fg1Var.N.getChildCount()) {
                        View childAt = fg1Var.N.getChildAt(i17);
                        if ((childAt instanceof cg1) && (tL_forumTopic = (cg1Var = (cg1) childAt).N) != null && tL_forumTopic.f18173id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        cg1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((wf1) arrayList.get(i13)).f39026c != null && ((wf1) arrayList.get(i13)).f39026c.f18173id == 1) {
                                tL_forumTopic2 = ((wf1) arrayList.get(i13)).f39026c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (fg1Var.f33678x <= 0) {
                        fg1Var.E = true;
                        fg1Var.f33680y = 2;
                    }
                    fg1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (cg1Var != null) {
                        fg1Var.f33641b1 = cg1Var;
                    }
                    fg1Var.N.A1(!tL_forumTopic2.hidden, cg1Var);
                    fg1Var.U0(true, true);
                    if (cg1Var != null) {
                        cg1Var.setTopicIcon(cg1Var.Y4);
                    }
                }
                fg1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(fg1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    v5 v5Var = new v5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = fg1Var.X;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    fg1Var.presentFragment(v5Var);
                    return;
                }
                fg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                return;
            case 15:
                d41.L(-j3, fg1Var);
                return;
            default:
                return;
        }
    }
}
