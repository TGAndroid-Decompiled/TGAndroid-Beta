package org.telegram.ui;

import android.view.View;
public final class ep0 extends org.telegram.ui.Components.a81 {
    public final aq0 f33381a;

    public ep0(aq0 aq0Var) {
        this.f33381a = aq0Var;
    }

    @Override
    public final View d(int i10) {
        aq0 aq0Var = this.f33381a;
        if (i10 == 1) {
            return aq0Var.h;
        }
        if (i10 == 0) {
            return aq0Var.f31900n;
        }
        return null;
    }

    @Override
    public final int e() {
        return 2;
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
