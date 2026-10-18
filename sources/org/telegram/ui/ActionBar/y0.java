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
    public final int f21892a;
    public final float f21893b;
    public final Object f21894c;

    public y0(Object obj, float f7, int i10) {
        this.f21892a = i10;
        this.f21894c = obj;
        this.f21893b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21892a) {
            case 0:
                b1 b1Var = (b1) this.f21894c;
                b1Var.T = null;
                b1Var.f20634a = this.f21893b;
                b1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f21894c;
                v3Var.f21787i = this.f21893b;
                w3 w3Var = v3Var.f21783b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f21894c;
                n6Var.F = this.f21893b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                y7 y7Var = (y7) this.f21894c;
                float f7 = this.f21893b;
                y7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - y7Var.v) * (-0.3f));
                }
                y7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f21894c;
                y9Var.f32578g = this.f21893b;
                y9Var.invalidateSelf();
                return;
            case 5:
                ph0 ph0Var = (ph0) this.f21894c;
                ph0Var.H.unlock();
                float f10 = this.f21893b;
                ph0Var.f29303b = f10;
                if (f10 <= 0.0f) {
                    ph0Var.G = -1;
                }
                ph0Var.c(true);
                ph0Var.f29305f = false;
                if (ph0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ph0Var.O.run();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.f21894c;
                z2Var.f35169r.getClass();
                z2Var.f35169r.setLayerType(0, null);
                if (this.f21893b == 0.0f) {
                    z2Var.b();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.f21894c;
                if (n5Var.f34591l0 == animator) {
                    n5Var.f34591l0 = null;
                    n5Var.G0(this.f21893b);
                    n5Var.f34594o0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21892a) {
            case 5:
                ph0 ph0Var = (ph0) this.f21894c;
                ph0Var.f29305f = true;
                ph0Var.f29304c = this.f21893b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
