package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.nj0 {
    public final int f37943r;
    public final Object f37944s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f37943r = i10;
        this.f37944s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f37943r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f37944s).f38918f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((k70) this.f37944s).f37848e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ff0) this.f37944s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f37943r) {
            case 0:
                super.invalidate();
                ((nd) this.f37944s).f38918f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.v20) this.f37944s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((k70) this.f37944s).f37848e.invalidate();
                return;
            default:
                super.invalidate();
                ((ff0) this.f37944s).h.invalidate();
                return;
        }
    }
}
