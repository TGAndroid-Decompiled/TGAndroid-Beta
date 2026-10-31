package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zj implements Runnable {
    public final int f19542a;
    public final vp f19543b;

    public zj(vp vpVar, int i10) {
        this.f19542a = i10;
        this.f19543b = vpVar;
    }

    @Override
    public final void run() {
        switch (this.f19542a) {
            case 0:
                this.f19543b.f3();
                return;
            case 1:
                vp vpVar = this.f19543b;
                vpVar.getNotificationCenter().k(46, new Object[0]);
                vpVar.getNotificationCenter().k(2, 2);
                vpVar.getUserConfig().v(true);
                return;
            case 2:
                vp vpVar2 = this.f19543b;
                vp messagesController = vpVar2.getMessagesController();
                vpVar2.getNotificationCenter().b(messagesController, 138);
                vpVar2.getNotificationCenter().b(messagesController, 139);
                vpVar2.getNotificationCenter().b(messagesController, 140);
                vpVar2.getNotificationCenter().b(messagesController, 142);
                vpVar2.getNotificationCenter().b(messagesController, 143);
                vpVar2.getNotificationCenter().b(messagesController, 21);
                vpVar2.getNotificationCenter().b(messagesController, 48);
                return;
            case 3:
                vp vpVar3 = this.f19543b;
                zj zjVar = vpVar3.K7;
                i0.r(zjVar);
                long currentTime = vpVar3.f18925v4 - vpVar3.getConnectionsManager().getCurrentTime();
                if (currentTime > 0) {
                    i0.h3(zjVar, currentTime);
                    return;
                }
                return;
            case 4:
                this.f19543b.P2(true);
                return;
            case 5:
                this.f19543b.M(false);
                return;
            case 6:
                d20 userConfig = this.f19543b.getUserConfig();
                if ((userConfig.f15163k0 != null || userConfig.f15162j0 != null) && Math.abs(SystemClock.elapsedRealtime() - userConfig.f15164l0) >= 1800000) {
                    userConfig.u();
                    return;
                }
                return;
            case 7:
                vp vpVar4 = this.f19543b;
                SharedPreferences sharedPreferences = vpVar4.e7;
                sharedPreferences.getBoolean("EnableContactJoined", true);
                vpVar4.F2 = sharedPreferences.getInt("nextTosCheckTime", 0);
                return;
            case 8:
                this.f19543b.getNotificationCenter().k(119, new Object[0]);
                return;
            case 9:
                this.f19543b.getNotificationsController().m(0);
                return;
            case 10:
                this.f19543b.getNotificationsController().m(1);
                return;
            case 11:
                this.f19543b.getNotificationsController().m(2);
                return;
            case 12:
                vp vpVar5 = this.f19543b;
                HashSet hashSet = vpVar5.f18787f8;
                if (!hashSet.isEmpty()) {
                    TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l4 = (Long) it.next();
                        l4.getClass();
                        getrequirementstocontact.f20001id.add(vpVar5.p1(vpVar5.Z1(l4)));
                        arrayList.add(l4);
                    }
                    hashSet.clear();
                    if (!getrequirementstocontact.f20001id.isEmpty()) {
                        vpVar5.getConnectionsManager().sendRequest(getrequirementstocontact, new v4(6, vpVar5, arrayList));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                vp vpVar6 = this.f19543b;
                vpVar6.getClass();
                a0.h hVar = new a0.h();
                HashSet hashSet2 = vpVar6.f18882q8;
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Pair pair2 = (Pair) hVar.f(((rh.x5) pair.first).f47691a);
                    if (pair2 == null) {
                        long j10 = ((rh.x5) pair.first).f47691a;
                        Pair pair3 = new Pair(new HashSet(), (AtomicBoolean) pair.second);
                        hVar.k(pair3, j10);
                        pair2 = pair3;
                    }
                    if (!((AtomicBoolean) pair.second).get()) {
                        ((AtomicBoolean) pair2.second).set(false);
                    }
                    ((HashSet) pair2.first).add(Integer.valueOf(((rh.x5) pair.first).f47692b));
                }
                hashSet2.clear();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    Pair pair4 = (Pair) hVar.n(i10);
                    long j11 = hVar.j(i10);
                    boolean z10 = ((AtomicBoolean) pair4.second).get();
                    TLRPC.TL_reportMessagesDelivery tL_reportMessagesDelivery = new TLRPC.TL_reportMessagesDelivery();
                    tL_reportMessagesDelivery.peer = vpVar6.i1(j11);
                    tL_reportMessagesDelivery.f19929id.addAll((HashSet) pair4.first);
                    tL_reportMessagesDelivery.push = z10;
                    vpVar6.getConnectionsManager().sendRequest(tL_reportMessagesDelivery, null);
                }
                return;
            case 14:
                this.f19543b.getNotificationCenter().k(240, new Object[0]);
                return;
            case 15:
                this.f19543b.getNotificationCenter().k(195, new Object[0]);
                return;
            case 16:
                this.f19543b.getNotificationCenter().k(2, 4);
                return;
            case 17:
                this.f19543b.getNotificationCenter().k(2, 64);
                return;
            case 18:
                vp vpVar7 = this.f19543b;
                vpVar7.f18961z2 = 0L;
                vpVar7.D2 = null;
                vpVar7.f18905t2 = vpVar7.getConnectionsManager().getCurrentTime() + 3600;
                vp.d1().edit().putLong("proxy_dialog", vpVar7.f18961z2).remove("proxyDialogAddress").putInt("nextPromoInfoCheckTime", vpVar7.f18905t2).commit();
                return;
            case 19:
                vp vpVar8 = this.f19543b;
                vpVar8.getMessagesStorage().t1(false);
                i0.g3(new zj(vpVar8, 29));
                return;
            case 20:
                this.f19543b.f3();
                return;
            case 21:
                vp vpVar9 = this.f19543b;
                TLRPC.Dialog dialog = vpVar9.f18943x2;
                if (dialog != null) {
                    long j12 = dialog.f19797id;
                    if (j12 < 0) {
                        TLRPC.Chat L0 = vpVar9.L0(Long.valueOf(-j12));
                        if (w3.r0(L0) || L0.restricted) {
                            vpVar9.c4(vpVar9.f18943x2);
                        }
                    } else {
                        vpVar9.c4(dialog);
                    }
                    vpVar9.f18943x2 = null;
                    vpVar9.Q4(null);
                    vpVar9.getNotificationCenter().k(3, new Object[0]);
                    return;
                }
                return;
            case 22:
                this.f19543b.f3();
                return;
            case 23:
                this.f19543b.getNotificationCenter().k(2, 8192);
                return;
            case 24:
                this.f19543b.f18773e2 = false;
                return;
            case 25:
                this.f19543b.N(true);
                return;
            case 26:
                this.f19543b.I(true);
                return;
            case 27:
                this.f19543b.getNotificationCenter().k(2, 8192);
                return;
            case 28:
                this.f19543b.getNotificationCenter().k(2, 8192);
                return;
            default:
                vp vpVar10 = this.f19543b;
                vpVar10.getMessagesController().Q4(null);
                vpVar10.getNotificationCenter().k(3, Boolean.TRUE);
                return;
        }
    }
}
