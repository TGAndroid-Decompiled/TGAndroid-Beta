package org.telegram.ui.Components;

import android.content.Context;
public final class mw extends y9 {
    public final pw G;

    public mw(pw pwVar, Context context) {
        super(context);
        this.G = pwVar;
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
