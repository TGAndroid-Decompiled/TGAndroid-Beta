package org.telegram.ui;

import android.view.View;
public final class h5 implements View.OnAttachStateChangeListener {
    public final int f37326a;
    public final Object f37327b;

    public h5(Object obj, int i10) {
        this.f37326a = i10;
        this.f37327b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37326a) {
            case 0:
                ((i5) this.f37327b).f37741b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f37327b).a();
                return;
            case 2:
                ((q70) this.f37327b).f40362b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ep0) this.f37327b).f36663i;
                if (j5Var != null) {
                    j5Var.a();
                    return;
                }
                return;
            default:
                k81 k81Var = (k81) this.f37327b;
                k81Var.h.a();
                k81Var.f38305n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37326a) {
            case 0:
                ((i5) this.f37327b).f37741b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f37327b).b();
                return;
            case 2:
                ((q70) this.f37327b).f40362b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ep0) this.f37327b).f36663i;
                if (j5Var != null) {
                    j5Var.b();
                    return;
                }
                return;
            default:
                k81 k81Var = (k81) this.f37327b;
                k81Var.h.b();
                k81Var.f38305n.b();
                return;
        }
    }
}
