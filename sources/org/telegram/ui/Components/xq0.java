package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class xq0 implements zk0 {
    public final ys0 f41753a;

    public xq0(ys0 ys0Var) {
        this.f41753a = ys0Var;
    }

    @Override
    public final void D() {
        int a10;
        int L0;
        ys0 ys0Var = this.f41753a;
        tr0[] tr0VarArr = ys0Var.f42117n0;
        int i7 = tr0VarArr[0].F;
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
            a10 = org.telegram.ui.Cells.o7.a(1);
        }
        tr0 tr0Var = tr0VarArr[0];
        if (tr0Var.F == 0) {
            L0 = (tr0Var.f39799x.L0() / ys0Var.f42123p1[0]) * a10;
        } else {
            L0 = tr0Var.f39799x.L0() * a10;
        }
        if (L0 >= tr0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            wi0 wi0Var = tr0VarArr[0].E;
            wi0Var.f41354b = 1;
            wi0Var.d(0, 0, false, false);
            return;
        }
        tr0VarArr[0].h.y0(0);
    }

    @Override
    public final void D0(float f10) {
        tr0 tr0Var;
        int i7;
        int i10;
        tr0 tr0Var2;
        ys0 ys0Var = this.f41753a;
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.f42125q0;
        tr0[] tr0VarArr = ys0Var.f42117n0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || tr0VarArr[1].getVisibility() == 0) {
            if (ys0Var.f42110k1) {
                tr0VarArr[0].setTranslationX((-f10) * tr0Var2.getMeasuredWidth());
                tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() - (tr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                tr0VarArr[0].setTranslationX(tr0Var.getMeasuredWidth() * f10);
                tr0VarArr[1].setTranslationX((tr0VarArr[0].getMeasuredWidth() * f10) - tr0VarArr[0].getMeasuredWidth());
            }
            ys0Var.Z0(ys0Var.getTabProgress());
            float k02 = ys0Var.k0(f10);
            ys0Var.f42133s0 = k02;
            ImageView imageView = ys0Var.f42138u0;
            int i12 = 4;
            if (k02 != 0.0f && ys0Var.I() && !ys0Var.A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            imageView.setVisibility(i7);
            if (q0Var != null && !ys0Var.I()) {
                if (ys0Var.I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                ys0Var.setSearchItemVisibility(i10);
                ys0Var.f42129r0 = 0.0f;
            } else {
                ys0Var.f42129r0 = ys0Var.l0(f10);
                ys0Var.N1();
            }
            ys0Var.I1(false);
            if (i11 == 0) {
                tr0 tr0Var3 = tr0VarArr[0];
                tr0VarArr[0] = tr0VarArr[1];
                tr0VarArr[1] = tr0Var3;
                tr0Var3.setVisibility(8);
                if (q0Var != null && ys0Var.A0 == 2) {
                    if (ys0Var.I0()) {
                        i12 = 8;
                    }
                    ys0Var.setSearchItemVisibility(i12);
                }
                ys0Var.A0 = 0;
                ys0Var.u1();
            }
        }
    }

    @Override
    public final void b(int i7, boolean z10) {
        ys0 ys0Var = this.f41753a;
        tr0[] tr0VarArr = ys0Var.f42117n0;
        if (tr0VarArr[0].F == i7) {
            return;
        }
        zp0 zp0Var = ys0Var.f42084c0;
        if (zp0Var != null && i7 == 8) {
            zp0Var.f48492b.f(1.0f, 0);
        }
        tr0 tr0Var = tr0VarArr[1];
        tr0Var.F = i7;
        tr0Var.setVisibility(0);
        ys0Var.w0();
        ys0Var.B1(true);
        ys0Var.f42110k1 = z10;
        ys0Var.Y0();
        ys0Var.E(!ys0Var.F0(i7));
        ys0Var.I1(true);
    }

    @Override
    public final boolean j1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        ys0 ys0Var = this.f41753a;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42150y1;
        if (e2Var != null) {
            boolean C0 = ys0Var.C0();
            if (ys0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, e2Var.getMessagesController().M0(Long.valueOf(ys0Var.f42098g1.f28052id)))) {
                        profileTab = ys0Var.f42098g1.main_tab;
                        if (profileTab != null || (i7 != ys0.p0(profileTab) && ys0Var.V1 != i7)) {
                            m60 H = m60.H(e2Var, view);
                            H.W(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)));
                            H.c(2131232774, org.telegram.messenger.hd.M0(2131746622, null), new di.u7(this, C0, i7, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (ys0Var.f42114m1 == e2Var.getUserConfig().e() && (userFull = ys0Var.f42101h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    m60 H2 = m60.H(e2Var, view);
                    H2.W(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)));
                    H2.c(2131232774, org.telegram.messenger.hd.M0(2131746622, null), new di.u7(this, C0, i7, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
