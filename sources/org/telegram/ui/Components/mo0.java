package org.telegram.ui.Components;

import android.view.View;
public final class mo0 extends org.telegram.ui.ActionBar.i1 {
    public final no0 f37591x;

    public mo0(no0 no0Var, no0 no0Var2) {
        super(no0Var2);
        this.f37591x = no0Var;
    }

    @Override
    public final boolean b() {
        ap0 ap0Var = this.f37591x.f37919q0;
        if (!ap0Var.J && ap0Var.U1) {
            return !ap0Var.f33576o1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        no0 no0Var = this.f37591x;
        ap0 ap0Var = no0Var.f37919q0;
        int i7 = ap0.U2;
        for (int i10 = 0; i10 < ap0Var.f30176b.getChildCount(); i10++) {
            View childAt = ap0Var.f30176b.getChildAt(i10);
            if (childAt != ap0Var.f33582r1 && childAt != ap0Var.f33592w1 && childAt != ap0Var.O1[1] && childAt != ap0Var.f33596y1 && childAt != ap0Var.n1 && childAt != ap0Var.Y1 && childAt != ap0Var.f33580q1) {
                childAt.setTranslationY(f10);
            }
        }
        co0 co0Var = ap0Var.B1;
        ap0Var.f33579p2 = f10;
        int i11 = no0Var.f37915l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = no0Var.m0;
            ap0Var.f33572l2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            co0Var.setTranslationY(f13);
            if (z10) {
                ap0Var.C1.setTranslationY(f13);
            } else {
                ap0Var.C1.setTranslationY(f13 + ap0Var.B1.getPaddingTop());
            }
        } else {
            int i13 = no0Var.f37916n0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = no0Var.f37917o0;
                ap0Var.f33572l2 = (int) ((i14 * f11) + (i13 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    co0Var.setTranslationY(f10 - ((i13 - i14) * f11));
                } else {
                    co0Var.setTranslationY(((i14 - i13) * f14) + f10);
                }
            }
        }
        ap0Var.B1.setTopGlowOffset((int) (ap0Var.f33572l2 + ap0Var.f33579p2));
        ap0Var.f33573m1.setTranslationY(ap0Var.f33572l2 + ap0Var.f33579p2);
        ap0Var.M1.setTranslationY(ap0Var.f33572l2 + ap0Var.f33579p2);
        ap0Var.n1.invalidate();
        ap0Var.F0 = ap0Var.f33579p2;
        ap0Var.f30179c.invalidate();
        ap0Var.a1();
        no0Var.invalidate();
    }

    @Override
    public final void f() {
        ap0 ap0Var = this.f37591x.f37919q0;
        go0 go0Var = ap0Var.f33576o1;
        if (go0Var == null || !go0Var.m()) {
            int i7 = ap0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        ap0Var.f33575n2 = false;
        int i10 = ap0Var.f33572l2;
        ap0Var.f33574m2 = i10;
        ap0Var.B1.setTopGlowOffset(i10);
        ap0Var.f33573m1.setTranslationY(ap0Var.f33572l2);
        ap0Var.M1.setTranslationY(ap0Var.f33572l2);
        ap0Var.B1.setTranslationY(0.0f);
        ap0Var.C1.setTranslationY(0.0f);
        ap0Var.a1();
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        no0 no0Var = this.f37591x;
        ap0 ap0Var = no0Var.f37919q0;
        int i11 = ap0Var.f33574m2;
        int i12 = ap0Var.f33572l2;
        if (i11 != i12) {
            no0Var.f37915l0 = i11;
            no0Var.m0 = i12;
            ap0Var.f33575n2 = true;
            ap0Var.f33572l2 = i11;
        } else {
            no0Var.f37915l0 = -1;
        }
        int i13 = no0Var.f37913j0;
        int i14 = no0Var.f37914k0;
        if (i13 != i14) {
            no0Var.f37916n0 = 0;
            no0Var.f37917o0 = 0;
            ap0Var.f33575n2 = true;
            if (!z10) {
                no0Var.f37917o0 = 0 - (i13 - i14);
            } else {
                no0Var.f37917o0 = i13 - i14;
            }
            if (z10) {
                i10 = no0Var.f37915l0;
            } else {
                i10 = no0Var.m0;
            }
            ap0Var.f33572l2 = i10;
        } else {
            no0Var.f37916n0 = -1;
        }
        ap0Var.B1.setTopGlowOffset((int) (ap0Var.f33579p2 + ap0Var.f33572l2));
        ap0Var.f33573m1.setTranslationY(ap0Var.f33579p2 + ap0Var.f33572l2);
        ap0Var.M1.setTranslationY(ap0Var.f33579p2 + ap0Var.f33572l2);
        no0Var.invalidate();
    }
}
