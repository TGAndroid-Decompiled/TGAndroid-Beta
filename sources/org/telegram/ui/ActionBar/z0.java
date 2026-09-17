package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.z9;
public final class z0 extends AnimatorListenerAdapter {
    public final int f21578a;
    public final float f21579b;
    public final Object f21580c;

    public z0(Object obj, float f7, int i10) {
        this.f21578a = i10;
        this.f21580c = obj;
        this.f21579b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21578a) {
            case 0:
                c1 c1Var = (c1) this.f21580c;
                c1Var.T = null;
                c1Var.f20325a = this.f21579b;
                c1Var.invalidate();
                return;
            case 1:
                w3 w3Var = (w3) this.f21580c;
                w3Var.f21487i = this.f21579b;
                x3 x3Var = w3Var.f21482b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f21580c;
                n6Var.E = this.f21579b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21580c;
                float f7 = this.f21579b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                z9 z9Var = (z9) this.f21580c;
                z9Var.f33134g = this.f21579b;
                z9Var.invalidateSelf();
                return;
            default:
                ug0 ug0Var = (ug0) this.f21580c;
                ug0Var.H.unlock();
                float f10 = this.f21579b;
                ug0Var.f30916b = f10;
                if (f10 <= 0.0f) {
                    ug0Var.G = -1;
                }
                ug0Var.c(true);
                ug0Var.f30919f = false;
                if (ug0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ug0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21578a) {
            case 5:
                ug0 ug0Var = (ug0) this.f21580c;
                ug0Var.f30919f = true;
                ug0Var.f30917c = this.f21579b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
