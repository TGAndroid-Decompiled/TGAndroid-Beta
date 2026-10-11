package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f37241a;
    public final Object f37242b;

    public e5(Object obj, int i10) {
        this.f37241a = i10;
        this.f37242b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37241a) {
            case 0:
                ((f5) this.f37242b).f37574b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37242b).a();
                return;
            case 2:
                ((w70) this.f37242b).f43260b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((up0) this.f37242b).f42786i;
                if (q5Var != null) {
                    q5Var.a();
                    return;
                }
                return;
            default:
                c91 c91Var = (c91) this.f37242b;
                c91Var.h.a();
                c91Var.f36683n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37241a) {
            case 0:
                ((f5) this.f37242b).f37574b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37242b).b();
                return;
            case 2:
                ((w70) this.f37242b).f43260b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((up0) this.f37242b).f42786i;
                if (q5Var != null) {
                    q5Var.b();
                    return;
                }
                return;
            default:
                c91 c91Var = (c91) this.f37242b;
                c91Var.h.b();
                c91Var.f36683n.b();
                return;
        }
    }
}
