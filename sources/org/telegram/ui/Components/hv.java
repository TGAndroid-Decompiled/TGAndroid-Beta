package org.telegram.ui.Components;

import android.content.Context;
public final class hv extends q9 {
    public final kv H;

    public hv(kv kvVar, Context context) {
        super(context);
        this.H = kvVar;
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
