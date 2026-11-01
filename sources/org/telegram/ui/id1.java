package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class id1 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.voip.b1, r0.m, org.telegram.ui.Components.voip.q2 {
    public final int f38007a;
    public final zd1 f38008b;

    public id1(zd1 zd1Var, int i10) {
        this.f38007a = i10;
        this.f38008b = zd1Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        zd1 zd1Var = this.f38008b;
        zd1Var.f43969r0 = g10;
        ((FrameLayout.LayoutParams) zd1Var.f43957j0.getLayoutParams()).bottomMargin = zd1Var.f43969r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zd1Var.f43946e0.getLayoutParams()).bottomMargin = zd1Var.f43969r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zd1Var.H.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zd1Var.I.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zd1Var.K.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(56.0f);
        ((FrameLayout.LayoutParams) zd1Var.X.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(135.0f);
        ((FrameLayout.LayoutParams) zd1Var.N.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(17.0f);
        ((FrameLayout.LayoutParams) zd1Var.D.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(93.0f);
        ((FrameLayout.LayoutParams) zd1Var.O.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zd1Var.R.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(118.0f);
        ((FrameLayout.LayoutParams) zd1Var.Q.getLayoutParams()).topMargin = zd1Var.f43969r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(380.0f);
        ((FrameLayout.LayoutParams) zd1Var.Z.getLayoutParams()).bottomMargin = zd1Var.f43969r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zd1Var.M0.getLayoutParams()).bottomMargin = zd1Var.f43969r0.getSystemWindowInsetBottom();
        zd1Var.Y.setInsets(zd1Var.f43969r0);
        zd1Var.Z.setInsets(zd1Var.f43969r0);
        zd1Var.f43970s.requestLayout();
        sd1 sd1Var = zd1Var.f43965o0;
        if (sd1Var != null) {
            sd1Var.setBottomPadding(zd1Var.f43969r0.getSystemWindowInsetBottom());
        }
        return r0.j1.f46142b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38007a) {
            case 0:
                rd1 rd1Var = this.f38008b.f43973u0;
                if (rd1Var != null) {
                    rd1Var.b();
                    return;
                }
                return;
            default:
                this.f38008b.f43973u0.b();
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.Components.voip.r2 r2Var) {
        int i10;
        int i11 = this.f38007a;
        zd1 zd1Var = this.f38008b;
        switch (i11) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.i0.r(zd1Var.S0);
                    zd1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (zd1Var.f43976w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = 2131754729;
                        } else {
                            i10 = 2131754728;
                        }
                        r2Var.announceForAccessibility(org.telegram.messenger.dd.L0(i10, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    zd1Var.f43967q0 = zd1Var.f43966p0;
                    zd1Var.G();
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.r(zd1Var.S0);
                zd1Var.R0 = false;
                if (zd1Var.f43938b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    zd1Var.f43938b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    zd1Var.B();
                    return;
                }
        }
    }
}
