package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.jj0 {
    public final int f35622r;
    public final Object f35623s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f35622r = i10;
        this.f35623s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f35622r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f35623s).f36584f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((e70) this.f35623s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ze0) this.f35623s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f35622r) {
            case 0:
                super.invalidate();
                ((nd) this.f35623s).f36584f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.s20) this.f35623s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((e70) this.f35623s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((ze0) this.f35623s).h.invalidate();
                return;
        }
    }
}
