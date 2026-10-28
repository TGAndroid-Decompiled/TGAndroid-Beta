package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.th0;
public final class a1 extends AnimatorListenerAdapter {
    public final int f22375a;
    public final float f22376b;
    public final Object f22377c;

    public a1(Object obj, float f7, int i10) {
        this.f22375a = i10;
        this.f22377c = obj;
        this.f22376b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f22375a;
        float f7 = this.f22376b;
        Object obj = this.f22377c;
        switch (i10) {
            case 0:
                d1 d1Var = (d1) obj;
                d1Var.T = null;
                d1Var.f22523a = f7;
                d1Var.invalidate();
                return;
            case 1:
                a4 a4Var = (a4) obj;
                a4Var.f22388i = f7;
                b4 b4Var = a4Var.f22384b;
                if (b4Var != null) {
                    b4Var.invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) obj;
                s6Var.F = f7;
                s6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                c8 c8Var = (c8) obj;
                c8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (y6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - c8Var.v) * (-0.3f));
                }
                c8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                ba baVar = (ba) obj;
                baVar.f26772g = f7;
                baVar.invalidateSelf();
                return;
            case 5:
                md mdVar = (md) obj;
                mdVar.e = null;
                if (f7 == 0.0f) {
                    Runnable runnable = mdVar.h;
                    mdVar.h = null;
                    md.a(mdVar);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                th0 th0Var = (th0) obj;
                th0Var.H.unlock();
                th0Var.f32964b = f7;
                if (f7 <= 0.0f) {
                    th0Var.G = -1;
                }
                th0Var.c(true);
                th0Var.f32966f = false;
                if (th0Var.O != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    th0Var.O.run();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj;
                org.telegram.ui.Wallet.w5 w5Var = y2Var.f37525r;
                w5Var.getClass();
                w5Var.setLayerType(0, null);
                if (f7 == 0.0f) {
                    y2Var.b();
                    return;
                } else if (!y2Var.R) {
                    ValueAnimator valueAnimator = y2Var.P;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(y2Var.Q, 1.0f);
                    y2Var.P = ofFloat;
                    ofFloat.setDuration(320L);
                    y2Var.P.setInterpolator(ds.f27531g);
                    y2Var.P.addUpdateListener(new org.telegram.ui.Wallet.v2(y2Var, 1));
                    y2Var.P.start();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                if (m5Var.m0 == animator) {
                    m5Var.m0 = null;
                    m5Var.I0(f7);
                    m5Var.f36957p0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22375a) {
            case 6:
                th0 th0Var = (th0) this.f22377c;
                th0Var.f32966f = true;
                th0Var.f32965c = this.f22376b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
