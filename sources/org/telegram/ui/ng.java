package org.telegram.ui;

import android.view.View;
public final class ng implements View.OnLayoutChangeListener {
    public final int f50174a;
    public final Object f50175b;

    public ng(Object obj, int i7) {
        this.f50174a = i7;
        this.f50175b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f50174a) {
            case 0:
                view.post((ai.b) this.f50175b);
                return;
            default:
                ((o31) this.f50175b).p0();
                return;
        }
    }
}
