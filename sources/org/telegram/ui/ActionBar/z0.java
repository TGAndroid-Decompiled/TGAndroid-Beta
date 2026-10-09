package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.xh0;
public final class z0 extends AnimatorListenerAdapter {
    public final int f21738a;
    public final float f21739b;
    public final Object f21740c;

    public z0(Object obj, float f7, int i10) {
        this.f21738a = i10;
        this.f21740c = obj;
        this.f21739b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21738a) {
            case 0:
                c1 c1Var = (c1) this.f21740c;
                c1Var.T = null;
                c1Var.f20486a = this.f21739b;
                c1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f21740c;
                v3Var.f21618i = this.f21739b;
                w3 w3Var = v3Var.f21613b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21740c;
                o6Var.F = this.f21739b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21740c;
                float f7 = this.f21739b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                aa aaVar = (aa) this.f21740c;
                aaVar.f24645g = this.f21739b;
                aaVar.invalidateSelf();
                return;
            case 5:
                xh0 xh0Var = (xh0) this.f21740c;
                xh0Var.H.unlock();
                float f10 = this.f21739b;
                xh0Var.f32865b = f10;
                if (f10 <= 0.0f) {
                    xh0Var.G = -1;
                }
                xh0Var.c(true);
                xh0Var.f32868f = false;
                if (xh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    xh0Var.O.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.f21740c;
                if (a5Var.f34629k0 == animator) {
                    a5Var.f34629k0 = null;
                    a5Var.x0(this.f21739b);
                    a5Var.f34632n0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21738a) {
            case 5:
                xh0 xh0Var = (xh0) this.f21740c;
                xh0Var.f32868f = true;
                xh0Var.f32866c = this.f21739b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
