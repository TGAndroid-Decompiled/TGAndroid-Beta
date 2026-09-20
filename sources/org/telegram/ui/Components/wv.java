package org.telegram.ui.Components;

import android.content.Context;
public final class wv extends v9 {
    public final zv G;

    public wv(zv zvVar, Context context) {
        super(context);
        this.G = zvVar;
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
