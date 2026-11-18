package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.tl.TL_wallet;
public final class p51 implements org.telegram.messenger.x10 {
    public final int f50761a;
    public final Object f50762b;
    public final Object f50763c;

    public p51(int i7, Object obj, Object obj2) {
        this.f50761a = i7;
        this.f50762b = obj;
        this.f50763c = obj2;
    }

    @Override
    public final void a(Object obj) {
        v4.f1 K;
        int i7 = this.f50761a;
        Object obj2 = this.f50763c;
        Object obj3 = this.f50762b;
        switch (i7) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.messenger.bz.f23204u0 = false;
                    org.telegram.messenger.bz.y();
                    themeActivity.P0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.ck0 ck0Var = themeActivity.f43832b;
                    if (ck0Var != null && ck0Var.H && (K = ck0Var.K(themeActivity.N)) != null) {
                        themeActivity.f43830a.t(K, themeActivity.N);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                b31 b31Var = (b31) obj2;
                if (((Boolean) obj).booleanValue()) {
                    b31Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.lc.b0(themeActivity2).I(2131624012, org.telegram.messenger.gd.M0(2131754309, null), org.telegram.messenger.gd.M0(2131754310, null)).j();
                    return;
                }
            case 2:
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj3;
                try {
                    ((org.telegram.messenger.x10) obj2).a((String) obj);
                    if (r0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (r0Var != null) {
                        r0Var.close();
                    }
                }
            case 3:
                ((org.telegram.ui.Wallet.r0) obj3).close();
                ((org.telegram.ui.Wallet.v8) obj2).a((String) obj);
                return;
            case 4:
                ((org.telegram.ui.Wallet.u0) obj3).f45097q.put((TL_wallet.walletTransaction) obj, (org.telegram.messenger.x10) obj2);
                return;
            case 5:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) obj3;
                org.telegram.ui.Wallet.y8 y8Var = (org.telegram.ui.Wallet.y8) obj2;
                String str = (String) obj;
                if (str != null) {
                    o0Var.close();
                    org.telegram.ui.Wallet.u0.n("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    y8Var.a(null, str);
                    return;
                }
                org.telegram.ui.Wallet.u0.P("prepare disable backup: done!");
                y8Var.a(o0Var, null);
                return;
            case 6:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj3;
                org.telegram.ui.Wallet.z8 z8Var = (org.telegram.ui.Wallet.z8) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    org.telegram.ui.Wallet.u0.n("disableBackupWithoutUpdatingPhrase: ".concat(str2));
                    z8Var.a(str2);
                    return;
                }
                org.telegram.ui.Wallet.u0.P("sending disableBackup to server");
                org.telegram.ui.Wallet.n3.a(u0Var.f45083a, new ci.y(10), null, null, null, new fi.b0(5, u0Var, z8Var), true, true, new m.b3(null, null));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.p((Object) ((org.telegram.ui.Wallet.g2) obj3), (Object) ((org.telegram.ui.Wallet.k) obj2), (String) obj, 2));
                return;
            case 8:
                ((org.telegram.ui.Wallet.l2) obj3).h = false;
                ((bi.t3) obj2).a(null, (String) obj);
                return;
            case 9:
                ((org.telegram.ui.Wallet.r0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).a((String) obj);
                return;
            case 10:
                ((org.telegram.ui.Wallet.r0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).a((String) obj);
                return;
            case 11:
                ((org.telegram.ui.Wallet.r0) obj3).close();
                ((p51) obj2).a((String) obj);
                return;
            case 12:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj3;
                org.telegram.ui.Wallet.u0 u0Var2 = (org.telegram.ui.Wallet.u0) obj2;
                String str3 = (String) obj;
                n6Var.F0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str3)) {
                    org.telegram.ui.Wallet.u8 u8Var = new org.telegram.ui.Wallet.u8();
                    u8Var.f45144s = u0Var2.E();
                    n6Var.presentFragment(u8Var);
                    return;
                } else if (str3 != null) {
                    org.telegram.ui.Components.lc.b0(n6Var).f0(str3, false);
                    return;
                } else {
                    n6Var.presentFragment(new org.telegram.ui.Wallet.na());
                    return;
                }
            case 13:
                org.telegram.ui.Wallet.u8 u8Var2 = (org.telegram.ui.Wallet.u8) obj3;
                org.telegram.ui.Wallet.u0 u0Var3 = (org.telegram.ui.Wallet.u0) obj2;
                String str4 = (String) obj;
                u8Var2.d.setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.lc.b0(u8Var2).f0(str4, false);
                    return;
                }
                u8Var2.finishFragment();
                u0Var3.T();
                return;
            case 14:
                org.telegram.ui.Wallet.d9 d9Var = (org.telegram.ui.Wallet.d9) obj3;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Components.lc.b0(d9Var).f0(str5, false);
                    return;
                }
                d9Var.finishFragment();
                if (h2Var instanceof org.telegram.ui.Wallet.n6) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.t3(2, h2Var), 300L);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) obj3;
                String str6 = (String) obj;
                ((org.telegram.messenger.x10) obj2).a(str6);
                if (str6 == null && !naVar.f44671r) {
                    if (naVar.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.h2 h2Var2 : naVar.getParentLayout().getFragmentStack()) {
                            if (h2Var2 instanceof org.telegram.ui.Wallet.n6) {
                                ((org.telegram.ui.Wallet.n6) h2Var2).T0();
                            }
                        }
                    }
                    naVar.finishFragment();
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Wallet.ya.d0((org.telegram.ui.Wallet.ya) obj3, (TL_wallet.tonConnectSession) obj2, (org.telegram.messenger.x10) obj);
                return;
            case 17:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj3;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                n1Var.getClass();
                ((org.telegram.ui.web.x0[]) obj2)[0].finishFragment();
                org.telegram.messenger.x10 x10Var = n1Var.f53258f;
                if (x10Var != null) {
                    n1Var.finishFragment();
                    x10Var.a(w0Var);
                    return;
                }
                vf.c.t(n1Var.getParentActivity(), w0Var.f53389c);
                return;
            default:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) obj3;
                v1Var.getClass();
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.sv0(v1Var, (org.telegram.ui.web.u1) obj2, (Bitmap) obj, 14));
                return;
        }
    }

    public p51(org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.Wallet.o0 o0Var, org.telegram.ui.Wallet.y8 y8Var) {
        this.f50761a = 5;
        this.f50762b = o0Var;
        this.f50763c = y8Var;
    }
}
