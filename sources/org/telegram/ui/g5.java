package org.telegram.ui;

import android.view.View;
public final class g5 implements View.OnAttachStateChangeListener {
    public final int f36509a;
    public final Object f36510b;

    public g5(Object obj, int i10) {
        this.f36509a = i10;
        this.f36510b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36509a) {
            case 0:
                ((h5) this.f36510b).f36891b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36510b).a();
                return;
            case 2:
                ((w70) this.f36510b).f41962b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f36510b).f40159i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                t81 t81Var = (t81) this.f36510b;
                t81Var.h.a();
                t81Var.f40751n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36509a) {
            case 0:
                ((h5) this.f36510b).f36891b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36510b).b();
                return;
            case 2:
                ((w70) this.f36510b).f41962b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f36510b).f40159i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                t81 t81Var = (t81) this.f36510b;
                t81Var.h.b();
                t81Var.f40751n.b();
                return;
        }
    }
}
