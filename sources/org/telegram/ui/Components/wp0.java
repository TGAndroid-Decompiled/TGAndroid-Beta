package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class wp0 implements Runnable {
    public final int f32293a;
    public final au0 f32294b;

    public wp0(au0 au0Var, int i10) {
        this.f32293a = i10;
        this.f32294b = au0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32293a;
        au0 au0Var = this.f32294b;
        switch (i10) {
            case 0:
                au0Var.f24543o2 = (int) au0Var.R0.c(au0.f24495u2);
                au0Var.F();
                if (au0Var.f24498a0 != null) {
                    au0Var.D1();
                }
                ts0[] ts0VarArr = au0Var.m0;
                if (ts0VarArr != null) {
                    for (ts0 ts0Var : ts0VarArr) {
                        if (ts0Var != null) {
                            int paddingTop = ts0Var.h.getPaddingTop();
                            er0 er0Var = ts0Var.h;
                            int paddingLeft = er0Var.getPaddingLeft();
                            int i02 = au0Var.i0(ts0Var.E);
                            int paddingRight = ts0Var.h.getPaddingRight();
                            er0 er0Var2 = ts0Var.h;
                            int h02 = au0Var.h0(au0Var.F0());
                            er0Var2.f30438h3 = h02;
                            er0Var.setPadding(paddingLeft, i02, paddingRight, h02);
                            org.telegram.messenger.i0.J(ts0Var.h, new eq0(ts0Var, paddingTop - ts0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                s4.R(au0Var.getContext(), au0Var.f24568x1, au0Var.H1, new xp0(au0Var));
                return;
            case 2:
                au0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -au0Var.f24516f1.f19795id);
                n90 n90Var = new n90(bundle, null);
                n90Var.f28750c = au0Var.f24516f1;
                au0Var.f24568x1.presentFragment(n90Var);
                return;
            case 3:
                org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
                vh.o8 D = vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount());
                long j10 = au0Var.l1;
                String currentLang = au0Var.W.getCurrentLang();
                D.f51686v0 = j10;
                D.f51690w0 = currentLang;
                D.Q(null);
                D.f51686v0 = j10;
                D.f51690w0 = currentLang;
                return;
            case 4:
                au0Var.W.f();
                return;
            case 5:
                vq0 vq0Var = au0Var.W;
                if (vq0Var.d()) {
                    vq0Var.h();
                    return;
                } else {
                    vq0Var.f();
                    return;
                }
            case 6:
                vq0 vq0Var2 = au0Var.W;
                vq0Var2.b(vq0Var2.getCurrentLang());
                return;
            case 7:
                org.telegram.ui.ActionBar.k2 k2Var2 = au0Var.f24568x1;
                k2Var2.getMessagesController().K4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", k2Var2.getUserConfig().e());
                k2Var2.presentFragment(new org.telegram.ui.un(bundle2), true);
                return;
            case 8:
                org.telegram.ui.ActionBar.k2 k2Var3 = au0Var.f24568x1;
                try {
                    org.telegram.messenger.vi mediaDataController = k2Var3.getMediaDataController();
                    long e = k2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.vi.R1;
                    mediaDataController.y0(e, 0, null);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 9:
                org.telegram.ui.ActionBar.k2 k2Var4 = au0Var.f24568x1;
                TLRPC.User f7 = k2Var4.getUserConfig().f();
                s4.r(k2Var4, false, null, f7, false, true, false, true, new f2(18, au0Var, f7));
                return;
            case 10:
                wq0 wq0Var = au0Var.f24498a0;
                wq0Var.getClass();
                wq0Var.h(null, new ph.o1(wq0Var, 1));
                return;
            case 11:
                au0Var.f24498a0.setReordering(true);
                return;
            case 12:
                au0Var.m1(false);
                org.telegram.ui.ActionBar.i5 i5Var = au0Var.H;
                if (i5Var != null) {
                    i5Var.j(true);
                } else {
                    au0Var.G.k(true);
                }
                au0Var.f24506c1 = 0;
                return;
            default:
                au0Var.v0();
                return;
        }
    }
}
