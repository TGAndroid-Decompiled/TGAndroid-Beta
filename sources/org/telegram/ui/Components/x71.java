package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x71 extends AnimatorListenerAdapter {
    public final int f29900a;
    public final i81 f29901b;

    public x71(i81 i81Var, int i10) {
        this.f29900a = i10;
        this.f29901b = i81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29900a) {
            case 0:
                i81 i81Var = this.f29901b;
                View[] viewArr = i81Var.e;
                View[] viewArr2 = i81Var.e;
                if (viewArr[1] != null) {
                    i81Var.F();
                    i81Var.h.put(i81Var.f24965f[1], viewArr2[1]);
                    i81Var.removeView(viewArr2[1]);
                    i81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                i81Var.Q = null;
                i81Var.w(true);
                y71 y71Var = i81Var.M;
                if (y71Var != null) {
                    y71Var.v.invalidate();
                    i81Var.M.v.f1();
                    i81Var.M.invalidate();
                }
                i81Var.u();
                i81Var.J.unlock();
                return;
            case 1:
                i81 i81Var2 = this.f29901b;
                i81Var2.f24969w = null;
                View[] viewArr3 = i81Var2.e;
                if (viewArr3[1] != null) {
                    if (!i81Var2.F) {
                        i81Var2.F();
                    }
                    i81Var2.h.put(i81Var2.f24965f[1], viewArr3[1]);
                    i81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                i81Var2.f24970x = false;
                i81Var2.I = false;
                y71 y71Var2 = i81Var2.M;
                if (y71Var2 != null) {
                    y71Var2.setEnabled(true);
                }
                i81Var2.w(false);
                i81Var2.u();
                i81Var2.J.unlock();
                return;
            case 2:
                i81 i81Var3 = this.f29901b;
                i81Var3.f24969w = null;
                View[] viewArr4 = i81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    i81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                i81Var3.f24970x = false;
                y71 y71Var3 = i81Var3.M;
                if (y71Var3 != null) {
                    y71Var3.setEnabled(true);
                    y71 y71Var4 = i81Var3.M;
                    y71Var4.J = false;
                    y71Var4.f24591a = 1.0f;
                    y71Var4.v.f1();
                    i81Var3.M.invalidate();
                    return;
                }
                return;
            default:
                i81 i81Var4 = this.f29901b;
                i81Var4.f24969w = null;
                View[] viewArr5 = i81Var4.e;
                if (viewArr5[1] != null) {
                    if (!i81Var4.F) {
                        i81Var4.F();
                    }
                    i81Var4.h.put(i81Var4.f24965f[1], viewArr5[1]);
                    i81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                i81Var4.f24970x = false;
                i81Var4.I = false;
                y71 y71Var5 = i81Var4.M;
                if (y71Var5 != null) {
                    y71Var5.setEnabled(true);
                }
                i81Var4.w(false);
                i81Var4.u();
                i81Var4.J.unlock();
                return;
        }
    }
}
