package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.x9;
public final class z0 extends AnimatorListenerAdapter {
    public final int f19973a;
    public final float f19974b;
    public final Object f19975c;

    public z0(Object obj, float f7, int i10) {
        this.f19973a = i10;
        this.f19975c = obj;
        this.f19974b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19973a) {
            case 0:
                c1 c1Var = (c1) this.f19975c;
                c1Var.T = null;
                c1Var.f18762a = this.f19974b;
                c1Var.invalidate();
                return;
            case 1:
                w3 w3Var = (w3) this.f19975c;
                w3Var.f19888i = this.f19974b;
                x3 x3Var = w3Var.f19884b;
                if (x3Var != null) {
                    x3Var.invalidate();
                    return;
                }
                return;
            case 2:
                p6 p6Var = (p6) this.f19975c;
                p6Var.E = this.f19974b;
                p6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                a8 a8Var = (a8) this.f19975c;
                float f7 = this.f19974b;
                a8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (j6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - a8Var.v) * (-0.3f));
                }
                a8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                x9 x9Var = (x9) this.f19975c;
                x9Var.f30288g = this.f19974b;
                x9Var.invalidateSelf();
                return;
            default:
                hh0 hh0Var = (hh0) this.f19975c;
                hh0Var.H.unlock();
                float f10 = this.f19974b;
                hh0Var.f24828b = f10;
                if (f10 <= 0.0f) {
                    hh0Var.G = -1;
                }
                hh0Var.c(true);
                hh0Var.f24830f = false;
                if (hh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    hh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19973a) {
            case 5:
                hh0 hh0Var = (hh0) this.f19975c;
                hh0Var.f24830f = true;
                hh0Var.f24829c = this.f19974b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
