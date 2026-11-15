package org.telegram.ui;

import android.view.View;
public final class q80 implements View.OnLayoutChangeListener {
    public boolean f50493a;

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        if (i12 - i10 > i11 - i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f50493a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ih(this, 26));
            this.f50493a = z10;
        }
    }
}
