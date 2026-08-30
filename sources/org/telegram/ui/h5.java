package org.telegram.ui;

import android.view.View;
public final class h5 implements View.OnAttachStateChangeListener {
    public final int f34755a;
    public final Object f34756b;

    public h5(Object obj, int i10) {
        this.f34755a = i10;
        this.f34756b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f34755a) {
            case 0:
                ((i5) this.f34756b).f35017b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f34756b).a();
                return;
            case 2:
                ((p70) this.f34756b).f37201b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((cp0) this.f34756b).f33407i;
                if (j5Var != null) {
                    j5Var.a();
                    return;
                }
                return;
            default:
                j81 j81Var = (j81) this.f34756b;
                j81Var.h.a();
                j81Var.f35279n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f34755a) {
            case 0:
                ((i5) this.f34756b).f35017b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f34756b).b();
                return;
            case 2:
                ((p70) this.f34756b).f37201b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((cp0) this.f34756b).f33407i;
                if (j5Var != null) {
                    j5Var.b();
                    return;
                }
                return;
            default:
                j81 j81Var = (j81) this.f34756b;
                j81Var.h.b();
                j81Var.f35279n.b();
                return;
        }
    }
}
