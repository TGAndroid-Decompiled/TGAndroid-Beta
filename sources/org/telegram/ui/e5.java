package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f37207a;
    public final Object f37208b;

    public e5(Object obj, int i10) {
        this.f37207a = i10;
        this.f37208b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37207a) {
            case 0:
                ((f5) this.f37208b).f37540b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37208b).a();
                return;
            case 2:
                ((w70) this.f37208b).f43226b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((up0) this.f37208b).f42752i;
                if (q5Var != null) {
                    q5Var.a();
                    return;
                }
                return;
            default:
                c91 c91Var = (c91) this.f37208b;
                c91Var.h.a();
                c91Var.f36649n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37207a) {
            case 0:
                ((f5) this.f37208b).f37540b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37208b).b();
                return;
            case 2:
                ((w70) this.f37208b).f43226b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((up0) this.f37208b).f42752i;
                if (q5Var != null) {
                    q5Var.b();
                    return;
                }
                return;
            default:
                c91 c91Var = (c91) this.f37208b;
                c91Var.h.b();
                c91Var.f36649n.b();
                return;
        }
    }
}
