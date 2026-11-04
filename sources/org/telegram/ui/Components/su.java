package org.telegram.ui.Components;

import android.content.Context;
public final class su extends k9 {
    public final vu H;

    public su(vu vuVar, Context context) {
        super(context);
        this.H = vuVar;
    }

    @Override
    public final void invalidate() {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate();
        this.H.f();
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
