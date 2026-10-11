package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ei1 implements Runnable {
    public final int f37374a;
    public final ui1 f37375b;

    public ei1(ui1 ui1Var, int i10) {
        this.f37374a = i10;
        this.f37375b = ui1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37374a) {
            case 0:
                this.f37375b.f42616u0.b();
                return;
            case 1:
                this.f37375b.f42616u0.b();
                return;
            case 2:
                this.f37375b.f42616u0.b();
                return;
            case 3:
                this.f37375b.f42616u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.v1 v1Var = this.f37375b.Z;
                v1Var.f32354c0 = false;
                v1Var.invalidate();
                return;
            case 5:
                ui1 ui1Var = this.f37375b;
                ui1Var.f42610q0 = ui1Var.f42609p0;
                ui1Var.G();
                return;
            case 6:
                this.f37375b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                ui1 ui1Var2 = this.f37375b;
                ui1Var2.f42589e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ui1Var2.f42588e.getLocationOnScreen(iArr);
                ui1Var2.f42588e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f42588e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.h.getLocationOnScreen(iArr);
                ui1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f42591f.getLocationOnScreen(iArr);
                ui1Var2.f42591f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f42591f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f42606n.getLocationOnScreen(iArr);
                ui1Var2.f42606n.setTranslationX((((ui1Var2.f42589e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ui1Var2.f42606n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f42606n.setAlpha(1.0f);
                ui1Var2.f42588e.setAlpha(1.0f);
                ui1Var2.h.setAlpha(1.0f);
                ui1Var2.f42591f.setAlpha(1.0f);
                long j3 = 200;
                ui1Var2.f42606n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f42588e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f42591f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f37375b.f42616u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ui1 ui1Var3 = this.f37375b;
                    ui1Var3.O0.setTranslationY(ui1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ui1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f37375b.f42616u0.b();
                return;
            case 11:
                ui1 ui1Var4 = this.f37375b;
                ui1Var4.f42616u0.setAlpha(1.0f);
                ui1Var4.f42616u0.invalidate();
                ValueAnimator j10 = ui1Var4.j(true);
                ui1Var4.H.setAlpha(0.0f);
                ui1Var4.I.setAlpha(0.0f);
                ui1Var4.N.setAlpha(0.0f);
                ui1Var4.X.setAlpha(0.0f);
                ui1Var4.f42600j0.setAlpha(0.0f);
                ui1Var4.f42596h0.setAlpha(0.0f);
                ui1Var4.f42598i0.setAlpha(0.0f);
                ui1Var4.K.setAlpha(0.0f);
                ui1Var4.M0.setAlpha(0.0f);
                ui1Var4.Y.f32352b0 = true;
                AndroidUtilities.runOnUIThread(new m31(29, ui1Var4, j10), 32L);
                return;
            case 12:
                ui1 ui1Var5 = this.f37375b;
                ui1Var5.R0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = ui1Var5.N0;
                if (e3Var != null && e3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ui1Var5.f42624z0 && ui1Var5.f42621x0 && !ui1Var5.C0 && !z10) {
                    ui1Var5.K0 = System.currentTimeMillis();
                    ui1Var5.z(false);
                    ui1Var5.f42610q0 = ui1Var5.f42609p0;
                    ui1Var5.G();
                    return;
                }
                return;
            default:
                ui1 ui1Var6 = this.f37375b;
                if (ui1Var6.f42609p0 == 3) {
                    ui1Var6.f42622y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = ui1Var6.v;
                    if (!d3Var.R) {
                        d3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
