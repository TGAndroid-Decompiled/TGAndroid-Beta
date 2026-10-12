package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class ki1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.h3 {
    public final int f37668a;
    public final dj1 f37669b;

    public ki1(dj1 dj1Var, int i10) {
        this.f37668a = i10;
        this.f37669b = dj1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        dj1 dj1Var = this.f37669b;
        dj1Var.f35308r0 = g10;
        ((FrameLayout.LayoutParams) dj1Var.f35296j0.getLayoutParams()).bottomMargin = dj1Var.f35308r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) dj1Var.f35285e0.getLayoutParams()).bottomMargin = dj1Var.f35308r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) dj1Var.H.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) dj1Var.I.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) dj1Var.K.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) dj1Var.X.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) dj1Var.N.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) dj1Var.f35318y.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) dj1Var.O.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) dj1Var.R.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) dj1Var.Q.getLayoutParams()).topMargin = dj1Var.f35308r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) dj1Var.Z.getLayoutParams()).bottomMargin = dj1Var.f35308r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) dj1Var.M0.getLayoutParams()).bottomMargin = dj1Var.f35308r0.getSystemWindowInsetBottom();
        dj1Var.Y.setInsets(dj1Var.f35308r0);
        dj1Var.Z.setInsets(dj1Var.f35308r0);
        dj1Var.f35309s.requestLayout();
        wi1 wi1Var = dj1Var.f35304o0;
        if (wi1Var != null) {
            wi1Var.setBottomPadding(dj1Var.f35308r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f43740b;
    }

    @Override
    public void c(org.telegram.ui.Components.voip.i3 i3Var) {
        int i10;
        switch (this.f37668a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    dj1 dj1Var = this.f37669b;
                    AndroidUtilities.cancelRunOnUIThread(dj1Var.S0);
                    dj1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (dj1Var.f35315w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        i3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    dj1Var.f35306q0 = dj1Var.f35305p0;
                    dj1Var.G();
                    return;
                }
                return;
            default:
                dj1 dj1Var2 = this.f37669b;
                AndroidUtilities.cancelRunOnUIThread(dj1Var2.S0);
                dj1Var2.R0 = false;
                if (dj1Var2.f35277b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    dj1Var2.f35277b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    dj1Var2.B();
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37668a) {
            case 0:
                vi1 vi1Var = this.f37669b.f35312u0;
                if (vi1Var != null) {
                    vi1Var.b();
                    return;
                }
                return;
            default:
                this.f37669b.f35312u0.b();
                return;
        }
    }
}
