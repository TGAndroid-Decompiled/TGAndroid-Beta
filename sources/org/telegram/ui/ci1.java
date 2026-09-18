package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ci1 implements Runnable {
    public final int f32667a;
    public final si1 f32668b;

    public ci1(si1 si1Var, int i10) {
        this.f32667a = i10;
        this.f32668b = si1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f32667a) {
            case 0:
                this.f32668b.f37333u0.b();
                return;
            case 1:
                this.f32668b.f37333u0.b();
                return;
            case 2:
                this.f32668b.f37333u0.b();
                return;
            case 3:
                this.f32668b.f37333u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.u1 u1Var = this.f32668b.Z;
                u1Var.f29579c0 = false;
                u1Var.invalidate();
                return;
            case 5:
                si1 si1Var = this.f32668b;
                si1Var.f37327q0 = si1Var.f37326p0;
                si1Var.H();
                return;
            case 6:
                this.f32668b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                si1 si1Var2 = this.f32668b;
                si1Var2.f37306e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                si1Var2.e.getLocationOnScreen(iArr);
                si1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                si1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                si1Var2.h.getLocationOnScreen(iArr);
                si1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                si1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                si1Var2.f37308f.getLocationOnScreen(iArr);
                si1Var2.f37308f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                si1Var2.f37308f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                si1Var2.f37323n.getLocationOnScreen(iArr);
                si1Var2.f37323n.setTranslationX((((si1Var2.f37306e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                si1Var2.f37323n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                si1Var2.f37323n.setAlpha(1.0f);
                si1Var2.e.setAlpha(1.0f);
                si1Var2.h.setAlpha(1.0f);
                si1Var2.f37308f.setAlpha(1.0f);
                long j3 = 200;
                si1Var2.f37323n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                si1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                si1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                si1Var2.f37308f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f32668b.f37333u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    si1 si1Var3 = this.f32668b;
                    si1Var3.O0.setTranslationY(si1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    si1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f32668b.f37333u0.b();
                return;
            case 11:
                si1 si1Var4 = this.f32668b;
                si1Var4.f37333u0.setAlpha(1.0f);
                si1Var4.f37333u0.invalidate();
                ValueAnimator k10 = si1Var4.k(true);
                si1Var4.H.setAlpha(0.0f);
                si1Var4.I.setAlpha(0.0f);
                si1Var4.N.setAlpha(0.0f);
                si1Var4.X.setAlpha(0.0f);
                si1Var4.f37317j0.setAlpha(0.0f);
                si1Var4.f37313h0.setAlpha(0.0f);
                si1Var4.f37315i0.setAlpha(0.0f);
                si1Var4.K.setAlpha(0.0f);
                si1Var4.M0.setAlpha(0.0f);
                si1Var4.Y.f29577b0 = true;
                AndroidUtilities.runOnUIThread(new x81(20, si1Var4, k10), 32L);
                return;
            case 12:
                si1 si1Var5 = this.f32668b;
                si1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = si1Var5.N0;
                if (d3Var != null && d3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (si1Var5.f37341z0 && si1Var5.f37338x0 && !si1Var5.C0 && !z10) {
                    si1Var5.K0 = System.currentTimeMillis();
                    si1Var5.A(false);
                    si1Var5.f37327q0 = si1Var5.f37326p0;
                    si1Var5.H();
                    return;
                }
                return;
            default:
                si1 si1Var6 = this.f32668b;
                if (si1Var6.f37326p0 == 3) {
                    si1Var6.f37339y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = si1Var6.v;
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
