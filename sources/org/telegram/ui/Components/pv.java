package org.telegram.ui.Components;

import android.content.Context;
public final class pv extends p9 {
    public final sv D;

    public pv(sv svVar, Context context) {
        super(context);
        this.D = svVar;
    }

    @Override
    public final void invalidate() {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.D.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
