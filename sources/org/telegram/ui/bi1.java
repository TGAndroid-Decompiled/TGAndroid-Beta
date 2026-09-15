package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
public final class bi1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.t1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final int f32172a;
    public final ti1 f32173b;

    public bi1(ti1 ti1Var, int i10) {
        this.f32172a = i10;
        this.f32173b = ti1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ti1 ti1Var = this.f32173b;
        ti1Var.f37727r0 = g10;
        ((FrameLayout.LayoutParams) ti1Var.f37715j0.getLayoutParams()).bottomMargin = ti1Var.f37727r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ti1Var.f37704e0.getLayoutParams()).bottomMargin = ti1Var.f37727r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ti1Var.H.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ti1Var.I.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ti1Var.K.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ti1Var.X.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ti1Var.N.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ti1Var.f37737y.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ti1Var.O.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ti1Var.R.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ti1Var.Q.getLayoutParams()).topMargin = ti1Var.f37727r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ti1Var.Z.getLayoutParams()).bottomMargin = ti1Var.f37727r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ti1Var.M0.getLayoutParams()).bottomMargin = ti1Var.f37727r0.getSystemWindowInsetBottom();
        ti1Var.Y.setInsets(ti1Var.f37727r0);
        ti1Var.Z.setInsets(ti1Var.f37727r0);
        ti1Var.f37728s.requestLayout();
        mi1 mi1Var = ti1Var.f37723o0;
        if (mi1Var != null) {
            mi1Var.setBottomPadding(ti1Var.f37727r0.getSystemWindowInsetBottom());
        }
        return r0.l1.f41854b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32172a) {
            case 0:
                li1 li1Var = this.f32173b.f37731u0;
                if (li1Var != null) {
                    li1Var.b();
                    return;
                }
                return;
            default:
                this.f32173b.f37731u0.b();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.Components.voip.j3 j3Var) {
        int i10;
        switch (this.f32172a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ti1 ti1Var = this.f32173b;
                    AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
                    ti1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ti1Var.f37734w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i10 = R.string.AccDescrVoipMicOff;
                        } else {
                            i10 = R.string.AccDescrVoipMicOn;
                        }
                        j3Var.announceForAccessibility(LocaleController.getString(i10));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ti1Var.f37725q0 = ti1Var.f37724p0;
                    ti1Var.H();
                    return;
                }
                return;
            default:
                ti1.i(this.f32173b);
                return;
        }
    }
}
