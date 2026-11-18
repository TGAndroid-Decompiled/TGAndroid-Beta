package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class fr0 implements hl0 {
    public final gt0 f35159a;

    public fr0(gt0 gt0Var) {
        this.f35159a = gt0Var;
    }

    @Override
    public final void D() {
        int a10;
        int L0;
        gt0 gt0Var = this.f35159a;
        bs0[] bs0VarArr = gt0Var.f35609n0;
        int i7 = bs0VarArr[0].F;
        if (i7 != 0) {
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            a10 = org.telegram.messenger.g0.L(58.0f);
                        } else {
                            a10 = org.telegram.messenger.g0.L(60.0f);
                        }
                    }
                } else {
                    a10 = org.telegram.messenger.g0.L(100.0f);
                }
            }
            a10 = org.telegram.messenger.g0.L(56.0f);
        } else {
            a10 = org.telegram.ui.Cells.p7.a(1);
        }
        bs0 bs0Var = bs0VarArr[0];
        if (bs0Var.F == 0) {
            L0 = (bs0Var.f33775x.L0() / gt0Var.f35615p1[0]) * a10;
        } else {
            L0 = bs0Var.f33775x.L0() * a10;
        }
        if (L0 >= bs0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            org.telegram.ui.ActionBar.l5 l5Var = bs0VarArr[0].E;
            l5Var.f29201b = 1;
            l5Var.k(0, 0, false, false);
            return;
        }
        bs0VarArr[0].h.y0(0);
    }

    @Override
    public final void a(int i7, boolean z10) {
        gt0 gt0Var = this.f35159a;
        bs0[] bs0VarArr = gt0Var.f35609n0;
        if (bs0VarArr[0].F == i7) {
            return;
        }
        hq0 hq0Var = gt0Var.f35576c0;
        if (hq0Var != null && i7 == 8) {
            hq0Var.f50353b.g(1.0f, 0);
        }
        bs0 bs0Var = bs0VarArr[1];
        bs0Var.F = i7;
        bs0Var.setVisibility(0);
        gt0Var.w0();
        gt0Var.B1(true);
        gt0Var.f35602k1 = z10;
        gt0Var.Y0();
        gt0Var.E(!gt0Var.F0(i7));
        gt0Var.I1(true);
    }

    @Override
    public final void g(float f10) {
        bs0 bs0Var;
        int i7;
        int i10;
        bs0 bs0Var2;
        gt0 gt0Var = this.f35159a;
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.f35617q0;
        bs0[] bs0VarArr = gt0Var.f35609n0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || bs0VarArr[1].getVisibility() == 0) {
            if (gt0Var.f35602k1) {
                bs0VarArr[0].setTranslationX((-f10) * bs0Var2.getMeasuredWidth());
                bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth() - (bs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                bs0VarArr[0].setTranslationX(bs0Var.getMeasuredWidth() * f10);
                bs0VarArr[1].setTranslationX((bs0VarArr[0].getMeasuredWidth() * f10) - bs0VarArr[0].getMeasuredWidth());
            }
            gt0Var.Z0(gt0Var.getTabProgress());
            float k02 = gt0Var.k0(f10);
            gt0Var.f35625s0 = k02;
            ImageView imageView = gt0Var.f35630u0;
            int i12 = 4;
            if (k02 != 0.0f && gt0Var.I() && !gt0Var.A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            imageView.setVisibility(i7);
            if (r0Var != null && !gt0Var.I()) {
                if (gt0Var.I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                gt0Var.setSearchItemVisibility(i10);
                gt0Var.f35621r0 = 0.0f;
            } else {
                gt0Var.f35621r0 = gt0Var.l0(f10);
                gt0Var.N1();
            }
            gt0Var.I1(false);
            if (i11 == 0) {
                bs0 bs0Var3 = bs0VarArr[0];
                bs0VarArr[0] = bs0VarArr[1];
                bs0VarArr[1] = bs0Var3;
                bs0Var3.setVisibility(8);
                if (r0Var != null && gt0Var.A0 == 2) {
                    if (gt0Var.I0()) {
                        i12 = 8;
                    }
                    gt0Var.setSearchItemVisibility(i12);
                }
                gt0Var.A0 = 0;
                gt0Var.u1();
            }
        }
    }

    @Override
    public final boolean h1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        gt0 gt0Var = this.f35159a;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        if (h2Var != null) {
            boolean C0 = gt0Var.C0();
            if (gt0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.v3.w(5, h2Var.getMessagesController().O0(Long.valueOf(gt0Var.f35590g1.f28406id)))) {
                        profileTab = gt0Var.f35590g1.main_tab;
                        if (profileTab != null || (i7 != gt0.p0(profileTab) && gt0Var.V1 != i7)) {
                            y60 I = y60.I(h2Var, view);
                            I.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false)));
                            I.c(2131232775, org.telegram.messenger.gd.M0(2131746427, null), new di.x7(this, C0, i7, 6), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (gt0Var.f35606m1 == h2Var.getUserConfig().e() && (userFull = gt0Var.f35593h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    y60 I2 = y60.I(h2Var, view);
                    I2.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false)));
                    I2.c(2131232775, org.telegram.messenger.gd.M0(2131746427, null), new di.x7(this, C0, i7, 6), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
