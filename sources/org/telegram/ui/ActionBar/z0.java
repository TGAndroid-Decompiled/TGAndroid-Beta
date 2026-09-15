package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.w9;
public final class z0 extends AnimatorListenerAdapter {
    public final int f19739a;
    public final float f19740b;
    public final Object f19741c;

    public z0(Object obj, float f7, int i10) {
        this.f19739a = i10;
        this.f19741c = obj;
        this.f19740b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19739a) {
            case 0:
                c1 c1Var = (c1) this.f19741c;
                c1Var.T = null;
                c1Var.f18530a = this.f19740b;
                c1Var.invalidate();
                return;
            case 1:
                w3 w3Var = (w3) this.f19741c;
                w3Var.f19654i = this.f19740b;
                x3 x3Var = w3Var.f19650b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f19741c;
                n6Var.E = this.f19740b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f19741c;
                float f7 = this.f19740b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                w9 w9Var = (w9) this.f19741c;
                w9Var.f29675g = this.f19740b;
                w9Var.invalidateSelf();
                return;
            default:
                ug0 ug0Var = (ug0) this.f19741c;
                ug0Var.H.unlock();
                float f10 = this.f19740b;
                ug0Var.f28398b = f10;
                if (f10 <= 0.0f) {
                    ug0Var.G = -1;
                }
                ug0Var.c(true);
                ug0Var.f28400f = false;
                if (ug0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ug0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19739a) {
            case 5:
                ug0 ug0Var = (ug0) this.f19741c;
                ug0Var.f28400f = true;
                ug0Var.f28399c = this.f19740b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
