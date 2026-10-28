package org.telegram.ui.Components;

import android.content.Context;
public final class x7 extends nm0 {
    public boolean f34692f3;
    public final m8 f34693g3;

    public x7(m8 m8Var, Context context) {
        super(context, null);
        this.f34693g3 = m8Var;
    }

    @Override
    public final boolean E0(float f7) {
        m8 m8Var = this.f34693g3;
        if (f7 < m8Var.f30460y.getY() - m8Var.f30444n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8 m8Var = this.f34693g3;
        int i14 = m8Var.f30450r0;
        if (i14 != -1 && !m8Var.f30432c.f22775n0) {
            this.f34692f3 = true;
            m8Var.f30449r.h1(i14, m8Var.f30452s0 - m8Var.f30444n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.f34692f3 = false;
            m8Var.f30450r0 = -1;
        } else if (m8Var.f30448q0) {
            m8Var.f30448q0 = false;
            this.f34692f3 = true;
            if (m8Var.D0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.f34692f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f34692f3) {
            return;
        }
        super.requestLayout();
    }
}
