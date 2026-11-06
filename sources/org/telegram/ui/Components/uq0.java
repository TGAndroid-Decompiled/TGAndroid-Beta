package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class uq0 implements uk0 {
    public final xs0 f38697a;

    public uq0(xs0 xs0Var) {
        this.f38697a = xs0Var;
    }

    @Override
    public final void F0(float f10) {
        sr0 sr0Var;
        int i7;
        int i10;
        sr0 sr0Var2;
        xs0 xs0Var = this.f38697a;
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.f40416p0;
        sr0[] sr0VarArr = xs0Var.m0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || sr0VarArr[1].getVisibility() == 0) {
            if (xs0Var.f40401j1) {
                sr0VarArr[0].setTranslationX((-f10) * sr0Var2.getMeasuredWidth());
                sr0VarArr[1].setTranslationX(sr0VarArr[0].getMeasuredWidth() - (sr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                sr0VarArr[0].setTranslationX(sr0Var.getMeasuredWidth() * f10);
                sr0VarArr[1].setTranslationX((sr0VarArr[0].getMeasuredWidth() * f10) - sr0VarArr[0].getMeasuredWidth());
            }
            xs0Var.X0(xs0Var.getTabProgress());
            float k02 = xs0Var.k0(f10);
            xs0Var.f40423r0 = k02;
            ImageView imageView = xs0Var.f40429t0;
            int i12 = 4;
            if (k02 != 0.0f && xs0Var.I() && !xs0Var.A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            imageView.setVisibility(i7);
            if (r0Var != null && !xs0Var.I()) {
                if (xs0Var.H0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                xs0Var.setSearchItemVisibility(i10);
                xs0Var.f40419q0 = 0.0f;
            } else {
                xs0Var.f40419q0 = xs0Var.l0(f10);
                xs0Var.L1();
            }
            xs0Var.G1(false);
            if (i11 == 0) {
                sr0 sr0Var3 = sr0VarArr[0];
                sr0VarArr[0] = sr0VarArr[1];
                sr0VarArr[1] = sr0Var3;
                sr0Var3.setVisibility(8);
                if (r0Var != null && xs0Var.f40444z0 == 2) {
                    if (xs0Var.H0()) {
                        i12 = 8;
                    }
                    xs0Var.setSearchItemVisibility(i12);
                }
                xs0Var.f40444z0 = 0;
                xs0Var.s1();
            }
        }
    }

    @Override
    public final void b(int i7, boolean z9) {
        xs0 xs0Var = this.f38697a;
        sr0[] sr0VarArr = xs0Var.m0;
        if (sr0VarArr[0].E == i7) {
            return;
        }
        yp0 yp0Var = xs0Var.f40374b0;
        if (yp0Var != null && i7 == 8) {
            yp0Var.f47336b.f(1.0f, 0);
        }
        sr0 sr0Var = sr0VarArr[1];
        sr0Var.E = i7;
        sr0Var.setVisibility(0);
        xs0Var.w0();
        xs0Var.z1(true);
        xs0Var.f40401j1 = z9;
        xs0Var.W0();
        xs0Var.E(!xs0Var.E0(i7));
        xs0Var.G1(true);
    }

    @Override
    public final void c() {
        int a10;
        int L0;
        xs0 xs0Var = this.f38697a;
        sr0[] sr0VarArr = xs0Var.m0;
        int i7 = sr0VarArr[0].E;
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
        sr0 sr0Var = sr0VarArr[0];
        if (sr0Var.E == 0) {
            L0 = (sr0Var.f38114x.L0() / xs0Var.f40414o1[0]) * a10;
        } else {
            L0 = sr0Var.f38114x.L0() * a10;
        }
        if (L0 >= sr0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ri0 ri0Var = sr0VarArr[0].D;
            ri0Var.f37652b = 1;
            ri0Var.d(0, 0, false, false);
            return;
        }
        sr0VarArr[0].h.y0(0);
    }

    @Override
    public final boolean m1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        xs0 xs0Var = this.f38697a;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40440x1;
        if (f2Var != null) {
            boolean C0 = xs0Var.C0();
            if (xs0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, f2Var.getMessagesController().M0(Long.valueOf(xs0Var.f40389f1.f26954id)))) {
                        profileTab = xs0Var.f40389f1.main_tab;
                        if (profileTab != null || (i7 != xs0.p0(profileTab) && xs0Var.U1 != i7)) {
                            k60 H = k60.H(f2Var, view);
                            H.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false)));
                            H.c(2131232773, org.telegram.messenger.hd.M0(2131746621, null), new bi.c9(this, C0, i7, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (xs0Var.l1 == f2Var.getUserConfig().e() && (userFull = xs0Var.f40392g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    k60 H2 = k60.H(f2Var, view);
                    H2.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false)));
                    H2.c(2131232773, org.telegram.messenger.hd.M0(2131746621, null), new bi.c9(this, C0, i7, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
