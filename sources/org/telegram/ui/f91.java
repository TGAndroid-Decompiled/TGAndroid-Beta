package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class f91 extends org.telegram.ui.ActionBar.j {
    public final Context f47093a;
    public final u91 f47094b;

    public f91(u91 u91Var, Context context) {
        this.f47094b = u91Var;
        this.f47093a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        boolean z10;
        int i11;
        boolean z11;
        r91 r91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        u91 u91Var = this.f47094b;
        org.telegram.messenger.h00 h00Var = u91Var.f51873s;
        ArrayList arrayList = u91Var.f51837b;
        HashSet hashSet = u91Var.f51838b0;
        long j3 = u91Var.f51834a;
        if (i7 == -1) {
            if (hashSet.size() > 0) {
                u91Var.G0();
                return;
            } else {
                u91Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i7) {
            case 1:
                org.telegram.messenger.h00 h00Var2 = u91Var.getMessagesController().f25383r7;
                h00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = h00Var2.getMessagesController().h1(j3);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                h00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(h00Var2, 7));
                u91Var.J = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                an anVar = new an(bundle);
                anVar.Fa = true;
                u91Var.presentFragment(anVar);
                return;
            case 2:
                TLRPC.ChatFull N0 = u91Var.getMessagesController().N0(j3);
                TLRPC.ChatFull chatFull = u91Var.K;
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
                    long j10 = N0.f28052id;
                    i10 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
                    d91 d91Var = new d91(this, this.f47093a, i10, hVar, N0.f28052id, u91Var, j10);
                    d91Var.f32872g2 = new ai.c0(this, j10, 11);
                    d91Var.show();
                    return;
                }
                return;
            case 3:
                s81 f02 = s81.f0(j3, 0L);
                u91Var.presentFragment(f02);
                org.telegram.messenger.g0.i3(new n81(f02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    u91Var.D0 = true;
                    u91Var.O0 = true;
                    org.telegram.messenger.h00 h00Var3 = u91Var.f51873s;
                    long j11 = u91Var.f51834a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i7 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h00Var3.t(j11, intValue, z10, u91Var);
                }
                u91Var.G0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    u91Var.getNotificationsController().G(-j3, ((Integer) it.next()).intValue(), u91Var.C0);
                }
                u91Var.G0();
                return;
            case 7:
                u91Var.H0(hashSet, new pu0(this, 22));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic f10 = h00Var.f(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (f10 != null) {
                        u91Var.getMessagesController().o3(-j3, f10.f28103id);
                        org.telegram.messenger.np messagesController = u91Var.getMessagesController();
                        long j12 = -j3;
                        int i14 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        if (message != null) {
                            i11 = message.date;
                        } else {
                            i11 = 0;
                        }
                        messagesController.j3(j12, i14, 0, i11, false, f10.f28103id, 0, true, 0);
                        u91Var.getMessagesStorage().d2(u91Var.f51834a, f10.f28103id, f10.top_message, 0);
                    }
                }
                u91Var.G0();
                return;
            case 9:
            case 10:
                u91Var.O0 = true;
                ArrayList arrayList3 = new ArrayList(hashSet);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    int intValue2 = ((Integer) arrayList3.get(i15)).intValue();
                    if (i7 == 9) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h00Var.z(intValue2, j3, z11);
                }
                u91Var.G0();
                return;
            case 11:
                TLRPC.Chat M0 = u91Var.getMessagesController().M0(Long.valueOf(j3));
                org.telegram.ui.Components.t4.r(u91Var, false, M0, null, false, true, false, false, new xi0(24, this, M0));
                return;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < u91Var.O.getChildCount()) {
                        View childAt = u91Var.O.getChildAt(i16);
                        if ((childAt instanceof r91) && (tL_forumTopic = (r91Var = (r91) childAt).O) != null && tL_forumTopic.f28103id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        r91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) != null && ((m91) arrayList.get(i12)).f49191c != null && ((m91) arrayList.get(i12)).f49191c.f28103id == 1) {
                                tL_forumTopic2 = ((m91) arrayList.get(i12)).f49191c;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (u91Var.f51882y <= 0) {
                        u91Var.F = true;
                        u91Var.E = 2;
                    }
                    u91Var.getMessagesController().f25383r7.A(1, j3, tL_forumTopic2.hidden);
                    if (r91Var != null) {
                        u91Var.f51844d1 = r91Var;
                    }
                    u91Var.O.B1(!tL_forumTopic2.hidden, r91Var);
                    u91Var.Z0(true, true);
                    if (r91Var != null) {
                        r91Var.setTopicIcon(r91Var.f50882d5);
                    }
                }
                u91Var.G0();
                return;
            case 14:
                if (org.telegram.messenger.t3.N(u91Var.getMessagesController().M0(Long.valueOf(j3)))) {
                    t5 t5Var = new t5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u91Var.Y;
                    t5Var.U = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().G0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                    }
                    u91Var.presentFragment(t5Var);
                    return;
                }
                u91Var.getNotificationCenter().k(org.telegram.messenger.ns.f25539n3, Long.valueOf(-j3));
                return;
            case 15:
                my0.K0(-j3, u91Var);
                return;
            default:
                return;
        }
    }
}
