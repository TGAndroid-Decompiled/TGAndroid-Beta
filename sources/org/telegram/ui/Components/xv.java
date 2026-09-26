package org.telegram.ui.Components;

import android.content.Context;
public final class xv extends w9 {
    public final aw G;

    public xv(aw awVar, Context context) {
        super(context);
        this.G = awVar;
    }

    @Override
    public final void invalidate() {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
