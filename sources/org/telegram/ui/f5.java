package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33531a;
    public final Object f33532b;

    public f5(Object obj, int i10) {
        this.f33531a = i10;
        this.f33532b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33531a) {
            case 0:
                ((g5) this.f33532b).f33806b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33532b).a();
                return;
            case 2:
                ((s70) this.f33532b).f37600b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.f33532b).f36309i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33532b;
                u81Var.h.a();
                u81Var.f38335n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33531a) {
            case 0:
                ((g5) this.f33532b).f33806b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f33532b).b();
                return;
            case 2:
                ((s70) this.f33532b).f37600b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((op0) this.f33532b).f36309i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                u81 u81Var = (u81) this.f33532b;
                u81Var.h.b();
                u81Var.f38335n.b();
                return;
        }
    }
}
