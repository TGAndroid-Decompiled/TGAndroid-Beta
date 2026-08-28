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
public final class fe1 extends org.telegram.ui.ActionBar.j {
    public final Context f38245a;
    public final we1 f38246b;

    public fe1(we1 we1Var, Context context) {
        this.f38246b = we1Var;
        this.f38245a = context;
    }

    @Override
    public final void b(int i9) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i11;
        boolean z11;
        se1 se1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        we1 we1Var = this.f38246b;
        TopicsController topicsController = we1Var.f43774s;
        ArrayList arrayList = we1Var.f43744b;
        HashSet hashSet = we1Var.W;
        long j10 = we1Var.f43741a;
        if (i9 == -1) {
            if (hashSet.size() > 0) {
                we1Var.B0();
                return;
            } else {
                we1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i9) {
            case 1:
                we1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                we1Var.E = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                qn qnVar = new qn(bundle);
                qnVar.f41914fa = true;
                we1Var.presentFragment(qnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = we1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = we1Var.F;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.h hVar = new a0.h();
                    if (chatFull.participants != null) {
                        while (i12 < chatFull.participants.participants.size()) {
                            hVar.k(null, chatFull.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j11 = chatFull.f22381id;
                    i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
                    de1 de1Var = new de1(this, this.f38245a, i10, hVar, chatFull.f22381id, we1Var, j11);
                    de1Var.f29981h0 = new d3.e(this, j11, 11);
                    de1Var.show();
                    return;
                }
                return;
            case 3:
                rd1 Z = rd1.Z(j10, 0L);
                we1Var.presentFragment(Z);
                AndroidUtilities.runOnUIThread(new md1(Z, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    we1Var.f43784y0 = true;
                    we1Var.J0 = true;
                    TopicsController topicsController2 = we1Var.f43774s;
                    long j12 = we1Var.f43741a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i9 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, we1Var);
                }
                we1Var.B0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    we1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), we1Var.f43782x0);
                }
                we1Var.B0();
                return;
            case 7:
                we1Var.C0(hashSet, new ky0(this, 21));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i13)).intValue());
                    if (findTopic != null) {
                        we1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f22432id);
                        MessagesController messagesController = we1Var.getMessagesController();
                        long j13 = -j10;
                        int i14 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i11 = message.date;
                        } else {
                            i11 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i14, 0, i11, false, findTopic.f22432id, 0, true, 0);
                        we1Var.getMessagesStorage().updateRepliesMaxReadId(we1Var.f43741a, findTopic.f22432id, findTopic.top_message, 0, true);
                    }
                }
                we1Var.B0();
                return;
            case 9:
            case 10:
                we1Var.J0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    int intValue2 = ((Integer) arrayList3.get(i15)).intValue();
                    if (i9 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    topicsController.toggleCloseTopic(j10, intValue2, z11);
                }
                we1Var.B0();
                return;
            case 11:
                TLRPC.Chat chat = we1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.y4.s(we1Var, false, chat, null, false, true, false, false, new nl0(25, this, chat));
                return;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < we1Var.J.getChildCount()) {
                        View childAt = we1Var.J.getChildAt(i16);
                        if ((childAt instanceof se1) && (tL_forumTopic = (se1Var = (se1) childAt).J) != null && tL_forumTopic.f22432id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        se1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) != null && ((me1) arrayList.get(i12)).f40405c != null && ((me1) arrayList.get(i12)).f40405c.f22432id == 1) {
                                tL_forumTopic2 = ((me1) arrayList.get(i12)).f40405c;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (we1Var.f43781x <= 0) {
                        we1Var.A = true;
                        we1Var.f43783y = 2;
                    }
                    we1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (se1Var != null) {
                        we1Var.X0 = se1Var;
                    }
                    we1Var.J.z1(!tL_forumTopic2.hidden, se1Var);
                    we1Var.U0(true, true);
                    if (se1Var != null) {
                        se1Var.setTopicIcon(se1Var.U4);
                    }
                }
                we1Var.B0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(we1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    u5 u5Var = new u5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = we1Var.T;
                    u5Var.N = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        u5Var.getMessagesController().getBoostsController().userCanBoostChannel(u5Var.L, u5Var.N, new m5(u5Var, 0));
                    }
                    we1Var.presentFragment(u5Var);
                    return;
                }
                we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                y21.K(-j10, we1Var);
                return;
            default:
                return;
        }
    }
}
