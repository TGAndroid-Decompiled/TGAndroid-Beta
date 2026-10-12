package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class fi1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final int f37794a;
    public final xi1 f37795b;

    public fi1(xi1 xi1Var, int i10) {
        this.f37794a = i10;
        this.f37795b = xi1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        xi1 xi1Var = this.f37795b;
        xi1Var.f44018r0 = g10;
        ((FrameLayout.LayoutParams) xi1Var.f44006j0.getLayoutParams()).bottomMargin = xi1Var.f44018r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) xi1Var.f43995e0.getLayoutParams()).bottomMargin = xi1Var.f44018r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) xi1Var.H.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) xi1Var.I.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) xi1Var.K.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) xi1Var.X.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) xi1Var.N.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) xi1Var.f44028y.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) xi1Var.O.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) xi1Var.R.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) xi1Var.Q.getLayoutParams()).topMargin = xi1Var.f44018r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) xi1Var.Z.getLayoutParams()).bottomMargin = xi1Var.f44018r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) xi1Var.M0.getLayoutParams()).bottomMargin = xi1Var.f44018r0.getSystemWindowInsetBottom();
        xi1Var.Y.setInsets(xi1Var.f44018r0);
        xi1Var.Z.setInsets(xi1Var.f44018r0);
        xi1Var.f44019s.requestLayout();
        qi1 qi1Var = xi1Var.f44014o0;
        if (qi1Var != null) {
            qi1Var.setBottomPadding(xi1Var.f44018r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f46999b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37794a) {
            case 0:
                pi1 pi1Var = this.f37795b.f44022u0;
                if (pi1Var != null) {
                    pi1Var.b();
                    return;
                }
                return;
            default:
                this.f37795b.f44022u0.b();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f37794a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    xi1 xi1Var = this.f37795b;
                    AndroidUtilities.cancelRunOnUIThread(xi1Var.S0);
                    xi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (xi1Var.f44025w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    xi1Var.f44016q0 = xi1Var.f44015p0;
                    xi1Var.G();
                    return;
                }
                return;
            default:
                xi1 xi1Var2 = this.f37795b;
                AndroidUtilities.cancelRunOnUIThread(xi1Var2.S0);
                xi1Var2.R0 = false;
                if (xi1Var2.f43986b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    xi1Var2.f43986b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    xi1Var2.B();
                    return;
                }
        }
    }
}
