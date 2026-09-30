package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.y9;
public final class y0 extends AnimatorListenerAdapter {
    public final int f19948a;
    public final float f19949b;
    public final Object f19950c;

    public y0(Object obj, float f7, int i10) {
        this.f19948a = i10;
        this.f19950c = obj;
        this.f19949b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19948a) {
            case 0:
                b1 b1Var = (b1) this.f19950c;
                b1Var.T = null;
                b1Var.f18755a = this.f19949b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f19950c;
                u3Var.f19842i = this.f19949b;
                v3 v3Var = u3Var.f19838b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f19950c;
                o6Var.E = this.f19949b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f19950c;
                float f7 = this.f19949b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f19950c;
                y9Var.f30683g = this.f19949b;
                y9Var.invalidateSelf();
                return;
            default:
                ih0 ih0Var = (ih0) this.f19950c;
                ih0Var.H.unlock();
                float f10 = this.f19949b;
                ih0Var.f25125b = f10;
                if (f10 <= 0.0f) {
                    ih0Var.G = -1;
                }
                ih0Var.c(true);
                ih0Var.f25127f = false;
                if (ih0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    ih0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19948a) {
            case 5:
                ih0 ih0Var = (ih0) this.f19950c;
                ih0Var.f25127f = true;
                ih0Var.f25126c = this.f19949b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
