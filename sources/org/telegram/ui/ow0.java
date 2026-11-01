package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class ow0 extends org.telegram.ui.Components.h6 {
    public final int f40280b;
    public final ProfileActivity f40281c;

    public ow0(ProfileActivity profileActivity, int i10) {
        super("headerShadow", 0);
        this.f40280b = i10;
        switch (i10) {
            case 1:
                this.f40281c = profileActivity;
                super("avatarAnimationProgress", 0);
                return;
            default:
                this.f40281c = profileActivity;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        boolean z10;
        boolean z11;
        boolean z12;
        ei.r rVar;
        int w02;
        int w03;
        org.telegram.ui.ActionBar.l lVar;
        int w04;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.p5 p5Var;
        int w05;
        int i10;
        float f10;
        int I3;
        switch (this.f40280b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                this.f40281c.f33781a1 = f7;
                return;
            default:
                org.telegram.ui.ActionBar.l lVar3 = (org.telegram.ui.ActionBar.l) obj;
                ProfileActivity profileActivity2 = this.f40281c;
                if (profileActivity2.Q5 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f7 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                profileActivity2.Q5 = f7;
                rVar = ((org.telegram.ui.ActionBar.k2) profileActivity2).glassEngine;
                rVar.g();
                if (z12) {
                    profileActivity2.P3();
                }
                ProfileActivity.s1(profileActivity2);
                profileActivity2.x5();
                kw0 kw0Var = profileActivity2.f33897r;
                if (kw0Var != null && !profileActivity2.f33880o2) {
                    Object tag = kw0Var.getTag();
                    if (tag instanceof Integer) {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.t6.w0(((Integer) tag).intValue(), profileActivity2.f33957z0), Boolean.valueOf(profileActivity2.J0[0]));
                    } else {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, profileActivity2.f33957z0), Boolean.TRUE);
                    }
                    kw0Var.setTextColor(i0.b.f(f7, I3, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, profileActivity2.f33957z0)));
                }
                profileActivity2.z5();
                lw0 lw0Var = profileActivity2.f33920u0;
                if (lw0Var != null) {
                    lw0Var.setActionBarActionMode(f7);
                }
                rh.g0 g0Var = profileActivity2.f33927v0;
                if (g0Var != null) {
                    g0Var.setActionBarActionMode(f7);
                }
                profileActivity2.f33796c1.invalidate();
                int i11 = -1;
                if (profileActivity2.f33830g6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21051ji, profileActivity2.f33957z0);
                }
                int i12 = org.telegram.ui.ActionBar.t6.Cj;
                int w06 = org.telegram.ui.ActionBar.t6.w0(i12, profileActivity2.f33957z0);
                int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, w02, w06);
                profileActivity2.f33816f.setTextColor(S0);
                Drawable drawable = profileActivity2.f33942x;
                if (drawable != null) {
                    if (profileActivity2.f33830g6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.K != null) {
                    profileActivity2.K.b(org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21005h8, profileActivity2.f33957z0), w06));
                }
                if (profileActivity2.f33830g6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21262v8, profileActivity2.f33957z0);
                }
                int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21314y8, profileActivity2.f33957z0);
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity2).actionBar;
                lVar.D(org.telegram.messenger.i0.S0(f7, 1.0f, w03, w07), false);
                org.telegram.messenger.lp lpVar = profileActivity2.f33830g6;
                if (lpVar != null) {
                    w04 = 1090519039;
                } else if (lpVar != null) {
                    w04 = 553648127;
                } else {
                    w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20968f8, profileActivity2.f33957z0);
                }
                int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21333z8, profileActivity2.f33957z0);
                lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity2).actionBar;
                lVar2.C(org.telegram.messenger.i0.S0(f7, 1.0f, w04, w08), false);
                profileActivity2.f33796c1.invalidate();
                if (profileActivity2.f33950y != null) {
                    org.telegram.messenger.lp lpVar2 = profileActivity2.f33830g6;
                    if (lpVar2 != null) {
                        int g10 = lpVar2.g();
                        if (profileActivity2.f33830g6.o(org.telegram.ui.ActionBar.t6.I.q())) {
                            i10 = profileActivity2.f33830g6.k();
                        } else {
                            i10 = profileActivity2.f33830g6.i();
                        }
                        int f11 = i0.b.f(0.4f, g10, i10);
                        if (org.telegram.ui.ActionBar.t6.I.q()) {
                            f10 = -0.1f;
                        } else {
                            f10 = -0.08f;
                        }
                        w05 = org.telegram.ui.ActionBar.t6.b(0.1f, f10, f11);
                    } else {
                        w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, profileActivity2.f33957z0);
                    }
                    profileActivity2.f33950y.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, w05, org.telegram.ui.ActionBar.t6.w0(i12, profileActivity2.f33957z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.H != null) {
                    if (profileActivity2.f33830g6 == null) {
                        i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, profileActivity2.f33957z0);
                    }
                    profileActivity2.H.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, i11, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, profileActivity2.f33957z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.D != null) {
                    profileActivity2.D.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, profileActivity2.f33957z0), org.telegram.ui.ActionBar.t6.w0(i12, profileActivity2.f33957z0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity2.s5();
                ProfileActivity profileActivity3 = profileActivity2.f33878o0.f44251n;
                if (profileActivity3.L0) {
                    p5Var = profileActivity3.P0;
                } else if (profileActivity3.N0) {
                    p5Var = profileActivity3.R0;
                } else {
                    p5Var = profileActivity3.T0;
                    if (p5Var == null) {
                        p5Var = null;
                    }
                }
                if (p5Var != null) {
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
        switch (this.f40280b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(this.f40281c.f33781a1);
            default:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(this.f40281c.Q5);
        }
    }
}
