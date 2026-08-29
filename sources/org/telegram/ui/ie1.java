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
public final class ie1 extends org.telegram.ui.ActionBar.k {
    public final Context f39227a;
    public final ze1 f39228b;

    public ie1(ze1 ze1Var, Context context) {
        this.f39228b = ze1Var;
        this.f39227a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        we1 we1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        ze1 ze1Var = this.f39228b;
        TopicsController topicsController = ze1Var.f45188s;
        ArrayList arrayList = ze1Var.f45158b;
        HashSet hashSet = ze1Var.W;
        long j10 = ze1Var.f45155a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                ze1Var.C0();
                return;
            } else {
                ze1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                ze1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                ze1Var.E = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                tn tnVar = new tn(bundle);
                tnVar.f42811fa = true;
                ze1Var.presentFragment(tnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = ze1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = ze1Var.F;
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
                    long j11 = chatFull.f22393id;
                    i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
                    ge1 ge1Var = new ge1(this, this.f39227a, i11, hVar, chatFull.f22393id, ze1Var, j11);
                    ge1Var.f34611h0 = new f3.e(this, j11, 11);
                    ge1Var.show();
                    return;
                }
                return;
            case 3:
                td1 a02 = td1.a0(j10, 0L);
                ze1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new od1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    ze1Var.f45198y0 = true;
                    ze1Var.J0 = true;
                    TopicsController topicsController2 = ze1Var.f45188s;
                    long j12 = ze1Var.f45155a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, ze1Var);
                }
                ze1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ze1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), ze1Var.f45196x0);
                }
                ze1Var.C0();
                return;
            case 7:
                ze1Var.D0(hashSet, new ky0(this, 21));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        ze1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f22444id);
                        MessagesController messagesController = ze1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f22444id, 0, true, 0);
                        ze1Var.getMessagesStorage().updateRepliesMaxReadId(ze1Var.f45155a, findTopic.f22444id, findTopic.top_message, 0, true);
                    }
                }
                ze1Var.C0();
                return;
            case 9:
            case 10:
                ze1Var.J0 = true;
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
                ze1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = ze1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.c5.s(ze1Var, false, chat, null, false, true, false, false, new kl0(25, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < ze1Var.J.getChildCount()) {
                        View childAt = ze1Var.J.getChildAt(i17);
                        if ((childAt instanceof we1) && (tL_forumTopic = (we1Var = (we1) childAt).J) != null && tL_forumTopic.f22444id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        we1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((pe1) arrayList.get(i13)).f41396c != null && ((pe1) arrayList.get(i13)).f41396c.f22444id == 1) {
                                tL_forumTopic2 = ((pe1) arrayList.get(i13)).f41396c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (ze1Var.f45195x <= 0) {
                        ze1Var.A = true;
                        ze1Var.f45197y = 2;
                    }
                    ze1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (we1Var != null) {
                        ze1Var.X0 = we1Var;
                    }
                    ze1Var.J.z1(!tL_forumTopic2.hidden, we1Var);
                    ze1Var.U0(true, true);
                    if (we1Var != null) {
                        we1Var.setTopicIcon(we1Var.U4);
                    }
                }
                ze1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(ze1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    v5 v5Var = new v5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ze1Var.T;
                    v5Var.N = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new n5(v5Var, 0));
                    }
                    ze1Var.presentFragment(v5Var);
                    return;
                }
                ze1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                y21.K(-j10, ze1Var);
                return;
            default:
                return;
        }
    }
}
