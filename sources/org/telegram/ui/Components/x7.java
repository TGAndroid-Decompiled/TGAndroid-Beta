package org.telegram.ui.Components;

import android.content.Context;
public final class x7 extends mm0 {
    public boolean V2;
    public final m8 W2;

    public x7(m8 m8Var, Context context) {
        super(context, null);
        this.W2 = m8Var;
    }

    @Override
    public final boolean E0(float f7) {
        m8 m8Var = this.W2;
        if (f7 < m8Var.E.getY() - m8Var.f26982n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8 m8Var = this.W2;
        int i14 = m8Var.f26990s0;
        if (i14 != -1 && !m8Var.f26970c.f20142n0) {
            this.V2 = true;
            m8Var.f26987r.h1(i14, m8Var.f26991t0 - m8Var.f26982n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.V2 = false;
            m8Var.f26990s0 = -1;
        } else if (m8Var.f26988r0) {
            m8Var.f26988r0 = false;
            this.V2 = true;
            if (m8Var.x0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.V2 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
