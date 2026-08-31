package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class kh1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.s1, r0.o, org.telegram.ui.Components.voip.j3 {
    public final int f38415a;
    public final ci1 f38416b;

    public kh1(ci1 ci1Var, int i10) {
        this.f38415a = i10;
        this.f38416b = ci1Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        ci1 ci1Var = this.f38416b;
        ci1Var.f35847o0 = g10;
        ((FrameLayout.LayoutParams) ci1Var.f35835g0.getLayoutParams()).bottomMargin = ci1Var.f35847o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ci1Var.f35822b0.getLayoutParams()).bottomMargin = ci1Var.f35847o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ci1Var.E.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ci1Var.F.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ci1Var.H.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ci1Var.U.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ci1Var.K.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ci1Var.f35861y.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ci1Var.L.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ci1Var.O.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ci1Var.N.getLayoutParams()).topMargin = ci1Var.f35847o0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ci1Var.W.getLayoutParams()).bottomMargin = ci1Var.f35847o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ci1Var.J0.getLayoutParams()).bottomMargin = ci1Var.f35847o0.getSystemWindowInsetBottom();
        ci1Var.V.setInsets(ci1Var.f35847o0);
        ci1Var.W.setInsets(ci1Var.f35847o0);
        ci1Var.f35852s.requestLayout();
        vh1 vh1Var = ci1Var.f35844l0;
        if (vh1Var != null) {
            vh1Var.setBottomPadding(ci1Var.f35847o0.getSystemWindowInsetBottom());
        }
        return r0.m1.f46451b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f38415a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ci1 ci1Var = this.f38416b;
                    AndroidUtilities.cancelRunOnUIThread(ci1Var.P0);
                    ci1Var.O0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z4 = !isMicMute;
                    if (ci1Var.f35854t0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z4, false, true);
                    ci1Var.f35846n0 = ci1Var.m0;
                    ci1Var.H();
                    return;
                }
                return;
            default:
                ci1.i(this.f38416b);
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38415a) {
            case 0:
                uh1 uh1Var = this.f38416b.f35851r0;
                if (uh1Var != null) {
                    uh1Var.b();
                    return;
                }
                return;
            default:
                this.f38416b.f35851r0.b();
                return;
        }
    }
}
