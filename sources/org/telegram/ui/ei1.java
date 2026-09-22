package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ei1 implements Runnable {
    public final int f33357a;
    public final ui1 f33358b;

    public ei1(ui1 ui1Var, int i10) {
        this.f33357a = i10;
        this.f33358b = ui1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f33357a) {
            case 0:
                this.f33358b.f38020u0.b();
                return;
            case 1:
                this.f33358b.f38020u0.b();
                return;
            case 2:
                this.f33358b.f38020u0.b();
                return;
            case 3:
                this.f33358b.f38020u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.u1 u1Var = this.f33358b.Z;
                u1Var.f29280c0 = false;
                u1Var.invalidate();
                return;
            case 5:
                ui1 ui1Var = this.f33358b;
                ui1Var.f38014q0 = ui1Var.f38013p0;
                ui1Var.H();
                return;
            case 6:
                this.f33358b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ui1 ui1Var2 = this.f33358b;
                ui1Var2.f37993e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ui1Var2.e.getLocationOnScreen(iArr);
                ui1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.h.getLocationOnScreen(iArr);
                ui1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f37995f.getLocationOnScreen(iArr);
                ui1Var2.f37995f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f37995f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f38010n.getLocationOnScreen(iArr);
                ui1Var2.f38010n.setTranslationX((((ui1Var2.f37993e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ui1Var2.f38010n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f38010n.setAlpha(1.0f);
                ui1Var2.e.setAlpha(1.0f);
                ui1Var2.h.setAlpha(1.0f);
                ui1Var2.f37995f.setAlpha(1.0f);
                long j3 = 200;
                ui1Var2.f38010n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f37995f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f33358b.f38020u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ui1 ui1Var3 = this.f33358b;
                    ui1Var3.O0.setTranslationY(ui1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ui1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f33358b.f38020u0.b();
                return;
            case 11:
                ui1 ui1Var4 = this.f33358b;
                ui1Var4.f38020u0.setAlpha(1.0f);
                ui1Var4.f38020u0.invalidate();
                ValueAnimator k10 = ui1Var4.k(true);
                ui1Var4.H.setAlpha(0.0f);
                ui1Var4.I.setAlpha(0.0f);
                ui1Var4.N.setAlpha(0.0f);
                ui1Var4.X.setAlpha(0.0f);
                ui1Var4.f38004j0.setAlpha(0.0f);
                ui1Var4.f38000h0.setAlpha(0.0f);
                ui1Var4.f38002i0.setAlpha(0.0f);
                ui1Var4.K.setAlpha(0.0f);
                ui1Var4.M0.setAlpha(0.0f);
                ui1Var4.Y.f29278b0 = true;
                AndroidUtilities.runOnUIThread(new pb1(16, ui1Var4, k10), 32L);
                return;
            case 12:
                ui1 ui1Var5 = this.f33358b;
                ui1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = ui1Var5.N0;
                if (d3Var != null && d3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ui1Var5.f38028z0 && ui1Var5.f38025x0 && !ui1Var5.C0 && !z10) {
                    ui1Var5.K0 = System.currentTimeMillis();
                    ui1Var5.A(false);
                    ui1Var5.f38014q0 = ui1Var5.f38013p0;
                    ui1Var5.H();
                    return;
                }
                return;
            default:
                ui1 ui1Var6 = this.f33358b;
                if (ui1Var6.f38013p0 == 3) {
                    ui1Var6.f38026y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = ui1Var6.v;
                    if (!c3Var.R) {
                        c3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
