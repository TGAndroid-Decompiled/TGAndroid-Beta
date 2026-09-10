package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class hi1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.s1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final int f33400a;
    public final zi1 f33401b;

    public hi1(zi1 zi1Var, int i10) {
        this.f33400a = i10;
        this.f33401b = zi1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        zi1 zi1Var = this.f33401b;
        zi1Var.f39390r0 = g10;
        ((FrameLayout.LayoutParams) zi1Var.f39378j0.getLayoutParams()).bottomMargin = zi1Var.f39390r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zi1Var.f39367e0.getLayoutParams()).bottomMargin = zi1Var.f39390r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zi1Var.H.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zi1Var.I.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zi1Var.K.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) zi1Var.X.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) zi1Var.N.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) zi1Var.f39400y.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) zi1Var.O.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zi1Var.R.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) zi1Var.Q.getLayoutParams()).topMargin = zi1Var.f39390r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) zi1Var.Z.getLayoutParams()).bottomMargin = zi1Var.f39390r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zi1Var.M0.getLayoutParams()).bottomMargin = zi1Var.f39390r0.getSystemWindowInsetBottom();
        zi1Var.Y.setInsets(zi1Var.f39390r0);
        zi1Var.Z.setInsets(zi1Var.f39390r0);
        zi1Var.f39391s.requestLayout();
        si1 si1Var = zi1Var.f39386o0;
        if (si1Var != null) {
            si1Var.setBottomPadding(zi1Var.f39390r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f41073b;
    }

    @Override
    public void b(org.telegram.ui.Components.voip.j3 j3Var) {
        int i10;
        switch (this.f33400a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    zi1 zi1Var = this.f33401b;
                    AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
                    zi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (zi1Var.f39397w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        j3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    zi1Var.f39388q0 = zi1Var.f39387p0;
                    zi1Var.H();
                    return;
                }
                return;
            default:
                zi1.i(this.f33401b);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33400a) {
            case 0:
                ri1 ri1Var = this.f33401b.f39394u0;
                if (ri1Var != null) {
                    ri1Var.b();
                    return;
                }
                return;
            default:
                this.f33401b.f39394u0.b();
                return;
        }
    }
}
