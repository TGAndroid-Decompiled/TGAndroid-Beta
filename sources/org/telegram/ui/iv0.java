package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class iv0 extends org.telegram.ui.Components.k6 {
    public final int f46758b;
    public final ProfileActivity f46759c;

    public iv0(ProfileActivity profileActivity, int i7) {
        super("headerShadow", 0);
        this.f46758b = i7;
        switch (i7) {
            case 1:
                this.f46759c = profileActivity;
                super("avatarAnimationProgress", 0);
                return;
            default:
                this.f46759c = profileActivity;
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
        org.telegram.ui.ActionBar.l lVar;
        int w04;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.g5 g5Var;
        int w05;
        int i7;
        float f11;
        int I3;
        switch (this.f46758b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                this.f46759c.f41691a1 = f10;
                return;
            default:
                org.telegram.ui.ActionBar.l lVar3 = (org.telegram.ui.ActionBar.l) obj;
                ProfileActivity profileActivity2 = this.f46759c;
                if (profileActivity2.S5 > 0.0f) {
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
                profileActivity2.S5 = f10;
                qVar = ((org.telegram.ui.ActionBar.f2) profileActivity2).glassEngine;
                qVar.g();
                if (z11) {
                    profileActivity2.P3();
                }
                ProfileActivity.s1(profileActivity2);
                profileActivity2.A5();
                ev0 ev0Var = profileActivity2.f41808r;
                if (ev0Var != null && !profileActivity2.f41790o2) {
                    Object tag = ev0Var.getTag();
                    if (tag instanceof Integer) {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.m6.w0(((Integer) tag).intValue(), profileActivity2.f41867z0), Boolean.valueOf(profileActivity2.J0[0]));
                    } else {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, profileActivity2.f41867z0), Boolean.TRUE);
                    }
                    ev0Var.setTextColor(i0.a.f(f10, I3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Dj, profileActivity2.f41867z0)));
                }
                profileActivity2.C5();
                fv0 fv0Var = profileActivity2.f41829u0;
                if (fv0Var != null) {
                    fv0Var.setActionBarActionMode(f10);
                }
                bi.g1 g1Var = profileActivity2.f41836v0;
                if (g1Var != null) {
                    g1Var.setActionBarActionMode(f10);
                }
                profileActivity2.f41707c1.invalidate();
                int i10 = -1;
                if (profileActivity2.f41761j6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28011ji, profileActivity2.f41867z0);
                }
                int i11 = org.telegram.ui.ActionBar.m6.Cj;
                int w06 = org.telegram.ui.ActionBar.m6.w0(i11, profileActivity2.f41867z0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w02, w06);
                profileActivity2.f41727f.setTextColor(S0);
                Drawable drawable = profileActivity2.f41851x;
                if (drawable != null) {
                    if (profileActivity2.f41761j6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.K != null) {
                    profileActivity2.K.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27965h8, profileActivity2.f41867z0), w06));
                }
                if (profileActivity2.f41761j6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28227v8, profileActivity2.f41867z0);
                }
                int w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28284y8, profileActivity2.f41867z0);
                lVar = ((org.telegram.ui.ActionBar.f2) profileActivity2).actionBar;
                lVar.G(org.telegram.messenger.g0.S0(f10, 1.0f, w03, w07), false);
                org.telegram.messenger.fp fpVar = profileActivity2.f41761j6;
                if (fpVar != null) {
                    w04 = 1090519039;
                } else if (fpVar != null) {
                    w04 = 553648127;
                } else {
                    w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27930f8, profileActivity2.f41867z0);
                }
                int w08 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28302z8, profileActivity2.f41867z0);
                lVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity2).actionBar;
                lVar2.E(org.telegram.messenger.g0.S0(f10, 1.0f, w04, w08), false);
                profileActivity2.f41707c1.invalidate();
                if (profileActivity2.f41859y != null) {
                    org.telegram.messenger.fp fpVar2 = profileActivity2.f41761j6;
                    if (fpVar2 != null) {
                        int g10 = fpVar2.g();
                        if (profileActivity2.f41761j6.o(org.telegram.ui.ActionBar.m6.I.q())) {
                            i7 = profileActivity2.f41761j6.k();
                        } else {
                            i7 = profileActivity2.f41761j6.i();
                        }
                        int f12 = i0.a.f(0.4f, g10, i7);
                        if (org.telegram.ui.ActionBar.m6.I.q()) {
                            f11 = -0.1f;
                        } else {
                            f11 = -0.08f;
                        }
                        w05 = org.telegram.ui.ActionBar.m6.b(0.1f, f11, f12);
                    } else {
                        w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28083ni, profileActivity2.f41867z0);
                    }
                    profileActivity2.f41859y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w05, org.telegram.ui.ActionBar.m6.w0(i11, profileActivity2.f41867z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.H != null) {
                    if (profileActivity2.f41761j6 == null) {
                        i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28102oi, profileActivity2.f41867z0);
                    }
                    profileActivity2.H.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, i10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, profileActivity2.f41867z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.D != null) {
                    profileActivity2.D.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28083ni, profileActivity2.f41867z0), org.telegram.ui.ActionBar.m6.w0(i11, profileActivity2.f41867z0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity2.v5();
                ProfileActivity profileActivity3 = profileActivity2.f41788o0.f48849n;
                if (profileActivity3.L0) {
                    g5Var = profileActivity3.P0;
                } else if (profileActivity3.N0) {
                    g5Var = profileActivity3.R0;
                } else {
                    g5Var = profileActivity3.T0;
                    if (g5Var == null) {
                        g5Var = null;
                    }
                }
                if (g5Var != null) {
                    if (profileActivity2.M0 || profileActivity2.N0 || profileActivity2.L0) {
                        profileActivity2.C4(0, profileActivity2.L3(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f46758b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(this.f46759c.f41691a1);
            default:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(this.f46759c.S5);
        }
    }
}
