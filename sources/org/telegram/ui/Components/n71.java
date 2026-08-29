package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n71 extends AnimatorListenerAdapter {
    public final int f30922a;
    public final z71 f30923b;

    public n71(z71 z71Var, int i10) {
        this.f30922a = i10;
        this.f30923b = z71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30922a) {
            case 0:
                z71 z71Var = this.f30923b;
                View[] viewArr = z71Var.f35261e;
                View[] viewArr2 = z71Var.f35261e;
                if (viewArr[1] != null) {
                    z71Var.F();
                    z71Var.h.put(z71Var.f35262f[1], viewArr2[1]);
                    z71Var.removeView(viewArr2[1]);
                    z71Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                z71Var.M = null;
                z71Var.w(true);
                o71 o71Var = z71Var.I;
                if (o71Var != null) {
                    o71Var.v.invalidate();
                    z71Var.I.v.f1();
                    z71Var.I.invalidate();
                }
                z71Var.u();
                z71Var.F.unlock();
                return;
            case 1:
                z71 z71Var2 = this.f30923b;
                z71Var2.f35266w = null;
                View[] viewArr3 = z71Var2.f35261e;
                if (viewArr3[1] != null) {
                    if (!z71Var2.B) {
                        z71Var2.F();
                    }
                    z71Var2.h.put(z71Var2.f35262f[1], viewArr3[1]);
                    z71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                z71Var2.f35267x = false;
                z71Var2.E = false;
                o71 o71Var2 = z71Var2.I;
                if (o71Var2 != null) {
                    o71Var2.setEnabled(true);
                }
                z71Var2.w(false);
                z71Var2.u();
                z71Var2.F.unlock();
                return;
            case 2:
                z71 z71Var3 = this.f30923b;
                z71Var3.f35266w = null;
                View[] viewArr4 = z71Var3.f35261e;
                View view = viewArr4[1];
                if (view != null) {
                    z71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                z71Var3.f35267x = false;
                o71 o71Var3 = z71Var3.I;
                if (o71Var3 != null) {
                    o71Var3.setEnabled(true);
                    o71 o71Var4 = z71Var3.I;
                    o71Var4.F = false;
                    o71Var4.f34940a = 1.0f;
                    o71Var4.v.f1();
                    z71Var3.I.invalidate();
                    return;
                }
                return;
            default:
                z71 z71Var4 = this.f30923b;
                z71Var4.f35266w = null;
                View[] viewArr5 = z71Var4.f35261e;
                if (viewArr5[1] != null) {
                    if (!z71Var4.B) {
                        z71Var4.F();
                    }
                    z71Var4.h.put(z71Var4.f35262f[1], viewArr5[1]);
                    z71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                z71Var4.f35267x = false;
                z71Var4.E = false;
                o71 o71Var5 = z71Var4.I;
                if (o71Var5 != null) {
                    o71Var5.setEnabled(true);
                }
                z71Var4.w(false);
                z71Var4.u();
                z71Var4.F.unlock();
                return;
        }
    }
}
