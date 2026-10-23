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
public final class he1 extends org.telegram.ui.ActionBar.j {
    public final Context f37835a;
    public final ye1 f37836b;

    public he1(ye1 ye1Var, Context context) {
        this.f37836b = ye1Var;
        this.f37835a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        ue1 ue1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        ye1 ye1Var = this.f37836b;
        TopicsController topicsController = ye1Var.f43830s;
        ArrayList arrayList = ye1Var.f43795b;
        HashSet hashSet = ye1Var.f43793a0;
        long j10 = ye1Var.f43792a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                ye1Var.B0();
                return;
            } else {
                ye1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                ye1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                ye1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                sn snVar = new sn(bundle);
                snVar.f41720va = true;
                ye1Var.presentFragment(snVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = ye1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = ye1Var.J;
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
                    long j11 = chatFull.f20344id;
                    i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
                    fe1 fe1Var = new fe1(this, this.f37835a, i11, hVar, chatFull.f20344id, ye1Var, j11);
                    fe1Var.f32462l0 = new ci.d1(this, j11, 11);
                    fe1Var.show();
                    return;
                }
                return;
            case 3:
                td1 a02 = td1.a0(j10, 0L);
                ye1Var.presentFragment(a02);
                AndroidUtilities.runOnUIThread(new od1(a02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    ye1Var.C0 = true;
                    ye1Var.N0 = true;
                    TopicsController topicsController2 = ye1Var.f43830s;
                    long j12 = ye1Var.f43792a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, ye1Var);
                }
                ye1Var.B0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ye1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), ye1Var.B0);
                }
                ye1Var.B0();
                return;
            case 7:
                ye1Var.C0(hashSet, new my0(this, 21));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        ye1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f20395id);
                        MessagesController messagesController = ye1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f20395id, 0, true, 0);
                        ye1Var.getMessagesStorage().updateRepliesMaxReadId(ye1Var.f43792a, findTopic.f20395id, findTopic.top_message, 0, true);
                    }
                }
                ye1Var.B0();
                return;
            case 9:
            case 10:
                ye1Var.N0 = true;
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
                ye1Var.B0();
                return;
            case 11:
                TLRPC.Chat chat = ye1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.f5.s(ye1Var, false, chat, null, false, true, false, false, new ql0(23, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < ye1Var.N.getChildCount()) {
                        View childAt = ye1Var.N.getChildAt(i17);
                        if ((childAt instanceof ue1) && (tL_forumTopic = (ue1Var = (ue1) childAt).N) != null && tL_forumTopic.f20395id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        ue1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((oe1) arrayList.get(i13)).f40146c != null && ((oe1) arrayList.get(i13)).f40146c.f20395id == 1) {
                                tL_forumTopic2 = ((oe1) arrayList.get(i13)).f40146c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (ye1Var.f43837x <= 0) {
                        ye1Var.E = true;
                        ye1Var.f43839y = 2;
                    }
                    ye1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (ue1Var != null) {
                        ye1Var.f43800c1 = ue1Var;
                    }
                    ye1Var.N.F1(!tL_forumTopic2.hidden, ue1Var);
                    ye1Var.U0(true, true);
                    if (ue1Var != null) {
                        ue1Var.setTopicIcon(ue1Var.f42405c5);
                    }
                }
                ye1Var.B0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(ye1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    y5 y5Var = new y5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ye1Var.X;
                    y5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.R, y5Var.T, new q5(y5Var, 0));
                    }
                    ye1Var.presentFragment(y5Var);
                    return;
                }
                ye1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                s21.O(-j10, ye1Var);
                return;
            default:
                return;
        }
    }
}
