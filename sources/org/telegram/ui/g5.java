package org.telegram.ui;

import android.view.View;
public final class g5 implements View.OnAttachStateChangeListener {
    public final int f36497a;
    public final Object f36498b;

    public g5(Object obj, int i10) {
        this.f36497a = i10;
        this.f36498b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36497a) {
            case 0:
                ((h5) this.f36498b).f36861b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36498b).a();
                return;
            case 2:
                ((w70) this.f36498b).f41940b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f36498b).f40179i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                v81 v81Var = (v81) this.f36498b;
                v81Var.h.a();
                v81Var.f41603n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36497a) {
            case 0:
                ((h5) this.f36498b).f36861b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36498b).b();
                return;
            case 2:
                ((w70) this.f36498b).f41940b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f36498b).f40179i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                v81 v81Var = (v81) this.f36498b;
                v81Var.h.b();
                v81Var.f41603n.b();
                return;
        }
    }
}
