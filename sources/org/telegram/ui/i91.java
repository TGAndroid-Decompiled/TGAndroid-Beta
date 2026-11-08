package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class i91 extends org.telegram.ui.ActionBar.j {
    public final Context f46612a;
    public final w91 f46613b;

    public i91(w91 w91Var, Context context) {
        this.f46613b = w91Var;
        this.f46612a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        boolean z9;
        int i11;
        boolean z10;
        t91 t91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        w91 w91Var = this.f46613b;
        org.telegram.messenger.k00 k00Var = w91Var.f51030s;
        ArrayList arrayList = w91Var.f50995b;
        HashSet hashSet = w91Var.f50993a0;
        long j3 = w91Var.f50992a;
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
                org.telegram.messenger.k00 k00Var2 = w91Var.getMessagesController().f24877q7;
                k00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = k00Var2.getMessagesController().h1(j3);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                k00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(k00Var2, 7));
                w91Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                an anVar = new an(bundle);
                anVar.Ca = true;
                w91Var.presentFragment(anVar);
                return;
            case 2:
                TLRPC.ChatFull N0 = w91Var.getMessagesController().N0(j3);
                TLRPC.ChatFull chatFull = w91Var.J;
                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                    N0.participants = chatParticipants;
                }
                if (N0 != null) {
                    a0.h hVar = new a0.h();
                    if (N0.participants != null) {
                        while (i12 < N0.participants.participants.size()) {
                            hVar.k(null, N0.participants.participants.get(i12).user_id);
                            i12++;
                        }
                    }
                    long j10 = N0.f26957id;
                    i10 = ((org.telegram.ui.ActionBar.f2) w91Var).currentAccount;
                    g91 g91Var = new g91(this, this.f46612a, i10, hVar, N0.f26957id, w91Var, j10);
                    g91Var.f40214c2 = new di.c1(this, j10, 10);
                    g91Var.show();
                    return;
                }
                return;
            case 3:
                v81 f02 = v81.f0(j3, 0L);
                w91Var.presentFragment(f02);
                org.telegram.messenger.g0.i3(new p81(f02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    w91Var.C0 = true;
                    w91Var.N0 = true;
                    org.telegram.messenger.k00 k00Var3 = w91Var.f51030s;
                    long j11 = w91Var.f50992a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i7 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    k00Var3.t(j11, intValue, z9, w91Var);
                }
                w91Var.G0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    w91Var.getNotificationsController().G(-j3, ((Integer) it.next()).intValue(), w91Var.B0);
                }
                w91Var.G0();
                return;
            case 7:
                w91Var.H0(hashSet, new ru0(this, 22));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic f10 = k00Var.f(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (f10 != null) {
                        w91Var.getMessagesController().o3(-j3, f10.f27008id);
                        org.telegram.messenger.qp messagesController = w91Var.getMessagesController();
                        long j12 = -j3;
                        int i14 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        if (message != null) {
                            i11 = message.date;
                        } else {
                            i11 = 0;
                        }
                        messagesController.j3(j12, i14, 0, i11, false, f10.f27008id, 0, true, 0);
                        w91Var.getMessagesStorage().d2(w91Var.f50992a, f10.f27008id, f10.top_message, 0);
                    }
                }
                w91Var.G0();
                return;
            case 9:
            case 10:
                w91Var.N0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    int intValue2 = ((Integer) arrayList3.get(i15)).intValue();
                    if (i7 == 9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k00Var.z(intValue2, j3, z10);
                }
                w91Var.G0();
                return;
            case 11:
                TLRPC.Chat M0 = w91Var.getMessagesController().M0(Long.valueOf(j3));
                org.telegram.ui.Components.v4.r(w91Var, false, M0, null, false, true, false, false, new lk0(20, this, M0));
                return;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < w91Var.N.getChildCount()) {
                        View childAt = w91Var.N.getChildAt(i16);
                        if ((childAt instanceof t91) && (tL_forumTopic = (t91Var = (t91) childAt).N) != null && tL_forumTopic.f27008id == 1) {
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
                            if (arrayList.get(i12) != null && ((o91) arrayList.get(i12)).f48337c != null && ((o91) arrayList.get(i12)).f48337c.f27008id == 1) {
                                tL_forumTopic2 = ((o91) arrayList.get(i12)).f48337c;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (w91Var.f51039y <= 0) {
                        w91Var.E = true;
                        w91Var.D = 2;
                    }
                    w91Var.getMessagesController().f24877q7.A(1, j3, tL_forumTopic2.hidden);
                    if (t91Var != null) {
                        w91Var.f51000c1 = t91Var;
                    }
                    w91Var.N.B1(!tL_forumTopic2.hidden, t91Var);
                    w91Var.Z0(true, true);
                    if (t91Var != null) {
                        t91Var.setTopicIcon(t91Var.f49986c5);
                    }
                }
                w91Var.G0();
                return;
            case 14:
                if (org.telegram.messenger.t3.N(w91Var.getMessagesController().M0(Long.valueOf(j3)))) {
                    t5 t5Var = new t5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w91Var.X;
                    t5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new l5(t5Var, 0));
                    }
                    w91Var.presentFragment(t5Var);
                    return;
                }
                w91Var.getNotificationCenter().k(org.telegram.messenger.qs.f25043n3, Long.valueOf(-j3));
                return;
            case 15:
                oy0.K0(-j3, w91Var);
                return;
            default:
                return;
        }
    }
}
