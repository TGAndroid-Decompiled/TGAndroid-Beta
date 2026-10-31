package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class kd1 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.voip.a1, r0.m, org.telegram.ui.Components.voip.p2 {
    public final int f38779a;
    public final be1 f38780b;

    public kd1(be1 be1Var, int i10) {
        this.f38779a = i10;
        this.f38780b = be1Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        be1 be1Var = this.f38780b;
        be1Var.f36230r0 = g10;
        ((FrameLayout.LayoutParams) be1Var.f36218j0.getLayoutParams()).bottomMargin = be1Var.f36230r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) be1Var.f36207e0.getLayoutParams()).bottomMargin = be1Var.f36230r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) be1Var.H.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) be1Var.I.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) be1Var.K.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(56.0f);
        ((FrameLayout.LayoutParams) be1Var.X.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(135.0f);
        ((FrameLayout.LayoutParams) be1Var.N.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(17.0f);
        ((FrameLayout.LayoutParams) be1Var.D.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(93.0f);
        ((FrameLayout.LayoutParams) be1Var.O.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) be1Var.R.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(118.0f);
        ((FrameLayout.LayoutParams) be1Var.Q.getLayoutParams()).topMargin = be1Var.f36230r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(380.0f);
        ((FrameLayout.LayoutParams) be1Var.Z.getLayoutParams()).bottomMargin = be1Var.f36230r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) be1Var.M0.getLayoutParams()).bottomMargin = be1Var.f36230r0.getSystemWindowInsetBottom();
        be1Var.Y.setInsets(be1Var.f36230r0);
        be1Var.Z.setInsets(be1Var.f36230r0);
        be1Var.f36231s.requestLayout();
        ud1 ud1Var = be1Var.f36226o0;
        if (ud1Var != null) {
            ud1Var.setBottomPadding(be1Var.f36230r0.getSystemWindowInsetBottom());
        }
        return r0.j1.f46131b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38779a) {
            case 0:
                td1 td1Var = this.f38780b.f36234u0;
                if (td1Var != null) {
                    td1Var.b();
                    return;
                }
                return;
            default:
                this.f38780b.f36234u0.b();
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.Components.voip.q2 q2Var) {
        int i10;
        int i11 = this.f38779a;
        be1 be1Var = this.f38780b;
        switch (i11) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.i0.r(be1Var.S0);
                    be1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (be1Var.f36237w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = 2131754729;
                        } else {
                            i10 = 2131754728;
                        }
                        q2Var.announceForAccessibility(org.telegram.messenger.cd.L0(i10, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    be1Var.f36228q0 = be1Var.f36227p0;
                    be1Var.G();
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.r(be1Var.S0);
                be1Var.R0 = false;
                if (be1Var.f36199b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    be1Var.f36199b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    be1Var.B();
                    return;
                }
        }
    }
}
