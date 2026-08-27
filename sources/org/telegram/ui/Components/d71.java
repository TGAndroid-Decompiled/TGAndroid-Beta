package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class d71 extends AnimatorListenerAdapter {

    public final int f27667a;

    public final p71 f27668b;

    public d71(p71 p71Var, int i10) {
        this.f27667a = i10;
        this.f27668b = p71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27667a) {
            case 0:
                p71 p71Var = this.f27668b;
                View[] viewArr = p71Var.f31545e;
                View[] viewArr2 = p71Var.f31545e;
                if (viewArr[1] != null) {
                    p71Var.F();
                    p71Var.h.put(p71Var.f31546f[1], viewArr2[1]);
                    p71Var.removeView(viewArr2[1]);
                    p71Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                p71Var.M = null;
                p71Var.w(true);
                e71 e71Var = p71Var.I;
                if (e71Var != null) {
                    e71Var.v.invalidate();
                    p71Var.I.v.f1();
                    p71Var.I.invalidate();
                }
                p71Var.u();
                p71Var.F.unlock();
                break;
            case 1:
                p71 p71Var2 = this.f27668b;
                p71Var2.f31550w = null;
                View[] viewArr3 = p71Var2.f31545e;
                if (viewArr3[1] != null) {
                    if (!p71Var2.B) {
                        p71Var2.F();
                    }
                    p71Var2.h.put(p71Var2.f31546f[1], viewArr3[1]);
                    p71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                p71Var2.f31551x = false;
                p71Var2.E = false;
                e71 e71Var2 = p71Var2.I;
                if (e71Var2 != null) {
                    e71Var2.setEnabled(true);
                }
                p71Var2.w(false);
                p71Var2.u();
                p71Var2.F.unlock();
                break;
            case 2:
                p71 p71Var3 = this.f27668b;
                p71Var3.f31550w = null;
                View[] viewArr4 = p71Var3.f31545e;
                View view = viewArr4[1];
                if (view != null) {
                    p71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                p71Var3.f31551x = false;
                e71 e71Var3 = p71Var3.I;
                if (e71Var3 != null) {
                    e71Var3.setEnabled(true);
                    e71 e71Var4 = p71Var3.I;
                    e71Var4.F = false;
                    e71Var4.f31204a = 1.0f;
                    e71Var4.v.f1();
                    p71Var3.I.invalidate();
                }
                break;
            default:
                p71 p71Var4 = this.f27668b;
                p71Var4.f31550w = null;
                View[] viewArr5 = p71Var4.f31545e;
                if (viewArr5[1] != null) {
                    if (!p71Var4.B) {
                        p71Var4.F();
                    }
                    p71Var4.h.put(p71Var4.f31546f[1], viewArr5[1]);
                    p71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                p71Var4.f31551x = false;
                p71Var4.E = false;
                e71 e71Var5 = p71Var4.I;
                if (e71Var5 != null) {
                    e71Var5.setEnabled(true);
                }
                p71Var4.w(false);
                p71Var4.u();
                p71Var4.F.unlock();
                break;
        }
    }
}
