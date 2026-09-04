package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ei1 implements Runnable {
    public final int f36092a;
    public final ui1 f36093b;

    public ei1(ui1 ui1Var, int i10) {
        this.f36092a = i10;
        this.f36093b = ui1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f36092a) {
            case 0:
                this.f36093b.f41146u0.b();
                return;
            case 1:
                this.f36093b.f41146u0.b();
                return;
            case 2:
                this.f36093b.f41146u0.b();
                return;
            case 3:
                this.f36093b.f41146u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f36093b.Z;
                s1Var.f31786c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                ui1 ui1Var = this.f36093b;
                ui1Var.f41140q0 = ui1Var.f41139p0;
                ui1Var.H();
                return;
            case 6:
                this.f36093b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ui1 ui1Var2 = this.f36093b;
                ui1Var2.f41119e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ui1Var2.f41118e.getLocationOnScreen(iArr);
                ui1Var2.f41118e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f41118e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.h.getLocationOnScreen(iArr);
                ui1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f41121f.getLocationOnScreen(iArr);
                ui1Var2.f41121f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f41121f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f41136n.getLocationOnScreen(iArr);
                ui1Var2.f41136n.setTranslationX((((ui1Var2.f41119e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ui1Var2.f41136n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f41136n.setAlpha(1.0f);
                ui1Var2.f41118e.setAlpha(1.0f);
                ui1Var2.h.setAlpha(1.0f);
                ui1Var2.f41121f.setAlpha(1.0f);
                long j3 = 200;
                ui1Var2.f41136n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f41118e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f41121f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f36093b.f41146u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ui1 ui1Var3 = this.f36093b;
                    ui1Var3.O0.setTranslationY(ui1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ui1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f36093b.f41146u0.b();
                return;
            case 11:
                ui1 ui1Var4 = this.f36093b;
                ui1Var4.f41146u0.setAlpha(1.0f);
                ui1Var4.f41146u0.invalidate();
                ValueAnimator k10 = ui1Var4.k(true);
                ui1Var4.H.setAlpha(0.0f);
                ui1Var4.I.setAlpha(0.0f);
                ui1Var4.N.setAlpha(0.0f);
                ui1Var4.X.setAlpha(0.0f);
                ui1Var4.f41130j0.setAlpha(0.0f);
                ui1Var4.f41126h0.setAlpha(0.0f);
                ui1Var4.f41128i0.setAlpha(0.0f);
                ui1Var4.K.setAlpha(0.0f);
                ui1Var4.M0.setAlpha(0.0f);
                ui1Var4.Y.f31784b0 = true;
                AndroidUtilities.runOnUIThread(new w81(22, ui1Var4, k10), 32L);
                return;
            case 12:
                ui1 ui1Var5 = this.f36093b;
                ui1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = ui1Var5.N0;
                if (b3Var != null && b3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ui1Var5.f41154z0 && ui1Var5.f41151x0 && !ui1Var5.C0 && !z10) {
                    ui1Var5.K0 = System.currentTimeMillis();
                    ui1Var5.A(false);
                    ui1Var5.f41140q0 = ui1Var5.f41139p0;
                    ui1Var5.H();
                    return;
                }
                return;
            default:
                ui1 ui1Var6 = this.f36093b;
                if (ui1Var6.f41139p0 == 3) {
                    ui1Var6.f41152y.b(true, false);
                    org.telegram.ui.Components.voip.a3 a3Var = ui1Var6.v;
                    if (!a3Var.R) {
                        a3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
