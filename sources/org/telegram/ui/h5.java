package org.telegram.ui;

import android.view.View;
public final class h5 implements View.OnAttachStateChangeListener {
    public final int f34135a;
    public final Object f34136b;

    public h5(Object obj, int i10) {
        this.f34135a = i10;
        this.f34136b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f34135a) {
            case 0:
                ((i5) this.f34136b).f34357b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f34136b).a();
                return;
            case 2:
                ((v70) this.f34136b).f38474b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f34136b).f37216i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                v81 v81Var = (v81) this.f34136b;
                v81Var.h.a();
                v81Var.f38494n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f34135a) {
            case 0:
                ((i5) this.f34136b).f34357b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f34136b).b();
                return;
            case 2:
                ((v70) this.f34136b).f38474b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((rp0) this.f34136b).f37216i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                v81 v81Var = (v81) this.f34136b;
                v81Var.h.b();
                v81Var.f38494n.b();
                return;
        }
    }
}
