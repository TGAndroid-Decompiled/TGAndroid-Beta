package org.telegram.ui.Components;

import android.content.Context;
public final class bw extends u9 {
    public final ew G;

    public bw(ew ewVar, Context context) {
        super(context);
        this.G = ewVar;
    }

    @Override
    public final void invalidate() {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
