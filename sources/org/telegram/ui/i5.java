package org.telegram.ui;

import android.view.View;
public final class i5 implements View.OnAttachStateChangeListener {
    public final int f38672a;
    public final Object f38673b;

    public i5(Object obj, int i10) {
        this.f38672a = i10;
        this.f38673b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38672a) {
            case 0:
                ((j5) this.f38673b).f39097b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f38673b).a();
                return;
            case 2:
                ((y70) this.f38673b).f44319b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((xp0) this.f38673b).f44150i;
                if (q5Var != null) {
                    q5Var.a();
                    return;
                }
                return;
            default:
                f91 f91Var = (f91) this.f38673b;
                f91Var.h.a();
                f91Var.f37691n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38672a) {
            case 0:
                ((j5) this.f38673b).f39097b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f38673b).b();
                return;
            case 2:
                ((y70) this.f38673b).f44319b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((xp0) this.f38673b).f44150i;
                if (q5Var != null) {
                    q5Var.b();
                    return;
                }
                return;
            default:
                f91 f91Var = (f91) this.f38673b;
                f91Var.h.b();
                f91Var.f37691n.b();
                return;
        }
    }
}
