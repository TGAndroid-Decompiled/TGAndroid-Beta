package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class mi1 implements Runnable {
    public final int f38020a;
    public final cj1 f38021b;

    public mi1(cj1 cj1Var, int i10) {
        this.f38020a = i10;
        this.f38021b = cj1Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38020a) {
            case 0:
                this.f38021b.f34714u0.b();
                return;
            case 1:
                this.f38021b.f34714u0.b();
                return;
            case 2:
                this.f38021b.f34714u0.b();
                return;
            case 3:
                this.f38021b.f34714u0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f38021b.Z;
                s1Var.f30123c0 = false;
                s1Var.invalidate();
                return;
            case 5:
                cj1 cj1Var = this.f38021b;
                cj1Var.f34708q0 = cj1Var.f34707p0;
                cj1Var.G();
                return;
            case 6:
                this.f38021b.A();
                return;
            case 7:
                int[] iArr = new int[2];
                cj1 cj1Var2 = this.f38021b;
                cj1Var2.f34687e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                cj1Var2.e.getLocationOnScreen(iArr);
                cj1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                cj1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                cj1Var2.h.getLocationOnScreen(iArr);
                cj1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                cj1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                cj1Var2.f34689f.getLocationOnScreen(iArr);
                cj1Var2.f34689f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                cj1Var2.f34689f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                cj1Var2.f34704n.getLocationOnScreen(iArr);
                cj1Var2.f34704n.setTranslationX((((cj1Var2.f34687e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                cj1Var2.f34704n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                cj1Var2.f34704n.setAlpha(1.0f);
                cj1Var2.e.setAlpha(1.0f);
                cj1Var2.h.setAlpha(1.0f);
                cj1Var2.f34689f.setAlpha(1.0f);
                long j10 = 200;
                cj1Var2.f34704n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                cj1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                cj1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                cj1Var2.f34689f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f38021b.f34714u0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    cj1 cj1Var3 = this.f38021b;
                    cj1Var3.O0.setTranslationY(cj1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    cj1Var3.O0.u();
                    return;
                }
                return;
            case 10:
                this.f38021b.f34714u0.b();
                return;
            case 11:
                cj1 cj1Var4 = this.f38021b;
                cj1Var4.f34714u0.setAlpha(1.0f);
                cj1Var4.f34714u0.invalidate();
                ValueAnimator j11 = cj1Var4.j(true);
                cj1Var4.H.setAlpha(0.0f);
                cj1Var4.I.setAlpha(0.0f);
                cj1Var4.N.setAlpha(0.0f);
                cj1Var4.X.setAlpha(0.0f);
                cj1Var4.f34698j0.setAlpha(0.0f);
                cj1Var4.f34694h0.setAlpha(0.0f);
                cj1Var4.f34696i0.setAlpha(0.0f);
                cj1Var4.K.setAlpha(0.0f);
                cj1Var4.M0.setAlpha(0.0f);
                cj1Var4.Y.f30121b0 = true;
                AndroidUtilities.runOnUIThread(new wg1(6, cj1Var4, j11), 32L);
                return;
            case 12:
                cj1 cj1Var5 = this.f38021b;
                cj1Var5.R0 = false;
                org.telegram.ui.Components.voip.c3 c3Var = cj1Var5.N0;
                if (c3Var != null && c3Var.V) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (cj1Var5.f34722z0 && cj1Var5.f34719x0 && !cj1Var5.C0 && !z10) {
                    cj1Var5.K0 = System.currentTimeMillis();
                    cj1Var5.z(false);
                    cj1Var5.f34708q0 = cj1Var5.f34707p0;
                    cj1Var5.G();
                    return;
                }
                return;
            default:
                cj1 cj1Var6 = this.f38021b;
                if (cj1Var6.f34707p0 == 3) {
                    cj1Var6.f34720y.b(true, false);
                    org.telegram.ui.Components.voip.b3 b3Var = cj1Var6.v;
                    if (!b3Var.R) {
                        b3Var.R = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
