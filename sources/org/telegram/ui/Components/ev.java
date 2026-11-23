package org.telegram.ui.Components;

import android.content.Context;
public final class ev extends p9 {
    public final hv H;

    public ev(hv hvVar, Context context) {
        super(context);
        this.H = hvVar;
    }

    @Override
    public final void invalidate() {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.f0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
