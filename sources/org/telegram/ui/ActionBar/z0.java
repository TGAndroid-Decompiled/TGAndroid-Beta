package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.x9;
public final class z0 extends AnimatorListenerAdapter {
    public final int f19958a;
    public final float f19959b;
    public final Object f19960c;

    public z0(Object obj, float f7, int i10) {
        this.f19958a = i10;
        this.f19960c = obj;
        this.f19959b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19958a) {
            case 0:
                c1 c1Var = (c1) this.f19960c;
                c1Var.T = null;
                c1Var.f18747a = this.f19959b;
                c1Var.invalidate();
                return;
            case 1:
                w3 w3Var = (w3) this.f19960c;
                w3Var.f19873i = this.f19959b;
                x3 x3Var = w3Var.f19869b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                p6 p6Var = (p6) this.f19960c;
                p6Var.E = this.f19959b;
                p6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                a8 a8Var = (a8) this.f19960c;
                float f7 = this.f19959b;
                a8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                x9 x9Var = (x9) this.f19960c;
                x9Var.f30206g = this.f19959b;
                x9Var.invalidateSelf();
                return;
            default:
                eh0 eh0Var = (eh0) this.f19960c;
                eh0Var.H.unlock();
                float f10 = this.f19959b;
                eh0Var.f23851b = f10;
                if (f10 <= 0.0f) {
                    eh0Var.G = -1;
                }
                eh0Var.c(true);
                eh0Var.f23853f = false;
                if (eh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    eh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19958a) {
            case 5:
                eh0 eh0Var = (eh0) this.f19960c;
                eh0Var.f23853f = true;
                eh0Var.f23852c = this.f19959b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
