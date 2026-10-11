package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.zh0;
public final class y0 extends AnimatorListenerAdapter {
    public final int f21690a;
    public final float f21691b;
    public final Object f21692c;

    public y0(Object obj, float f7, int i10) {
        this.f21690a = i10;
        this.f21692c = obj;
        this.f21691b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21690a) {
            case 0:
                b1 b1Var = (b1) this.f21692c;
                b1Var.T = null;
                b1Var.f20448a = this.f21691b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f21692c;
                u3Var.f21574i = this.f21691b;
                v3 v3Var = u3Var.f21569b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21692c;
                o6Var.F = this.f21691b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21692c;
                float f7 = this.f21691b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                aa aaVar = (aa) this.f21692c;
                aaVar.f24480g = this.f21691b;
                aaVar.invalidateSelf();
                return;
            case 5:
                zh0 zh0Var = (zh0) this.f21692c;
                zh0Var.H.unlock();
                float f10 = this.f21691b;
                zh0Var.f33529b = f10;
                if (f10 <= 0.0f) {
                    zh0Var.G = -1;
                }
                zh0Var.c(true);
                zh0Var.f33532f = false;
                if (zh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    zh0Var.O.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f21692c;
                if (c5Var.f34751k0 == animator) {
                    c5Var.f34751k0 = null;
                    c5Var.x0(this.f21691b);
                    c5Var.f34754n0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21690a) {
            case 5:
                zh0 zh0Var = (zh0) this.f21692c;
                zh0Var.f33532f = true;
                zh0Var.f33530c = this.f21691b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
