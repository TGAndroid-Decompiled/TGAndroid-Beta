package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class hi1 implements Runnable {
    public final int f38441a;
    public final xi1 f38442b;

    public hi1(xi1 xi1Var, int i10) {
        this.f38441a = i10;
        this.f38442b = xi1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38441a) {
            case 0:
                this.f38442b.f44022u0.b();
                return;
            case 1:
                this.f38442b.f44022u0.b();
                return;
            case 2:
                this.f38442b.f44022u0.b();
                return;
            case 3:
                this.f38442b.f44022u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.v1 v1Var = this.f38442b.Z;
                v1Var.f32040c0 = false;
                v1Var.invalidate();
                return;
            case 5:
                xi1 xi1Var = this.f38442b;
                xi1Var.f44016q0 = xi1Var.f44015p0;
                xi1Var.G();
                return;
            case 6:
                this.f38442b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                xi1 xi1Var2 = this.f38442b;
                xi1Var2.f43995e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                xi1Var2.f43994e.getLocationOnScreen(iArr);
                xi1Var2.f43994e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                xi1Var2.f43994e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                xi1Var2.h.getLocationOnScreen(iArr);
                xi1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                xi1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                xi1Var2.f43997f.getLocationOnScreen(iArr);
                xi1Var2.f43997f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                xi1Var2.f43997f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                xi1Var2.f44012n.getLocationOnScreen(iArr);
                xi1Var2.f44012n.setTranslationX((((xi1Var2.f43995e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                xi1Var2.f44012n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                xi1Var2.f44012n.setAlpha(1.0f);
                xi1Var2.f43994e.setAlpha(1.0f);
                xi1Var2.h.setAlpha(1.0f);
                xi1Var2.f43997f.setAlpha(1.0f);
                long j3 = 200;
                xi1Var2.f44012n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                xi1Var2.f43994e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                xi1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                xi1Var2.f43997f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f38442b.f44022u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    xi1 xi1Var3 = this.f38442b;
                    xi1Var3.O0.setTranslationY(xi1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    xi1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f38442b.f44022u0.b();
                return;
            case 11:
                xi1 xi1Var4 = this.f38442b;
                xi1Var4.f44022u0.setAlpha(1.0f);
                xi1Var4.f44022u0.invalidate();
                ValueAnimator j10 = xi1Var4.j(true);
                xi1Var4.H.setAlpha(0.0f);
                xi1Var4.I.setAlpha(0.0f);
                xi1Var4.N.setAlpha(0.0f);
                xi1Var4.X.setAlpha(0.0f);
                xi1Var4.f44006j0.setAlpha(0.0f);
                xi1Var4.f44002h0.setAlpha(0.0f);
                xi1Var4.f44004i0.setAlpha(0.0f);
                xi1Var4.K.setAlpha(0.0f);
                xi1Var4.M0.setAlpha(0.0f);
                xi1Var4.Y.f32038b0 = true;
                AndroidUtilities.runOnUIThread(new u31(28, xi1Var4, j10), 32L);
                return;
            case 12:
                xi1 xi1Var5 = this.f38442b;
                xi1Var5.R0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = xi1Var5.N0;
                if (e3Var != null && e3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (xi1Var5.f44030z0 && xi1Var5.f44027x0 && !xi1Var5.C0 && !z10) {
                    xi1Var5.K0 = System.currentTimeMillis();
                    xi1Var5.z(false);
                    xi1Var5.f44016q0 = xi1Var5.f44015p0;
                    xi1Var5.G();
                    return;
                }
                return;
            default:
                xi1 xi1Var6 = this.f38442b;
                if (xi1Var6.f44015p0 == 3) {
                    xi1Var6.f44028y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = xi1Var6.v;
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
