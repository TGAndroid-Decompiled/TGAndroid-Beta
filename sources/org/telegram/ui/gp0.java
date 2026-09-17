package org.telegram.ui;

import android.view.View;
public final class gp0 extends org.telegram.ui.Components.b81 {
    public final cq0 f34023a;

    public gp0(cq0 cq0Var) {
        this.f34023a = cq0Var;
    }

    @Override
    public final View d(int i10) {
        cq0 cq0Var = this.f34023a;
        if (i10 == 1) {
            return cq0Var.h;
        }
        if (i10 == 0) {
            return cq0Var.f32862n;
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
