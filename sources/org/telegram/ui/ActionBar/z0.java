package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.y9;
public final class z0 extends AnimatorListenerAdapter {
    public final int f19704a;
    public final float f19705b;
    public final Object f19706c;

    public z0(Object obj, float f7, int i10) {
        this.f19704a = i10;
        this.f19706c = obj;
        this.f19705b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19704a) {
            case 0:
                c1 c1Var = (c1) this.f19706c;
                c1Var.T = null;
                c1Var.f18515a = this.f19705b;
                c1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f19706c;
                v3Var.f19598i = this.f19705b;
                w3 w3Var = v3Var.f19594b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f19706c;
                o6Var.E = this.f19705b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                a8 a8Var = (a8) this.f19706c;
                float f7 = this.f19705b;
                a8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f19706c;
                y9Var.f30184g = this.f19705b;
                y9Var.invalidateSelf();
                return;
            default:
                vg0 vg0Var = (vg0) this.f19706c;
                vg0Var.H.unlock();
                float f10 = this.f19705b;
                vg0Var.f28740b = f10;
                if (f10 <= 0.0f) {
                    vg0Var.G = -1;
                }
                vg0Var.c(true);
                vg0Var.f28742f = false;
                if (vg0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    vg0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19704a) {
            case 5:
                vg0 vg0Var = (vg0) this.f19706c;
                vg0Var.f28742f = true;
                vg0Var.f28741c = this.f19705b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
