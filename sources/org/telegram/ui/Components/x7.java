package org.telegram.ui.Components;

import android.content.Context;
public final class x7 extends mm0 {
    public boolean f34647f3;
    public final m8 f34648g3;

    public x7(m8 m8Var, Context context) {
        super(context, null);
        this.f34648g3 = m8Var;
    }

    @Override
    public final boolean E0(float f7) {
        m8 m8Var = this.f34648g3;
        if (f7 < m8Var.f30451y.getY() - m8Var.f30435n.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8 m8Var = this.f34648g3;
        int i14 = m8Var.f30441r0;
        if (i14 != -1 && !m8Var.f30423c.f22772n0) {
            this.f34647f3 = true;
            m8Var.f30440r.h1(i14, m8Var.f30443s0 - m8Var.f30435n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.f34647f3 = false;
            m8Var.f30441r0 = -1;
        } else if (m8Var.f30439q0) {
            m8Var.f30439q0 = false;
            this.f34647f3 = true;
            if (m8Var.D0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.f34647f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f34647f3) {
            return;
        }
        super.requestLayout();
    }
}
