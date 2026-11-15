package org.telegram.ui;

import android.view.View;
public final class lg implements View.OnLayoutChangeListener {
    public final int f48986a;
    public final Object f48987b;

    public lg(Object obj, int i7) {
        this.f48986a = i7;
        this.f48987b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f48986a) {
            case 0:
                view.post((ai.b) this.f48987b);
                return;
            default:
                ((k31) this.f48987b).p0();
                return;
        }
    }
}
