package org.telegram.ui;

import android.view.View;
public final class o80 implements View.OnLayoutChangeListener {
    public boolean f48233a;

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        if (i12 - i10 > i11 - i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f48233a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(this, 21));
            this.f48233a = z10;
        }
    }
}
