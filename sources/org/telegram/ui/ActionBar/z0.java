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
public final class z0 extends AnimatorListenerAdapter {
    public final int f21723a;
    public final float f21724b;
    public final Object f21725c;

    public z0(Object obj, float f7, int i10) {
        this.f21723a = i10;
        this.f21725c = obj;
        this.f21724b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21723a) {
            case 0:
                c1 c1Var = (c1) this.f21725c;
                c1Var.T = null;
                c1Var.f20480a = this.f21724b;
                c1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f21725c;
                v3Var.f21609i = this.f21724b;
                w3 w3Var = v3Var.f21604b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21725c;
                o6Var.E = this.f21724b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21725c;
                float f7 = this.f21724b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f21725c;
                y9Var.f33117g = this.f21724b;
                y9Var.invalidateSelf();
                return;
            default:
                hh0 hh0Var = (hh0) this.f21725c;
                hh0Var.H.unlock();
                float f10 = this.f21724b;
                hh0Var.f27132b = f10;
                if (f10 <= 0.0f) {
                    hh0Var.G = -1;
                }
                hh0Var.c(true);
                hh0Var.f27135f = false;
                if (hh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    hh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21723a) {
            case 5:
                hh0 hh0Var = (hh0) this.f21725c;
                hh0Var.f27135f = true;
                hh0Var.f27133c = this.f21724b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
