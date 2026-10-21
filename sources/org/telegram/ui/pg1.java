package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class pg1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final int f40227a;
    public final hh1 f40228b;

    public pg1(hh1 hh1Var, int i10) {
        this.f40227a = i10;
        this.f40228b = hh1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        hh1 hh1Var = this.f40228b;
        hh1Var.f37665r0 = g10;
        ((FrameLayout.LayoutParams) hh1Var.f37653j0.getLayoutParams()).bottomMargin = hh1Var.f37665r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hh1Var.f37642e0.getLayoutParams()).bottomMargin = hh1Var.f37665r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hh1Var.H.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hh1Var.I.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hh1Var.K.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) hh1Var.X.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) hh1Var.N.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) hh1Var.f37675y.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) hh1Var.O.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hh1Var.R.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) hh1Var.Q.getLayoutParams()).topMargin = hh1Var.f37665r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) hh1Var.Z.getLayoutParams()).bottomMargin = hh1Var.f37665r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hh1Var.M0.getLayoutParams()).bottomMargin = hh1Var.f37665r0.getSystemWindowInsetBottom();
        hh1Var.Y.setInsets(hh1Var.f37665r0);
        hh1Var.Z.setInsets(hh1Var.f37665r0);
        hh1Var.f37666s.requestLayout();
        ah1 ah1Var = hh1Var.f37661o0;
        if (ah1Var != null) {
            ah1Var.setBottomPadding(hh1Var.f37665r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f44834b;
    }

    @Override
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        int i10;
        switch (this.f40227a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    hh1 hh1Var = this.f40228b;
                    AndroidUtilities.cancelRunOnUIThread(hh1Var.S0);
                    hh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (hh1Var.f37672w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        h3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    hh1Var.f37663q0 = hh1Var.f37662p0;
                    hh1Var.G();
                    return;
                }
                return;
            default:
                hh1 hh1Var2 = this.f40228b;
                AndroidUtilities.cancelRunOnUIThread(hh1Var2.S0);
                hh1Var2.R0 = false;
                if (hh1Var2.f37634b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    hh1Var2.f37634b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    hh1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40227a) {
            case 0:
                zg1 zg1Var = this.f40228b.f37669u0;
                if (zg1Var != null) {
                    zg1Var.b();
                    return;
                }
                return;
            default:
                this.f40228b.f37669u0.b();
                return;
        }
    }
}
