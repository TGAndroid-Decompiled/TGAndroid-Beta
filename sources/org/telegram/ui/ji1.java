package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ji1 implements Runnable {
    public final int f34120a;
    public final zi1 f34121b;

    public ji1(zi1 zi1Var, int i10) {
        this.f34120a = i10;
        this.f34121b = zi1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f34120a) {
            case 0:
                this.f34121b.f39394u0.b();
                return;
            case 1:
                this.f34121b.f39394u0.b();
                return;
            case 2:
                this.f34121b.f39394u0.b();
                return;
            case 3:
                this.f34121b.f39394u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.t1 t1Var = this.f34121b.Z;
                t1Var.f28452c0 = false;
                t1Var.invalidate();
                return;
            case 5:
                zi1 zi1Var = this.f34121b;
                zi1Var.f39388q0 = zi1Var.f39387p0;
                zi1Var.H();
                return;
            case 6:
                this.f34121b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                zi1 zi1Var2 = this.f34121b;
                zi1Var2.f39367e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                zi1Var2.e.getLocationOnScreen(iArr);
                zi1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                zi1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.h.getLocationOnScreen(iArr);
                zi1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                zi1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.f39369f.getLocationOnScreen(iArr);
                zi1Var2.f39369f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                zi1Var2.f39369f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.f39384n.getLocationOnScreen(iArr);
                zi1Var2.f39384n.setTranslationX((((zi1Var2.f39367e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                zi1Var2.f39384n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.f39384n.setAlpha(1.0f);
                zi1Var2.e.setAlpha(1.0f);
                zi1Var2.h.setAlpha(1.0f);
                zi1Var2.f39369f.setAlpha(1.0f);
                long j3 = 200;
                zi1Var2.f39384n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                zi1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                zi1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                zi1Var2.f39369f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                return;
            case 8:
                this.f34121b.f39394u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    zi1 zi1Var3 = this.f34121b;
                    zi1Var3.O0.setTranslationY(zi1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    zi1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f34121b.f39394u0.b();
                return;
            case 11:
                zi1 zi1Var4 = this.f34121b;
                zi1Var4.f39394u0.setAlpha(1.0f);
                zi1Var4.f39394u0.invalidate();
                ValueAnimator k10 = zi1Var4.k(true);
                zi1Var4.H.setAlpha(0.0f);
                zi1Var4.I.setAlpha(0.0f);
                zi1Var4.N.setAlpha(0.0f);
                zi1Var4.X.setAlpha(0.0f);
                zi1Var4.f39378j0.setAlpha(0.0f);
                zi1Var4.f39374h0.setAlpha(0.0f);
                zi1Var4.f39376i0.setAlpha(0.0f);
                zi1Var4.K.setAlpha(0.0f);
                zi1Var4.M0.setAlpha(0.0f);
                zi1Var4.Y.f28450b0 = true;
                AndroidUtilities.runOnUIThread(new r91(19, zi1Var4, k10), 32L);
                return;
            case 12:
                zi1 zi1Var5 = this.f34121b;
                zi1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = zi1Var5.N0;
                if (d3Var != null && d3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (zi1Var5.f39402z0 && zi1Var5.f39399x0 && !zi1Var5.C0 && !z10) {
                    zi1Var5.K0 = System.currentTimeMillis();
                    zi1Var5.A(false);
                    zi1Var5.f39388q0 = zi1Var5.f39387p0;
                    zi1Var5.H();
                    return;
                }
                return;
            default:
                zi1 zi1Var6 = this.f34121b;
                if (zi1Var6.f39387p0 == 3) {
                    zi1Var6.f39400y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = zi1Var6.v;
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
