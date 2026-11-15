package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class dv0 extends org.telegram.ui.Components.j6 {
    public final int f46493b;
    public final ProfileActivity f46494c;

    public dv0(ProfileActivity profileActivity, int i7) {
        super("headerShadow", 0);
        this.f46493b = i7;
        switch (i7) {
            case 1:
                this.f46494c = profileActivity;
                super("avatarAnimationProgress", 0);
                return;
            default:
                this.f46494c = profileActivity;
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
        org.telegram.ui.ActionBar.d5 d5Var;
        int w05;
        int i7;
        float f11;
        int H3;
        switch (this.f46493b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                this.f46494c.f43072b1 = f10;
                return;
            default:
                org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
                ProfileActivity profileActivity2 = this.f46494c;
                if (profileActivity2.U5 > 0.0f) {
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
                profileActivity2.U5 = f10;
                qVar = ((org.telegram.ui.ActionBar.e2) profileActivity2).glassEngine;
                qVar.g();
                if (z12) {
                    profileActivity2.O3();
                }
                profileActivity2.z5();
                profileActivity2.A5();
                zu0 zu0Var = profileActivity2.f43181r;
                if (zu0Var != null && !profileActivity2.f43176q2) {
                    Object tag = zu0Var.getTag();
                    if (tag instanceof Integer) {
                        H3 = profileActivity2.H3(org.telegram.ui.ActionBar.j6.w0(((Integer) tag).intValue(), profileActivity2.A0), Boolean.valueOf(profileActivity2.K0[0]));
                    } else {
                        H3 = profileActivity2.H3(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, profileActivity2.A0), Boolean.TRUE);
                    }
                    zu0Var.setTextColor(i0.a.f(f10, H3, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gj, profileActivity2.A0)));
                }
                profileActivity2.C5();
                av0 av0Var = profileActivity2.f43209v0;
                if (av0Var != null) {
                    av0Var.setActionBarActionMode(f10);
                }
                di.u0 u0Var = profileActivity2.f43217w0;
                if (u0Var != null) {
                    u0Var.setActionBarActionMode(f10);
                }
                profileActivity2.f43087d1.invalidate();
                int i10 = -1;
                if (profileActivity2.f43147l6 != null) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29024mi, profileActivity2.A0);
                }
                int i11 = org.telegram.ui.ActionBar.j6.Fj;
                int w06 = org.telegram.ui.ActionBar.j6.w0(i11, profileActivity2.A0);
                int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, w02, w06);
                profileActivity2.f43100f.setTextColor(S0);
                Drawable drawable = profileActivity2.f43224x;
                if (drawable != null) {
                    if (profileActivity2.f43147l6 != null) {
                        S0 = -1;
                    }
                    drawable.setColorFilter(S0, PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.L != null) {
                    profileActivity2.L.b(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28924h8, profileActivity2.A0), w06));
                }
                if (profileActivity2.f43147l6 != null) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29186v8, profileActivity2.A0);
                }
                int w07 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29243y8, profileActivity2.A0);
                kVar = ((org.telegram.ui.ActionBar.e2) profileActivity2).actionBar;
                kVar.H(org.telegram.messenger.g0.S0(f10, 1.0f, w03, w07), false);
                org.telegram.messenger.cp cpVar = profileActivity2.f43147l6;
                if (cpVar != null) {
                    w04 = 1090519039;
                } else if (cpVar != null) {
                    w04 = 553648127;
                } else {
                    w04 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28889f8, profileActivity2.A0);
                }
                int w08 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29262z8, profileActivity2.A0);
                kVar2 = ((org.telegram.ui.ActionBar.e2) profileActivity2).actionBar;
                kVar2.F(org.telegram.messenger.g0.S0(f10, 1.0f, w04, w08), false);
                profileActivity2.f43087d1.invalidate();
                if (profileActivity2.f43232y != null) {
                    org.telegram.messenger.cp cpVar2 = profileActivity2.f43147l6;
                    if (cpVar2 != null) {
                        int g10 = cpVar2.g();
                        if (profileActivity2.f43147l6.o(org.telegram.ui.ActionBar.j6.I.q())) {
                            i7 = profileActivity2.f43147l6.k();
                        } else {
                            i7 = profileActivity2.f43147l6.i();
                        }
                        int f12 = i0.a.f(0.4f, g10, i7);
                        if (org.telegram.ui.ActionBar.j6.I.q()) {
                            f11 = -0.1f;
                        } else {
                            f11 = -0.08f;
                        }
                        w05 = org.telegram.ui.ActionBar.j6.b(0.1f, f11, f12);
                    } else {
                        w05 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, profileActivity2.A0);
                    }
                    profileActivity2.f43232y.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, w05, org.telegram.ui.ActionBar.j6.w0(i11, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.I != null) {
                    if (profileActivity2.f43147l6 == null) {
                        i10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29120ri, profileActivity2.A0);
                    }
                    profileActivity2.I.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, i10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                if (profileActivity2.E != null) {
                    profileActivity2.E.setColorFilter(org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, profileActivity2.A0), org.telegram.ui.ActionBar.j6.w0(i11, profileActivity2.A0)), PorterDuff.Mode.MULTIPLY);
                }
                profileActivity2.u5();
                ProfileActivity profileActivity3 = profileActivity2.f43167p0.f49055n;
                if (profileActivity3.M0) {
                    d5Var = profileActivity3.Q0;
                } else if (profileActivity3.O0) {
                    d5Var = profileActivity3.S0;
                } else {
                    d5Var = profileActivity3.U0;
                    if (d5Var == null) {
                        d5Var = null;
                    }
                }
                if (d5Var != null) {
                    if (profileActivity2.N0 || profileActivity2.O0 || profileActivity2.M0) {
                        profileActivity2.B4(0, profileActivity2.K3(), true);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f46493b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                return Float.valueOf(this.f46494c.f43072b1);
            default:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
                return Float.valueOf(this.f46494c.U5);
        }
    }
}
