package org.telegram.ui;

import android.view.View;
public final class ng implements View.OnLayoutChangeListener {
    public final int f50313a;
    public final Object f50314b;

    public ng(Object obj, int i7) {
        this.f50313a = i7;
        this.f50314b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f50313a) {
            case 0:
                view.post((bi.s1) this.f50314b);
                return;
            default:
                ((n31) this.f50314b).p0();
                return;
        }
    }
}
