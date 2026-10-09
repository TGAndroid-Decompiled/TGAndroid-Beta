package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f37448a;
    public final Object f37449b;

    public f5(Object obj, int i10) {
        this.f37448a = i10;
        this.f37449b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37448a) {
            case 0:
                ((g5) this.f37449b).f37776b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37449b).a();
                return;
            case 2:
                ((w70) this.f37449b).f43102b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((vp0) this.f37449b).f42963i;
                if (q5Var != null) {
                    q5Var.a();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f37449b;
                d91Var.h.a();
                d91Var.f36911n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37448a) {
            case 0:
                ((g5) this.f37449b).f37776b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37449b).b();
                return;
            case 2:
                ((w70) this.f37449b).f43102b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((vp0) this.f37449b).f42963i;
                if (q5Var != null) {
                    q5Var.b();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f37449b;
                d91Var.h.b();
                d91Var.f36911n.b();
                return;
        }
    }
}
