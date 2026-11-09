package org.telegram.ui.Components;

import android.view.View;
public final class hj0 implements Runnable {
    public final View f34317a;
    public final int f34318b;
    public final float f34319c;
    public final float d;
    public final ij0 f34320e;

    public hj0(ij0 ij0Var, View view, int i7, float f10, float f11) {
        this.f34320e = ij0Var;
        this.f34317a = view;
        this.f34318b = i7;
        this.f34319c = f10;
        this.d = f11;
    }

    @Override
    public final void run() {
        jj0 jj0Var = this.f34320e.f34767b;
        qj0 qj0Var = (qj0) jj0Var.f35080b;
        if (this == qj0Var.Q1) {
            qj0Var.Q1 = null;
        }
        View view = this.f34317a;
        if (view != null) {
            qj0Var.j1(view, 0.0f, 0.0f, false);
            if (!((qj0) jj0Var.f35080b).P1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i7 = this.f34318b;
                if (i7 != -1) {
                    qj0 qj0Var2 = (qj0) jj0Var.f35080b;
                    cj0 cj0Var = qj0Var2.T0;
                    if (cj0Var != null) {
                        cj0Var.c(i7, view);
                        return;
                    }
                    dj0 dj0Var = qj0Var2.U0;
                    if (dj0Var != null) {
                        dj0Var.f(this.f34319c - view.getX(), this.d - view.getY(), i7, view);
                    }
                }
            }
        }
    }
}
