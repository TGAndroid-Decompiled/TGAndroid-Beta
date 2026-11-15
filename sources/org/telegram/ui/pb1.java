package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class pb1 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.voip.q1, r0.m, org.telegram.ui.Components.voip.d3 {
    public final int f50215a;
    public final ec1 f50216b;

    public pb1(ec1 ec1Var, int i7) {
        this.f50215a = i7;
        this.f50216b = ec1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ec1 ec1Var = this.f50216b;
        ec1Var.f46705r0 = g10;
        ((FrameLayout.LayoutParams) ec1Var.f46694j0.getLayoutParams()).bottomMargin = ec1Var.f46705r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.f46686f0.getLayoutParams()).bottomMargin = ec1Var.f46705r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.I.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.J.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.L.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) ec1Var.Y.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) ec1Var.O.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) ec1Var.E.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) ec1Var.P.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.S.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) ec1Var.R.getLayoutParams()).topMargin = ec1Var.f46705r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) ec1Var.f46672a0.getLayoutParams()).bottomMargin = ec1Var.f46705r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.M0.getLayoutParams()).bottomMargin = ec1Var.f46705r0.getSystemWindowInsetBottom();
        ec1Var.Z.setInsets(ec1Var.f46705r0);
        ec1Var.f46672a0.setInsets(ec1Var.f46705r0);
        ec1Var.f46706s.requestLayout();
        yb1 yb1Var = ec1Var.f46701o0;
        if (yb1Var != null) {
            yb1Var.setBottomPadding(ec1Var.f46705r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f55681b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.e3 e3Var) {
        int i7;
        int i10 = this.f50215a;
        ec1 ec1Var = this.f50216b;
        switch (i10) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(ec1Var.S0);
                    ec1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ec1Var.f46712w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i7 = 2131754729;
                        } else {
                            i7 = 2131754728;
                        }
                        e3Var.announceForAccessibility(org.telegram.messenger.hd.M0(i7, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ec1Var.f46703q0 = ec1Var.f46702p0;
                    ec1Var.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(ec1Var.S0);
                ec1Var.R0 = false;
                if (ec1Var.f46674b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    ec1Var.f46674b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    ec1Var.t();
                    return;
                }
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f50216b.f46709u0.b();
    }
}
