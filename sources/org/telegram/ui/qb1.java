package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class qb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final int f49186a;
    public final fc1 f49187b;

    public qb1(fc1 fc1Var, int i7) {
        this.f49186a = i7;
        this.f49187b = fc1Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        fc1 fc1Var = this.f49187b;
        fc1Var.f45571q0 = g10;
        ((FrameLayout.LayoutParams) fc1Var.f45560i0.getLayoutParams()).bottomMargin = fc1Var.f45571q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.f45551e0.getLayoutParams()).bottomMargin = fc1Var.f45571q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.H.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.I.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.K.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) fc1Var.X.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) fc1Var.N.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) fc1Var.D.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) fc1Var.O.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.R.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) fc1Var.Q.getLayoutParams()).topMargin = fc1Var.f45571q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) fc1Var.Z.getLayoutParams()).bottomMargin = fc1Var.f45571q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.L0.getLayoutParams()).bottomMargin = fc1Var.f45571q0.getSystemWindowInsetBottom();
        fc1Var.Y.setInsets(fc1Var.f45571q0);
        fc1Var.Z.setInsets(fc1Var.f45571q0);
        fc1Var.f45574s.requestLayout();
        zb1 zb1Var = fc1Var.f45568n0;
        if (zb1Var != null) {
            zb1Var.setBottomPadding(fc1Var.f45571q0.getSystemWindowInsetBottom());
        }
        return r0.k1.f54200b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7;
        int i10 = this.f49186a;
        fc1 fc1Var = this.f49187b;
        switch (i10) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(fc1Var.R0);
                    fc1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (fc1Var.f45578v0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i7 = 2131754729;
                        } else {
                            i7 = 2131754728;
                        }
                        a3Var.announceForAccessibility(org.telegram.messenger.id.M0(i7, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    fc1Var.f45570p0 = fc1Var.f45569o0;
                    fc1Var.y();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(fc1Var.R0);
                fc1Var.Q0 = false;
                if (fc1Var.f45542b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    fc1Var.f45542b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    fc1Var.t();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f49187b.f45576t0.b();
    }
}
