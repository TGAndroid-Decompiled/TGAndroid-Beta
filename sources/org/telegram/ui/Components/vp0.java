package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class vp0 implements Runnable {
    public final int f31808a;
    public final zt0 f31809b;

    public vp0(zt0 zt0Var, int i10) {
        this.f31808a = i10;
        this.f31809b = zt0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f31808a;
        zt0 zt0Var = this.f31809b;
        switch (i10) {
            case 0:
                zt0Var.f33215o2 = (int) zt0Var.R0.c(zt0.f33167u2);
                zt0Var.F();
                if (zt0Var.f33170a0 != null) {
                    zt0Var.C1();
                }
                ss0[] ss0VarArr = zt0Var.m0;
                if (ss0VarArr != null) {
                    for (ss0 ss0Var : ss0VarArr) {
                        if (ss0Var != null) {
                            int paddingTop = ss0Var.h.getPaddingTop();
                            dr0 dr0Var = ss0Var.h;
                            int paddingLeft = dr0Var.getPaddingLeft();
                            int h02 = zt0Var.h0(ss0Var.E);
                            int paddingRight = ss0Var.h.getPaddingRight();
                            dr0 dr0Var2 = ss0Var.h;
                            int g02 = zt0Var.g0(zt0Var.E0());
                            dr0Var2.f30014h3 = g02;
                            dr0Var.setPadding(paddingLeft, h02, paddingRight, g02);
                            org.telegram.messenger.i0.J(ss0Var.h, new dq0(ss0Var, paddingTop - ss0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                s4.R(zt0Var.getContext(), zt0Var.f33240x1, zt0Var.H1, new wp0(zt0Var));
                return;
            case 2:
                zt0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -zt0Var.f33188f1.f19794id);
                n90 n90Var = new n90(bundle, null);
                n90Var.f28724c = zt0Var.f33188f1;
                zt0Var.f33240x1.presentFragment(n90Var);
                return;
            case 3:
                org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
                vh.o8 D = vh.o8.D(k2Var.getParentActivity(), k2Var.getCurrentAccount());
                long j10 = zt0Var.l1;
                String currentLang = zt0Var.W.getCurrentLang();
                D.f51671v0 = j10;
                D.f51675w0 = currentLang;
                D.Q(null);
                D.f51671v0 = j10;
                D.f51675w0 = currentLang;
                return;
            case 4:
                zt0Var.W.f();
                return;
            case 5:
                uq0 uq0Var = zt0Var.W;
                if (uq0Var.d()) {
                    uq0Var.h();
                    return;
                } else {
                    uq0Var.f();
                    return;
                }
            case 6:
                uq0 uq0Var2 = zt0Var.W;
                uq0Var2.b(uq0Var2.getCurrentLang());
                return;
            case 7:
                org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var.f33240x1;
                k2Var2.getMessagesController().K4(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", k2Var2.getUserConfig().e());
                k2Var2.presentFragment(new org.telegram.ui.un(bundle2), true);
                return;
            case 8:
                org.telegram.ui.ActionBar.k2 k2Var3 = zt0Var.f33240x1;
                try {
                    org.telegram.messenger.ui mediaDataController = k2Var3.getMediaDataController();
                    long e = k2Var3.getUserConfig().e();
                    Pattern pattern = org.telegram.messenger.ui.R1;
                    mediaDataController.y0(e, 0, null);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 9:
                org.telegram.ui.ActionBar.k2 k2Var4 = zt0Var.f33240x1;
                TLRPC.User f7 = k2Var4.getUserConfig().f();
                s4.r(k2Var4, false, null, f7, false, true, false, true, new f2(18, zt0Var, f7));
                return;
            case 10:
                vq0 vq0Var = zt0Var.f33170a0;
                vq0Var.getClass();
                vq0Var.h(null, new ph.o1(vq0Var, 1));
                return;
            case 11:
                zt0Var.f33170a0.setReordering(true);
                return;
            case 12:
                zt0Var.l1(false);
                org.telegram.ui.ActionBar.i5 i5Var = zt0Var.H;
                if (i5Var != null) {
                    i5Var.j(true);
                } else {
                    zt0Var.G.k(true);
                }
                zt0Var.f33178c1 = 0;
                return;
            default:
                zt0Var.u0();
                return;
        }
    }
}
