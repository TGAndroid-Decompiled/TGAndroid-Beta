package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ki1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.h3 {
    public final int f37440a;
    public final cj1 f37441b;

    public ki1(cj1 cj1Var, int i10) {
        this.f37440a = i10;
        this.f37441b = cj1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        cj1 cj1Var = this.f37441b;
        cj1Var.f34710r0 = g10;
        ((FrameLayout.LayoutParams) cj1Var.f34698j0.getLayoutParams()).bottomMargin = cj1Var.f34710r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) cj1Var.f34687e0.getLayoutParams()).bottomMargin = cj1Var.f34710r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) cj1Var.H.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) cj1Var.I.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) cj1Var.K.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) cj1Var.X.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) cj1Var.N.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) cj1Var.f34720y.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) cj1Var.O.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) cj1Var.R.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) cj1Var.Q.getLayoutParams()).topMargin = cj1Var.f34710r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) cj1Var.Z.getLayoutParams()).bottomMargin = cj1Var.f34710r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) cj1Var.M0.getLayoutParams()).bottomMargin = cj1Var.f34710r0.getSystemWindowInsetBottom();
        cj1Var.Y.setInsets(cj1Var.f34710r0);
        cj1Var.Z.setInsets(cj1Var.f34710r0);
        cj1Var.f34711s.requestLayout();
        vi1 vi1Var = cj1Var.f34706o0;
        if (vi1Var != null) {
            vi1Var.setBottomPadding(cj1Var.f34710r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f43496b;
    }

    @Override
    public void c(org.telegram.ui.Components.voip.i3 i3Var) {
        int i10;
        switch (this.f37440a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    cj1 cj1Var = this.f37441b;
                    AndroidUtilities.cancelRunOnUIThread(cj1Var.S0);
                    cj1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (cj1Var.f34717w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        i3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    cj1Var.f34708q0 = cj1Var.f34707p0;
                    cj1Var.G();
                    return;
                }
                return;
            default:
                cj1 cj1Var2 = this.f37441b;
                AndroidUtilities.cancelRunOnUIThread(cj1Var2.S0);
                cj1Var2.R0 = false;
                if (cj1Var2.f34679b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    cj1Var2.f34679b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    cj1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37440a) {
            case 0:
                ui1 ui1Var = this.f37441b.f34714u0;
                if (ui1Var != null) {
                    ui1Var.b();
                    return;
                }
                return;
            default:
                this.f37441b.f34714u0.b();
                return;
        }
    }
}
