package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class fv0 extends org.telegram.ui.Components.l6 {
    public final int f45734b;
    public final ProfileActivity f45735c;

    public fv0(ProfileActivity profileActivity, int i7) {
        super("headerShadow", 0);
        this.f45734b = i7;
        switch (i7) {
            case 1:
                this.f45735c = profileActivity;
                super("avatarAnimationProgress", 0);
                return;
            default:
                this.f45735c = profileActivity;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        boolean z9;
        boolean z10;
        boolean z11;
        oi.q qVar;
        int w02;
        int w03;
        org.telegram.ui.ActionBar.k kVar;
        int w04;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.f5 f5Var;
        int w05;
        int i7;
        float f11;
        int I3;
        switch (this.f45734b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                this.f45735c.f41689a1 = f10;
                return;
            default:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
                ProfileActivity profileActivity2 = this.f45735c;
                if (profileActivity2.Q5 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (f10 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 != z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                profileActivity2.Q5 = f10;
                qVar = ((org.telegram.ui.ActionBar.f2) profileActivity2).glassEngine;
                qVar.g();
                if (z11) {
                    profileActivity2.P3();
                }
                ProfileActivity.s1(profileActivity2);
                profileActivity2.x5();
                bv0 bv0Var = profileActivity2.f41806r;
                if (bv0Var != null && !profileActivity2.f41788o2) {
                    Object tag = bv0Var.getTag();
                    if (tag instanceof Integer) {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.k6.w0(((Integer) tag).intValue(), profileActivity2.f41865z0), Boolean.valueOf(profileActivity2.J0[0]));
                    } else {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, profileActivity2.f41865z0), Boolean.TRUE);
                    }
                    bv0Var.setTextColor(i0.a.f(f10, I3, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, profileActivity2.f41865z0)));
                }
                profileActivity2.z5();
                cv0 cv0Var = profileActivity2.f41827u0;
                if (cv0Var != null) {
                    cv0Var.setActionBarActionMode(f10);
                }
                bi.g1 g1Var = profileActivity2.f41834v0;
                if (g1Var != null) {
                    g1Var.setActionBarActionMode(f10);
                }
                profileActivity2.f41705c1.invalidate();
                int i10 = -1;
                if (profileActivity2.f41739g6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27970ji, profileActivity2.f41865z0);
                }
                int i11 = org.telegram.ui.ActionBar.k6.Cj;
                int w06 = org.telegram.ui.ActionBar.k6.w0(i11, profileActivity2.f41865z0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w02, w06);
                profileActivity2.f41725f.setTextColor(S0);
                Drawable drawable = profileActivity2.f41849x;
                if (drawable != null) {
                    if (profileActivity2.f41739g6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.K != null) {
                    profileActivity2.K.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27924h8, profileActivity2.f41865z0), w06));
                }
                if (profileActivity2.f41739g6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28186v8, profileActivity2.f41865z0);
                }
                int w07 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28243y8, profileActivity2.f41865z0);
                kVar = ((org.telegram.ui.ActionBar.f2) profileActivity2).actionBar;
                kVar.D(org.telegram.messenger.g0.S0(f10, 1.0f, w03, w07), false);
                org.telegram.messenger.fp fpVar = profileActivity2.f41739g6;
                if (fpVar != null) {
                    w04 = 1090519039;
                } else if (fpVar != null) {
                    w04 = 553648127;
                } else {
                    w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27889f8, profileActivity2.f41865z0);
                }
                int w08 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28261z8, profileActivity2.f41865z0);
                kVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity2).actionBar;
                kVar2.C(org.telegram.messenger.g0.S0(f10, 1.0f, w04, w08), false);
                profileActivity2.f41705c1.invalidate();
                if (profileActivity2.f41857y != null) {
                    org.telegram.messenger.fp fpVar2 = profileActivity2.f41739g6;
                    if (fpVar2 != null) {
                        int g10 = fpVar2.g();
                        if (profileActivity2.f41739g6.o(org.telegram.ui.ActionBar.k6.I.q())) {
                            i7 = profileActivity2.f41739g6.k();
                        } else {
                            i7 = profileActivity2.f41739g6.i();
                        }
                        int f12 = i0.a.f(0.4f, g10, i7);
                        if (org.telegram.ui.ActionBar.k6.I.q()) {
                            f11 = -0.1f;
                        } else {
                            f11 = -0.08f;
                        }
                        w05 = org.telegram.ui.ActionBar.k6.b(0.1f, f11, f12);
                    } else {
                        w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28042ni, profileActivity2.f41865z0);
                    }
                    profileActivity2.f41857y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w05, org.telegram.ui.ActionBar.k6.w0(i11, profileActivity2.f41865z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.H != null) {
                    if (profileActivity2.f41739g6 == null) {
                        i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28061oi, profileActivity2.f41865z0);
                    }
                    profileActivity2.H.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, i10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d6, profileActivity2.f41865z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.D != null) {
                    profileActivity2.D.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28042ni, profileActivity2.f41865z0), org.telegram.ui.ActionBar.k6.w0(i11, profileActivity2.f41865z0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity2.s5();
                ProfileActivity profileActivity3 = profileActivity2.f41786o0.f47892n;
                if (profileActivity3.L0) {
                    f5Var = profileActivity3.P0;
                } else if (profileActivity3.N0) {
                    f5Var = profileActivity3.R0;
                } else {
                    f5Var = profileActivity3.T0;
                    if (f5Var == null) {
                        f5Var = null;
                    }
                }
                if (f5Var != null) {
                    if (profileActivity2.M0 || profileActivity2.N0 || profileActivity2.L0) {
                        profileActivity2.z4(0, profileActivity2.L3(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f45734b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(this.f45735c.f41689a1);
            default:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(this.f45735c.Q5);
        }
    }
}
