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
public final class ke1 extends org.telegram.ui.ActionBar.j {
    public final Context f40926a;
    public final af1 f40927b;

    public ke1(af1 af1Var, Context context) {
        this.f40927b = af1Var;
        this.f40926a = context;
    }

    @Override
    public final void b(int i10) {
        int i11;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i12;
        boolean z11;
        xe1 xe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        af1 af1Var = this.f40927b;
        TopicsController topicsController = af1Var.f37772s;
        ArrayList arrayList = af1Var.f37737b;
        HashSet hashSet = af1Var.f37735a0;
        long j10 = af1Var.f37734a;
        if (i10 == -1) {
            if (hashSet.size() > 0) {
                af1Var.C0();
                return;
            } else {
                af1Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i13 = 0;
        switch (i10) {
            case 1:
                af1Var.getMessagesController().getTopicsController().toggleViewForumAsMessages(j10, true);
                af1Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j10);
                un unVar = new un(bundle);
                unVar.va = true;
                af1Var.presentFragment(unVar);
                return;
            case 2:
                TLRPC.ChatFull chatFull = af1Var.getMessagesController().getChatFull(j10);
                TLRPC.ChatFull chatFull2 = af1Var.J;
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
                    long j11 = chatFull.f22028id;
                    i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
                    ie1 ie1Var = new ie1(this, this.f40926a, i11, hVar, chatFull.f22028id, af1Var, j11);
                    ie1Var.f34955l0 = new di.d1(this, j11, 11);
                    ie1Var.show();
                    return;
                }
                return;
            case 3:
                wd1 b02 = wd1.b0(j10, 0L);
                af1Var.presentFragment(b02);
                AndroidUtilities.runOnUIThread(new rd1(b02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    af1Var.C0 = true;
                    af1Var.N0 = true;
                    TopicsController topicsController2 = af1Var.f37772s;
                    long j12 = af1Var.f37734a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    topicsController2.pinTopic(j12, intValue, z10, af1Var);
                }
                af1Var.C0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    af1Var.getNotificationsController().muteDialog(-j10, ((Integer) it.next()).intValue(), af1Var.B0);
                }
                af1Var.C0();
                return;
            case 7:
                af1Var.D0(hashSet, new my0(this, 23));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, ((Integer) arrayList2.get(i14)).intValue());
                    if (findTopic != null) {
                        af1Var.getMessagesController().markMentionsAsRead(-j10, findTopic.f22079id);
                        MessagesController messagesController = af1Var.getMessagesController();
                        long j13 = -j10;
                        int i15 = findTopic.top_message;
                        TLRPC.Message message = findTopic.topMessage;
                        if (message != null) {
                            i12 = message.date;
                        } else {
                            i12 = 0;
                        }
                        messagesController.markDialogAsRead(j13, i15, 0, i12, false, findTopic.f22079id, 0, true, 0);
                        af1Var.getMessagesStorage().updateRepliesMaxReadId(af1Var.f37734a, findTopic.f22079id, findTopic.top_message, 0, true);
                    }
                }
                af1Var.C0();
                return;
            case 9:
            case 10:
                af1Var.N0 = true;
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
                af1Var.C0();
                return;
            case 11:
                TLRPC.Chat chat = af1Var.getMessagesController().getChat(Long.valueOf(j10));
                org.telegram.ui.Components.g5.r(af1Var, false, chat, null, false, true, false, false, new af0(27, this, chat));
                return;
            case 12:
            case 13:
                int i17 = 0;
                while (true) {
                    if (i17 < af1Var.N.getChildCount()) {
                        View childAt = af1Var.N.getChildAt(i17);
                        if ((childAt instanceof xe1) && (tL_forumTopic = (xe1Var = (xe1) childAt).N) != null && tL_forumTopic.f22079id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i17++;
                        }
                    } else {
                        xe1Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i13 < arrayList.size()) {
                            if (arrayList.get(i13) != null && ((re1) arrayList.get(i13)).f43135c != null && ((re1) arrayList.get(i13)).f43135c.f22079id == 1) {
                                tL_forumTopic2 = ((re1) arrayList.get(i13)).f43135c;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (af1Var.f37779x <= 0) {
                        af1Var.E = true;
                        af1Var.f37781y = 2;
                    }
                    af1Var.getMessagesController().getTopicsController().toggleShowTopic(j10, 1, tL_forumTopic2.hidden);
                    if (xe1Var != null) {
                        af1Var.f37742c1 = xe1Var;
                    }
                    af1Var.N.F1(!tL_forumTopic2.hidden, xe1Var);
                    af1Var.V0(true, true);
                    if (xe1Var != null) {
                        xe1Var.setTopicIcon(xe1Var.f45751c5);
                    }
                }
                af1Var.C0();
                return;
            case 14:
                if (ChatObject.hasAdminRights(af1Var.getMessagesController().getChat(Long.valueOf(j10)))) {
                    x5 x5Var = new x5(-j10);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = af1Var.X;
                    x5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, 0));
                    }
                    af1Var.presentFragment(x5Var);
                    return;
                }
                af1Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j10));
                return;
            case 15:
                v21.O(-j10, af1Var);
                return;
            default:
                return;
        }
    }
}
