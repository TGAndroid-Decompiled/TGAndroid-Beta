package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class pb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final int f48773a;
    public final ec1 f48774b;

    public pb1(ec1 ec1Var, int i7) {
        this.f48773a = i7;
        this.f48774b = ec1Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ec1 ec1Var = this.f48774b;
        ec1Var.f45303q0 = g10;
        ((FrameLayout.LayoutParams) ec1Var.f45292i0.getLayoutParams()).bottomMargin = ec1Var.f45303q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.f45283e0.getLayoutParams()).bottomMargin = ec1Var.f45303q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.H.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.I.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.K.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) ec1Var.X.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) ec1Var.N.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) ec1Var.D.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) ec1Var.O.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.R.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) ec1Var.Q.getLayoutParams()).topMargin = ec1Var.f45303q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) ec1Var.Z.getLayoutParams()).bottomMargin = ec1Var.f45303q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.L0.getLayoutParams()).bottomMargin = ec1Var.f45303q0.getSystemWindowInsetBottom();
        ec1Var.Y.setInsets(ec1Var.f45303q0);
        ec1Var.Z.setInsets(ec1Var.f45303q0);
        ec1Var.f45306s.requestLayout();
        yb1 yb1Var = ec1Var.f45300n0;
        if (yb1Var != null) {
            yb1Var.setBottomPadding(ec1Var.f45303q0.getSystemWindowInsetBottom());
        }
        return r0.k1.f54107b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7;
        int i10 = this.f48773a;
        ec1 ec1Var = this.f48774b;
        switch (i10) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(ec1Var.R0);
                    ec1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (ec1Var.f45310v0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i7 = 2131754729;
                        } else {
                            i7 = 2131754728;
                        }
                        a3Var.announceForAccessibility(org.telegram.messenger.hd.M0(i7, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    ec1Var.f45302p0 = ec1Var.f45301o0;
                    ec1Var.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(ec1Var.R0);
                ec1Var.Q0 = false;
                if (ec1Var.f45274b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    ec1Var.f45274b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    ec1Var.t();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f48774b.f45308t0.b();
    }
}
