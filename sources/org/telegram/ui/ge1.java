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

    public final Context f38397a;

    public final we1 f38398b;

    public ge1(we1 we1Var, Context context) {
        this.f38398b = we1Var;
        this.f38397a = context;
    }

    @Override
    public final void b(int i10) {
        TLRPC.ChatParticipants chatParticipants;
        te1 te1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        we1 we1Var = this.f38398b;
        TopicsController topicsController = we1Var.f43752s;
        ArrayList arrayList = we1Var.f43722b;
        HashSet hashSet = we1Var.W;
        long j10 = we1Var.f43719a;
        if (i10 == -1) {
            if (hashSet.size() <= 0) {
                we1Var.finishFragment();
                return;
            }
            we1Var.C0();
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i11 = 0;
        switch (i10) {
            case 1:
                we1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                we1Var.E = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                rn rnVar = new rn(bundle);
                rnVar.f42050fa = true;
                we1Var.presentFragment(rnVar);
                break;
            case 2:
                TLRPC.ChatFull chatFull = we1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = we1Var.F;
                if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                    chatFull.participants = chatParticipants;
                }
                if (chatFull != null) {
                    a0.h hVar = new a0.h();
                    if (chatFull.participants != null) {
                        while (i11 < chatFull.participants.participants.size()) {
                            hVar.k(null, chatFull.participants.participants.get(i11).user_id);
                            i11++;
                        }
                    }
                    long j11 = chatFull.f22381id;
                    ee1 ee1Var = new ee1(this, this.f38397a, ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount, hVar, chatFull.f22381id, we1Var, j11);
                    ee1Var.f31521h0 = new d3.e(this, j11, 11);
                    ee1Var.show();
                }
                break;
            case 3:
                sd1 sd1VarA0 = sd1.a0(j10, 0L);
                we1Var.presentFragment(sd1VarA0);
                AndroidUtilities.runOnUIThread(new nd1(sd1VarA0, 1), 200L);
                break;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    we1Var.f43762y0 = true;
                    we1Var.J0 = true;
                    we1Var.f43752s.pinTopic(we1Var.f43719a, ((Integer) hashSet.iterator().next()).intValue(), i10 == 4, we1Var);
                }
                we1Var.C0();
                break;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    we1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), we1Var.f43760x0);
                }
                we1Var.C0();
                break;
            case 7:
                we1Var.D0(hashSet, new ky0(this, 21));
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i12)).intValue());
                    if (tL_forumTopicFindTopic != null) {
                        we1Var.getMessagesController().markMentionsAsRead(-j10, tL_forumTopicFindTopic.f22432id);
                        MessagesController messagesController = we1Var.getMessagesController();
                        long j12 = -j10;
                        int i13 = tL_forumTopicFindTopic.top_message;
                        TLRPC.Message message = tL_forumTopicFindTopic.topMessage;
                        messagesController.markDialogAsRead(j12, i13, 0, message != null ? message.date : 0, false, tL_forumTopicFindTopic.f22432id, 0, true, 0);
                        we1Var.getMessagesStorage().updateRepliesMaxReadId(we1Var.f43719a, tL_forumTopicFindTopic.f22432id, tL_forumTopicFindTopic.top_message, 0, true);
                    }
                }
                we1Var.C0();
                break;
            case 9:
            case 10:
                we1Var.J0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    topicsController.toggleCloseTopic(j10, ((Integer) arrayList3.get(i14)).intValue(), i10 == 9);
                }
                we1Var.C0();
                break;
            case 11:
                TLRPC.Chat chat = we1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.y4.s(we1Var, false, chat, null, false, true, false, false, new nl0(25, this, chat));
                break;
            case 12:
            case 13:
                int i15 = 0;
                while (true) {
                    if (i15 < we1Var.J.getChildCount()) {
                        View childAt = we1Var.J.getChildAt(i15);
                        if ((childAt instanceof te1) && (tL_forumTopic = (te1Var = (te1) childAt).J) != null && tL_forumTopic.f22432id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i15++;
                        }
                    } else {
                        te1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (i11 < arrayList.size()) {
                        if (arrayList.get(i11) == null || ((ne1) arrayList.get(i11)).f40813c == null || ((ne1) arrayList.get(i11)).f40813c.f22432id != 1) {
                            i11++;
                        } else {
                            tL_forumTopic2 = ((ne1) arrayList.get(i11)).f40813c;
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (we1Var.f43759x <= 0) {
                        we1Var.A = true;
                        we1Var.f43761y = 2;
                    }
                    we1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (te1Var != null) {
                        we1Var.X0 = te1Var;
                    }
                    we1Var.J.z1(!tL_forumTopic2.hidden, te1Var);
                    we1Var.U0(true, true);
                    if (te1Var != null) {
                        te1Var.setTopicIcon(te1Var.U4);
                    }
                }
                we1Var.C0();
                break;
            case 14:
                if (ChatObject.hasAdminRights(we1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    v5 v5Var = new v5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = we1Var.T;
                    v5Var.N = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new n5(v5Var, 0));
                    }
                    we1Var.presentFragment(v5Var);
                } else {
                    we1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                }
                break;
            case 15:
                x21.L(-j10, we1Var);
                break;
        }
    }
}
