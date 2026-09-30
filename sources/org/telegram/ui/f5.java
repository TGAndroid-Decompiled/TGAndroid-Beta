package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33631a;
    public final Object f33632b;

    public f5(Object obj, int i10) {
        this.f33631a = i10;
        this.f33632b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33631a) {
            case 0:
                ((g5) this.f33632b).f33962b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33632b).a();
                return;
            case 2:
                ((s70) this.f33632b).f37711b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((np0) this.f33632b).f36098i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33632b;
                u81Var.h.a();
                u81Var.f38444n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33631a) {
            case 0:
                ((g5) this.f33632b).f33962b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33632b).b();
                return;
            case 2:
                ((s70) this.f33632b).f37711b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((np0) this.f33632b).f36098i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33632b;
                u81Var.h.b();
                u81Var.f38444n.b();
                return;
        }
    }
}
