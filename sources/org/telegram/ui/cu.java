package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class cu implements Runnable {
    public final int f44898a;
    public final ww f44899b;

    public cu(ww wwVar, int i7) {
        this.f44898a = i7;
        this.f44899b = wwVar;
    }

    @Override
    public final void run() {
        int i7 = this.f44898a;
        int i10 = 0;
        ww wwVar = this.f44899b;
        switch (i7) {
            case 0:
                wwVar.getClass();
                wwVar.presentFragment(new org.telegram.ui.Wallet.y5());
                return;
            case 1:
                ww.u0(wwVar);
                return;
            case 2:
                wwVar.g5();
                return;
            case 3:
                ?? obj = new Object();
                obj.f27421a = true;
                wwVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 4:
                wwVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                return;
            case 5:
                ww wwVar2 = this.f44899b;
                ArrayList arrayList = wwVar2.I2;
                wwVar2.M2 = true;
                if (wwVar2.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    wwVar2.C2.y(wwVar2, arrayList2, wwVar2.B1.getFieldText(), false, wwVar2.J2, wwVar2.K2, wwVar2.L2, null);
                    return;
                }
                return;
            case 6:
                ww wwVar3 = this.f44899b;
                ArrayList arrayList3 = wwVar3.I2;
                wwVar3.J2 = false;
                wwVar3.M2 = false;
                if (wwVar3.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i10 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    wwVar3.C2.y(wwVar3, arrayList4, wwVar3.B1.getFieldText(), false, wwVar3.J2, wwVar3.K2, wwVar3.L2, null);
                    return;
                }
                return;
            case 7:
                ww.z0(wwVar);
                return;
            case 8:
                wwVar.getClass();
                if (LaunchActivity.Q() != null) {
                    wwVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 9:
                wwVar.X.f37441r.requestFocus();
                org.telegram.messenger.g0.K3(wwVar.X.f37441r);
                return;
            case 10:
                wwVar.getClass();
                wwVar.presentFragment(new k());
                return;
            case 11:
                wwVar.getClass();
                wwVar.presentFragment(new FiltersSetupActivity());
                return;
            case 12:
                wwVar.getClass();
                wwVar.presentFragment(new ThemeActivity(1));
                return;
            case 13:
                wwVar.M4(false, true);
                return;
            case 14:
                org.telegram.messenger.yr messagesStorage = wwVar.getMessagesStorage();
                messagesStorage.f26696a.c(new org.telegram.messenger.qq(messagesStorage, 16));
                Toast.makeText(wwVar.getParentActivity(), org.telegram.messenger.hd.M0(2131751652, null), 0).show();
                return;
            case 15:
                org.telegram.messenger.qp messagesController = wwVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                return;
            case 16:
                fw fwVar = wwVar.C0;
                if (fwVar != null && fwVar.A0) {
                    fwVar.R(false);
                    return;
                }
                wwVar.X.f37441r.getText().clear();
                org.telegram.messenger.g0.v1(wwVar.X.f37441r);
                wwVar.X.f37441r.clearFocus();
                wwVar.Y.b(false);
                return;
            case 17:
                if (wwVar.R0 != 10) {
                    wwVar.o4(false);
                }
                if (wwVar.L && wwVar.j4().I()) {
                    wwVar.E0.h();
                    return;
                } else {
                    wwVar.J4(true, true);
                    return;
                }
            case 18:
                jh.f fVar = wwVar.f51651y1;
                if (fVar != null) {
                    fVar.d();
                }
                wwVar.E3();
                wwVar.F3();
                li.w1 w1Var = wwVar.C1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-wwVar.f51638w.d());
                    return;
                }
                return;
            case 19:
                wwVar.getNotificationCenter().k(24, new Object[0]);
                return;
            case 20:
                wwVar.Y3();
                return;
            case 21:
                wwVar.g5();
                return;
            case 22:
                ww.H0(wwVar);
                return;
            case 23:
                wwVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 24:
                fi.m3 m3Var = wwVar.f51606q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                wwVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 25:
                wwVar.f51549e0[0].d.f();
                return;
            case 26:
                UndoView k42 = wwVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new cu(wwVar, 11));
                    return;
                }
                return;
            case 27:
                wwVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                long j3 = e12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                wwVar.g5();
                return;
            case 28:
                org.telegram.messenger.qp.s1(wwVar.currentAccount).l0(null);
                return;
            default:
                wwVar.getClass();
                wwVar.presentFragment(new UserInfoActivity());
                return;
        }
    }
}
