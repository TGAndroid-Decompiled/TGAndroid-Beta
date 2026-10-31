package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class pw0 extends org.telegram.ui.Components.h6 {
    public final int f40799b;
    public final ProfileActivity f40800c;

    public pw0(ProfileActivity profileActivity, int i10) {
        super("headerShadow", 0);
        this.f40799b = i10;
        switch (i10) {
            case 1:
                this.f40800c = profileActivity;
                super("avatarAnimationProgress", 0);
                return;
            default:
                this.f40800c = profileActivity;
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
        int H3;
        switch (this.f40799b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                this.f40800c.f33774a1 = f7;
                return;
            default:
                org.telegram.ui.ActionBar.l lVar3 = (org.telegram.ui.ActionBar.l) obj;
                ProfileActivity profileActivity2 = this.f40800c;
                if (profileActivity2.P5 > 0.0f) {
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
                profileActivity2.P5 = f7;
                rVar = ((org.telegram.ui.ActionBar.k2) profileActivity2).glassEngine;
                rVar.g();
                if (z12) {
                    profileActivity2.O3();
                }
                ProfileActivity.r1(profileActivity2);
                profileActivity2.w5();
                lw0 lw0Var = profileActivity2.f33890r;
                if (lw0Var != null && !profileActivity2.f33873o2) {
                    Object tag = lw0Var.getTag();
                    if (tag instanceof Integer) {
                        H3 = profileActivity2.H3(org.telegram.ui.ActionBar.t6.w0(((Integer) tag).intValue(), profileActivity2.f33950z0), Boolean.valueOf(profileActivity2.J0[0]));
                    } else {
                        H3 = profileActivity2.H3(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.B8, profileActivity2.f33950z0), Boolean.TRUE);
                    }
                    lw0Var.setTextColor(i0.b.f(f7, H3, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, profileActivity2.f33950z0)));
                }
                profileActivity2.y5();
                mw0 mw0Var = profileActivity2.f33913u0;
                if (mw0Var != null) {
                    mw0Var.setActionBarActionMode(f7);
                }
                rh.g0 g0Var = profileActivity2.f33920v0;
                if (g0Var != null) {
                    g0Var.setActionBarActionMode(f7);
                }
                profileActivity2.f33789c1.invalidate();
                int i11 = -1;
                if (profileActivity2.f33816f6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21050ji, profileActivity2.f33950z0);
                }
                int i12 = org.telegram.ui.ActionBar.t6.Cj;
                int w06 = org.telegram.ui.ActionBar.t6.w0(i12, profileActivity2.f33950z0);
                int S0 = org.telegram.messenger.i0.S0(f7, 1.0f, w02, w06);
                profileActivity2.f33809f.setTextColor(S0);
                Drawable drawable = profileActivity2.f33935x;
                if (drawable != null) {
                    if (profileActivity2.f33816f6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.K != null) {
                    profileActivity2.K.b(org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21004h8, profileActivity2.f33950z0), w06));
                }
                if (profileActivity2.f33816f6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21261v8, profileActivity2.f33950z0);
                }
                int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21313y8, profileActivity2.f33950z0);
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity2).actionBar;
                lVar.D(org.telegram.messenger.i0.S0(f7, 1.0f, w03, w07), false);
                org.telegram.messenger.kp kpVar = profileActivity2.f33816f6;
                if (kpVar != null) {
                    w04 = 1090519039;
                } else if (kpVar != null) {
                    w04 = 553648127;
                } else {
                    w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20967f8, profileActivity2.f33950z0);
                }
                int w08 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21332z8, profileActivity2.f33950z0);
                lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity2).actionBar;
                lVar2.C(org.telegram.messenger.i0.S0(f7, 1.0f, w04, w08), false);
                profileActivity2.f33789c1.invalidate();
                if (profileActivity2.f33943y != null) {
                    org.telegram.messenger.kp kpVar2 = profileActivity2.f33816f6;
                    if (kpVar2 != null) {
                        int g10 = kpVar2.g();
                        if (profileActivity2.f33816f6.o(org.telegram.ui.ActionBar.t6.I.q())) {
                            i10 = profileActivity2.f33816f6.k();
                        } else {
                            i10 = profileActivity2.f33816f6.i();
                        }
                        int f11 = i0.b.f(0.4f, g10, i10);
                        if (org.telegram.ui.ActionBar.t6.I.q()) {
                            f10 = -0.1f;
                        } else {
                            f10 = -0.08f;
                        }
                        w05 = org.telegram.ui.ActionBar.t6.b(0.1f, f10, f11);
                    } else {
                        w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, profileActivity2.f33950z0);
                    }
                    profileActivity2.f33943y.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, w05, org.telegram.ui.ActionBar.t6.w0(i12, profileActivity2.f33950z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.H != null) {
                    if (profileActivity2.f33816f6 == null) {
                        i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.oi, profileActivity2.f33950z0);
                    }
                    profileActivity2.H.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, i11, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, profileActivity2.f33950z0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.D != null) {
                    profileActivity2.D.setColorFilter(org.telegram.messenger.i0.S0(f7, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ni, profileActivity2.f33950z0), org.telegram.ui.ActionBar.t6.w0(i12, profileActivity2.f33950z0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity2.r5();
                ProfileActivity profileActivity3 = profileActivity2.f33871o0.f35908n;
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
                        profileActivity2.y4(0, profileActivity2.K3(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40799b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(this.f40800c.f33774a1);
            default:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj;
                return Float.valueOf(this.f40800c.P5);
        }
    }
}
