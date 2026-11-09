package org.telegram.ui;

import android.view.View;
public final class og implements View.OnLayoutChangeListener {
    public final int f48445a;
    public final Object f48446b;

    public og(Object obj, int i7) {
        this.f48445a = i7;
        this.f48446b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f48445a) {
            case 0:
                view.post((bi.u0) this.f48446b);
                return;
            default:
                ((n31) this.f48446b).p0();
                return;
        }
    }
}
