package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33545a;
    public final Object f33546b;

    public f5(Object obj, int i10) {
        this.f33545a = i10;
        this.f33546b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33545a) {
            case 0:
                ((g5) this.f33546b).f33820b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33546b).a();
                return;
            case 2:
                ((s70) this.f33546b).f37614b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.f33546b).f36324i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33546b;
                u81Var.h.a();
                u81Var.f38353n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33545a) {
            case 0:
                ((g5) this.f33546b).f33820b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33546b).b();
                return;
            case 2:
                ((s70) this.f33546b).f37614b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.f33546b).f36324i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33546b;
                u81Var.h.b();
                u81Var.f38353n.b();
                return;
        }
    }
}
