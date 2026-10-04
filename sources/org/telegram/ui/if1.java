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
public final class if1 extends org.telegram.ui.ActionBar.j {
    public final Context f37419a;
    public final yf1 f37420b;

    public if1(yf1 yf1Var, Context context) {
        this.f37420b = yf1Var;
        this.f37419a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        vf1 vf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        yf1 yf1Var = this.f37420b;
        TopicsController topicsController = yf1Var.f43206s;
        ArrayList arrayList = yf1Var.f43173b;
        HashSet hashSet = yf1Var.f43171a0;
        long j3 = yf1Var.f43170a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                yf1Var.C0();
                return;
            } else {
                yf1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                yf1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j3, true);
                yf1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                yn ynVar = new yn(bundle);
                ynVar.ha = true;
                yf1Var.presentFragment(ynVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = yf1Var.getMessagesController().getChatFull(j3);
                TLRPC.ChatFull chatFull2 = yf1Var.J;
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
                    long j10 = chatFull.f20043id;
                    i11 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
                    gf1 gf1Var = new gf1(this, this.f37419a, i11, iVar, chatFull.f20043id, yf1Var, j10);
                    gf1Var.f29546l0 = new ai.z1(this, j10, 11);
                    gf1Var.show();
                    return;
                }
                return;
            case 3:
                ue1 Z = ue1.Z(j3, 0L);
                yf1Var.presentFragment(Z);
                AndroidUtilities.runOnUIThread(new pe1(Z, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    yf1Var.C0 = true;
                    yf1Var.N0 = true;
                    TopicsController topicsController2 = yf1Var.f43206s;
                    long j11 = yf1Var.f43170a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j11, intValue, z10, yf1Var);
                }
                yf1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    yf1Var.getNotificationsController().muteDialog(-j3, ((Integer) it.next()).intValue(), yf1Var.B0);
                }
                yf1Var.C0();
                return;
            case 7:
                yf1Var.D0(hashSet, new hz0(this, 21));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        yf1Var.getMessagesController().markMentionsAsRead(-j3, findTopic.f20094id);
                        MessagesController messagesController = yf1Var.getMessagesController();
                        long j12 = -j3;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j12, i15, 0, i12, false, findTopic.f20094id, 0, true, 0);
                        yf1Var.getMessagesStorage().updateRepliesMaxReadId(yf1Var.f43170a, findTopic.f20094id, findTopic.top_message, 0, true);
                    }
                }
                yf1Var.C0();
                return;
            case 9:
            case 10:
                yf1Var.N0 = true;
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
                yf1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = yf1Var.getMessagesController().getChat(Long.valueOf(j3));
                org.telegram.ui.Components.e5.s(yf1Var, false, chat, null, false, true, false, false, new fs0(18, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < yf1Var.N.getChildCount()) {
                        View childAt = yf1Var.N.getChildAt(i17);
                        if ((childAt instanceof vf1) && (tL_forumTopic = (vf1Var = (vf1) childAt).N) != null && tL_forumTopic.f20094id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        vf1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((pf1) arrayList.get(i13)).f39477c != null && ((pf1) arrayList.get(i13)).f39477c.f20094id == 1) {
                                tL_forumTopic2 = ((pf1) arrayList.get(i13)).f39477c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (yf1Var.f43213x <= 0) {
                        yf1Var.E = true;
                        yf1Var.f43215y = 2;
                    }
                    yf1Var.getMessagesController().getTopicsController().toggleShowTopic(j3, 1, tL_forumTopic2.hidden);
                    if (vf1Var != null) {
                        yf1Var.f43175b1 = vf1Var;
                    }
                    yf1Var.N.B1(!tL_forumTopic2.hidden, vf1Var);
                    yf1Var.U0(true, true);
                    if (vf1Var != null) {
                        vf1Var.setTopicIcon(vf1Var.Y4);
                    }
                }
                yf1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(yf1Var.getMessagesController().getChat(Long.valueOf(j3)))) {
                    w5 w5Var = new w5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = yf1Var.X;
                    w5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                    }
                    yf1Var.presentFragment(w5Var);
                    return;
                }
                yf1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j3));
                return;
            case 15:
                v31.J(-j3, yf1Var);
                return;
            default:
                return;
        }
    }
}
