package org.telegram.ui;

import android.view.View;
public final class ng implements View.OnLayoutChangeListener {
    public final int f50167a;
    public final Object f50168b;

    public ng(Object obj, int i7) {
        this.f50167a = i7;
        this.f50168b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f50167a) {
            case 0:
                view.post((ai.b) this.f50168b);
                return;
            default:
                ((o31) this.f50168b).p0();
                return;
        }
    }
}
