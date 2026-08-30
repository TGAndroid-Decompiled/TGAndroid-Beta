package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.r9;
public final class a1 extends AnimatorListenerAdapter {
    public final int f19508a;
    public final float f19509b;
    public final Object f19510c;

    public a1(Object obj, float f10, int i10) {
        this.f19508a = i10;
        this.f19510c = obj;
        this.f19509b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19508a) {
            case 0:
                d1 d1Var = (d1) this.f19510c;
                d1Var.Q = null;
                d1Var.f19573a = this.f19509b;
                d1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f19510c;
                v3Var.f20621i = this.f19509b;
                w3 w3Var = v3Var.f20617b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f19510c;
                n6Var.B = this.f19509b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                x7 x7Var = (x7) this.f19510c;
                float f10 = this.f19509b;
                x7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                r9 r9Var = (r9) this.f19510c;
                r9Var.f28420g = this.f19509b;
                r9Var.invalidateSelf();
                return;
            default:
                ah0 ah0Var = (ah0) this.f19510c;
                ah0Var.E.unlock();
                float f11 = this.f19509b;
                ah0Var.f23394b = f11;
                if (f11 <= 0.0f) {
                    ah0Var.D = -1;
                }
                ah0Var.c(true);
                ah0Var.f23396f = false;
                if (ah0Var.L != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    ah0Var.L.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19508a) {
            case 5:
                ah0 ah0Var = (ah0) this.f19510c;
                ah0Var.f23396f = true;
                ah0Var.f23395c = this.f19509b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
