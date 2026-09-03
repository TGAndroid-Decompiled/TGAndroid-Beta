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
public final class cf1 extends org.telegram.ui.ActionBar.j {
    public final Context f35787a;
    public final sf1 f35788b;

    public cf1(sf1 sf1Var, Context context) {
        this.f35788b = sf1Var;
        this.f35787a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z4;
        int i12;
        boolean z10;
        pf1 pf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        sf1 sf1Var = this.f35788b;
        TopicsController topicsController = sf1Var.f41222s;
        ArrayList arrayList = sf1Var.f41191b;
        HashSet hashSet = sf1Var.X;
        long j10 = sf1Var.f41188a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                sf1Var.C0();
                return;
            } else {
                sf1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                sf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                sf1Var.F = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                xn xnVar = new xn(bundle);
                xnVar.f43179ga = true;
                sf1Var.presentFragment(xnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = sf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = sf1Var.G;
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
                    long j11 = chatFull.f20846id;
                    i11 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
                    af1 af1Var = new af1(this, this.f35787a, i11, hVar, chatFull.f20846id, sf1Var, j11);
                    af1Var.f26475i0 = new f3.e(this, j11, 10);
                    af1Var.show();
                    return;
                }
                return;
            case 3:
                oe1 a02 = oe1.a0(j10, 0L);
                sf1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new je1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    sf1Var.f41233z0 = true;
                    sf1Var.K0 = true;
                    TopicsController topicsController2 = sf1Var.f41222s;
                    long j12 = sf1Var.f41188a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z4, sf1Var);
                }
                sf1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    sf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), sf1Var.f41232y0);
                }
                sf1Var.C0();
                return;
            case 7:
                sf1Var.D0(hashSet, new sz0(this, 19));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        sf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f20897id);
                        MessagesController messagesController = sf1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f20897id, 0, true, 0);
                        sf1Var.getMessagesStorage().updateRepliesMaxReadId(sf1Var.f41188a, findTopic.f20897id, findTopic.top_message, 0, true);
                    }
                }
                sf1Var.C0();
                return;
            case 9:
            case 10:
                sf1Var.K0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    int intValue2 = ((Integer) arrayList3.get(i16)).intValue();
                    if (i10 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController.toggleCloseTopic(j10, intValue2, z10);
                }
                sf1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = sf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.z4.s(sf1Var, false, chat, null, false, true, false, false, new vl0(24, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < sf1Var.K.getChildCount()) {
                        View childAt = sf1Var.K.getChildAt(i17);
                        if ((childAt instanceof pf1) && (tL_forumTopic = (pf1Var = (pf1) childAt).K) != null && tL_forumTopic.f20897id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        pf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((jf1) arrayList.get(i13)).f38044c != null && ((jf1) arrayList.get(i13)).f38044c.f20897id == 1) {
                                tL_forumTopic2 = ((jf1) arrayList.get(i13)).f38044c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (sf1Var.f41229x <= 0) {
                        sf1Var.B = true;
                        sf1Var.f41231y = 2;
                    }
                    sf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (pf1Var != null) {
                        sf1Var.Y0 = pf1Var;
                    }
                    sf1Var.K.y1(!tL_forumTopic2.hidden, pf1Var);
                    sf1Var.U0(true, true);
                    if (pf1Var != null) {
                        pf1Var.setTopicIcon(pf1Var.V4);
                    }
                }
                sf1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(sf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sf1Var.U;
                    y5Var.O = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                    }
                    sf1Var.presentFragment(y5Var);
                    return;
                }
                sf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                q31.K(-j10, sf1Var);
                return;
            default:
                return;
        }
    }
}
