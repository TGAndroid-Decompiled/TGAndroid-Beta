package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.r9;
public final class a1 extends AnimatorListenerAdapter {
    public final int f21173a;
    public final float f21174b;
    public final Object f21175c;

    public a1(Object obj, float f10, int i10) {
        this.f21173a = i10;
        this.f21175c = obj;
        this.f21174b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21173a) {
            case 0:
                d1 d1Var = (d1) this.f21175c;
                d1Var.Q = null;
                d1Var.f21225a = this.f21174b;
                d1Var.invalidate();
                return;
            case 1:
                w3 w3Var = (w3) this.f21175c;
                w3Var.f22382i = this.f21174b;
                x3 x3Var = w3Var.f22377b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f21175c;
                n6Var.B = this.f21174b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                x7 x7Var = (x7) this.f21175c;
                float f10 = this.f21174b;
                x7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (k6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                r9 r9Var = (r9) this.f21175c;
                r9Var.f30698g = this.f21174b;
                r9Var.invalidateSelf();
                return;
            default:
                ch0 ch0Var = (ch0) this.f21175c;
                ch0Var.E.unlock();
                float f11 = this.f21174b;
                ch0Var.f25941b = f11;
                if (f11 <= 0.0f) {
                    ch0Var.D = -1;
                }
                ch0Var.c(true);
                ch0Var.f25944f = false;
                if (ch0Var.L != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    ch0Var.L.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21173a) {
            case 5:
                ch0 ch0Var = (ch0) this.f21175c;
                ch0Var.f25944f = true;
                ch0Var.f25942c = this.f21174b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
