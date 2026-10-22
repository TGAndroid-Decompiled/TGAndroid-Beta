package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class dz0 extends org.telegram.ui.Components.s6 {
    public final ProfileActivity f36471b;

    public dz0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f36471b = profileActivity;
    }

    @Override
    public final void c(Object obj, float f7) {
        int w02;
        int w03;
        org.telegram.ui.ActionBar.k kVar;
        int w04;
        org.telegram.ui.ActionBar.k kVar2;
        int w05;
        int w06;
        int w07;
        int w08;
        org.telegram.ui.ActionBar.u0 u0Var;
        int w09;
        int color3;
        float f10;
        org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
        ProfileActivity profileActivity = this.f36471b;
        profileActivity.G5 = f7;
        Drawable[] drawableArr = profileActivity.E;
        Drawable[] drawableArr2 = profileActivity.I;
        Drawable[] drawableArr3 = profileActivity.f33755y;
        uy0 uy0Var = profileActivity.f33732v0;
        if (uy0Var != null) {
            uy0Var.setActionBarActionMode(f7);
        }
        ai.j1 j1Var = profileActivity.f33740w0;
        if (j1Var != null) {
            j1Var.setActionBarActionMode(f7);
        }
        profileActivity.f33615e1.invalidate();
        int i10 = -1;
        if (profileActivity.S5 != null) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21337vh, profileActivity.A0);
        }
        int i11 = org.telegram.ui.ActionBar.h6.Oi;
        int w010 = org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0);
        int offsetColor = AndroidUtilities.getOffsetColor(w02, w010, f7, 1.0f);
        profileActivity.f33621f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.f33747x;
        if (drawable != null) {
            if (profileActivity.S5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.L != null) {
            profileActivity.L.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21067h8, profileActivity.A0), w010, f7, 1.0f));
        }
        if (profileActivity.S5 != null) {
            w03 = -1;
        } else {
            w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21328v8, profileActivity.A0);
        }
        int w011 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21383y8, profileActivity.A0);
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar.C(AndroidUtilities.getOffsetColor(w03, w011, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.S5;
        if (peerColor != null) {
            w04 = 1090519039;
        } else if (peerColor != null) {
            w04 = 553648127;
        } else {
            w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21030f8, profileActivity.A0);
        }
        int w012 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21400z8, profileActivity.A0);
        kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar2.B(AndroidUtilities.getOffsetColor(w04, w012, f7, 1.0f), false);
        profileActivity.f33615e1.invalidate();
        org.telegram.ui.ActionBar.u0 u0Var2 = profileActivity.U0;
        if (profileActivity.S5 != null) {
            w05 = -1;
        } else {
            w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21328v8, profileActivity.A0);
        }
        u0Var2.setIconColor(w05);
        org.telegram.ui.ActionBar.u0 u0Var3 = profileActivity.R0;
        if (profileActivity.S5 != null) {
            w06 = -1;
        } else {
            w06 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21328v8, profileActivity.A0);
        }
        u0Var3.setIconColor(w06);
        org.telegram.ui.ActionBar.u0 u0Var4 = profileActivity.S0;
        if (profileActivity.S5 != null) {
            w07 = -1;
        } else {
            w07 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21328v8, profileActivity.A0);
        }
        u0Var4.setIconColor(w07);
        org.telegram.ui.ActionBar.u0 u0Var5 = profileActivity.T0;
        if (profileActivity.S5 != null) {
            w08 = -1;
        } else {
            w08 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21328v8, profileActivity.A0);
        }
        u0Var5.setIconColor(w08);
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21408zh, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.S5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (profileActivity.S5.hasColor6(org.telegram.ui.ActionBar.h6.I.q())) {
                    color3 = profileActivity.S5.getColor5();
                } else {
                    color3 = profileActivity.S5.getColor3();
                }
                int f11 = i0.a.f(0.4f, color2, color3);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                w09 = org.telegram.ui.ActionBar.h6.b(0.1f, f10, f11);
            } else {
                w09 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21408zh, profileActivity.A0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(w09, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            if (profileActivity.S5 == null) {
                i10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, profileActivity.A0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(i10, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21408zh, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21408zh, profileActivity.A0), org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.f33690p0.f36488n;
        if (profileActivity2.M0) {
            u0Var = profileActivity2.R0;
        } else if (profileActivity2.O0) {
            u0Var = profileActivity2.T0;
        } else {
            u0Var = profileActivity2.V0;
            if (u0Var == null) {
                u0Var = null;
            }
        }
        if (u0Var != null) {
            if (profileActivity.N0 || profileActivity.O0 || profileActivity.M0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override
    public final Object get(Object obj) {
        org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
        return Float.valueOf(this.f36471b.G5);
    }
}
