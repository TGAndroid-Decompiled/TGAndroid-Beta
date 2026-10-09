package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class di1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.t1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final int f36986a;
    public final wi1 f36987b;

    public di1(wi1 wi1Var, int i10) {
        this.f36986a = i10;
        this.f36987b = wi1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        wi1 wi1Var = this.f36987b;
        wi1Var.f43661r0 = g10;
        ((FrameLayout.LayoutParams) wi1Var.f43649j0.getLayoutParams()).bottomMargin = wi1Var.f43661r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) wi1Var.f43638e0.getLayoutParams()).bottomMargin = wi1Var.f43661r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) wi1Var.H.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) wi1Var.I.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) wi1Var.K.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) wi1Var.X.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) wi1Var.N.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) wi1Var.f43671y.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) wi1Var.O.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) wi1Var.R.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) wi1Var.Q.getLayoutParams()).topMargin = wi1Var.f43661r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) wi1Var.Z.getLayoutParams()).bottomMargin = wi1Var.f43661r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) wi1Var.M0.getLayoutParams()).bottomMargin = wi1Var.f43661r0.getSystemWindowInsetBottom();
        wi1Var.Y.setInsets(wi1Var.f43661r0);
        wi1Var.Z.setInsets(wi1Var.f43661r0);
        wi1Var.f43662s.requestLayout();
        pi1 pi1Var = wi1Var.f43657o0;
        if (pi1Var != null) {
            pi1Var.setBottomPadding(wi1Var.f43661r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f46776b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36986a) {
            case 0:
                oi1 oi1Var = this.f36987b.f43665u0;
                if (oi1Var != null) {
                    oi1Var.b();
                    return;
                }
                return;
            default:
                this.f36987b.f43665u0.b();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.voip.j3 j3Var) {
        int i10;
        switch (this.f36986a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    wi1 wi1Var = this.f36987b;
                    AndroidUtilities.cancelRunOnUIThread(wi1Var.S0);
                    wi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (wi1Var.f43668w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        j3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    wi1Var.f43659q0 = wi1Var.f43658p0;
                    wi1Var.G();
                    return;
                }
                return;
            default:
                wi1 wi1Var2 = this.f36987b;
                AndroidUtilities.cancelRunOnUIThread(wi1Var2.S0);
                wi1Var2.R0 = false;
                if (wi1Var2.f43629b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    wi1Var2.f43629b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    wi1Var2.B();
                    return;
                }
        }
    }
}
