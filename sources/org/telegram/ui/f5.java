package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f36292a;
    public final Object f36293b;

    public f5(Object obj, int i10) {
        this.f36292a = i10;
        this.f36293b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36292a) {
            case 0:
                ((g5) this.f36293b).f36590b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36293b).a();
                return;
            case 2:
                ((x70) this.f36293b).f42635b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.f36293b).f42483i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f36293b;
                d91Var.h.a();
                d91Var.f35767n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36292a) {
            case 0:
                ((g5) this.f36293b).f36590b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36293b).b();
                return;
            case 2:
                ((x70) this.f36293b).f42635b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.f36293b).f42483i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f36293b;
                d91Var.h.b();
                d91Var.f35767n.b();
                return;
        }
    }
}
