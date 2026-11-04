package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_wallet;
public final class e51 implements org.telegram.messenger.u10 {
    public final int f44898a;
    public final Object f44899b;
    public final Object f44900c;

    public e51(int i3, Object obj, Object obj2) {
        this.f44898a = i3;
        this.f44899b = obj;
        this.f44900c = obj2;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f44898a;
        Object obj2 = this.f44900c;
        Object obj3 = this.f44899b;
        switch (i3) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                qv0 qv0Var = (qv0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    qv0Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.fc.a0(themeActivity).I(2131624011, org.telegram.messenger.bd.M0(2131754311, null), org.telegram.messenger.bd.M0(2131754312, null)).j();
                    return;
                }
            case 1:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj3;
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) obj2;
                String str = (String) obj;
                if (str != null) {
                    org.telegram.ui.Wallet.k0.j("disableBackupWithoutUpdatingPhrase: ".concat(str));
                    j8Var.a(str);
                    return;
                }
                org.telegram.ui.Wallet.k0.H("sending disableBackup to server");
                org.telegram.ui.Wallet.g3.a(k0Var.f42718a, new bi.x(11), null, null, null, new ei.d0(6, k0Var, j8Var), true, true, new cg.u0((Object) null, 2));
                return;
            case 2:
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj3;
                try {
                    ((org.telegram.messenger.u10) obj2).a((String) obj);
                    if (h0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (h0Var != null) {
                        h0Var.close();
                    }
                }
            case 3:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.f8) obj2).a((String) obj);
                return;
            case 4:
                HashMap hashMap = ((org.telegram.ui.Wallet.k0) obj3).f42732q;
                hashMap.put((TL_wallet.walletTransaction) obj, (ci.q3) obj2);
                return;
            case 5:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) obj3;
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    f0Var.close();
                    org.telegram.ui.Wallet.k0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str2));
                    g8Var.a(null, str2);
                    return;
                }
                org.telegram.ui.Wallet.k0.H("prepare disable backup: done!");
                g8Var.a(f0Var, null);
                return;
            case 6:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((e51) obj2).a((String) obj);
                return;
            case 7:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g((org.telegram.ui.Wallet.x1) obj3, (org.telegram.ui.Wallet.k) obj2, (String) obj, 2));
                return;
            case 8:
                ((org.telegram.ui.Wallet.c2) obj3).h = false;
                ((f60) obj2).a(null, (String) obj);
                return;
            case 9:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.m) obj2).a((String) obj);
                return;
            case 10:
                ((org.telegram.ui.Wallet.h0) obj3).close();
                ((org.telegram.ui.Wallet.m) obj2).a((String) obj);
                return;
            case 11:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj3;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj2;
                String str3 = (String) obj;
                w5Var.D0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str3)) {
                    org.telegram.ui.Wallet.e8 e8Var = new org.telegram.ui.Wallet.e8();
                    e8Var.f42486s = k0Var2.y();
                    w5Var.presentFragment(e8Var);
                    return;
                } else if (str3 != null) {
                    org.telegram.ui.Components.fc.a0(w5Var).e0(str3, false);
                    return;
                } else {
                    w5Var.presentFragment(new org.telegram.ui.Wallet.w9());
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.e8 e8Var2 = (org.telegram.ui.Wallet.e8) obj3;
                org.telegram.ui.Wallet.k0 k0Var3 = (org.telegram.ui.Wallet.k0) obj2;
                String str4 = (String) obj;
                e8Var2.d.setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.fc.a0(e8Var2).e0(str4, false);
                    return;
                }
                e8Var2.finishFragment();
                k0Var3.L();
                return;
            case 13:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Components.fc.a0(n8Var).e0(str5, false);
                    return;
                }
                n8Var.finishFragment();
                if (d2Var instanceof org.telegram.ui.Wallet.w5) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.i3(2, d2Var), 300L);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Wallet.w9 w9Var = (org.telegram.ui.Wallet.w9) obj3;
                String str6 = (String) obj;
                ((org.telegram.messenger.u10) obj2).a(str6);
                if (str6 == null && !w9Var.f43365r) {
                    if (w9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.d2 d2Var2 : w9Var.getParentLayout().getFragmentStack()) {
                            if (d2Var2 instanceof org.telegram.ui.Wallet.w5) {
                                ((org.telegram.ui.Wallet.w5) d2Var2).O0();
                            }
                        }
                    }
                    w9Var.finishFragment();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Wallet.ha.d0((org.telegram.ui.Wallet.ha) obj3, (TL_wallet.tonConnectSession) obj2, (org.telegram.messenger.u10) obj);
                return;
            case 16:
                org.telegram.ui.web.m1 m1Var = (org.telegram.ui.web.m1) obj3;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                m1Var.getClass();
                ((org.telegram.ui.web.y0[]) obj2)[0].finishFragment();
                org.telegram.messenger.u10 u10Var = m1Var.f50950f;
                if (u10Var != null) {
                    m1Var.finishFragment();
                    u10Var.a(x0Var);
                    return;
                }
                sf.c.t(m1Var.getParentActivity(), x0Var.f51104c);
                return;
            default:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj3;
                u1Var.getClass();
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.iv0(u1Var, (org.telegram.ui.web.t1) obj2, (Bitmap) obj, 13));
                return;
        }
    }

    public e51(org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.Wallet.f0 f0Var, org.telegram.ui.Wallet.g8 g8Var) {
        this.f44898a = 5;
        this.f44899b = f0Var;
        this.f44900c = g8Var;
    }
}
