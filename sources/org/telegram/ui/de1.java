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
public final class de1 extends org.telegram.ui.ActionBar.j {
    public final Context f36202a;
    public final te1 f36203b;

    public de1(te1 te1Var, Context context) {
        this.f36203b = te1Var;
        this.f36202a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        qe1 qe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        te1 te1Var = this.f36203b;
        TopicsController topicsController = te1Var.f41740s;
        ArrayList arrayList = te1Var.f41708b;
        HashSet hashSet = te1Var.f41706a0;
        long j10 = te1Var.f41705a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                te1Var.C0();
                return;
            } else {
                te1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                te1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                te1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                sn snVar = new sn(bundle);
                snVar.f41287ja = true;
                te1Var.presentFragment(snVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = te1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = te1Var.J;
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
                    long j11 = chatFull.f20280id;
                    i11 = ((org.telegram.ui.ActionBar.n2) te1Var).currentAccount;
                    be1 be1Var = new be1(this, this.f36202a, i11, hVar, chatFull.f20280id, te1Var, j11);
                    be1Var.f31211l0 = new ci.d1(this, j11, 11);
                    be1Var.show();
                    return;
                }
                return;
            case 3:
                pd1 a02 = pd1.a0(j10, 0L);
                te1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new kd1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    te1Var.C0 = true;
                    te1Var.N0 = true;
                    TopicsController topicsController2 = te1Var.f41740s;
                    long j12 = te1Var.f41705a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, te1Var);
                }
                te1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    te1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), te1Var.B0);
                }
                te1Var.C0();
                return;
            case 7:
                te1Var.D0(hashSet, new sy0(this, 20));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        te1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f20331id);
                        MessagesController messagesController = te1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f20331id, 0, true, 0);
                        te1Var.getMessagesStorage().updateRepliesMaxReadId(te1Var.f41705a, findTopic.f20331id, findTopic.top_message, 0, true);
                    }
                }
                te1Var.C0();
                return;
            case 9:
            case 10:
                te1Var.N0 = true;
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
                te1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = te1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.f5.r(te1Var, false, chat, null, false, true, false, false, new gn0(21, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < te1Var.N.getChildCount()) {
                        View childAt = te1Var.N.getChildAt(i17);
                        if ((childAt instanceof qe1) && (tL_forumTopic = (qe1Var = (qe1) childAt).N) != null && tL_forumTopic.f20331id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        qe1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((ke1) arrayList.get(i13)).f38515c != null && ((ke1) arrayList.get(i13)).f38515c.f20331id == 1) {
                                tL_forumTopic2 = ((ke1) arrayList.get(i13)).f38515c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (te1Var.f41747x <= 0) {
                        te1Var.E = true;
                        te1Var.f41749y = 2;
                    }
                    te1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (qe1Var != null) {
                        te1Var.f41710b1 = qe1Var;
                    }
                    te1Var.N.A1(!tL_forumTopic2.hidden, qe1Var);
                    te1Var.U0(true, true);
                    if (qe1Var != null) {
                        qe1Var.setTopicIcon(qe1Var.f40410c5);
                    }
                }
                te1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(te1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    z5 z5Var = new z5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = te1Var.X;
                    z5Var.R = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, 0));
                    }
                    te1Var.presentFragment(z5Var);
                    return;
                }
                te1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                q21.M(-j10, te1Var);
                return;
            default:
                return;
        }
    }
}
