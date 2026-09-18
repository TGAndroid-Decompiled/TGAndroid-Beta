package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.w9;
public final class a1 extends AnimatorListenerAdapter {
    public final int f18455a;
    public final float f18456b;
    public final Object f18457c;

    public a1(Object obj, float f7, int i10) {
        this.f18455a = i10;
        this.f18457c = obj;
        this.f18456b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18455a) {
            case 0:
                d1 d1Var = (d1) this.f18457c;
                d1Var.T = null;
                d1Var.f18557a = this.f18456b;
                d1Var.invalidate();
                return;
            case 1:
                x3 x3Var = (x3) this.f18457c;
                x3Var.f19682i = this.f18456b;
                y3 y3Var = x3Var.f19678b;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f18457c;
                n6Var.E = this.f18456b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f18457c;
                float f7 = this.f18456b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                w9 w9Var = (w9) this.f18457c;
                w9Var.f29619g = this.f18456b;
                w9Var.invalidateSelf();
                return;
            default:
                vg0 vg0Var = (vg0) this.f18457c;
                vg0Var.H.unlock();
                float f10 = this.f18456b;
                vg0Var.f28715b = f10;
                if (f10 <= 0.0f) {
                    vg0Var.G = -1;
                }
                vg0Var.c(true);
                vg0Var.f28717f = false;
                if (vg0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    vg0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18455a) {
            case 5:
                vg0 vg0Var = (vg0) this.f18457c;
                vg0Var.f28717f = true;
                vg0Var.f28716c = this.f18456b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
