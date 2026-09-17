package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class y71 extends AnimatorListenerAdapter {
    public final int f30136a;
    public final j81 f30137b;

    public y71(j81 j81Var, int i10) {
        this.f30136a = i10;
        this.f30137b = j81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30136a) {
            case 0:
                j81 j81Var = this.f30137b;
                View[] viewArr = j81Var.e;
                View[] viewArr2 = j81Var.e;
                if (viewArr[1] != null) {
                    j81Var.G();
                    j81Var.h.put(j81Var.f25181f[1], viewArr2[1]);
                    j81Var.removeView(viewArr2[1]);
                    j81Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                j81Var.R = null;
                j81Var.x(true);
                z71 z71Var = j81Var.M;
                if (z71Var != null) {
                    z71Var.v.invalidate();
                    j81Var.M.v.g1();
                    j81Var.M.invalidate();
                }
                j81Var.u();
                j81Var.J.unlock();
                return;
            case 1:
                j81 j81Var2 = this.f30137b;
                j81Var2.f25185w = null;
                View[] viewArr3 = j81Var2.e;
                if (viewArr3[1] != null) {
                    if (!j81Var2.F) {
                        j81Var2.G();
                    }
                    j81Var2.h.put(j81Var2.f25181f[1], viewArr3[1]);
                    j81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                j81Var2.f25186x = false;
                j81Var2.I = false;
                z71 z71Var2 = j81Var2.M;
                if (z71Var2 != null) {
                    z71Var2.setEnabled(true);
                }
                j81Var2.x(false);
                j81Var2.u();
                j81Var2.J.unlock();
                return;
            case 2:
                j81 j81Var3 = this.f30137b;
                j81Var3.f25185w = null;
                View[] viewArr4 = j81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    j81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                j81Var3.f25186x = false;
                z71 z71Var3 = j81Var3.M;
                if (z71Var3 != null) {
                    z71Var3.setEnabled(true);
                    z71 z71Var4 = j81Var3.M;
                    z71Var4.J = false;
                    z71Var4.f24870a = 1.0f;
                    z71Var4.v.g1();
                    j81Var3.M.invalidate();
                    return;
                }
                return;
            default:
                j81 j81Var4 = this.f30137b;
                j81Var4.f25185w = null;
                View[] viewArr5 = j81Var4.e;
                if (viewArr5[1] != null) {
                    if (!j81Var4.F) {
                        j81Var4.G();
                    }
                    j81Var4.h.put(j81Var4.f25181f[1], viewArr5[1]);
                    j81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                j81Var4.f25186x = false;
                j81Var4.I = false;
                z71 z71Var5 = j81Var4.M;
                if (z71Var5 != null) {
                    z71Var5.setEnabled(true);
                }
                j81Var4.x(false);
                j81Var4.u();
                j81Var4.J.unlock();
                return;
        }
    }
}
