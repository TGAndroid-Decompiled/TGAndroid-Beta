package org.telegram.ui.Components;

import android.content.Context;
public final class uu extends l9 {
    public final xu G;

    public uu(xu xuVar, Context context) {
        super(context);
        this.G = xuVar;
    }

    @Override
    public final void invalidate() {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
