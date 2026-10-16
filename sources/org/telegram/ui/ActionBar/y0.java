package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.vh0;
public final class y0 extends AnimatorListenerAdapter {
    public final int f20520a;
    public final float f20521b;
    public final Object f20522c;

    public y0(Object obj, float f7, int i10) {
        this.f20520a = i10;
        this.f20522c = obj;
        this.f20521b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20520a) {
            case 0:
                b1 b1Var = (b1) this.f20522c;
                b1Var.T = null;
                b1Var.f19324a = this.f20521b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f20522c;
                u3Var.f20412i = this.f20521b;
                v3 v3Var = u3Var.f20408b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f20522c;
                o6Var.F = this.f20521b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f20522c;
                float f7 = this.f20521b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                ba baVar = (ba) this.f20522c;
                baVar.f23425g = this.f20521b;
                baVar.invalidateSelf();
                return;
            case 5:
                vh0 vh0Var = (vh0) this.f20522c;
                vh0Var.H.unlock();
                float f10 = this.f20521b;
                vh0Var.f29646b = f10;
                if (f10 <= 0.0f) {
                    vh0Var.G = -1;
                }
                vh0Var.c(true);
                vh0Var.f29648f = false;
                if (vh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    vh0Var.O.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f20522c;
                if (a5Var.f32647k0 == animator) {
                    a5Var.f32647k0 = null;
                    a5Var.x0(this.f20521b);
                    a5Var.f32650n0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20520a) {
            case 5:
                vh0 vh0Var = (vh0) this.f20522c;
                vh0Var.f29648f = true;
                vh0Var.f29647c = this.f20521b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
