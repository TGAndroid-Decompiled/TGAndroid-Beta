package org.telegram.ui.Components;

import android.content.Context;
public final class ow extends y9 {
    public final rw G;

    public ow(rw rwVar, Context context) {
        super(context);
        this.G = rwVar;
    }

    @Override
    public final void invalidate() {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
