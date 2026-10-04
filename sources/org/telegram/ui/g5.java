package org.telegram.ui;

import android.view.View;
public final class g5 implements View.OnAttachStateChangeListener {
    public final int f36496a;
    public final Object f36497b;

    public g5(Object obj, int i10) {
        this.f36496a = i10;
        this.f36497b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36496a) {
            case 0:
                ((h5) this.f36497b).f36860b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36497b).a();
                return;
            case 2:
                ((w70) this.f36497b).f41939b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f36497b).f40178i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                v81 v81Var = (v81) this.f36497b;
                v81Var.h.a();
                v81Var.f41602n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36496a) {
            case 0:
                ((h5) this.f36497b).f36860b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36497b).b();
                return;
            case 2:
                ((w70) this.f36497b).f41939b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f36497b).f40178i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                v81 v81Var = (v81) this.f36497b;
                v81Var.h.b();
                v81Var.f41602n.b();
                return;
        }
    }
}
