package org.telegram.ui.Components;

import android.content.Context;
public final class uv extends x9 {
    public final xv G;

    public uv(xv xvVar, Context context) {
        super(context);
        this.G = xvVar;
    }

    @Override
    public final void invalidate() {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
