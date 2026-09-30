package org.telegram.ui.Components;

import android.content.Context;
public final class yv extends w9 {
    public final bw G;

    public yv(bw bwVar, Context context) {
        super(context);
        this.G = bwVar;
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
