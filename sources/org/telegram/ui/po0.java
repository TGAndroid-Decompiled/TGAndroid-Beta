package org.telegram.ui;

import android.view.View;
public final class po0 extends org.telegram.ui.Components.e81 {
    public final ip0 f40130a;

    public po0(ip0 ip0Var) {
        this.f40130a = ip0Var;
    }

    @Override
    public final View d(int i10) {
        ip0 ip0Var = this.f40130a;
        if (i10 == 1) {
            return ip0Var.f37908f;
        }
        if (i10 == 0) {
            return ip0Var.h;
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
