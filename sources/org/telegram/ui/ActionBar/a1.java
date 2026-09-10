package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.y9;
public final class a1 extends AnimatorListenerAdapter {
    public final int f17533a;
    public final float f17534b;
    public final Object f17535c;

    public a1(Object obj, float f7, int i10) {
        this.f17533a = i10;
        this.f17535c = obj;
        this.f17534b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17533a) {
            case 0:
                d1 d1Var = (d1) this.f17535c;
                d1Var.T = null;
                d1Var.f17594a = this.f17534b;
                d1Var.invalidate();
                return;
            case 1:
                y3 y3Var = (y3) this.f17535c;
                y3Var.f18779i = this.f17534b;
                z3 z3Var = y3Var.f18775b;
                if (z3Var != null) {
                    z3Var.invalidate();
                    return;
                }
                return;
            case 2:
                p6 p6Var = (p6) this.f17535c;
                p6Var.E = this.f17534b;
                p6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                a8 a8Var = (a8) this.f17535c;
                float f7 = this.f17534b;
                a8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f17535c;
                y9Var.f29282g = this.f17534b;
                y9Var.invalidateSelf();
                return;
            default:
                eh0 eh0Var = (eh0) this.f17535c;
                eh0Var.H.unlock();
                float f10 = this.f17534b;
                eh0Var.f22703b = f10;
                if (f10 <= 0.0f) {
                    eh0Var.G = -1;
                }
                eh0Var.c(true);
                eh0Var.f22705f = false;
                if (eh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    eh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17533a) {
            case 5:
                eh0 eh0Var = (eh0) this.f17535c;
                eh0Var.f22705f = true;
                eh0Var.f22704c = this.f17534b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
