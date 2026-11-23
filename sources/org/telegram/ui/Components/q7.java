package org.telegram.ui.Components;

import android.content.Context;
public final class q7 extends ek0 {
    public boolean f38721f3;
    public final e8 f38722g3;

    public q7(e8 e8Var, Context context) {
        super(context, null);
        this.f38722g3 = e8Var;
    }

    @Override
    public final boolean E0(float f10) {
        e8 e8Var = this.f38722g3;
        if (f10 < e8Var.f34626y1.getY() - e8Var.f34614s1.getTop()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e8 e8Var = this.f38722g3;
        int i13 = e8Var.f34604m2;
        if (i13 != -1 && !e8Var.n1.f29166o0) {
            this.f38721f3 = true;
            e8Var.f34616t1.h1(i13, e8Var.f34605n2 - e8Var.f34614s1.getPaddingTop());
            super.onLayout(false, i7, i10, i11, i12);
            this.f38721f3 = false;
            e8Var.f34604m2 = -1;
        } else if (e8Var.f34602l2) {
            e8Var.f34602l2 = false;
            this.f38721f3 = true;
            if (e8Var.T0(true)) {
                super.onLayout(false, i7, i10, i11, i12);
            }
            this.f38721f3 = false;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f38721f3) {
            return;
        }
        super.requestLayout();
    }
}
