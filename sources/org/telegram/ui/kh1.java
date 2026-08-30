package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class kh1 implements Runnable {
    public final int f35730a;
    public final ai1 f35731b;

    public kh1(ai1 ai1Var, int i10) {
        this.f35730a = i10;
        this.f35731b = ai1Var;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f35730a) {
            case 0:
                this.f35731b.f32630r0.b();
                return;
            case 1:
                this.f35731b.f32630r0.b();
                return;
            case 2:
                this.f35731b.f32630r0.b();
                return;
            case 3:
                this.f35731b.f32630r0.b();
                return;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.f35731b.W;
                s1Var.W = false;
                s1Var.invalidate();
                return;
            case 5:
                ai1 ai1Var = this.f35731b;
                ai1Var.f32625n0 = ai1Var.m0;
                ai1Var.H();
                return;
            case 6:
                this.f35731b.B();
                return;
            case 7:
                int[] iArr = new int[2];
                ai1 ai1Var2 = this.f35731b;
                ai1Var2.f32602b0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ai1Var2.e.getLocationOnScreen(iArr);
                ai1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ai1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.h.getLocationOnScreen(iArr);
                ai1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ai1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.f32611f.getLocationOnScreen(iArr);
                ai1Var2.f32611f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ai1Var2.f32611f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.f32624n.getLocationOnScreen(iArr);
                ai1Var2.f32624n.setTranslationX((((ai1Var2.f32602b0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ai1Var2.f32624n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.f32624n.setAlpha(1.0f);
                ai1Var2.e.setAlpha(1.0f);
                ai1Var2.h.setAlpha(1.0f);
                ai1Var2.f32611f.setAlpha(1.0f);
                long j10 = 200;
                ai1Var2.f32624n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ai1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ai1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ai1Var2.f32611f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                return;
            case 8:
                this.f35731b.f32630r0.b();
                return;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ai1 ai1Var3 = this.f35731b;
                    ai1Var3.L0.setTranslationY(ai1Var3.K.getY() + AndroidUtilities.dp(36.0f));
                    ai1Var3.L0.v();
                    return;
                }
                return;
            case 10:
                this.f35731b.f32630r0.b();
                return;
            case 11:
                ai1 ai1Var4 = this.f35731b;
                ai1Var4.f32630r0.setAlpha(1.0f);
                ai1Var4.f32630r0.invalidate();
                ValueAnimator k10 = ai1Var4.k(true);
                ai1Var4.E.setAlpha(0.0f);
                ai1Var4.F.setAlpha(0.0f);
                ai1Var4.K.setAlpha(0.0f);
                ai1Var4.U.setAlpha(0.0f);
                ai1Var4.f32614g0.setAlpha(0.0f);
                ai1Var4.f32609e0.setAlpha(0.0f);
                ai1Var4.f32612f0.setAlpha(0.0f);
                ai1Var4.H.setAlpha(0.0f);
                ai1Var4.J0.setAlpha(0.0f);
                ai1Var4.V.V = true;
                AndroidUtilities.runOnUIThread(new kg1(4, ai1Var4, k10), 32L);
                return;
            case 12:
                ai1 ai1Var5 = this.f35731b;
                ai1Var5.O0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = ai1Var5.K0;
                if (d3Var != null && d3Var.S) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ai1Var5.f32637w0 && ai1Var5.f32634u0 && !ai1Var5.f32642z0 && !z4) {
                    ai1Var5.H0 = System.currentTimeMillis();
                    ai1Var5.A(false);
                    ai1Var5.f32625n0 = ai1Var5.m0;
                    ai1Var5.H();
                    return;
                }
                return;
            default:
                ai1 ai1Var6 = this.f35731b;
                if (ai1Var6.m0 == 3) {
                    ai1Var6.f32640y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = ai1Var6.v;
                    if (!c3Var.O) {
                        c3Var.O = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
