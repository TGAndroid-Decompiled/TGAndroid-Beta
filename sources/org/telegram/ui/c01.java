package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class c01 extends org.telegram.ui.Components.p6 {
    public final ProfileActivity f32612b;

    public c01(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f32612b = profileActivity;
    }

    @Override
    public final void c(Object obj, float f7) {
        int v02;
        int v03;
        org.telegram.ui.ActionBar.k kVar;
        int v04;
        org.telegram.ui.ActionBar.k kVar2;
        int v05;
        int v06;
        int v07;
        int v08;
        org.telegram.ui.ActionBar.w0 w0Var;
        int v09;
        int color3;
        float f10;
        org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
        ProfileActivity profileActivity = this.f32612b;
        profileActivity.E5 = f7;
        Drawable[] drawableArr = profileActivity.E;
        Drawable[] drawableArr2 = profileActivity.I;
        Drawable[] drawableArr3 = profileActivity.f31419y;
        tz0 tz0Var = profileActivity.f31391u0;
        if (tz0Var != null) {
            tz0Var.setActionBarActionMode(f7);
        }
        yh.g0 g0Var = profileActivity.f31398v0;
        if (g0Var != null) {
            g0Var.setActionBarActionMode(f7);
        }
        profileActivity.f31275d1.invalidate();
        int i10 = -1;
        if (profileActivity.Q5 != null) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19202vh, profileActivity.f31425z0);
        }
        int i11 = org.telegram.ui.ActionBar.j6.Oi;
        int v010 = org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f31425z0);
        int offsetColor = AndroidUtilities.getOffsetColor(v02, v010, f7, 1.0f);
        profileActivity.f31288f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.f31412x;
        if (drawable != null) {
            if (profileActivity.Q5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.L != null) {
            profileActivity.L.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18936h8, profileActivity.f31425z0), v010, f7, 1.0f));
        }
        if (profileActivity.Q5 != null) {
            v03 = -1;
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19194v8, profileActivity.f31425z0);
        }
        int v011 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19246y8, profileActivity.f31425z0);
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        kVar.B(AndroidUtilities.getOffsetColor(v03, v011, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.Q5;
        if (peerColor != null) {
            v04 = 1090519039;
        } else if (peerColor != null) {
            v04 = 553648127;
        } else {
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18899f8, profileActivity.f31425z0);
        }
        int v012 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19265z8, profileActivity.f31425z0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        kVar2.A(AndroidUtilities.getOffsetColor(v04, v012, f7, 1.0f), false);
        profileActivity.f31275d1.invalidate();
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.T0;
        if (profileActivity.Q5 != null) {
            v05 = -1;
        } else {
            v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19194v8, profileActivity.f31425z0);
        }
        w0Var2.setIconColor(v05);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.Q0;
        if (profileActivity.Q5 != null) {
            v06 = -1;
        } else {
            v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19194v8, profileActivity.f31425z0);
        }
        w0Var3.setIconColor(v06);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.R0;
        if (profileActivity.Q5 != null) {
            v07 = -1;
        } else {
            v07 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19194v8, profileActivity.f31425z0);
        }
        w0Var4.setIconColor(v07);
        org.telegram.ui.ActionBar.w0 w0Var5 = profileActivity.S0;
        if (profileActivity.Q5 != null) {
            v08 = -1;
        } else {
            v08 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19194v8, profileActivity.f31425z0);
        }
        w0Var5.setIconColor(v08);
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19274zh, profileActivity.f31425z0), org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f31425z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.Q5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (profileActivity.Q5.hasColor6(org.telegram.ui.ActionBar.j6.I.q())) {
                    color3 = profileActivity.Q5.getColor5();
                } else {
                    color3 = profileActivity.Q5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                v09 = org.telegram.ui.ActionBar.j6.b(0.1f, f10, d);
            } else {
                v09 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19274zh, profileActivity.f31425z0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(v09, org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f31425z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, profileActivity.f31425z0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, profileActivity.f31425z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            if (profileActivity.Q5 == null) {
                i10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, profileActivity.f31425z0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(i10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, profileActivity.f31425z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19274zh, profileActivity.f31425z0), org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f31425z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19274zh, profileActivity.f31425z0), org.telegram.ui.ActionBar.j6.v0(i11, profileActivity.f31425z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.f31349o0.f33262n;
        if (profileActivity2.L0) {
            w0Var = profileActivity2.Q0;
        } else if (profileActivity2.N0) {
            w0Var = profileActivity2.S0;
        } else {
            w0Var = profileActivity2.U0;
            if (w0Var == null) {
                w0Var = null;
            }
        }
        if (w0Var != null) {
            if (profileActivity.M0 || profileActivity.N0 || profileActivity.L0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override
    public final Object get(Object obj) {
        org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
        return Float.valueOf(this.f32612b.E5);
    }
}
