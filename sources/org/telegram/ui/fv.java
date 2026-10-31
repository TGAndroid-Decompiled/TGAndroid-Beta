package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.ui.Components.UndoView;
public final class fv implements Runnable {
    public final int f37353a;
    public final ay f37354b;

    public fv(ay ayVar, int i10) {
        this.f37353a = i10;
        this.f37354b = ayVar;
    }

    @Override
    public final void run() {
        int i10 = this.f37353a;
        int i11 = 0;
        ay ayVar = this.f37354b;
        switch (i10) {
            case 0:
                ayVar.getClass();
                ayVar.presentFragment(new org.telegram.ui.Wallet.b6());
                return;
            case 1:
                ay.t0(ayVar);
                return;
            case 2:
                ayVar.f5();
                return;
            case 3:
                ?? obj = new Object();
                obj.f20389a = true;
                ayVar.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 4:
                ayVar.fragmentView.dispatchTouchEvent(org.telegram.messenger.i0.R());
                return;
            case 5:
                ay ayVar2 = this.f37354b;
                ArrayList arrayList = ayVar2.I2;
                ayVar2.M2 = true;
                if (ayVar2.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(org.telegram.messenger.gs.a(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    ayVar2.C2.y(ayVar2, arrayList2, ayVar2.B1.getFieldText(), false, ayVar2.J2, ayVar2.K2, ayVar2.L2, null);
                    return;
                }
                return;
            case 6:
                ay ayVar3 = this.f37354b;
                ArrayList arrayList3 = ayVar3.I2;
                ayVar3.J2 = false;
                ayVar3.M2 = false;
                if (ayVar3.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.gs.a(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    ayVar3.C2.y(ayVar3, arrayList4, ayVar3.B1.getFieldText(), false, ayVar3.J2, ayVar3.K2, ayVar3.L2, null);
                    return;
                }
                return;
            case 7:
                ay.y0(ayVar);
                return;
            case 8:
                ayVar.getClass();
                if (LaunchActivity.Q() != null) {
                    ayVar.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 9:
                ayVar.X.f26588r.requestFocus();
                org.telegram.messenger.i0.J3(ayVar.X.f26588r);
                return;
            case 10:
                ayVar.getClass();
                ayVar.presentFragment(new j());
                return;
            case 11:
                ayVar.getClass();
                ayVar.presentFragment(new FiltersSetupActivity());
                return;
            case 12:
                ayVar.getClass();
                ayVar.presentFragment(new ThemeActivity(1));
                return;
            case 13:
                ayVar.L4(false, true);
                return;
            case 14:
                org.telegram.messenger.hs messagesStorage = ayVar.getMessagesStorage();
                messagesStorage.f15938a.c(new org.telegram.messenger.br(messagesStorage, 15));
                Toast.makeText(ayVar.getParentActivity(), org.telegram.messenger.cd.L0(2131751652, null), 0).show();
                return;
            case 15:
                org.telegram.messenger.vp messagesController = ayVar.getMessagesController();
                messagesController.B1.b();
                messagesController.C1.b();
                return;
            case 16:
                kx kxVar = ayVar.C0;
                if (kxVar != null && kxVar.A0) {
                    kxVar.R(false);
                    return;
                }
                ayVar.X.f26588r.getText().clear();
                org.telegram.messenger.i0.v1(ayVar.X.f26588r);
                ayVar.X.f26588r.clearFocus();
                ayVar.Y.b(false);
                return;
            case 17:
                if (ayVar.R0 != 10) {
                    ayVar.n4(false);
                }
                if (ayVar.L && ayVar.i4().I()) {
                    ayVar.E0.h();
                    return;
                } else {
                    ayVar.I4(true, true);
                    return;
                }
            case 18:
                zg.e eVar = ayVar.f35898y1;
                if (eVar != null) {
                    eVar.d();
                }
                ayVar.D3();
                ayVar.E3();
                bi.f2 f2Var = ayVar.C1;
                if (f2Var != null) {
                    f2Var.setTranslationY(-ayVar.f35885w.d());
                    return;
                }
                return;
            case 19:
                ayVar.getNotificationCenter().k(24, new Object[0]);
                return;
            case 20:
                ayVar.X3();
                return;
            case 21:
                ayVar.f5();
                return;
            case 22:
                ay.G0(ayVar);
                return;
            case 23:
                ayVar.getMessagesController().h4(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 24:
                vh.p2 p2Var = ayVar.f35853q0;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                ayVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 25:
                ayVar.f35794e0[0].d.f();
                return;
            case 26:
                UndoView j42 = ayVar.j4();
                if (j42 != null) {
                    j42.l(0L, 15, null, new fv(ayVar, 11));
                    return;
                }
                return;
            case 27:
                ayVar.getClass();
                SharedPreferences d12 = org.telegram.messenger.vp.d1();
                long j10 = d12.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                d12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                ayVar.f5();
                return;
            case 28:
                org.telegram.messenger.vp.r1(ayVar.currentAccount).l0(null);
                return;
            default:
                ayVar.getClass();
                ayVar.presentFragment(new UserInfoActivity());
                return;
        }
    }
}
