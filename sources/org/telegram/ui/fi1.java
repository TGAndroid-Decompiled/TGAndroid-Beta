package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class fi1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final int f37797a;
    public final xi1 f37798b;

    public fi1(xi1 xi1Var, int i10) {
        this.f37797a = i10;
        this.f37798b = xi1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        xi1 xi1Var = this.f37798b;
        xi1Var.f44013r0 = g10;
        ((FrameLayout.LayoutParams) xi1Var.f44001j0.getLayoutParams()).bottomMargin = xi1Var.f44013r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) xi1Var.f43990e0.getLayoutParams()).bottomMargin = xi1Var.f44013r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) xi1Var.H.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) xi1Var.I.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) xi1Var.K.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) xi1Var.X.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) xi1Var.N.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) xi1Var.f44023y.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) xi1Var.O.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) xi1Var.R.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) xi1Var.Q.getLayoutParams()).topMargin = xi1Var.f44013r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) xi1Var.Z.getLayoutParams()).bottomMargin = xi1Var.f44013r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) xi1Var.M0.getLayoutParams()).bottomMargin = xi1Var.f44013r0.getSystemWindowInsetBottom();
        xi1Var.Y.setInsets(xi1Var.f44013r0);
        xi1Var.Z.setInsets(xi1Var.f44013r0);
        xi1Var.f44014s.requestLayout();
        qi1 qi1Var = xi1Var.f44009o0;
        if (qi1Var != null) {
            qi1Var.setBottomPadding(xi1Var.f44013r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f46991b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37797a) {
            case 0:
                pi1 pi1Var = this.f37798b.f44017u0;
                if (pi1Var != null) {
                    pi1Var.b();
                    return;
                }
                return;
            default:
                this.f37798b.f44017u0.b();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f37797a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    xi1 xi1Var = this.f37798b;
                    AndroidUtilities.cancelRunOnUIThread(xi1Var.S0);
                    xi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (xi1Var.f44020w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    xi1Var.f44011q0 = xi1Var.f44010p0;
                    xi1Var.G();
                    return;
                }
                return;
            default:
                xi1 xi1Var2 = this.f37798b;
                AndroidUtilities.cancelRunOnUIThread(xi1Var2.S0);
                xi1Var2.R0 = false;
                if (xi1Var2.f43981b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    xi1Var2.f43981b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    xi1Var2.B();
                    return;
                }
        }
    }
}
