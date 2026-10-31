package org.telegram.ui.Components;

import android.content.Context;
public final class fv extends g9 {
    public final iv G;

    public fv(iv ivVar, Context context) {
        super(context);
        this.G = ivVar;
    }

    @Override
    public final void invalidate() {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
