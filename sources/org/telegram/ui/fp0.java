package org.telegram.ui;

import android.view.View;
public final class fp0 extends org.telegram.ui.Components.o81 {
    public final cq0 f33592a;

    public fp0(cq0 cq0Var) {
        this.f33592a = cq0Var;
    }

    @Override
    public final View d(int i10) {
        cq0 cq0Var = this.f33592a;
        if (i10 == 1) {
            return cq0Var.h;
        }
        if (i10 == 0) {
            return cq0Var.f32751n;
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
