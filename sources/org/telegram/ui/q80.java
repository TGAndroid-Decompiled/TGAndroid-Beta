package org.telegram.ui;

import android.view.View;
public final class q80 implements View.OnLayoutChangeListener {
    public boolean f49169a;

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z9;
        if (i12 - i10 > i11 - i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.f49169a) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(this, 20));
            this.f49169a = z9;
        }
    }
}
