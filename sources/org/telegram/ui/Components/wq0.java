package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class wq0 implements uk0 {
    public final ys0 f40056a;

    public wq0(ys0 ys0Var) {
        this.f40056a = ys0Var;
    }

    @Override
    public final void F0(float f10) {
        tr0 tr0Var;
        int i7;
        int i10;
        tr0 tr0Var2;
        ys0 ys0Var = this.f40056a;
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.f40695p0;
        tr0[] tr0VarArr = ys0Var.m0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || tr0VarArr[1].getVisibility() == 0) {
            if (ys0Var.f40680j1) {
                tr0VarArr[0].setTranslationX((-f10) * tr0Var2.getMeasuredWidth());
                tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() - (tr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                tr0VarArr[0].setTranslationX(tr0Var.getMeasuredWidth() * f10);
                tr0VarArr[1].setTranslationX((tr0VarArr[0].getMeasuredWidth() * f10) - tr0VarArr[0].getMeasuredWidth());
            }
            ys0Var.Z0(ys0Var.getTabProgress());
            float k02 = ys0Var.k0(f10);
            ys0Var.f40702r0 = k02;
            ImageView imageView = ys0Var.f40708t0;
            int i12 = 4;
            if (k02 != 0.0f && ys0Var.I() && !ys0Var.A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            imageView.setVisibility(i7);
            if (r0Var != null && !ys0Var.I()) {
                if (ys0Var.I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                ys0Var.setSearchItemVisibility(i10);
                ys0Var.f40698q0 = 0.0f;
            } else {
                ys0Var.f40698q0 = ys0Var.l0(f10);
                ys0Var.N1();
            }
            ys0Var.I1(false);
            if (i11 == 0) {
                tr0 tr0Var3 = tr0VarArr[0];
                tr0VarArr[0] = tr0VarArr[1];
                tr0VarArr[1] = tr0Var3;
                tr0Var3.setVisibility(8);
                if (r0Var != null && ys0Var.f40723z0 == 2) {
                    if (ys0Var.I0()) {
                        i12 = 8;
                    }
                    ys0Var.setSearchItemVisibility(i12);
                }
                ys0Var.f40723z0 = 0;
                ys0Var.u1();
            }
        }
    }

    @Override
    public final void b(int i7, boolean z9) {
        ys0 ys0Var = this.f40056a;
        tr0[] tr0VarArr = ys0Var.m0;
        if (tr0VarArr[0].E == i7) {
            return;
        }
        yp0 yp0Var = ys0Var.f40653b0;
        if (yp0Var != null && i7 == 8) {
            yp0Var.f48862b.f(1.0f, 0);
        }
        tr0 tr0Var = tr0VarArr[1];
        tr0Var.E = i7;
        tr0Var.setVisibility(0);
        ys0Var.w0();
        ys0Var.B1(true);
        ys0Var.f40680j1 = z9;
        ys0Var.Y0();
        ys0Var.E(!ys0Var.F0(i7));
        ys0Var.I1(true);
    }

    @Override
    public final void c() {
        int a10;
        int L0;
        ys0 ys0Var = this.f40056a;
        tr0[] tr0VarArr = ys0Var.m0;
        int i7 = tr0VarArr[0].E;
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
        tr0 tr0Var = tr0VarArr[0];
        if (tr0Var.E == 0) {
            L0 = (tr0Var.f38390x.L0() / ys0Var.f40693o1[0]) * a10;
        } else {
            L0 = tr0Var.f38390x.L0() * a10;
        }
        if (L0 >= tr0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ri0 ri0Var = tr0VarArr[0].D;
            ri0Var.f37666b = 1;
            ri0Var.d(0, 0, false, false);
            return;
        }
        tr0VarArr[0].h.y0(0);
    }

    @Override
    public final boolean m1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        ys0 ys0Var = this.f40056a;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        if (f2Var != null) {
            boolean C0 = ys0Var.C0();
            if (ys0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, f2Var.getMessagesController().M0(Long.valueOf(ys0Var.f40668f1.f26961id)))) {
                        profileTab = ys0Var.f40668f1.main_tab;
                        if (profileTab != null || (i7 != ys0.p0(profileTab) && ys0Var.U1 != i7)) {
                            k60 H = k60.H(f2Var, view);
                            H.W(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)));
                            H.c(2131232773, org.telegram.messenger.id.M0(2131746622, null), new bi.c9(this, C0, i7, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (ys0Var.l1 == f2Var.getUserConfig().e() && (userFull = ys0Var.f40671g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    k60 H2 = k60.H(f2Var, view);
                    H2.W(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)));
                    H2.c(2131232773, org.telegram.messenger.id.M0(2131746622, null), new bi.c9(this, C0, i7, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
