package org.telegram.ui;

import android.view.View;
public final class fp0 extends org.telegram.ui.Components.a81 {
    public final bq0 f36471a;

    public fp0(bq0 bq0Var) {
        this.f36471a = bq0Var;
    }

    @Override
    public final View d(int i10) {
        bq0 bq0Var = this.f36471a;
        if (i10 == 1) {
            return bq0Var.h;
        }
        if (i10 == 0) {
            return bq0Var.f34900n;
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
