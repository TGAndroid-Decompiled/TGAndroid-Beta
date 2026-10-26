package org.telegram.ui.Components;

import android.content.Context;
public final class x7 extends mm0 {
    public boolean f34650f3;
    public final m8 f34651g3;

    public x7(m8 m8Var, Context context) {
        super(context, null);
        this.f34651g3 = m8Var;
    }

    @Override
    public final boolean E0(float f7) {
        m8 m8Var = this.f34651g3;
        if (f7 < m8Var.f30453y.getY() - m8Var.f30437n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8 m8Var = this.f34651g3;
        int i14 = m8Var.f30443r0;
        if (i14 != -1 && !m8Var.f30425c.f22774n0) {
            this.f34650f3 = true;
            m8Var.f30442r.h1(i14, m8Var.f30445s0 - m8Var.f30437n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.f34650f3 = false;
            m8Var.f30443r0 = -1;
        } else if (m8Var.f30441q0) {
            m8Var.f30441q0 = false;
            this.f34650f3 = true;
            if (m8Var.D0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.f34650f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f34650f3) {
            return;
        }
        super.requestLayout();
    }
}
