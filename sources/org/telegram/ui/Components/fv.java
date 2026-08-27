package org.telegram.ui.Components;

import android.content.Context;

public final class fv extends n9 {
    public final iv C;

    public fv(iv ivVar, Context context) {
        super(context);
        this.C = ivVar;
    }

    @Override
    public final void invalidate() {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.C.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ig.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
