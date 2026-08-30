package org.telegram.ui.Components;

import android.content.Context;
public final class qv extends p9 {
    public final tv D;

    public qv(tv tvVar, Context context) {
        super(context);
        this.D = tvVar;
    }

    @Override
    public final void invalidate() {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate();
        this.D.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (mg.g0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
