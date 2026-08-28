package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.q9;
public final class a1 extends AnimatorListenerAdapter {
    public final int f22707a;
    public final float f22708b;
    public final Object f22709c;

    public a1(Object obj, float f10, int i9) {
        this.f22707a = i9;
        this.f22709c = obj;
        this.f22708b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22707a) {
            case 0:
                d1 d1Var = (d1) this.f22709c;
                d1Var.P = null;
                d1Var.f22818a = this.f22708b;
                d1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f22709c;
                u3Var.f23822i = this.f22708b;
                v3 v3Var = u3Var.f23817b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                n6 n6Var = (n6) this.f22709c;
                n6Var.A = this.f22708b;
                n6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                x7 x7Var = (x7) this.f22709c;
                float f10 = this.f22708b;
                x7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (f6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - x7Var.v) * (-0.3f));
                }
                x7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                q9 q9Var = (q9) this.f22709c;
                q9Var.f31870g = this.f22708b;
                q9Var.invalidateSelf();
                return;
            default:
                fg0 fg0Var = (fg0) this.f22709c;
                fg0Var.D.unlock();
                float f11 = this.f22708b;
                fg0Var.f28417b = f11;
                if (f11 <= 0.0f) {
                    fg0Var.C = -1;
                }
                fg0Var.c(true);
                fg0Var.f28420f = false;
                if (fg0Var.K != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    fg0Var.K.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22707a) {
            case 5:
                fg0 fg0Var = (fg0) this.f22709c;
                fg0Var.f28420f = true;
                fg0Var.f28418c = this.f22708b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
