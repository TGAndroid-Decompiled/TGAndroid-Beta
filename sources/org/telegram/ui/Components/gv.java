package org.telegram.ui.Components;

import android.content.Context;
public final class gv extends o9 {
    public final jv C;

    public gv(jv jvVar, Context context) {
        super(context);
        this.C = jvVar;
    }

    @Override
    public final void invalidate() {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate();
        this.C.f();
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (hg.h0.b(this)) {
            return;
        }
        super.invalidate(i9, i10, i11, i12);
    }
}
