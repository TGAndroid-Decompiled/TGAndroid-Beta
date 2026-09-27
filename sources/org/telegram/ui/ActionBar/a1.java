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
public final class a1 extends AnimatorListenerAdapter {
    public final int f18663a;
    public final float f18664b;
    public final Object f18665c;

    public a1(Object obj, float f7, int i10) {
        this.f18663a = i10;
        this.f18665c = obj;
        this.f18664b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18663a) {
            case 0:
                d1 d1Var = (d1) this.f18665c;
                d1Var.T = null;
                d1Var.f18782a = this.f18664b;
                d1Var.invalidate();
                return;
            case 1:
                w3 w3Var = (w3) this.f18665c;
                w3Var.f19875i = this.f18664b;
                x3 x3Var = w3Var.f19871b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f18665c;
                o6Var.E = this.f18664b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f18665c;
                float f7 = this.f18664b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f18665c;
                y9Var.f30633g = this.f18664b;
                y9Var.invalidateSelf();
                return;
            default:
                hh0 hh0Var = (hh0) this.f18665c;
                hh0Var.H.unlock();
                float f10 = this.f18664b;
                hh0Var.f24840b = f10;
                if (f10 <= 0.0f) {
                    hh0Var.G = -1;
                }
                hh0Var.c(true);
                hh0Var.f24842f = false;
                if (hh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    hh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18663a) {
            case 5:
                hh0 hh0Var = (hh0) this.f18665c;
                hh0Var.f24842f = true;
                hh0Var.f24841c = this.f18664b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
