package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class fv0 extends org.telegram.ui.Components.q6 {
    public final int f47865b;
    public final ProfileActivity f47866c;

    public fv0(ProfileActivity profileActivity, int i7) {
        super("headerShadow", 0);
        this.f47865b = i7;
        switch (i7) {
            case 1:
                this.f47866c = profileActivity;
                super("avatarAnimationProgress", 0);
                return;
            default:
                this.f47866c = profileActivity;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        boolean z10;
        boolean z11;
        boolean z12;
        ri.q qVar;
        int w02;
        int w03;
        org.telegram.ui.ActionBar.k kVar;
        int w04;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.g5 g5Var;
        int w05;
        int i7;
        float f11;
        int I3;
        switch (this.f47865b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                this.f47866c.f43563b1 = f10;
                return;
            default:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
                ProfileActivity profileActivity2 = this.f47866c;
                if (profileActivity2.W5 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (f10 > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                profileActivity2.W5 = f10;
                qVar = ((org.telegram.ui.ActionBar.g2) profileActivity2).glassEngine;
                qVar.g();
                if (z12) {
                    profileActivity2.P3();
                }
                profileActivity2.A5();
                profileActivity2.B5();
                bv0 bv0Var = profileActivity2.f43672r;
                if (bv0Var != null && !profileActivity2.f43667q2) {
                    Object tag = bv0Var.getTag();
                    if (tag instanceof Integer) {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.m6.w0(((Integer) tag).intValue(), profileActivity2.A0), Boolean.valueOf(profileActivity2.K0[0]));
                    } else {
                        I3 = profileActivity2.I3(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, profileActivity2.A0), Boolean.TRUE);
                    }
                    bv0Var.setTextColor(i0.a.f(f10, I3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, profileActivity2.A0)));
                }
                profileActivity2.D5();
                cv0 cv0Var = profileActivity2.f43700v0;
                if (cv0Var != null) {
                    cv0Var.setActionBarActionMode(f10);
                }
                di.t0 t0Var = profileActivity2.f43708w0;
                if (t0Var != null) {
                    t0Var.setActionBarActionMode(f10);
                }
                profileActivity2.f43578d1.invalidate();
                int i10 = -1;
                if (profileActivity2.f43651n6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29556mi, profileActivity2.A0);
                }
                int i11 = org.telegram.ui.ActionBar.m6.Fj;
                int w06 = org.telegram.ui.ActionBar.m6.w0(i11, profileActivity2.A0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w02, w06);
                profileActivity2.f43591f.setTextColor(S0);
                Drawable drawable = profileActivity2.f43715x;
                if (drawable != null) {
                    if (profileActivity2.f43651n6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.L != null) {
                    profileActivity2.L.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29456h8, profileActivity2.A0), w06));
                }
                if (profileActivity2.f43651n6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29718v8, profileActivity2.A0);
                }
                int w07 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29775y8, profileActivity2.A0);
                kVar = ((org.telegram.ui.ActionBar.g2) profileActivity2).actionBar;
                kVar.G(org.telegram.messenger.g0.S0(f10, 1.0f, w03, w07), false);
                org.telegram.messenger.cp cpVar = profileActivity2.f43651n6;
                if (cpVar != null) {
                    w04 = 1090519039;
                } else if (cpVar != null) {
                    w04 = 553648127;
                } else {
                    w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29421f8, profileActivity2.A0);
                }
                int w08 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29794z8, profileActivity2.A0);
                kVar2 = ((org.telegram.ui.ActionBar.g2) profileActivity2).actionBar;
                kVar2.F(org.telegram.messenger.g0.S0(f10, 1.0f, w04, w08), false);
                profileActivity2.f43578d1.invalidate();
                if (profileActivity2.f43723y != null) {
                    org.telegram.messenger.cp cpVar2 = profileActivity2.f43651n6;
                    if (cpVar2 != null) {
                        int g10 = cpVar2.g();
                        if (profileActivity2.f43651n6.o(org.telegram.ui.ActionBar.m6.I.q())) {
                            i7 = profileActivity2.f43651n6.k();
                        } else {
                            i7 = profileActivity2.f43651n6.i();
                        }
                        int f12 = i0.a.f(0.4f, g10, i7);
                        if (org.telegram.ui.ActionBar.m6.I.q()) {
                            f11 = -0.1f;
                        } else {
                            f11 = -0.08f;
                        }
                        w05 = org.telegram.ui.ActionBar.m6.b(0.1f, f11, f12);
                    } else {
                        w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, profileActivity2.A0);
                    }
                    profileActivity2.f43723y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w05, org.telegram.ui.ActionBar.m6.w0(i11, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.I != null) {
                    if (profileActivity2.f43651n6 == null) {
                        i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29652ri, profileActivity2.A0);
                    }
                    profileActivity2.I.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, i10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.E != null) {
                    profileActivity2.E.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, profileActivity2.A0), org.telegram.ui.ActionBar.m6.w0(i11, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity2.v5();
                ProfileActivity profileActivity3 = profileActivity2.f43658p0.f50670n;
                if (profileActivity3.M0) {
                    g5Var = profileActivity3.Q0;
                } else if (profileActivity3.O0) {
                    g5Var = profileActivity3.S0;
                } else {
                    g5Var = profileActivity3.U0;
                    if (g5Var == null) {
                        g5Var = null;
                    }
                }
                if (g5Var != null) {
                    if (profileActivity2.N0 || profileActivity2.O0 || profileActivity2.M0) {
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
        switch (this.f47865b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(this.f47866c.f43563b1);
            default:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(this.f47866c.W5);
        }
    }
}
