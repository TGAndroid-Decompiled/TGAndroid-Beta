package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class jz0 extends org.telegram.ui.Components.u6 {
    public final ProfileActivity f40766b;

    public jz0(ProfileActivity profileActivity) {
        super("avatarAnimationProgress", 0);
        this.f40766b = profileActivity;
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
        org.telegram.ui.ActionBar.w0 w0Var;
        int w09;
        int color3;
        float f10;
        org.telegram.ui.ActionBar.k kVar3 = (org.telegram.ui.ActionBar.k) obj;
        ProfileActivity profileActivity = this.f40766b;
        profileActivity.K5 = f7;
        ProfileActivity.m1(profileActivity);
        View view = profileActivity.N5;
        if (view != null) {
            view.setAlpha(f7);
        }
        bz0 bz0Var = profileActivity.f36089u0;
        if (bz0Var != null) {
            bz0Var.setActionBarActionMode(f7);
        }
        bi.i1 i1Var = profileActivity.f36096v0;
        if (i1Var != null) {
            i1Var.setActionBarActionMode(f7);
        }
        profileActivity.f35972d1.invalidate();
        int i10 = -1;
        if (profileActivity.X5 != null) {
            w02 = -1;
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23702vh, profileActivity.f36126z0);
        }
        int i11 = org.telegram.ui.ActionBar.y6.Oi;
        int w010 = org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36126z0);
        int offsetColor = AndroidUtilities.getOffsetColor(w02, w010, f7, 1.0f);
        profileActivity.f35985f.setTextColor(offsetColor);
        Drawable drawable = profileActivity.f36103w;
        if (drawable != null) {
            if (profileActivity.X5 != null) {
                offsetColor = -1;
            }
            drawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.K != null) {
            profileActivity.K.b(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23430h8, profileActivity.f36126z0), w010, f7, 1.0f));
        }
        if (profileActivity.X5 != null) {
            w03 = -1;
        } else {
            w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, profileActivity.f36126z0);
        }
        int w011 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23750y8, profileActivity.f36126z0);
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        kVar.y(AndroidUtilities.getOffsetColor(w03, w011, f7, 1.0f), false);
        MessagesController.PeerColor peerColor = profileActivity.X5;
        if (peerColor != null) {
            w04 = 1090519039;
        } else if (peerColor != null) {
            w04 = 553648127;
        } else {
            w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23394f8, profileActivity.f36126z0);
        }
        int w012 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23769z8, profileActivity.f36126z0);
        kVar2 = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        kVar2.x(AndroidUtilities.getOffsetColor(w04, w012, f7, 1.0f), false);
        profileActivity.f35972d1.invalidate();
        org.telegram.ui.ActionBar.w0 w0Var2 = profileActivity.T0;
        if (profileActivity.X5 != null) {
            w05 = -1;
        } else {
            w05 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, profileActivity.f36126z0);
        }
        w0Var2.setIconColor(w05);
        org.telegram.ui.ActionBar.w0 w0Var3 = profileActivity.Q0;
        if (profileActivity.X5 != null) {
            w06 = -1;
        } else {
            w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, profileActivity.f36126z0);
        }
        w0Var3.setIconColor(w06);
        org.telegram.ui.ActionBar.w0 w0Var4 = profileActivity.R0;
        if (profileActivity.X5 != null) {
            w07 = -1;
        } else {
            w07 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, profileActivity.f36126z0);
        }
        w0Var4.setIconColor(w07);
        org.telegram.ui.ActionBar.w0 w0Var5 = profileActivity.S0;
        if (profileActivity.X5 != null) {
            w08 = -1;
        } else {
            w08 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, profileActivity.f36126z0);
        }
        w0Var5.setIconColor(w08);
        if (profileActivity.f36111x != null) {
            MessagesController.PeerColor peerColor2 = profileActivity.X5;
            if (peerColor2 != null) {
                int color2 = peerColor2.getColor2();
                if (profileActivity.X5.hasColor6(org.telegram.ui.ActionBar.y6.I.q())) {
                    color3 = profileActivity.X5.getColor5();
                } else {
                    color3 = profileActivity.X5.getColor3();
                }
                int f11 = i0.a.f(0.4f, color2, color3);
                if (org.telegram.ui.ActionBar.y6.I.q()) {
                    f10 = -0.1f;
                } else {
                    f10 = -0.08f;
                }
                w09 = org.telegram.ui.ActionBar.y6.b(0.1f, f10, f11);
            } else {
                w09 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23776zh, profileActivity.f36126z0);
            }
            profileActivity.f36111x.setColorFilter(AndroidUtilities.getOffsetColor(w09, org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36126z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.H != null) {
            if (profileActivity.X5 == null) {
                i10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ah, profileActivity.f36126z0);
            }
            profileActivity.H.setColorFilter(AndroidUtilities.getOffsetColor(i10, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, profileActivity.f36126z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (profileActivity.f36119y != null) {
            profileActivity.f36119y.setColorFilter(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23776zh, profileActivity.f36126z0), org.telegram.ui.ActionBar.y6.w0(i11, profileActivity.f36126z0), f7, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        profileActivity.j5();
        ProfileActivity profileActivity2 = profileActivity.f36047o0.f41429n;
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
                profileActivity.s4(0, profileActivity.G3(), true);
            }
        }
    }

    @Override
    public final Object get(Object obj) {
        org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj;
        return Float.valueOf(this.f40766b.K5);
    }
}
