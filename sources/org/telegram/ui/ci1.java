package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ci1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.t1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final int f32805a;
    public final ui1 f32806b;

    public ci1(ui1 ui1Var, int i10) {
        this.f32805a = i10;
        this.f32806b = ui1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ui1 ui1Var = this.f32806b;
        ui1Var.f38016r0 = g10;
        ((FrameLayout.LayoutParams) ui1Var.f38004j0.getLayoutParams()).bottomMargin = ui1Var.f38016r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.f37993e0.getLayoutParams()).bottomMargin = ui1Var.f38016r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.H.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.I.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.K.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ui1Var.X.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ui1Var.N.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ui1Var.f38026y.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ui1Var.O.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.R.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ui1Var.Q.getLayoutParams()).topMargin = ui1Var.f38016r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ui1Var.Z.getLayoutParams()).bottomMargin = ui1Var.f38016r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.M0.getLayoutParams()).bottomMargin = ui1Var.f38016r0.getSystemWindowInsetBottom();
        ui1Var.Y.setInsets(ui1Var.f38016r0);
        ui1Var.Z.setInsets(ui1Var.f38016r0);
        ui1Var.f38017s.requestLayout();
        ni1 ni1Var = ui1Var.f38012o0;
        if (ni1Var != null) {
            ni1Var.setBottomPadding(ui1Var.f38016r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f41850b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32805a) {
            case 0:
                mi1 mi1Var = this.f32806b.f38020u0;
                if (mi1Var != null) {
                    mi1Var.b();
                    return;
                }
                return;
            default:
                this.f32806b.f38020u0.b();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.Components.voip.j3 j3Var) {
        int i10;
        switch (this.f32805a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ui1 ui1Var = this.f32806b;
                    AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
                    ui1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ui1Var.f38023w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        j3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ui1Var.f38014q0 = ui1Var.f38013p0;
                    ui1Var.H();
                    return;
                }
                return;
            default:
                ui1.i(this.f32806b);
                return;
        }
    }
}
