package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class ib1 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.voip.b1, r0.m, org.telegram.ui.Components.voip.o2 {
    public final int f46231a;
    public final zb1 f46232b;

    public ib1(zb1 zb1Var, int i3) {
        this.f46231a = i3;
        this.f46232b = zb1Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        zb1 zb1Var = this.f46232b;
        zb1Var.f52641s0 = g7;
        ((FrameLayout.LayoutParams) zb1Var.f52629k0.getLayoutParams()).bottomMargin = zb1Var.f52641s0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zb1Var.f52619f0.getLayoutParams()).bottomMargin = zb1Var.f52641s0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zb1Var.I.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zb1Var.J.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zb1Var.L.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) zb1Var.Y.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) zb1Var.O.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) zb1Var.E.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) zb1Var.P.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zb1Var.S.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) zb1Var.R.getLayoutParams()).topMargin = zb1Var.f52641s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) zb1Var.f52605a0.getLayoutParams()).bottomMargin = zb1Var.f52641s0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zb1Var.N0.getLayoutParams()).bottomMargin = zb1Var.f52641s0.getSystemWindowInsetBottom();
        zb1Var.Z.setInsets(zb1Var.f52641s0);
        zb1Var.f52605a0.setInsets(zb1Var.f52641s0);
        zb1Var.f52640s.requestLayout();
        sb1 sb1Var = zb1Var.f52636p0;
        if (sb1Var != null) {
            sb1Var.setBottomPadding(zb1Var.f52641s0.getSystemWindowInsetBottom());
        }
        return r0.k1.f54025b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f46231a) {
            case 0:
                rb1 rb1Var = this.f46232b.f52644v0;
                if (rb1Var != null) {
                    rb1Var.b();
                    return;
                }
                return;
            default:
                this.f46232b.f52644v0.b();
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.Components.voip.p2 p2Var) {
        int i3;
        int i10 = this.f46231a;
        zb1 zb1Var = this.f46232b;
        switch (i10) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(zb1Var.T0);
                    zb1Var.S0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (zb1Var.f52648x0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i3 = 2131754729;
                        } else {
                            i3 = 2131754728;
                        }
                        p2Var.announceForAccessibility(org.telegram.messenger.bd.M0(i3, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    zb1Var.f52639r0 = zb1Var.f52637q0;
                    zb1Var.G();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.r(zb1Var.T0);
                zb1Var.S0 = false;
                if (zb1Var.f52607b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    zb1Var.f52607b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    zb1Var.B();
                    return;
                }
        }
    }
}
