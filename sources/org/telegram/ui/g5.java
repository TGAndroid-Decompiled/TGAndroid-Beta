package org.telegram.ui;

import android.view.View;
public final class g5 implements View.OnAttachStateChangeListener {
    public final int f33463a;
    public final Object f33464b;

    public g5(Object obj, int i10) {
        this.f33463a = i10;
        this.f33464b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33463a) {
            case 0:
                ((h5) this.f33464b).f33732b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33464b).a();
                return;
            case 2:
                ((u70) this.f33464b).f37932b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((pp0) this.f33464b).f36161i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                s81 s81Var = (s81) this.f33464b;
                s81Var.h.a();
                s81Var.f37186n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33463a) {
            case 0:
                ((h5) this.f33464b).f33732b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33464b).b();
                return;
            case 2:
                ((u70) this.f33464b).f37932b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((pp0) this.f33464b).f36161i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                s81 s81Var = (s81) this.f33464b;
                s81Var.h.b();
                s81Var.f37186n.b();
                return;
        }
    }
}
