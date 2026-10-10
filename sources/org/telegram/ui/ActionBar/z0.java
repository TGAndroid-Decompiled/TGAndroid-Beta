package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.yh0;
public final class z0 extends AnimatorListenerAdapter {
    public final int f21742a;
    public final float f21743b;
    public final Object f21744c;

    public z0(Object obj, float f7, int i10) {
        this.f21742a = i10;
        this.f21744c = obj;
        this.f21743b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21742a) {
            case 0:
                c1 c1Var = (c1) this.f21744c;
                c1Var.T = null;
                c1Var.f20490a = this.f21743b;
                c1Var.invalidate();
                return;
            case 1:
                v3 v3Var = (v3) this.f21744c;
                v3Var.f21622i = this.f21743b;
                w3 w3Var = v3Var.f21617b;
                if (w3Var != null) {
                    w3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21744c;
                o6Var.F = this.f21743b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21744c;
                float f7 = this.f21743b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (i6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                aa aaVar = (aa) this.f21744c;
                aaVar.f24525g = this.f21743b;
                aaVar.invalidateSelf();
                return;
            case 5:
                yh0 yh0Var = (yh0) this.f21744c;
                yh0Var.H.unlock();
                float f10 = this.f21743b;
                yh0Var.f33207b = f10;
                if (f10 <= 0.0f) {
                    yh0Var.G = -1;
                }
                yh0Var.c(true);
                yh0Var.f33210f = false;
                if (yh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    yh0Var.O.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.b5 b5Var = (org.telegram.ui.Wallet.b5) this.f21744c;
                if (b5Var.f34720k0 == animator) {
                    b5Var.f34720k0 = null;
                    b5Var.x0(this.f21743b);
                    b5Var.f34723n0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21742a) {
            case 5:
                yh0 yh0Var = (yh0) this.f21744c;
                yh0Var.f33210f = true;
                yh0Var.f33208c = this.f21743b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
