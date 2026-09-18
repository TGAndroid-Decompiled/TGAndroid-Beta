package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.y9;
public final class z0 extends AnimatorListenerAdapter {
    public final int f19926a;
    public final float f19927b;
    public final Object f19928c;

    public z0(Object obj, float f7, int i10) {
        this.f19926a = i10;
        this.f19928c = obj;
        this.f19927b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19926a) {
            case 0:
                c1 c1Var = (c1) this.f19928c;
                c1Var.T = null;
                c1Var.f18715a = this.f19927b;
                c1Var.invalidate();
                return;
            case 1:
                w3 w3Var = (w3) this.f19928c;
                w3Var.f19841i = this.f19927b;
                x3 x3Var = w3Var.f19837b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f19928c;
                o6Var.E = this.f19927b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f19928c;
                float f7 = this.f19927b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f19928c;
                y9Var.f30514g = this.f19927b;
                y9Var.invalidateSelf();
                return;
            default:
                fh0 fh0Var = (fh0) this.f19928c;
                fh0Var.H.unlock();
                float f10 = this.f19927b;
                fh0Var.f24162b = f10;
                if (f10 <= 0.0f) {
                    fh0Var.G = -1;
                }
                fh0Var.c(true);
                fh0Var.f24164f = false;
                if (fh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    fh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19926a) {
            case 5:
                fh0 fh0Var = (fh0) this.f19928c;
                fh0Var.f24164f = true;
                fh0Var.f24163c = this.f19927b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
