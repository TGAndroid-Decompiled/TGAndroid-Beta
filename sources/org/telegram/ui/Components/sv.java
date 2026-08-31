package org.telegram.ui.Components;

import android.content.Context;
public final class sv extends p9 {
    public final vv D;

    public sv(vv vvVar, Context context) {
        super(context);
        this.D = vvVar;
    }

    @Override
    public final void invalidate() {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.D.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ng.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
