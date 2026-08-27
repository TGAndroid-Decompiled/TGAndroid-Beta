package org.telegram.ui;

import android.content.Context;

public final class fd extends org.telegram.ui.Components.ri0 {

    public final int f38072r;

    public final Object f38073s;

    public fd(Object obj, Context context, int i10) {
        super(context);
        this.f38072r = i10;
        this.f38073s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38072r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((id) this.f38073s).f39038f.invalidate();
                break;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((u60) this.f38073s).f43136e.invalidate();
                break;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((te0) this.f38073s).h.invalidate();
                break;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38072r) {
            case 0:
                super.invalidate();
                ((id) this.f38073s).f39038f.invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.e20) this.f38073s).invalidate();
                break;
            case 2:
                super.invalidate();
                ((u60) this.f38073s).f43136e.invalidate();
                break;
            default:
                super.invalidate();
                ((te0) this.f38073s).h.invalidate();
                break;
        }
    }
}
