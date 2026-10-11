package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ci1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.u1, r0.n, org.telegram.ui.Components.voip.j3 {
    public final int f36719a;
    public final ui1 f36720b;

    public ci1(ui1 ui1Var, int i10) {
        this.f36719a = i10;
        this.f36720b = ui1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ui1 ui1Var = this.f36720b;
        ui1Var.f42612r0 = g10;
        ((FrameLayout.LayoutParams) ui1Var.f42600j0.getLayoutParams()).bottomMargin = ui1Var.f42612r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.f42589e0.getLayoutParams()).bottomMargin = ui1Var.f42612r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.H.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.I.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.K.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ui1Var.X.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ui1Var.N.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ui1Var.f42622y.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ui1Var.O.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.R.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ui1Var.Q.getLayoutParams()).topMargin = ui1Var.f42612r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ui1Var.Z.getLayoutParams()).bottomMargin = ui1Var.f42612r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.M0.getLayoutParams()).bottomMargin = ui1Var.f42612r0.getSystemWindowInsetBottom();
        ui1Var.Y.setInsets(ui1Var.f42612r0);
        ui1Var.Z.setInsets(ui1Var.f42612r0);
        ui1Var.f42613s.requestLayout();
        ni1 ni1Var = ui1Var.f42608o0;
        if (ni1Var != null) {
            ni1Var.setBottomPadding(ui1Var.f42612r0.getSystemWindowInsetBottom());
        }
        return r0.k1.f46866b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36719a) {
            case 0:
                mi1 mi1Var = this.f36720b.f42616u0;
                if (mi1Var != null) {
                    mi1Var.b();
                    return;
                }
                return;
            default:
                this.f36720b.f42616u0.b();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.voip.k3 k3Var) {
        int i10;
        switch (this.f36719a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ui1 ui1Var = this.f36720b;
                    AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
                    ui1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ui1Var.f42619w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        k3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ui1Var.f42610q0 = ui1Var.f42609p0;
                    ui1Var.G();
                    return;
                }
                return;
            default:
                ui1 ui1Var2 = this.f36720b;
                AndroidUtilities.cancelRunOnUIThread(ui1Var2.S0);
                ui1Var2.R0 = false;
                if (ui1Var2.f42580b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    ui1Var2.f42580b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    ui1Var2.B();
                    return;
                }
        }
    }
}
