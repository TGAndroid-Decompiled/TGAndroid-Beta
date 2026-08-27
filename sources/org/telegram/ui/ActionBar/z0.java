package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.p9;

public final class z0 extends AnimatorListenerAdapter {

    public final int f23988a;

    public final float f23989b;

    public final Object f23990c;

    public z0(Object obj, float f10, int i10) {
        this.f23988a = i10;
        this.f23990c = obj;
        this.f23989b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23988a) {
            case 0:
                c1 c1Var = (c1) this.f23990c;
                c1Var.P = null;
                c1Var.f22794a = this.f23989b;
                c1Var.invalidate();
                break;
            case 1:
                u3 u3Var = (u3) this.f23990c;
                u3Var.f23833i = this.f23989b;
                v3 v3Var = u3Var.f23828b;
                if (v3Var != null) {
                    v3Var.invalidate();
                }
                break;
            case 2:
                k6 k6Var = (k6) this.f23990c;
                k6Var.A = this.f23989b;
                k6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                u7 u7Var = (u7) this.f23990c;
                float f10 = this.f23989b;
                u7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - u7Var.v) * (-0.3f));
                }
                u7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                p9 p9Var = (p9) this.f23990c;
                p9Var.f31569g = this.f23989b;
                p9Var.invalidateSelf();
                break;
            default:
                hg0 hg0Var = (hg0) this.f23990c;
                hg0Var.D.unlock();
                float f11 = this.f23989b;
                hg0Var.f29007b = f11;
                if (f11 <= 0.0f) {
                    hg0Var.C = -1;
                }
                hg0Var.c(true);
                hg0Var.f29010f = false;
                if (hg0Var.K != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    hg0Var.K.run();
                    break;
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f23988a) {
            case 5:
                hg0 hg0Var = (hg0) this.f23990c;
                hg0Var.f29010f = true;
                hg0Var.f29008c = this.f23989b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
