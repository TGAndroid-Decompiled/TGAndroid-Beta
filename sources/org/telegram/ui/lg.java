package org.telegram.ui;

import android.view.View;
public final class lg implements View.OnLayoutChangeListener {
    public final int f48990a;
    public final Object f48991b;

    public lg(Object obj, int i7) {
        this.f48990a = i7;
        this.f48991b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f48990a) {
            case 0:
                view.post((ai.b) this.f48991b);
                return;
            default:
                ((k31) this.f48991b).p0();
                return;
        }
    }
}
