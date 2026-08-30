package org.telegram.ui;

import android.view.View;
public final class no0 extends org.telegram.ui.Components.c81 {
    public final gp0 f36704a;

    public no0(gp0 gp0Var) {
        this.f36704a = gp0Var;
    }

    @Override
    public final View d(int i10) {
        gp0 gp0Var = this.f36704a;
        if (i10 == 1) {
            return gp0Var.f34656f;
        }
        if (i10 == 0) {
            return gp0Var.h;
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
