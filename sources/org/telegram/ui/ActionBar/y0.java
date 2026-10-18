package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.y9;
public final class y0 extends AnimatorListenerAdapter {
    public final int f21899a;
    public final float f21900b;
    public final Object f21901c;

    public y0(Object obj, float f7, int i10) {
        this.f21899a = i10;
        this.f21901c = obj;
        this.f21900b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21899a) {
            case 0:
                b1 b1Var = (b1) this.f21901c;
                b1Var.T = null;
                b1Var.f20641a = this.f21900b;
                b1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f21901c;
                v3Var.f21794i = this.f21900b;
                w3 w3Var = v3Var.f21790b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f21901c;
                n6Var.F = this.f21900b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                y7 y7Var = (y7) this.f21901c;
                float f7 = this.f21900b;
                y7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f21901c;
                y9Var.f32585g = this.f21900b;
                y9Var.invalidateSelf();
                return;
            case 5:
                ph0 ph0Var = (ph0) this.f21901c;
                ph0Var.H.unlock();
                float f10 = this.f21900b;
                ph0Var.f29310b = f10;
                if (f10 <= 0.0f) {
                    ph0Var.G = -1;
                }
                ph0Var.c(true);
                ph0Var.f29312f = false;
                if (ph0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ph0Var.O.run();
                    return;
                }
                return;
            case 6:
                if (this.f21900b == 0.0f) {
                    ((org.telegram.ui.Wallet.y2) this.f21901c).b();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.f21901c;
                if (m5Var.f34581n0 == animator) {
                    m5Var.f34581n0 = null;
                    m5Var.F0(this.f21900b);
                    m5Var.f34584q0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21899a) {
            case 5:
                ph0 ph0Var = (ph0) this.f21901c;
                ph0Var.f29312f = true;
                ph0Var.f29311c = this.f21900b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
