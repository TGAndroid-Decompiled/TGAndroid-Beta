package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class eu implements Runnable {
    public final int f45513a;
    public final yw f45514b;

    public eu(yw ywVar, int i7) {
        this.f45513a = i7;
        this.f45514b = ywVar;
    }

    @Override
    public final void run() {
        int i7 = this.f45513a;
        int i10 = 0;
        yw ywVar = this.f45514b;
        switch (i7) {
            case 0:
                ywVar.getClass();
                ywVar.presentFragment(new org.telegram.ui.Wallet.w5());
                return;
            case 1:
                yw.u0(ywVar);
                return;
            case 2:
                ywVar.g5();
                return;
            case 3:
                ?? obj = new Object();
                obj.f27408a = true;
                ywVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 4:
                ywVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                return;
            case 5:
                yw ywVar2 = this.f45514b;
                ArrayList arrayList = ywVar2.J2;
                ywVar2.N2 = true;
                if (ywVar2.D2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    ywVar2.D2.y(ywVar2, arrayList2, ywVar2.C1.getFieldText(), false, ywVar2.K2, ywVar2.L2, ywVar2.M2, null);
                    return;
                }
                return;
            case 6:
                yw ywVar3 = this.f45514b;
                ArrayList arrayList3 = ywVar3.J2;
                ywVar3.K2 = false;
                ywVar3.N2 = false;
                if (ywVar3.D2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i10 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    ywVar3.D2.y(ywVar3, arrayList4, ywVar3.C1.getFieldText(), false, ywVar3.K2, ywVar3.L2, ywVar3.M2, null);
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
                ywVar.X.f37857r.requestFocus();
                org.telegram.messenger.g0.K3(ywVar.X.f37857r);
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
                org.telegram.messenger.yr messagesStorage = ywVar.getMessagesStorage();
                messagesStorage.f26719a.c(new org.telegram.messenger.rq(messagesStorage, 15));
                Toast.makeText(ywVar.getParentActivity(), org.telegram.messenger.id.M0(2131751651, null), 0).show();
                return;
            case 15:
                org.telegram.messenger.qp messagesController = ywVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                return;
            case 16:
                hw hwVar = ywVar.C0;
                if (hwVar != null && hwVar.A0) {
                    hwVar.R(false);
                    return;
                }
                ywVar.X.f37857r.getText().clear();
                org.telegram.messenger.g0.v1(ywVar.X.f37857r);
                ywVar.X.f37857r.clearFocus();
                ywVar.Y.b(false);
                return;
            case 17:
                if (ywVar.S0 != 10) {
                    ywVar.o4(false);
                }
                if (ywVar.L && ywVar.j4().I()) {
                    ywVar.E0.h();
                    return;
                } else {
                    ywVar.J4(true, true);
                    return;
                }
            case 18:
                jh.f fVar = ywVar.f52338z1;
                if (fVar != null) {
                    fVar.d();
                }
                ywVar.E3();
                ywVar.F3();
                li.w1 w1Var = ywVar.D1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-ywVar.f52320w.d());
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
                fi.m3 m3Var = ywVar.f52288q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                ywVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 25:
                ywVar.f52231e0[0].d.f();
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
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                long j3 = e12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                ywVar.g5();
                return;
            case 28:
                org.telegram.messenger.qp.s1(ywVar.currentAccount).l0(null);
                return;
            default:
                ywVar.getClass();
                ywVar.presentFragment(new UserInfoActivity());
                return;
        }
    }
}
