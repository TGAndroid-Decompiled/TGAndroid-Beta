package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class qh1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.i3 {
    public final int f37420a;
    public final ii1 f37421b;

    public qh1(ii1 ii1Var, int i10) {
        this.f37420a = i10;
        this.f37421b = ii1Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        ii1 ii1Var = this.f37421b;
        ii1Var.f34972o0 = g10;
        ((FrameLayout.LayoutParams) ii1Var.f34960g0.getLayoutParams()).bottomMargin = ii1Var.f34972o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ii1Var.f34948b0.getLayoutParams()).bottomMargin = ii1Var.f34972o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ii1Var.E.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ii1Var.F.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ii1Var.H.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ii1Var.U.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ii1Var.K.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ii1Var.f34986y.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ii1Var.L.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ii1Var.O.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ii1Var.N.getLayoutParams()).topMargin = ii1Var.f34972o0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ii1Var.W.getLayoutParams()).bottomMargin = ii1Var.f34972o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ii1Var.J0.getLayoutParams()).bottomMargin = ii1Var.f34972o0.getSystemWindowInsetBottom();
        ii1Var.V.setInsets(ii1Var.f34972o0);
        ii1Var.W.setInsets(ii1Var.f34972o0);
        ii1Var.f34977s.requestLayout();
        bi1 bi1Var = ii1Var.f34969l0;
        if (bi1Var != null) {
            bi1Var.setBottomPadding(ii1Var.f34972o0.getSystemWindowInsetBottom());
        }
        return r0.m1.f43153b;
    }

    @Override
    public void f(org.telegram.ui.Components.voip.j3 j3Var) {
        int i10;
        switch (this.f37420a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ii1 ii1Var = this.f37421b;
                    AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
                    ii1Var.O0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z4 = !isMicMute;
                    if (ii1Var.f34979t0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        j3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z4, false, true);
                    ii1Var.f34971n0 = ii1Var.m0;
                    ii1Var.H();
                    return;
                }
                return;
            default:
                ii1.i(this.f37421b);
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f37420a) {
            case 0:
                ai1 ai1Var = this.f37421b.f34976r0;
                if (ai1Var != null) {
                    ai1Var.b();
                    return;
                }
                return;
            default:
                this.f37421b.f34976r0.b();
                return;
        }
    }
}
