package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o6;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.y9;
public final class y0 extends AnimatorListenerAdapter {
    public final int f19931a;
    public final float f19932b;
    public final Object f19933c;

    public y0(Object obj, float f7, int i10) {
        this.f19931a = i10;
        this.f19933c = obj;
        this.f19932b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f19931a) {
            case 0:
                b1 b1Var = (b1) this.f19933c;
                b1Var.T = null;
                b1Var.f18738a = this.f19932b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f19933c;
                u3Var.f19825i = this.f19932b;
                v3 v3Var = u3Var.f19821b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f19933c;
                o6Var.E = this.f19932b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f19933c;
                float f7 = this.f19932b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                y9 y9Var = (y9) this.f19933c;
                y9Var.f30606g = this.f19932b;
                y9Var.invalidateSelf();
                return;
            default:
                gh0 gh0Var = (gh0) this.f19933c;
                gh0Var.H.unlock();
                float f10 = this.f19932b;
                gh0Var.f24502b = f10;
                if (f10 <= 0.0f) {
                    gh0Var.G = -1;
                }
                gh0Var.c(true);
                gh0Var.f24504f = false;
                if (gh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    gh0Var.O.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19931a) {
            case 5:
                gh0 gh0Var = (gh0) this.f19933c;
                gh0Var.f24504f = true;
                gh0Var.f24503c = this.f19932b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
