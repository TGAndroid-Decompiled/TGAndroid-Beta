package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class ev implements Runnable {
    public final int f36915a;
    public final zx f36916b;

    public ev(zx zxVar, int i10) {
        this.f36915a = i10;
        this.f36916b = zxVar;
    }

    @Override
    public final void run() {
        int i10 = this.f36915a;
        int i11 = 0;
        zx zxVar = this.f36916b;
        switch (i10) {
            case 0:
                zxVar.getClass();
                zxVar.presentFragment(new org.telegram.ui.Wallet.b6());
                return;
            case 1:
                zx.u0(zxVar);
                return;
            case 2:
                zxVar.g5();
                return;
            case 3:
                ?? obj = new Object();
                obj.f20390a = true;
                zxVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 4:
                zxVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.i0.R());
                return;
            case 5:
                zx zxVar2 = this.f36916b;
                ArrayList arrayList = zxVar2.I2;
                zxVar2.M2 = true;
                if (zxVar2.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.hs.a(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    zxVar2.C2.z(zxVar2, arrayList2, zxVar2.B1.getFieldText(), false, zxVar2.J2, zxVar2.K2, zxVar2.L2, null);
                    return;
                }
                return;
            case 6:
                zx zxVar3 = this.f36916b;
                ArrayList arrayList3 = zxVar3.I2;
                zxVar3.J2 = false;
                zxVar3.M2 = false;
                if (zxVar3.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.hs.a(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    zxVar3.C2.z(zxVar3, arrayList4, zxVar3.B1.getFieldText(), false, zxVar3.J2, zxVar3.K2, zxVar3.L2, null);
                    return;
                }
                return;
            case 7:
                zx.z0(zxVar);
                return;
            case 8:
                zxVar.getClass();
                if (LaunchActivity.Q() != null) {
                    zxVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 9:
                zxVar.X.f26635r.requestFocus();
                org.telegram.messenger.i0.J3(zxVar.X.f26635r);
                return;
            case 10:
                zxVar.getClass();
                zxVar.presentFragment(new j());
                return;
            case 11:
                zxVar.getClass();
                zxVar.presentFragment(new FiltersSetupActivity());
                return;
            case 12:
                zxVar.getClass();
                zxVar.presentFragment(new ThemeActivity(1));
                return;
            case 13:
                zxVar.M4(false, true);
                return;
            case 14:
                org.telegram.messenger.is messagesStorage = zxVar.getMessagesStorage();
                messagesStorage.f16331a.c(new org.telegram.messenger.cr(messagesStorage, 15));
                Toast.makeText(zxVar.getParentActivity(), org.telegram.messenger.dd.L0(2131751652, null), 0).show();
                return;
            case 15:
                org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                return;
            case 16:
                jx jxVar = zxVar.C0;
                if (jxVar != null && jxVar.A0) {
                    jxVar.R(false);
                    return;
                }
                zxVar.X.f26635r.getText().clear();
                org.telegram.messenger.i0.v1(zxVar.X.f26635r);
                zxVar.X.f26635r.clearFocus();
                zxVar.Y.b(false);
                return;
            case 17:
                if (zxVar.R0 != 10) {
                    zxVar.o4(false);
                }
                if (zxVar.L && zxVar.j4().I()) {
                    zxVar.E0.h();
                    return;
                } else {
                    zxVar.J4(true, true);
                    return;
                }
            case 18:
                zg.e eVar = zxVar.f44241y1;
                if (eVar != null) {
                    eVar.d();
                }
                zxVar.E3();
                zxVar.F3();
                bi.f2 f2Var = zxVar.C1;
                if (f2Var != null) {
                    f2Var.setTranslationY(-zxVar.f44228w.d());
                    return;
                }
                return;
            case 19:
                zxVar.getNotificationCenter().k(24, new Object[0]);
                return;
            case 20:
                zxVar.Y3();
                return;
            case 21:
                zxVar.g5();
                return;
            case 22:
                zx.H0(zxVar);
                return;
            case 23:
                zxVar.getMessagesController().h4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 24:
                vh.p2 p2Var = zxVar.f44196q0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                zxVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 25:
                zxVar.f44137e0[0].d.f();
                return;
            case 26:
                UndoView k42 = zxVar.k4();
                if (k42 != null) {
                    k42.l(0L, 15, null, new ev(zxVar, 11));
                    return;
                }
                return;
            case 27:
                zxVar.getClass();
                SharedPreferences d12 = org.telegram.messenger.wp.d1();
                long j10 = d12.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                d12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                zxVar.g5();
                return;
            case 28:
                org.telegram.messenger.wp.r1(zxVar.currentAccount).l0(null);
                return;
            default:
                zxVar.getClass();
                zxVar.presentFragment(new UserInfoActivity());
                return;
        }
    }
}
