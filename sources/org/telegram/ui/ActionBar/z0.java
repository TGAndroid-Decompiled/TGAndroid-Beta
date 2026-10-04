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
    public final int f21724a;
    public final float f21725b;
    public final Object f21726c;

    public z0(Object obj, float f7, int i10) {
        this.f21724a = i10;
        this.f21726c = obj;
        this.f21725b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21724a) {
            case 0:
                c1 c1Var = (c1) this.f21726c;
                c1Var.T = null;
                c1Var.f20481a = this.f21725b;
                c1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f21726c;
                v3Var.f21610i = this.f21725b;
                w3 w3Var = v3Var.f21605b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21726c;
                o6Var.E = this.f21725b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21726c;
                float f7 = this.f21725b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f21726c;
                y9Var.f33118g = this.f21725b;
                y9Var.invalidateSelf();
                return;
            default:
                hh0 hh0Var = (hh0) this.f21726c;
                hh0Var.H.unlock();
                float f10 = this.f21725b;
                hh0Var.f27133b = f10;
                if (f10 <= 0.0f) {
                    hh0Var.G = -1;
                }
                hh0Var.c(true);
                hh0Var.f27136f = false;
                if (hh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    hh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21724a) {
            case 5:
                hh0 hh0Var = (hh0) this.f21726c;
                hh0Var.f27136f = true;
                hh0Var.f27134c = this.f21725b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
