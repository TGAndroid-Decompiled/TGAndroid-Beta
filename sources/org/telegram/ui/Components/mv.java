package org.telegram.ui.Components;

import android.content.Context;
public final class mv extends t9 {
    public final pv C;

    public mv(pv pvVar, Context context) {
        super(context);
        this.C = pvVar;
    }

    @Override
    public final void invalidate() {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.C.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (kg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
