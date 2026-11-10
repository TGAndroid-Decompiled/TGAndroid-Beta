package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class fu implements Runnable {
    public final int f45850a;
    public final zw f45851b;

    public fu(zw zwVar, int i7) {
        this.f45850a = i7;
        this.f45851b = zwVar;
    }

    @Override
    public final void run() {
        int i7 = this.f45850a;
        int i10 = 0;
        zw zwVar = this.f45851b;
        switch (i7) {
            case 0:
                zwVar.getClass();
                zwVar.presentFragment(new org.telegram.ui.Wallet.z5());
                return;
            case 1:
                zw.u0(zwVar);
                return;
            case 2:
                zwVar.g5();
                return;
            case 3:
                ?? obj = new Object();
                obj.f27388a = true;
                zwVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 4:
                zwVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.g0.R());
                return;
            case 5:
                zw zwVar2 = this.f45851b;
                ArrayList arrayList = zwVar2.J2;
                zwVar2.N2 = true;
                if (zwVar2.D2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.xr.a(((Long) arrayList.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    zwVar2.D2.y(zwVar2, arrayList2, zwVar2.C1.getFieldText(), false, zwVar2.K2, zwVar2.L2, zwVar2.M2, null);
                    return;
                }
                return;
            case 6:
                zw zwVar3 = this.f45851b;
                ArrayList arrayList3 = zwVar3.J2;
                zwVar3.K2 = false;
                zwVar3.N2 = false;
                if (zwVar3.D2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i10 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.xr.a(((Long) arrayList3.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    zwVar3.D2.y(zwVar3, arrayList4, zwVar3.C1.getFieldText(), false, zwVar3.K2, zwVar3.L2, zwVar3.M2, null);
                    return;
                }
                return;
            case 7:
                zw.z0(zwVar);
                return;
            case 8:
                zwVar.getClass();
                if (LaunchActivity.Q() != null) {
                    zwVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 9:
                zwVar.X.f37446r.requestFocus();
                org.telegram.messenger.g0.K3(zwVar.X.f37446r);
                return;
            case 10:
                zwVar.getClass();
                zwVar.presentFragment(new k());
                return;
            case 11:
                zwVar.getClass();
                zwVar.presentFragment(new FiltersSetupActivity());
                return;
            case 12:
                zwVar.getClass();
                zwVar.presentFragment(new ThemeActivity(1));
                return;
            case 13:
                zwVar.M4(false, true);
                return;
            case 14:
                org.telegram.messenger.yr messagesStorage = zwVar.getMessagesStorage();
                messagesStorage.f26723a.c(new org.telegram.messenger.rq(messagesStorage, 15));
                Toast.makeText(zwVar.getParentActivity(), org.telegram.messenger.id.M0(2131751651, null), 0).show();
                return;
            case 15:
                org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                return;
            case 16:
                iw iwVar = zwVar.C0;
                if (iwVar != null && iwVar.A0) {
                    iwVar.R(false);
                    return;
                }
                zwVar.X.f37446r.getText().clear();
                org.telegram.messenger.g0.v1(zwVar.X.f37446r);
                zwVar.X.f37446r.clearFocus();
                zwVar.Y.b(false);
                return;
            case 17:
                if (zwVar.S0 != 10) {
                    zwVar.o4(false);
                }
                if (zwVar.L && zwVar.j4().I()) {
                    zwVar.E0.h();
                    return;
                } else {
                    zwVar.J4(true, true);
                    return;
                }
            case 18:
                jh.f fVar = zwVar.f52684z1;
                if (fVar != null) {
                    fVar.d();
                }
                zwVar.E3();
                zwVar.F3();
                li.w1 w1Var = zwVar.D1;
                if (w1Var != null) {
                    w1Var.setTranslationY(-zwVar.f52666w.d());
                    return;
                }
                return;
            case 19:
                zwVar.getNotificationCenter().k(24, new Object[0]);
                return;
            case 20:
                zwVar.Y3();
                return;
            case 21:
                zwVar.g5();
                return;
            case 22:
                zw.H0(zwVar);
                return;
            case 23:
                zwVar.getMessagesController().k4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 24:
                fi.m3 m3Var = zwVar.f52634q0;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                zwVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 25:
                zwVar.f52577e0[0].d.f();
                return;
            case 26:
                UndoView k42 = zwVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new fu(zwVar, 11));
                    return;
                }
                return;
            case 27:
                zwVar.getClass();
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                long j3 = e12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                e12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                zwVar.g5();
                return;
            case 28:
                org.telegram.messenger.qp.s1(zwVar.currentAccount).l0(null);
                return;
            default:
                zwVar.getClass();
                zwVar.presentFragment(new UserInfoActivity());
                return;
        }
    }
}
