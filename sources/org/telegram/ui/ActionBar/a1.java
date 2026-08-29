package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.l6;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.qg0;
import org.telegram.ui.Components.v9;
public final class a1 extends AnimatorListenerAdapter {
    public final int f22723a;
    public final float f22724b;
    public final Object f22725c;

    public a1(Object obj, float f9, int i10) {
        this.f22723a = i10;
        this.f22725c = obj;
        this.f22724b = f9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22723a) {
            case 0:
                d1 d1Var = (d1) this.f22725c;
                d1Var.P = null;
                d1Var.f22835a = this.f22724b;
                d1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f22725c;
                u3Var.f23840i = this.f22724b;
                v3 v3Var = u3Var.f23835b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                l6 l6Var = (l6) this.f22725c;
                l6Var.A = this.f22724b;
                l6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                v7 v7Var = (v7) this.f22725c;
                float f9 = this.f22724b;
                v7Var.v = f9;
                colorMatrix.setSaturation(f9);
                if (g6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - v7Var.v) * (-0.3f));
                }
                v7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                v9 v9Var = (v9) this.f22725c;
                v9Var.f33501g = this.f22724b;
                v9Var.invalidateSelf();
                return;
            default:
                qg0 qg0Var = (qg0) this.f22725c;
                qg0Var.D.unlock();
                float f10 = this.f22724b;
                qg0Var.f31942b = f10;
                if (f10 <= 0.0f) {
                    qg0Var.C = -1;
                }
                qg0Var.c(true);
                qg0Var.f31945f = false;
                if (qg0Var.K != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    qg0Var.K.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f22723a) {
            case 5:
                qg0 qg0Var = (qg0) this.f22725c;
                qg0Var.f31945f = true;
                qg0Var.f31943c = this.f22724b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
