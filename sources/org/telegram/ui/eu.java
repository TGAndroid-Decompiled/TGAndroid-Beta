package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class eu implements Runnable {
    public final int f46905a;
    public final yw f46906b;

    public eu(yw ywVar, int i7) {
        this.f46905a = i7;
        this.f46906b = ywVar;
    }

    @Override
    public final void run() {
        int i7 = this.f46905a;
        int i10 = 0;
        yw ywVar = this.f46906b;
        switch (i7) {
            case 0:
                ywVar.getClass();
                ywVar.presentFragment(new org.telegram.ui.Wallet.y5());
                return;
            case 1:
                yw.u0(ywVar);
                return;
            case 2:
                ywVar.g5();
                return;
            case 3:
                ?? obj = new Object();
                obj.f28476a = true;
                ywVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 4:
                ywVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                return;
            case 5:
                yw ywVar2 = this.f46906b;
                ArrayList arrayList = ywVar2.K2;
                ywVar2.O2 = true;
                if (ywVar2.E2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.ur.a(((Long) arrayList.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    ywVar2.E2.y(ywVar2, arrayList2, ywVar2.D1.getFieldText(), false, ywVar2.L2, ywVar2.M2, ywVar2.N2, null);
                    return;
                }
                return;
            case 6:
                yw ywVar3 = this.f46906b;
                ArrayList arrayList3 = ywVar3.K2;
                ywVar3.L2 = false;
                ywVar3.O2 = false;
                if (ywVar3.E2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i10 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.ur.a(((Long) arrayList3.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    ywVar3.E2.y(ywVar3, arrayList4, ywVar3.D1.getFieldText(), false, ywVar3.L2, ywVar3.M2, ywVar3.N2, null);
                    return;
                }
                return;
            case 7:
                yw.z0(ywVar);
                return;
            case 8:
                ywVar.getClass();
                if (LaunchActivity.Q() != null) {
                    ywVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 9:
                ywVar.Y.f40202r.requestFocus();
                org.telegram.messenger.g0.J3(ywVar.Y.f40202r);
                return;
            case 10:
                ywVar.getClass();
                ywVar.presentFragment(new k());
                return;
            case 11:
                ywVar.getClass();
                ywVar.presentFragment(new FiltersSetupActivity());
                return;
            case 12:
                ywVar.getClass();
                ywVar.presentFragment(new ThemeActivity(1));
                return;
            case 13:
                ywVar.M4(false, true);
                return;
            case 14:
                org.telegram.messenger.vr messagesStorage = ywVar.getMessagesStorage();
                messagesStorage.f27219a.c(new org.telegram.messenger.nq(messagesStorage, 15));
                Toast.makeText(ywVar.getParentActivity(), org.telegram.messenger.hd.M0(2131751651, null), 0).show();
                return;
            case 15:
                org.telegram.messenger.np messagesController = ywVar.getMessagesController();
                messagesController.C1.b();
                messagesController.D1.b();
                return;
            case 16:
                hw hwVar = ywVar.D0;
                if (hwVar != null && hwVar.B0) {
                    hwVar.Q(false);
                    return;
                }
                ywVar.Y.f40202r.getText().clear();
                org.telegram.messenger.g0.v1(ywVar.Y.f40202r);
                ywVar.Y.f40202r.clearFocus();
                ywVar.Z.b(false);
                return;
            case 17:
                if (ywVar.T0 != 10) {
                    ywVar.o4(false);
                }
                if (ywVar.M && ywVar.j4().I()) {
                    ywVar.F0.h();
                    return;
                } else {
                    ywVar.J4(true, true);
                    return;
                }
            case 18:
                jh.f fVar = ywVar.A1;
                if (fVar != null) {
                    fVar.d();
                }
                ywVar.E3();
                ywVar.F3();
                oi.u1 u1Var = ywVar.E1;
                if (u1Var != null) {
                    u1Var.setTranslationY(-ywVar.f53721w.d());
                    return;
                }
                return;
            case 19:
                ywVar.getNotificationCenter().k(24, new Object[0]);
                return;
            case 20:
                ywVar.Y3();
                return;
            case 21:
                ywVar.g5();
                return;
            case 22:
                yw.H0(ywVar);
                return;
            case 23:
                ywVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 24:
                hi.l3 l3Var = ywVar.f53695r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                ywVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 25:
                ywVar.f53638f0[0].d.f();
                return;
            case 26:
                UndoView k42 = ywVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new eu(ywVar, 11));
                    return;
                }
                return;
            case 27:
                ywVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.np.e1();
                long j3 = e12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                ywVar.g5();
                return;
            case 28:
                org.telegram.messenger.np.s1(ywVar.currentAccount).l0(null);
                return;
            default:
                ywVar.getClass();
                ywVar.presentFragment(new UserInfoActivity());
                return;
        }
    }
}
