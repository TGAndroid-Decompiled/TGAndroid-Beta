package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.y9;
public final class y0 extends AnimatorListenerAdapter {
    public final int f19932a;
    public final float f19933b;
    public final Object f19934c;

    public y0(Object obj, float f7, int i10) {
        this.f19932a = i10;
        this.f19934c = obj;
        this.f19933b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19932a) {
            case 0:
                b1 b1Var = (b1) this.f19934c;
                b1Var.T = null;
                b1Var.f18739a = this.f19933b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f19934c;
                u3Var.f19826i = this.f19933b;
                v3 v3Var = u3Var.f19822b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f19934c;
                o6Var.E = this.f19933b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f19934c;
                float f7 = this.f19933b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f19934c;
                y9Var.f30573g = this.f19933b;
                y9Var.invalidateSelf();
                return;
            default:
                fh0 fh0Var = (fh0) this.f19934c;
                fh0Var.H.unlock();
                float f10 = this.f19933b;
                fh0Var.f24188b = f10;
                if (f10 <= 0.0f) {
                    fh0Var.G = -1;
                }
                fh0Var.c(true);
                fh0Var.f24190f = false;
                if (fh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    fh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19932a) {
            case 5:
                fh0 fh0Var = (fh0) this.f19934c;
                fh0Var.f24190f = true;
                fh0Var.f24189c = this.f19933b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
