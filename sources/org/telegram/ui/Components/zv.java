package org.telegram.ui.Components;

import android.content.Context;
public final class zv extends w9 {
    public final cw G;

    public zv(cw cwVar, Context context) {
        super(context);
        this.G = cwVar;
    }

    @Override
    public final void invalidate() {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (yg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
