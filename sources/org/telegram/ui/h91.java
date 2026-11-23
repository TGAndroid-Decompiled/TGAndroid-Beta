package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class h91 extends org.telegram.ui.ActionBar.j {
    public final Context f48512a;
    public final w91 f48513b;

    public h91(w91 w91Var, Context context) {
        this.f48513b = w91Var;
        this.f48512a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i11;
        boolean z11;
        t91 t91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        w91 w91Var = this.f48513b;
        org.telegram.messenger.d00 d00Var = w91Var.f53256s;
        ArrayList arrayList = w91Var.f53219b;
        HashSet hashSet = w91Var.f53220b0;
        long j3 = w91Var.f53216a;
        if (i7 == -1) {
            if (hashSet.size() > 0) {
                w91Var.G0();
                return;
            } else {
                w91Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i7) {
            case 1:
                org.telegram.messenger.d00 d00Var2 = w91Var.getMessagesController().f25864t7;
                d00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = d00Var2.getMessagesController().j1(j3);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                d00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(d00Var2, 7));
                w91Var.J = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                bn bnVar = new bn(bundle);
                bnVar.Ga = true;
                w91Var.presentFragment(bnVar);
                return;
            case 2:
                TLRPC.ChatFull P0 = w91Var.getMessagesController().P0(j3);
                TLRPC.ChatFull chatFull = w91Var.K;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    P0.participants = chatParticipants;
                }
                if (P0 != null) {
                    a0.h hVar = new a0.h();
                    if (P0.participants != null) {
                        while (i12 < P0.participants.participants.size()) {
                            hVar.k(null, P0.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j10 = P0.f28493id;
                    i10 = ((org.telegram.ui.ActionBar.g2) w91Var).currentAccount;
                    f91 f91Var = new f91(this, this.f48512a, i10, hVar, P0.f28493id, w91Var, j10);
                    f91Var.f35942g2 = new ai.z(this, j10, 11);
                    f91Var.show();
                    return;
                }
                return;
            case 3:
                u81 f02 = u81.f0(j3, 0L);
                w91Var.presentFragment(f02);
                org.telegram.messenger.g0.h3(new p81(f02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    w91Var.D0 = true;
                    w91Var.O0 = true;
                    org.telegram.messenger.d00 d00Var3 = w91Var.f53256s;
                    long j11 = w91Var.f53216a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i7 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d00Var3.t(j11, intValue, z10, w91Var);
                }
                w91Var.G0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    w91Var.getNotificationsController().G(-j3, ((Integer) it.next()).intValue(), w91Var.C0);
                }
                w91Var.G0();
                return;
            case 7:
                w91Var.H0(hashSet, new qu0(this, 22));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic f10 = d00Var.f(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (f10 != null) {
                        w91Var.getMessagesController().v3(-j3, f10.f28544id);
                        org.telegram.messenger.mp messagesController = w91Var.getMessagesController();
                        long j12 = -j3;
                        int i14 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        if (message != null) {
                            i11 = message.date;
                        } else {
                            i11 = 0;
                        }
                        messagesController.q3(j12, i14, 0, i11, false, f10.f28544id, 0, true, 0);
                        w91Var.getMessagesStorage().d2(w91Var.f53216a, f10.f28544id, f10.top_message, 0);
                    }
                }
                w91Var.G0();
                return;
            case 9:
            case 10:
                w91Var.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    int intValue2 = ((Integer) arrayList3.get(i15)).intValue();
                    if (i7 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    d00Var.z(intValue2, j3, z11);
                }
                w91Var.G0();
                return;
            case 11:
                TLRPC.Chat O0 = w91Var.getMessagesController().O0(Long.valueOf(j3));
                org.telegram.ui.Components.b5.r(w91Var, false, O0, null, false, true, false, false, new yi0(23, this, O0));
                return;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < w91Var.O.getChildCount()) {
                        View childAt = w91Var.O.getChildAt(i16);
                        if ((childAt instanceof t91) && (tL_forumTopic = (t91Var = (t91) childAt).O) != null && tL_forumTopic.f28544id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        t91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) != null && ((o91) arrayList.get(i12)).f50609c != null && ((o91) arrayList.get(i12)).f50609c.f28544id == 1) {
                                tL_forumTopic2 = ((o91) arrayList.get(i12)).f50609c;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (w91Var.f53265y <= 0) {
                        w91Var.F = true;
                        w91Var.E = 2;
                    }
                    w91Var.getMessagesController().f25864t7.A(1, j3, tL_forumTopic2.hidden);
                    if (t91Var != null) {
                        w91Var.f53226d1 = t91Var;
                    }
                    w91Var.O.B1(!tL_forumTopic2.hidden, t91Var);
                    w91Var.Z0(true, true);
                    if (t91Var != null) {
                        t91Var.setTopicIcon(t91Var.f52319d5);
                    }
                }
                w91Var.G0();
                return;
            case 14:
                if (org.telegram.messenger.v3.N(w91Var.getMessagesController().O0(Long.valueOf(j3)))) {
                    t5 t5Var = new t5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w91Var.Y;
                    t5Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                    }
                    w91Var.presentFragment(t5Var);
                    return;
                }
                w91Var.getNotificationCenter().k(org.telegram.messenger.ks.f25267p3, Long.valueOf(-j3));
                return;
            case 15:
                py0.L0(-j3, w91Var);
                return;
            default:
                return;
        }
    }
}
