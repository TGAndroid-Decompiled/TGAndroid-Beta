package org.telegram.ui;

import android.view.View;
public final class i5 implements View.OnAttachStateChangeListener {
    public final int f40043a;
    public final Object f40044b;

    public i5(Object obj, int i10) {
        this.f40043a = i10;
        this.f40044b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f40043a) {
            case 0:
                ((j5) this.f40044b).f40427b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.r5) this.f40044b).a();
                return;
            case 2:
                ((l70) this.f40044b).f40986b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((op0) this.f40044b).f42173i;
                if (r5Var != null) {
                    r5Var.a();
                    return;
                }
                return;
            default:
                a81 a81Var = (a81) this.f40044b;
                a81Var.h.a();
                a81Var.f37714n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f40043a) {
            case 0:
                ((j5) this.f40044b).f40427b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.r5) this.f40044b).b();
                return;
            case 2:
                ((l70) this.f40044b).f40986b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.r5 r5Var = ((op0) this.f40044b).f42173i;
                if (r5Var != null) {
                    r5Var.b();
                    return;
                }
                return;
            default:
                a81 a81Var = (a81) this.f40044b;
                a81Var.h.b();
                a81Var.f37714n.b();
                return;
        }
    }
}
