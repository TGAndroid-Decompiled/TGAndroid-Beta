package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class au implements Runnable {
    public final int f43843a;
    public final uw f43844b;

    public au(uw uwVar, int i3) {
        this.f43843a = i3;
        this.f43844b = uwVar;
    }

    @Override
    public final void run() {
        int i3 = this.f43843a;
        int i10 = 0;
        uw uwVar = this.f43844b;
        switch (i3) {
            case 0:
                uwVar.getClass();
                uwVar.presentFragment(new org.telegram.ui.Wallet.w5());
                return;
            case 1:
                uw.u0(uwVar);
                return;
            case 2:
                uwVar.g5();
                return;
            case 3:
                ?? obj = new Object();
                obj.f27395a = true;
                uwVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 4:
                uwVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                return;
            case 5:
                uw uwVar2 = this.f43844b;
                ArrayList arrayList = uwVar2.J2;
                uwVar2.N2 = true;
                if (uwVar2.D2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.pr.a(((Long) arrayList.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    uwVar2.D2.y(uwVar2, arrayList2, uwVar2.C1.getFieldText(), false, uwVar2.K2, uwVar2.L2, uwVar2.M2, null);
                    return;
                }
                return;
            case 6:
                uw uwVar3 = this.f43844b;
                ArrayList arrayList3 = uwVar3.J2;
                uwVar3.K2 = false;
                uwVar3.N2 = false;
                if (uwVar3.D2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i10 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.pr.a(((Long) arrayList3.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    uwVar3.D2.y(uwVar3, arrayList4, uwVar3.C1.getFieldText(), false, uwVar3.K2, uwVar3.L2, uwVar3.M2, null);
                    return;
                }
                return;
            case 7:
                uw.z0(uwVar);
                return;
            case 8:
                uwVar.getClass();
                if (LaunchActivity.Q() != null) {
                    uwVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 9:
                uwVar.Y.f36302r.requestFocus();
                org.telegram.messenger.g0.K3(uwVar.Y.f36302r);
                return;
            case 10:
                uwVar.getClass();
                uwVar.presentFragment(new k());
                return;
            case 11:
                uwVar.getClass();
                uwVar.presentFragment(new FiltersSetupActivity());
                return;
            case 12:
                uwVar.getClass();
                uwVar.presentFragment(new ThemeActivity(1));
                return;
            case 13:
                uwVar.M4(false, true);
                return;
            case 14:
                org.telegram.messenger.qr messagesStorage = uwVar.getMessagesStorage();
                messagesStorage.f24934a.c(new org.telegram.messenger.hq(messagesStorage, 16));
                Toast.makeText(uwVar.getParentActivity(), org.telegram.messenger.bd.M0(2131751652, null), 0).show();
                return;
            case 15:
                org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
                messagesController.C1.b();
                messagesController.D1.b();
                return;
            case 16:
                cw cwVar = uwVar.D0;
                if (cwVar != null && cwVar.B0) {
                    cwVar.R(false);
                    return;
                }
                uwVar.Y.f36302r.getText().clear();
                org.telegram.messenger.g0.v1(uwVar.Y.f36302r);
                uwVar.Y.f36302r.clearFocus();
                uwVar.Z.b(false);
                return;
            case 17:
                if (uwVar.S0 != 10) {
                    uwVar.o4(false);
                }
                if (uwVar.M && uwVar.j4().I()) {
                    uwVar.F0.h();
                    return;
                } else {
                    uwVar.J4(true, true);
                    return;
                }
            case 18:
                kh.f fVar = uwVar.f50331z1;
                if (fVar != null) {
                    fVar.d();
                }
                uwVar.E3();
                uwVar.F3();
                mi.x1 x1Var = uwVar.D1;
                if (x1Var != null) {
                    x1Var.setTranslationY(-uwVar.f50313w.d());
                    return;
                }
                return;
            case 19:
                uwVar.getNotificationCenter().k(24, new Object[0]);
                return;
            case 20:
                uwVar.Y3();
                return;
            case 21:
                uwVar.g5();
                return;
            case 22:
                uw.H0(uwVar);
                return;
            case 23:
                uwVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 24:
                gi.l3 l3Var = uwVar.f50287r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                uwVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 25:
                uwVar.f50230f0[0].d.f();
                return;
            case 26:
                UndoView k42 = uwVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new au(uwVar, 11));
                    return;
                }
                return;
            case 27:
                uwVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.hp.e1();
                long j10 = e12.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                uwVar.g5();
                return;
            case 28:
                org.telegram.messenger.hp.s1(uwVar.currentAccount).l0(null);
                return;
            default:
                uwVar.getClass();
                uwVar.presentFragment(new UserInfoActivity());
                return;
        }
    }
}
