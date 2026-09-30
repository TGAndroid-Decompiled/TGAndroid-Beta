package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.y9;
public final class y0 extends AnimatorListenerAdapter {
    public final int f19933a;
    public final float f19934b;
    public final Object f19935c;

    public y0(Object obj, float f7, int i10) {
        this.f19933a = i10;
        this.f19935c = obj;
        this.f19934b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19933a) {
            case 0:
                b1 b1Var = (b1) this.f19935c;
                b1Var.T = null;
                b1Var.f18740a = this.f19934b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f19935c;
                u3Var.f19827i = this.f19934b;
                v3 v3Var = u3Var.f19823b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f19935c;
                o6Var.E = this.f19934b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f19935c;
                float f7 = this.f19934b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f19935c;
                y9Var.f30626g = this.f19934b;
                y9Var.invalidateSelf();
                return;
            default:
                hh0 hh0Var = (hh0) this.f19935c;
                hh0Var.H.unlock();
                float f10 = this.f19934b;
                hh0Var.f24809b = f10;
                if (f10 <= 0.0f) {
                    hh0Var.G = -1;
                }
                hh0Var.c(true);
                hh0Var.f24811f = false;
                if (hh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    hh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19933a) {
            case 5:
                hh0 hh0Var = (hh0) this.f19935c;
                hh0Var.f24811f = true;
                hh0Var.f24810c = this.f19934b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
