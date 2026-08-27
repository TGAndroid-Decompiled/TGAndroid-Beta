package org.telegram.ui.Components;

import android.content.Context;

public final class n7 extends zk0 {
    public boolean T2;
    public final b8 U2;

    public n7(b8 b8Var, Context context) {
        super(context, null);
        this.U2 = b8Var;
    }

    @Override
    public final boolean E0(float f10) {
        b8 b8Var = this.U2;
        return f10 < b8Var.A.getY() - ((float) b8Var.f27026n.getTop());
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b8 b8Var = this.U2;
        int i14 = b8Var.f27028o0;
        if (i14 != -1 && !b8Var.f27013c.f23578j0) {
            this.T2 = true;
            b8Var.f27031r.h1(i14, b8Var.f27029p0 - b8Var.f27026n.getPaddingTop());
            super.onLayout(false, i10, i11, i12, i13);
            this.T2 = false;
            b8Var.f27028o0 = -1;
            return;
        }
        if (b8Var.f27027n0) {
            b8Var.f27027n0 = false;
            this.T2 = true;
            if (b8Var.w0(true)) {
                super.onLayout(false, i10, i11, i12, i13);
            }
            this.T2 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
