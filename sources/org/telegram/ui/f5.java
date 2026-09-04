package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f36264a;
    public final Object f36265b;

    public f5(Object obj, int i10) {
        this.f36264a = i10;
        this.f36265b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36264a) {
            case 0:
                ((g5) this.f36265b).f36562b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36265b).a();
                return;
            case 2:
                ((x70) this.f36265b).f42607b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.f36265b).f42455i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f36265b;
                d91Var.h.a();
                d91Var.f35739n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36264a) {
            case 0:
                ((g5) this.f36265b).f36562b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36265b).b();
                return;
            case 2:
                ((x70) this.f36265b).f42607b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.f36265b).f42455i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f36265b;
                d91Var.h.b();
                d91Var.f35739n.b();
                return;
        }
    }
}
