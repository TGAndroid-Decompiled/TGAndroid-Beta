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
public final class ge1 extends org.telegram.ui.ActionBar.j {
    public final Context f37551a;
    public final xe1 f37552b;

    public ge1(xe1 xe1Var, Context context) {
        this.f37552b = xe1Var;
        this.f37551a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        te1 te1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        xe1 xe1Var = this.f37552b;
        TopicsController topicsController = xe1Var.f43583s;
        ArrayList arrayList = xe1Var.f43548b;
        HashSet hashSet = xe1Var.f43546a0;
        long j10 = xe1Var.f43545a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                xe1Var.B0();
                return;
            } else {
                xe1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                xe1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                xe1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                sn snVar = new sn(bundle);
                snVar.f41717va = true;
                xe1Var.presentFragment(snVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = xe1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = xe1Var.J;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.h hVar = new a0.h();
                    if (chatFull.participants != null) {
                        while (i13 < chatFull.participants.participants.size()) {
                            hVar.k(null, chatFull.participants.participants.get(i13).user_id);
                            i13++;
                        }
                    }
                    long j11 = chatFull.f20345id;
                    i11 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
                    ee1 ee1Var = new ee1(this, this.f37551a, i11, hVar, chatFull.f20345id, xe1Var, j11);
                    ee1Var.f31357l0 = new ci.d1(this, j11, 11);
                    ee1Var.show();
                    return;
                }
                return;
            case 3:
                sd1 a02 = sd1.a0(j10, 0L);
                xe1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new nd1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    xe1Var.C0 = true;
                    xe1Var.N0 = true;
                    TopicsController topicsController2 = xe1Var.f43583s;
                    long j12 = xe1Var.f43545a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, xe1Var);
                }
                xe1Var.B0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    xe1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), xe1Var.B0);
                }
                xe1Var.B0();
                return;
            case 7:
                xe1Var.C0(hashSet, new ly0(this, 21));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        xe1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f20396id);
                        MessagesController messagesController = xe1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f20396id, 0, true, 0);
                        xe1Var.getMessagesStorage().updateRepliesMaxReadId(xe1Var.f43545a, findTopic.f20396id, findTopic.top_message, 0, true);
                    }
                }
                xe1Var.B0();
                return;
            case 9:
            case 10:
                xe1Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    int intValue2 = ((Integer) arrayList3.get(i16)).intValue();
                    if (i10 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    topicsController.toggleCloseTopic(j10, intValue2, z11);
                }
                xe1Var.B0();
                return;
            case 11:
                TLRPC.Chat chat = xe1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.d5.r(xe1Var, false, chat, null, false, true, false, false, new pl0(23, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < xe1Var.N.getChildCount()) {
                        View childAt = xe1Var.N.getChildAt(i17);
                        if ((childAt instanceof te1) && (tL_forumTopic = (te1Var = (te1) childAt).N) != null && tL_forumTopic.f20396id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        te1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((ne1) arrayList.get(i13)).f39813c != null && ((ne1) arrayList.get(i13)).f39813c.f20396id == 1) {
                                tL_forumTopic2 = ((ne1) arrayList.get(i13)).f39813c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (xe1Var.f43590x <= 0) {
                        xe1Var.E = true;
                        xe1Var.f43592y = 2;
                    }
                    xe1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (te1Var != null) {
                        xe1Var.f43553c1 = te1Var;
                    }
                    xe1Var.N.F1(!tL_forumTopic2.hidden, te1Var);
                    xe1Var.U0(true, true);
                    if (te1Var != null) {
                        te1Var.setTopicIcon(te1Var.f42027c5);
                    }
                }
                xe1Var.B0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(xe1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = xe1Var.X;
                    y5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.R, y5Var.T, new q5(y5Var, 0));
                    }
                    xe1Var.presentFragment(y5Var);
                    return;
                }
                xe1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                r21.O(-j10, xe1Var);
                return;
            default:
                return;
        }
    }
}
