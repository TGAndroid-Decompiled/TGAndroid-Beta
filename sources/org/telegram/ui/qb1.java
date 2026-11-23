package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class qb1 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.voip.q1, r0.m, org.telegram.ui.Components.voip.d3 {
    public final int f51399a;
    public final fc1 f51400b;

    public qb1(fc1 fc1Var, int i7) {
        this.f51399a = i7;
        this.f51400b = fc1Var;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.e3 e3Var) {
        int i7;
        int i10 = this.f51399a;
        fc1 fc1Var = this.f51400b;
        switch (i10) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(fc1Var.S0);
                    fc1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (fc1Var.f47793w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i7 = 2131754728;
                        } else {
                            i7 = 2131754727;
                        }
                        e3Var.announceForAccessibility(org.telegram.messenger.gd.N0(i7, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    fc1Var.f47784q0 = fc1Var.f47783p0;
                    fc1Var.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(fc1Var.S0);
                fc1Var.R0 = false;
                if (fc1Var.f47755b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    fc1Var.f47755b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    fc1Var.t();
                    return;
                }
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f51400b.f47790u0.b();
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        fc1 fc1Var = this.f51400b;
        fc1Var.f47786r0 = g10;
        ((FrameLayout.LayoutParams) fc1Var.f47775j0.getLayoutParams()).bottomMargin = fc1Var.f47786r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.f47767f0.getLayoutParams()).bottomMargin = fc1Var.f47786r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.I.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.J.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.L.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) fc1Var.Y.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) fc1Var.O.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) fc1Var.E.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) fc1Var.P.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.S.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) fc1Var.R.getLayoutParams()).topMargin = fc1Var.f47786r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) fc1Var.f47753a0.getLayoutParams()).bottomMargin = fc1Var.f47786r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.M0.getLayoutParams()).bottomMargin = fc1Var.f47786r0.getSystemWindowInsetBottom();
        fc1Var.Z.setInsets(fc1Var.f47786r0);
        fc1Var.f47753a0.setInsets(fc1Var.f47786r0);
        fc1Var.f47787s.requestLayout();
        zb1 zb1Var = fc1Var.f47782o0;
        if (zb1Var != null) {
            zb1Var.setBottomPadding(fc1Var.f47786r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f56380b;
    }
}
