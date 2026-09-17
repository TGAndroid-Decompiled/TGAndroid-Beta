package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ei1 implements Runnable {
    public final int f36093a;
    public final ui1 f36094b;

    public ei1(ui1 ui1Var, int i10) {
        this.f36093a = i10;
        this.f36094b = ui1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f36093a) {
            case 0:
                this.f36094b.f41147u0.b();
                return;
            case 1:
                this.f36094b.f41147u0.b();
                return;
            case 2:
                this.f36094b.f41147u0.b();
                return;
            case 3:
                this.f36094b.f41147u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f36094b.Z;
                s1Var.f31787c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                ui1 ui1Var = this.f36094b;
                ui1Var.f41141q0 = ui1Var.f41140p0;
                ui1Var.H();
                return;
            case 6:
                this.f36094b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ui1 ui1Var2 = this.f36094b;
                ui1Var2.f41120e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ui1Var2.f41119e.getLocationOnScreen(iArr);
                ui1Var2.f41119e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f41119e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.h.getLocationOnScreen(iArr);
                ui1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f41122f.getLocationOnScreen(iArr);
                ui1Var2.f41122f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f41122f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f41137n.getLocationOnScreen(iArr);
                ui1Var2.f41137n.setTranslationX((((ui1Var2.f41120e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ui1Var2.f41137n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f41137n.setAlpha(1.0f);
                ui1Var2.f41119e.setAlpha(1.0f);
                ui1Var2.h.setAlpha(1.0f);
                ui1Var2.f41122f.setAlpha(1.0f);
                long j3 = 200;
                ui1Var2.f41137n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f41119e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f41122f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f36094b.f41147u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ui1 ui1Var3 = this.f36094b;
                    ui1Var3.O0.setTranslationY(ui1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ui1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f36094b.f41147u0.b();
                return;
            case 11:
                ui1 ui1Var4 = this.f36094b;
                ui1Var4.f41147u0.setAlpha(1.0f);
                ui1Var4.f41147u0.invalidate();
                ValueAnimator k10 = ui1Var4.k(true);
                ui1Var4.H.setAlpha(0.0f);
                ui1Var4.I.setAlpha(0.0f);
                ui1Var4.N.setAlpha(0.0f);
                ui1Var4.X.setAlpha(0.0f);
                ui1Var4.f41131j0.setAlpha(0.0f);
                ui1Var4.f41127h0.setAlpha(0.0f);
                ui1Var4.f41129i0.setAlpha(0.0f);
                ui1Var4.K.setAlpha(0.0f);
                ui1Var4.M0.setAlpha(0.0f);
                ui1Var4.Y.f31785b0 = true;
                AndroidUtilities.runOnUIThread(new w81(22, ui1Var4, k10), 32L);
                return;
            case 12:
                ui1 ui1Var5 = this.f36094b;
                ui1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = ui1Var5.N0;
                if (b3Var != null && b3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ui1Var5.f41155z0 && ui1Var5.f41152x0 && !ui1Var5.C0 && !z10) {
                    ui1Var5.K0 = System.currentTimeMillis();
                    ui1Var5.A(false);
                    ui1Var5.f41141q0 = ui1Var5.f41140p0;
                    ui1Var5.H();
                    return;
                }
                return;
            default:
                ui1 ui1Var6 = this.f36094b;
                if (ui1Var6.f41140p0 == 3) {
                    ui1Var6.f41153y.b(true, false);
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
