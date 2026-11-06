package org.telegram.ui.Components;

import android.content.Context;
public final class tu extends l9 {
    public final wu G;

    public tu(wu wuVar, Context context) {
        super(context);
        this.G = wuVar;
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
