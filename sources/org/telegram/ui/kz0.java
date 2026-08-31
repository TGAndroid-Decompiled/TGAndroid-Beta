package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class kz0 extends org.telegram.ui.Components.m6 {
    public final ProfileActivity f38537b;

    public kz0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f38537b = profileActivity;
    }

    @Override
    public final void b(Object obj, float f10) {
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
        float f11;
        org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
        ProfileActivity profileActivity = this.f38537b;
        profileActivity.B5 = f10;
        Drawable[] drawableArr = profileActivity.B;
        Drawable[] drawableArr2 = profileActivity.F;
        Drawable[] drawableArr3 = profileActivity.f34727y;
        bz0 bz0Var = profileActivity.f34681r0;
        if (bz0Var != null) {
            bz0Var.setActionBarActionMode(f10);
        }
        mh.t0 t0Var = profileActivity.f34689s0;
        if (t0Var != null) {
            t0Var.setActionBarActionMode(f10);
        }
        profileActivity.f34562a1.invalidate();
        int i10 = -1;
        if (profileActivity.N5 != null) {
            v02 = -1;
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21990vh, profileActivity.f34714w0);
        }
        int i11 = org.telegram.ui.ActionBar.k6.Oi;
        int v010 = org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0);
        int offsetColor = AndroidUtilities.getOffsetColor(v02, v010, f10, 1.0f);
        profileActivity.f34596f[1].setTextColor(offsetColor);
        Drawable drawable = profileActivity.f34720x;
        if (drawable != null) {
            if (profileActivity.N5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.I != null) {
            profileActivity.I.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21734h8, profileActivity.f34714w0), v010, f10, 1.0f));
        }
        if (profileActivity.N5 != null) {
            v03 = -1;
        } else {
            v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, profileActivity.f34714w0);
        }
        int v011 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22038y8, profileActivity.f34714w0);
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        kVar.C(AndroidUtilities.getOffsetColor(v03, v011, f10, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.N5;
        if (peerColor != null) {
            v04 = 1090519039;
        } else if (peerColor != null) {
            v04 = 553648127;
        } else {
            v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21698f8, profileActivity.f34714w0);
        }
        int v012 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22055z8, profileActivity.f34714w0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        kVar2.B(AndroidUtilities.getOffsetColor(v04, v012, f10, 1.0f), false);
        profileActivity.f34562a1.invalidate();
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.Q0;
        if (profileActivity.N5 != null) {
            v05 = -1;
        } else {
            v05 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, profileActivity.f34714w0);
        }
        w0Var2.setIconColor(v05);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.N0;
        if (profileActivity.N5 != null) {
            v06 = -1;
        } else {
            v06 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, profileActivity.f34714w0);
        }
        w0Var3.setIconColor(v06);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.O0;
        if (profileActivity.N5 != null) {
            v07 = -1;
        } else {
            v07 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, profileActivity.f34714w0);
        }
        w0Var4.setIconColor(v07);
        org.telegram.ui.ActionBar.w0 w0Var5 = profileActivity.P0;
        if (profileActivity.N5 != null) {
            v08 = -1;
        } else {
            v08 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, profileActivity.f34714w0);
        }
        w0Var5.setIconColor(v08);
        if (drawableArr3[0] != null) {
            drawableArr3[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, profileActivity.f34714w0), org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr3[1] != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.N5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (profileActivity.N5.hasColor6(org.telegram.ui.ActionBar.k6.I.q())) {
                    color3 = profileActivity.N5.getColor5();
                } else {
                    color3 = profileActivity.N5.getColor3();
                }
                int d = i0.a.d(0.4f, color2, color3);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.1f;
                } else {
                    f11 = -0.08f;
                }
                v09 = org.telegram.ui.ActionBar.k6.b(0.1f, f11, d);
            } else {
                v09 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, profileActivity.f34714w0);
            }
            drawableArr3[1].setColorFilter(AndroidUtilities.getOffsetColor(v09, org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[0] != null) {
            drawableArr2[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ah, profileActivity.f34714w0), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, profileActivity.f34714w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr2[1] != null) {
            if (profileActivity.N5 == null) {
                i10 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ah, profileActivity.f34714w0);
            }
            drawableArr2[1].setColorFilter(AndroidUtilities.getOffsetColor(i10, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, profileActivity.f34714w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[0] != null) {
            drawableArr[0].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, profileActivity.f34714w0), org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (drawableArr[1] != null) {
            drawableArr[1].setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, profileActivity.f34714w0), org.telegram.ui.ActionBar.k6.v0(i11, profileActivity.f34714w0), f10, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.X4();
        ProfileActivity profileActivity2 = profileActivity.f34639l0.f38546n;
        if (profileActivity2.I0) {
            w0Var = profileActivity2.N0;
        } else if (profileActivity2.K0) {
            w0Var = profileActivity2.P0;
        } else {
            w0Var = profileActivity2.R0;
            if (w0Var == null) {
                w0Var = null;
            }
        }
        if (w0Var != null) {
            if (profileActivity.J0 || profileActivity.K0 || profileActivity.I0) {
                profileActivity.l4(0, profileActivity.y3(), true);
            }
        }
    }

    @Override
    public final Object get(Object obj) {
        org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
        return Float.valueOf(this.f38537b.B5);
    }
}
