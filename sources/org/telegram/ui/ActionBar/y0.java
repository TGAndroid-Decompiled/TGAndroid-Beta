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
    public final int f21465a;
    public final float f21466b;
    public final Object f21467c;

    public y0(Object obj, float f7, int i10) {
        this.f21465a = i10;
        this.f21467c = obj;
        this.f21466b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21465a) {
            case 0:
                b1 b1Var = (b1) this.f21467c;
                b1Var.T = null;
                b1Var.f20221a = this.f21466b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f21467c;
                u3Var.f21349i = this.f21466b;
                v3 v3Var = u3Var.f21344b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21467c;
                o6Var.F = this.f21466b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21467c;
                float f7 = this.f21466b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                aa aaVar = (aa) this.f21467c;
                aaVar.f24271g = this.f21466b;
                aaVar.invalidateSelf();
                return;
            case 5:
                bi0 bi0Var = (bi0) this.f21467c;
                bi0Var.H.unlock();
                float f10 = this.f21466b;
                bi0Var.f24650b = f10;
                if (f10 <= 0.0f) {
                    bi0Var.G = -1;
                }
                bi0Var.c(true);
                bi0Var.f24653f = false;
                if (bi0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    bi0Var.O.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f21467c;
                if (c5Var.f34562k0 == animator) {
                    c5Var.f34562k0 = null;
                    c5Var.x0(this.f21466b);
                    c5Var.f34565n0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21465a) {
            case 5:
                bi0 bi0Var = (bi0) this.f21467c;
                bi0Var.f24653f = true;
                bi0Var.f24651c = this.f21466b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
