package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k91 extends org.telegram.ui.ActionBar.k {
    public final Context f47235a;
    public final z91 f47236b;

    public k91(z91 z91Var, Context context) {
        this.f47236b = z91Var;
        this.f47235a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        TLRPC.ChatParticipants chatParticipants;
        boolean z9;
        int i11;
        boolean z10;
        w91 w91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        z91 z91Var = this.f47236b;
        org.telegram.messenger.k00 k00Var = z91Var.f52381s;
        ArrayList arrayList = z91Var.f52346b;
        HashSet hashSet = z91Var.f52344a0;
        long j3 = z91Var.f52343a;
        if (i7 == -1) {
            if (hashSet.size() > 0) {
                z91Var.G0();
                return;
            } else {
                z91Var.finishFragment();
                return;
            }
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = null;
        int i12 = 0;
        switch (i7) {
            case 1:
                org.telegram.messenger.k00 k00Var2 = z91Var.getMessagesController().f24881q7;
                k00Var2.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = k00Var2.getMessagesController().h1(j3);
                tL_channels_toggleViewForumAsMessages.enabled = true;
                k00Var2.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(k00Var2, 7));
                z91Var.I = true;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", j3);
                cn cnVar = new cn(bundle);
                cnVar.Ea = true;
                z91Var.presentFragment(cnVar);
                return;
            case 2:
                TLRPC.ChatFull N0 = z91Var.getMessagesController().N0(j3);
                TLRPC.ChatFull chatFull = z91Var.J;
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
                    long j10 = N0.f26961id;
                    i10 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
                    i91 i91Var = new i91(this, this.f47235a, i10, hVar, N0.f26961id, z91Var, j10);
                    i91Var.f40188f2 = new di.c1(this, j10, 10);
                    i91Var.show();
                    return;
                }
                return;
            case 3:
                x81 f02 = x81.f0(j3, 0L);
                z91Var.presentFragment(f02);
                org.telegram.messenger.g0.i3(new r81(f02, 1), 200L);
                return;
            case 4:
            case 5:
                if (hashSet.size() > 0) {
                    z91Var.C0 = true;
                    z91Var.N0 = true;
                    org.telegram.messenger.k00 k00Var3 = z91Var.f52381s;
                    long j11 = z91Var.f52343a;
                    int intValue = ((Integer) hashSet.iterator().next()).intValue();
                    if (i7 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    k00Var3.t(j11, intValue, z9, z91Var);
                }
                z91Var.G0();
                return;
            case 6:
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    z91Var.getNotificationsController().G(-j3, ((Integer) it.next()).intValue(), z91Var.B0);
                }
                z91Var.G0();
                return;
            case 7:
                z91Var.H0(hashSet, new uu0(this, 22));
                return;
            case 8:
                ArrayList arrayList2 = new ArrayList(hashSet);
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TLRPC.TL_forumTopic f10 = k00Var.f(j3, ((Integer) arrayList2.get(i13)).intValue());
                    if (f10 != null) {
                        z91Var.getMessagesController().o3(-j3, f10.f27012id);
                        org.telegram.messenger.qp messagesController = z91Var.getMessagesController();
                        long j12 = -j3;
                        int i14 = f10.top_message;
                        TLRPC.Message message = f10.topMessage;
                        if (message != null) {
                            i11 = message.date;
                        } else {
                            i11 = 0;
                        }
                        messagesController.j3(j12, i14, 0, i11, false, f10.f27012id, 0, true, 0);
                        z91Var.getMessagesStorage().d2(z91Var.f52343a, f10.f27012id, f10.top_message, 0);
                    }
                }
                z91Var.G0();
                return;
            case 9:
            case 10:
                z91Var.N0 = true;
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
                z91Var.G0();
                return;
            case 11:
                TLRPC.Chat M0 = z91Var.getMessagesController().M0(Long.valueOf(j3));
                org.telegram.ui.Components.u4.r(z91Var, false, M0, null, false, true, false, false, new ok0(20, this, M0));
                return;
            case 12:
            case 13:
                int i16 = 0;
                while (true) {
                    if (i16 < z91Var.N.getChildCount()) {
                        View childAt = z91Var.N.getChildAt(i16);
                        if ((childAt instanceof w91) && (tL_forumTopic = (w91Var = (w91) childAt).N) != null && tL_forumTopic.f27012id == 1) {
                            tL_forumTopic2 = tL_forumTopic;
                        } else {
                            i16++;
                        }
                    } else {
                        w91Var = null;
                    }
                }
                if (tL_forumTopic2 == null) {
                    while (true) {
                        if (i12 < arrayList.size()) {
                            if (arrayList.get(i12) != null && ((r91) arrayList.get(i12)).f49322c != null && ((r91) arrayList.get(i12)).f49322c.f27012id == 1) {
                                tL_forumTopic2 = ((r91) arrayList.get(i12)).f49322c;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (tL_forumTopic2 != null) {
                    if (z91Var.f52390y <= 0) {
                        z91Var.E = true;
                        z91Var.D = 2;
                    }
                    z91Var.getMessagesController().f24881q7.A(1, j3, tL_forumTopic2.hidden);
                    if (w91Var != null) {
                        z91Var.f52351c1 = w91Var;
                    }
                    z91Var.N.B1(!tL_forumTopic2.hidden, w91Var);
                    z91Var.Z0(true, true);
                    if (w91Var != null) {
                        w91Var.setTopicIcon(w91Var.f50955c5);
                    }
                }
                z91Var.G0();
                return;
            case 14:
                if (org.telegram.messenger.t3.N(z91Var.getMessagesController().M0(Long.valueOf(j3)))) {
                    t5 t5Var = new t5(-j3);
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = z91Var.X;
                    t5Var.T = tL_premium_boostsStatus;
                    if (tL_premium_boostsStatus != null) {
                        t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new l5(t5Var, 0));
                    }
                    z91Var.presentFragment(t5Var);
                    return;
                }
                z91Var.getNotificationCenter().k(org.telegram.messenger.qs.f25047n3, Long.valueOf(-j3));
                return;
            case 15:
                sy0.K0(-j3, z91Var);
                return;
            default:
                return;
        }
    }
}
