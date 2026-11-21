package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class y61 extends AnimatorListenerAdapter {
    public final int f42339a;
    public final j71 f42340b;

    public y61(j71 j71Var, int i7) {
        this.f42339a = i7;
        this.f42340b = j71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42339a) {
            case 0:
                j71 j71Var = this.f42340b;
                View[] viewArr = j71Var.f36440e;
                View[] viewArr2 = j71Var.f36440e;
                if (viewArr[1] != null) {
                    j71Var.C();
                    j71Var.h.put(j71Var.f36441f[1], viewArr2[1]);
                    j71Var.removeView(viewArr2[1]);
                    j71Var.B(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                j71Var.T = null;
                j71Var.t(true);
                z61 z61Var = j71Var.N;
                if (z61Var != null) {
                    z61Var.f36226w.invalidate();
                    j71Var.N.f36226w.g1();
                    j71Var.N.invalidate();
                }
                j71Var.q();
                j71Var.K.e();
                return;
            case 1:
                j71 j71Var2 = this.f42340b;
                j71Var2.f36446x = null;
                View[] viewArr3 = j71Var2.f36440e;
                if (viewArr3[1] != null) {
                    if (!j71Var2.G) {
                        j71Var2.C();
                    }
                    j71Var2.h.put(j71Var2.f36441f[1], viewArr3[1]);
                    j71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                j71Var2.f36447y = false;
                j71Var2.J = false;
                z61 z61Var2 = j71Var2.N;
                if (z61Var2 != null) {
                    z61Var2.setEnabled(true);
                }
                j71Var2.t(false);
                j71Var2.q();
                j71Var2.K.e();
                return;
            case 2:
                j71 j71Var3 = this.f42340b;
                j71Var3.f36446x = null;
                View[] viewArr4 = j71Var3.f36440e;
                View view = viewArr4[1];
                if (view != null) {
                    j71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                j71Var3.f36447y = false;
                z61 z61Var3 = j71Var3.N;
                if (z61Var3 != null) {
                    z61Var3.setEnabled(true);
                    z61 z61Var4 = j71Var3.N;
                    z61Var4.K = false;
                    z61Var4.f36200a = 1.0f;
                    z61Var4.f36226w.g1();
                    j71Var3.N.invalidate();
                    return;
                }
                return;
            default:
                j71 j71Var4 = this.f42340b;
                j71Var4.f36446x = null;
                View[] viewArr5 = j71Var4.f36440e;
                if (viewArr5[1] != null) {
                    if (!j71Var4.G) {
                        j71Var4.C();
                    }
                    j71Var4.h.put(j71Var4.f36441f[1], viewArr5[1]);
                    j71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                j71Var4.f36447y = false;
                j71Var4.J = false;
                z61 z61Var5 = j71Var4.N;
                if (z61Var5 != null) {
                    z61Var5.setEnabled(true);
                }
                j71Var4.t(false);
                j71Var4.q();
                j71Var4.K.e();
                return;
        }
    }
}
