package org.telegram.ui;

import android.view.View;
public final class ep0 extends org.telegram.ui.Components.n81 {
    public final bq0 f32582a;

    public ep0(bq0 bq0Var) {
        this.f32582a = bq0Var;
    }

    @Override
    public final View d(int i10) {
        bq0 bq0Var = this.f32582a;
        if (i10 == 1) {
            return bq0Var.h;
        }
        if (i10 == 0) {
            return bq0Var.f31352n;
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
