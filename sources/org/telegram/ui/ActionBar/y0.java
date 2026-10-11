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
public final class y0 extends AnimatorListenerAdapter {
    public final int f21726a;
    public final float f21727b;
    public final Object f21728c;

    public y0(Object obj, float f7, int i10) {
        this.f21726a = i10;
        this.f21728c = obj;
        this.f21727b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21726a) {
            case 0:
                b1 b1Var = (b1) this.f21728c;
                b1Var.T = null;
                b1Var.f20484a = this.f21727b;
                b1Var.invalidate();
                return;
            case 1:
                u3 u3Var = (u3) this.f21728c;
                u3Var.f21610i = this.f21727b;
                v3 v3Var = u3Var.f21605b;
                if (v3Var != null) {
                    v3Var.invalidate();
                    return;
                }
                return;
            case 2:
                o6 o6Var = (o6) this.f21728c;
                o6Var.F = this.f21727b;
                o6Var.invalidate();
                return;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                z7 z7Var = (z7) this.f21728c;
                float f7 = this.f21727b;
                z7Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (h6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - z7Var.v) * (-0.3f));
                }
                z7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 4:
                aa aaVar = (aa) this.f21728c;
                aaVar.f24541g = this.f21727b;
                aaVar.invalidateSelf();
                return;
            case 5:
                yh0 yh0Var = (yh0) this.f21728c;
                yh0Var.H.unlock();
                float f10 = this.f21727b;
                yh0Var.f33261b = f10;
                if (f10 <= 0.0f) {
                    yh0Var.G = -1;
                }
                yh0Var.c(true);
                yh0Var.f33264f = false;
                if (yh0Var.O != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    yh0Var.O.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f21728c;
                if (c5Var.f34785k0 == animator) {
                    c5Var.f34785k0 = null;
                    c5Var.x0(this.f21727b);
                    c5Var.f34788n0.o(false);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f21726a) {
            case 5:
                yh0 yh0Var = (yh0) this.f21728c;
                yh0Var.f33264f = true;
                yh0Var.f33262c = this.f21727b;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
