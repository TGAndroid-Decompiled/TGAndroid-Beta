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
public final class be1 extends org.telegram.ui.ActionBar.j {
    public final Context f35622a;
    public final re1 f35623b;

    public be1(re1 re1Var, Context context) {
        this.f35623b = re1Var;
        this.f35622a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        oe1 oe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        re1 re1Var = this.f35623b;
        TopicsController topicsController = re1Var.f41187s;
        ArrayList arrayList = re1Var.f41155b;
        HashSet hashSet = re1Var.f41153a0;
        long j10 = re1Var.f41152a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                re1Var.C0();
                return;
            } else {
                re1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                re1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                re1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                qn qnVar = new qn(bundle);
                qnVar.f40738ja = true;
                re1Var.presentFragment(qnVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = re1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = re1Var.J;
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
                    long j11 = chatFull.f20281id;
                    i11 = ((org.telegram.ui.ActionBar.n2) re1Var).currentAccount;
                    zd1 zd1Var = new zd1(this, this.f35622a, i11, hVar, chatFull.f20281id, re1Var, j11);
                    zd1Var.f31183l0 = new ci.d1(this, j11, 11);
                    zd1Var.show();
                    return;
                }
                return;
            case 3:
                nd1 a02 = nd1.a0(j10, 0L);
                re1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new id1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    re1Var.C0 = true;
                    re1Var.N0 = true;
                    TopicsController topicsController2 = re1Var.f41187s;
                    long j12 = re1Var.f41152a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, re1Var);
                }
                re1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    re1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), re1Var.B0);
                }
                re1Var.C0();
                return;
            case 7:
                re1Var.D0(hashSet, new qy0(this, 20));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        re1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f20332id);
                        MessagesController messagesController = re1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f20332id, 0, true, 0);
                        re1Var.getMessagesStorage().updateRepliesMaxReadId(re1Var.f41152a, findTopic.f20332id, findTopic.top_message, 0, true);
                    }
                }
                re1Var.C0();
                return;
            case 9:
            case 10:
                re1Var.N0 = true;
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
                re1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = re1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.f5.r(re1Var, false, chat, null, false, true, false, false, new en0(21, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < re1Var.N.getChildCount()) {
                        View childAt = re1Var.N.getChildAt(i17);
                        if ((childAt instanceof oe1) && (tL_forumTopic = (oe1Var = (oe1) childAt).N) != null && tL_forumTopic.f20332id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        oe1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((ie1) arrayList.get(i13)).f37963c != null && ((ie1) arrayList.get(i13)).f37963c.f20332id == 1) {
                                tL_forumTopic2 = ((ie1) arrayList.get(i13)).f37963c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (re1Var.f41194x <= 0) {
                        re1Var.E = true;
                        re1Var.f41196y = 2;
                    }
                    re1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (oe1Var != null) {
                        re1Var.f41157b1 = oe1Var;
                    }
                    re1Var.N.A1(!tL_forumTopic2.hidden, oe1Var);
                    re1Var.U0(true, true);
                    if (oe1Var != null) {
                        oe1Var.setTopicIcon(oe1Var.f39869c5);
                    }
                }
                re1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(re1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = re1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                    }
                    re1Var.presentFragment(z5Var);
                    return;
                }
                re1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                o21.M(-j10, re1Var);
                return;
            default:
                return;
        }
    }
}
