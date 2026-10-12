package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.bi0;
public final class y0 extends AnimatorListenerAdapter {
    public final int f21464a;
    public final float f21465b;
    public final Object f21466c;

    public y0(Object obj, float f7, int i10) {
        this.f21464a = i10;
        this.f21466c = obj;
        this.f21465b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21464a) {
            case 0:
                b1 b1Var = (b1) this.f21466c;
                b1Var.T = null;
                b1Var.f20220a = this.f21465b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f21466c;
                u3Var.f21348i = this.f21465b;
                v3 v3Var = u3Var.f21343b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21466c;
                o6Var.F = this.f21465b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21466c;
                float f7 = this.f21465b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                aa aaVar = (aa) this.f21466c;
                aaVar.f24270g = this.f21465b;
                aaVar.invalidateSelf();
                return;
            case 5:
                bi0 bi0Var = (bi0) this.f21466c;
                bi0Var.H.unlock();
                float f10 = this.f21465b;
                bi0Var.f24659b = f10;
                if (f10 <= 0.0f) {
                    bi0Var.G = -1;
                }
                bi0Var.c(true);
                bi0Var.f24662f = false;
                if (bi0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    bi0Var.O.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f21466c;
                if (c5Var.f34560k0 == animator) {
                    c5Var.f34560k0 = null;
                    c5Var.x0(this.f21465b);
                    c5Var.f34563n0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21464a) {
            case 5:
                bi0 bi0Var = (bi0) this.f21466c;
                bi0Var.f24662f = true;
                bi0Var.f24660c = this.f21465b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
