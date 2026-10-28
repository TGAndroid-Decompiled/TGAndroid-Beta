package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ah1 implements Runnable {
    public final int f37782a;
    public final rh1 f37783b;

    public ah1(rh1 rh1Var, int i10) {
        this.f37782a = i10;
        this.f37783b = rh1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37782a) {
            case 0:
                this.f37783b.f43038u0.b();
                return;
            case 1:
                this.f37783b.f43038u0.b();
                return;
            case 2:
                this.f37783b.f43038u0.b();
                return;
            case 3:
                this.f37783b.f43038u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.v1 v1Var = this.f37783b.Z;
                v1Var.f34260c0 = false;
                v1Var.invalidate();
                return;
            case 5:
                rh1 rh1Var = this.f37783b;
                rh1Var.f43032q0 = rh1Var.f43031p0;
                rh1Var.G();
                return;
            case 6:
                this.f37783b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                rh1 rh1Var2 = this.f37783b;
                rh1Var2.f43011e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                rh1Var2.e.getLocationOnScreen(iArr);
                rh1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                rh1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                rh1Var2.h.getLocationOnScreen(iArr);
                rh1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                rh1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                rh1Var2.f43013f.getLocationOnScreen(iArr);
                rh1Var2.f43013f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                rh1Var2.f43013f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                rh1Var2.f43028n.getLocationOnScreen(iArr);
                rh1Var2.f43028n.setTranslationX((((rh1Var2.f43011e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                rh1Var2.f43028n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                rh1Var2.f43028n.setAlpha(1.0f);
                rh1Var2.e.setAlpha(1.0f);
                rh1Var2.h.setAlpha(1.0f);
                rh1Var2.f43013f.setAlpha(1.0f);
                long j10 = 200;
                rh1Var2.f43028n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                rh1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                rh1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                rh1Var2.f43013f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f37783b.f43038u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    rh1 rh1Var3 = this.f37783b;
                    rh1Var3.O0.setTranslationY(rh1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    rh1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f37783b.f43038u0.b();
                return;
            case 11:
                rh1 rh1Var4 = this.f37783b;
                rh1Var4.f43038u0.setAlpha(1.0f);
                rh1Var4.f43038u0.invalidate();
                ValueAnimator j11 = rh1Var4.j(true);
                rh1Var4.H.setAlpha(0.0f);
                rh1Var4.I.setAlpha(0.0f);
                rh1Var4.N.setAlpha(0.0f);
                rh1Var4.X.setAlpha(0.0f);
                rh1Var4.f43022j0.setAlpha(0.0f);
                rh1Var4.f43018h0.setAlpha(0.0f);
                rh1Var4.f43020i0.setAlpha(0.0f);
                rh1Var4.K.setAlpha(0.0f);
                rh1Var4.M0.setAlpha(0.0f);
                rh1Var4.Y.f34258b0 = true;
                AndroidUtilities.runOnUIThread(new yc1(13, rh1Var4, j11), 32L);
                return;
            case 12:
                rh1 rh1Var5 = this.f37783b;
                rh1Var5.R0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = rh1Var5.N0;
                if (e3Var != null && e3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rh1Var5.f43046z0 && rh1Var5.f43043x0 && !rh1Var5.C0 && !z10) {
                    rh1Var5.K0 = System.currentTimeMillis();
                    rh1Var5.z(false);
                    rh1Var5.f43032q0 = rh1Var5.f43031p0;
                    rh1Var5.G();
                    return;
                }
                return;
            default:
                rh1 rh1Var6 = this.f37783b;
                if (rh1Var6.f43031p0 == 3) {
                    rh1Var6.f43044y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = rh1Var6.v;
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
