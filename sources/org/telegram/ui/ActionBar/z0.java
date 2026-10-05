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
    public final int f21732a;
    public final float f21733b;
    public final Object f21734c;

    public z0(Object obj, float f7, int i10) {
        this.f21732a = i10;
        this.f21734c = obj;
        this.f21733b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21732a) {
            case 0:
                c1 c1Var = (c1) this.f21734c;
                c1Var.T = null;
                c1Var.f20490a = this.f21733b;
                c1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f21734c;
                v3Var.f21618i = this.f21733b;
                w3 w3Var = v3Var.f21613b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21734c;
                o6Var.E = this.f21733b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21734c;
                float f7 = this.f21733b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f21734c;
                y9Var.f33244g = this.f21733b;
                y9Var.invalidateSelf();
                return;
            default:
                hh0 hh0Var = (hh0) this.f21734c;
                hh0Var.H.unlock();
                float f10 = this.f21733b;
                hh0Var.f27230b = f10;
                if (f10 <= 0.0f) {
                    hh0Var.G = -1;
                }
                hh0Var.c(true);
                hh0Var.f27233f = false;
                if (hh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    hh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21732a) {
            case 5:
                hh0 hh0Var = (hh0) this.f21734c;
                hh0Var.f27233f = true;
                hh0Var.f27231c = this.f21733b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
