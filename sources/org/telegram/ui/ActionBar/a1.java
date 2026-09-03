package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.r9;
public final class a1 extends AnimatorListenerAdapter {
    public final int f19483a;
    public final float f19484b;
    public final Object f19485c;

    public a1(Object obj, float f10, int i10) {
        this.f19483a = i10;
        this.f19485c = obj;
        this.f19484b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19483a) {
            case 0:
                d1 d1Var = (d1) this.f19485c;
                d1Var.Q = null;
                d1Var.f19548a = this.f19484b;
                d1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f19485c;
                v3Var.f20596i = this.f19484b;
                w3 w3Var = v3Var.f20592b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                m6 m6Var = (m6) this.f19485c;
                m6Var.B = this.f19484b;
                m6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                w7 w7Var = (w7) this.f19485c;
                float f10 = this.f19484b;
                w7Var.v = f10;
                colorMatrix.setSaturation(f10);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - w7Var.v) * (-0.3f));
                }
                w7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                r9 r9Var = (r9) this.f19485c;
                r9Var.f28431g = this.f19484b;
                r9Var.invalidateSelf();
                return;
            default:
                bh0 bh0Var = (bh0) this.f19485c;
                bh0Var.E.unlock();
                float f11 = this.f19484b;
                bh0Var.f23683b = f11;
                if (f11 <= 0.0f) {
                    bh0Var.D = -1;
                }
                bh0Var.c(true);
                bh0Var.f23685f = false;
                if (bh0Var.L != null && Math.abs(f11 - 1.0f) < 0.01f) {
                    bh0Var.L.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19483a) {
            case 5:
                bh0 bh0Var = (bh0) this.f19485c;
                bh0Var.f23685f = true;
                bh0Var.f23684c = this.f19484b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
