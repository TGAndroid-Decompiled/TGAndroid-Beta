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
public final class me1 extends org.telegram.ui.ActionBar.j {
    public final Context f41426a;
    public final cf1 f41427b;

    public me1(cf1 cf1Var, Context context) {
        this.f41427b = cf1Var;
        this.f41426a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        ze1 ze1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        cf1 cf1Var = this.f41427b;
        TopicsController topicsController = cf1Var.f38326s;
        ArrayList arrayList = cf1Var.f38291b;
        HashSet hashSet = cf1Var.f38289a0;
        long j10 = cf1Var.f38288a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                cf1Var.C0();
                return;
            } else {
                cf1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                cf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                cf1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                wn wnVar = new wn(bundle);
                wnVar.f45374za = true;
                cf1Var.presentFragment(wnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = cf1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = cf1Var.J;
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
                    long j11 = chatFull.f22029id;
                    i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
                    ke1 ke1Var = new ke1(this, this.f41426a, i11, hVar, chatFull.f22029id, cf1Var, j11);
                    ke1Var.f35272l0 = new di.d1(this, j11, 11);
                    ke1Var.show();
                    return;
                }
                return;
            case 3:
                yd1 b02 = yd1.b0(j10, 0L);
                cf1Var.presentFragment(b02);
                AndroidUtilities.runOnUIThread(new td1(b02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    cf1Var.C0 = true;
                    cf1Var.N0 = true;
                    TopicsController topicsController2 = cf1Var.f38326s;
                    long j12 = cf1Var.f38288a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, cf1Var);
                }
                cf1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    cf1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), cf1Var.B0);
                }
                cf1Var.C0();
                return;
            case 7:
                cf1Var.D0(hashSet, new oy0(this, 23));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        cf1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f22080id);
                        MessagesController messagesController = cf1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f22080id, 0, true, 0);
                        cf1Var.getMessagesStorage().updateRepliesMaxReadId(cf1Var.f38288a, findTopic.f22080id, findTopic.top_message, 0, true);
                    }
                }
                cf1Var.C0();
                return;
            case 9:
            case 10:
                cf1Var.N0 = true;
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
                cf1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = cf1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(cf1Var, false, chat, null, false, true, false, false, new cf0(27, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < cf1Var.N.getChildCount()) {
                        View childAt = cf1Var.N.getChildAt(i17);
                        if ((childAt instanceof ze1) && (tL_forumTopic = (ze1Var = (ze1) childAt).N) != null && tL_forumTopic.f22080id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        ze1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((te1) arrayList.get(i13)).f43620c != null && ((te1) arrayList.get(i13)).f43620c.f22080id == 1) {
                                tL_forumTopic2 = ((te1) arrayList.get(i13)).f43620c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (cf1Var.f38333x <= 0) {
                        cf1Var.E = true;
                        cf1Var.f38335y = 2;
                    }
                    cf1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (ze1Var != null) {
                        cf1Var.f38296c1 = ze1Var;
                    }
                    cf1Var.N.F1(!tL_forumTopic2.hidden, ze1Var);
                    cf1Var.V0(true, true);
                    if (ze1Var != null) {
                        ze1Var.setTopicIcon(ze1Var.f46245c5);
                    }
                }
                cf1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(cf1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    x5 x5Var = new x5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = cf1Var.X;
                    x5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                    }
                    cf1Var.presentFragment(x5Var);
                    return;
                }
                cf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                x21.O(-j10, cf1Var);
                return;
            default:
                return;
        }
    }
}
