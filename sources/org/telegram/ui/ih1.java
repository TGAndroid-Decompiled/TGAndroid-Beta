package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ih1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.i3 {
    public final int f35124a;
    public final ai1 f35125b;

    public ih1(ai1 ai1Var, int i10) {
        this.f35124a = i10;
        this.f35125b = ai1Var;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        ai1 ai1Var = this.f35125b;
        ai1Var.f32626o0 = g10;
        ((FrameLayout.LayoutParams) ai1Var.f32614g0.getLayoutParams()).bottomMargin = ai1Var.f32626o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ai1Var.f32602b0.getLayoutParams()).bottomMargin = ai1Var.f32626o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ai1Var.E.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ai1Var.F.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ai1Var.H.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ai1Var.U.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ai1Var.K.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ai1Var.f32640y.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ai1Var.L.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ai1Var.O.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ai1Var.N.getLayoutParams()).topMargin = ai1Var.f32626o0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ai1Var.W.getLayoutParams()).bottomMargin = ai1Var.f32626o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ai1Var.J0.getLayoutParams()).bottomMargin = ai1Var.f32626o0.getSystemWindowInsetBottom();
        ai1Var.V.setInsets(ai1Var.f32626o0);
        ai1Var.W.setInsets(ai1Var.f32626o0);
        ai1Var.f32631s.requestLayout();
        th1 th1Var = ai1Var.f32623l0;
        if (th1Var != null) {
            th1Var.setBottomPadding(ai1Var.f32626o0.getSystemWindowInsetBottom());
        }
        return r0.m1.f43129b;
    }

    @Override
    public void d(org.telegram.ui.Components.voip.j3 j3Var) {
        int i10;
        switch (this.f35124a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ai1 ai1Var = this.f35125b;
                    AndroidUtilities.cancelRunOnUIThread(ai1Var.P0);
                    ai1Var.O0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z4 = !isMicMute;
                    if (ai1Var.f32633t0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        j3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z4, false, true);
                    ai1Var.f32625n0 = ai1Var.m0;
                    ai1Var.H();
                    return;
                }
                return;
            default:
                ai1.i(this.f35125b);
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f35124a) {
            case 0:
                sh1 sh1Var = this.f35125b.f32630r0;
                if (sh1Var != null) {
                    sh1Var.b();
                    return;
                }
                return;
            default:
                this.f35125b.f32630r0.b();
                return;
        }
    }
}
