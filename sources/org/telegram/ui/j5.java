package org.telegram.ui;

import android.view.View;
public final class j5 implements View.OnAttachStateChangeListener {
    public final int f36927a;
    public final Object f36928b;

    public j5(Object obj, int i10) {
        this.f36927a = i10;
        this.f36928b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36927a) {
            case 0:
                ((k5) this.f36928b).f37287b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f36928b).a();
                return;
            case 2:
                ((b80) this.f36928b).f34229b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((zp0) this.f36928b).f42406i;
                if (q5Var != null) {
                    q5Var.a();
                    return;
                }
                return;
            default:
                j91 j91Var = (j91) this.f36928b;
                j91Var.h.a();
                j91Var.f37000n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36927a) {
            case 0:
                ((k5) this.f36928b).f37287b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f36928b).b();
                return;
            case 2:
                ((b80) this.f36928b).f34229b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((zp0) this.f36928b).f42406i;
                if (q5Var != null) {
                    q5Var.b();
                    return;
                }
                return;
            default:
                j91 j91Var = (j91) this.f36928b;
                j91Var.h.b();
                j91Var.f37000n.b();
                return;
        }
    }
}
