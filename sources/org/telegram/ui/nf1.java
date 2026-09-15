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
public final class nf1 extends org.telegram.ui.ActionBar.j {
    public final Context f35970a;
    public final dg1 f35971b;

    public nf1(dg1 dg1Var, Context context) {
        this.f35971b = dg1Var;
        this.f35970a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        ag1 ag1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        dg1 dg1Var = this.f35971b;
        TopicsController topicsController = dg1Var.f33047s;
        ArrayList arrayList = dg1Var.f33015b;
        HashSet hashSet = dg1Var.f33013a0;
        long j3 = dg1Var.f33012a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                dg1Var.C0();
                return;
            } else {
                dg1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                dg1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                dg1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bo boVar = new bo(bundle);
                boVar.f32358ja = true;
                dg1Var.presentFragment(boVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = dg1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = dg1Var.J;
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
                    long j10 = chatFull.f18113id;
                    i11 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
                    lf1 lf1Var = new lf1(this, this.f35970a, i11, iVar, chatFull.f18113id, dg1Var, j10);
                    lf1Var.f22682l0 = new ai.z1(this, j10, 11);
                    lf1Var.show();
                    return;
                }
                return;
            case 3:
                ze1 a02 = ze1.a0(j3, 0L);
                dg1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new ue1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    dg1Var.C0 = true;
                    dg1Var.N0 = true;
                    TopicsController topicsController2 = dg1Var.f33047s;
                    long j11 = dg1Var.f33012a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j11, intValue, z10, dg1Var);
                }
                dg1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    dg1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), dg1Var.B0);
                }
                dg1Var.C0();
                return;
            case 7:
                dg1Var.D0(hashSet, new e01(this, 19));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        dg1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.f18164id);
                        MessagesController messagesController = dg1Var.getMessagesController();
                        long j12 = -j3;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j12, i15, 0, i12, false, findTopic.f18164id, 0, true, 0);
                        dg1Var.getMessagesStorage().updateRepliesMaxReadId(dg1Var.f33012a, findTopic.f18164id, findTopic.top_message, 0, true);
                    }
                }
                dg1Var.C0();
                return;
            case 9:
            case 10:
                dg1Var.N0 = true;
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
                dg1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = dg1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.c5.s(dg1Var, false, chat, null, false, true, false, false, new rv0(15, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < dg1Var.N.getChildCount()) {
                        View childAt = dg1Var.N.getChildAt(i17);
                        if ((childAt instanceof ag1) && (tL_forumTopic = (ag1Var = (ag1) childAt).N) != null && tL_forumTopic.f18164id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        ag1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((uf1) arrayList.get(i13)).f37995c != null && ((uf1) arrayList.get(i13)).f37995c.f18164id == 1) {
                                tL_forumTopic2 = ((uf1) arrayList.get(i13)).f37995c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (dg1Var.f33054x <= 0) {
                        dg1Var.E = true;
                        dg1Var.f33056y = 2;
                    }
                    dg1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (ag1Var != null) {
                        dg1Var.f33017b1 = ag1Var;
                    }
                    dg1Var.N.z1(!tL_forumTopic2.hidden, ag1Var);
                    dg1Var.U0(true, true);
                    if (ag1Var != null) {
                        ag1Var.setTopicIcon(ag1Var.Y4);
                    }
                }
                dg1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(dg1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    v5 v5Var = new v5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = dg1Var.X;
                    v5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new m5(v5Var, 0));
                    }
                    dg1Var.presentFragment(v5Var);
                    return;
                }
                dg1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                return;
            case 15:
                b41.L(-j3, dg1Var);
                return;
            default:
                return;
        }
    }
}
