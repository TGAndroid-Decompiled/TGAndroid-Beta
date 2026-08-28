package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ka0 implements View.OnLayoutChangeListener {
    public boolean f39784a;

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        if (i12 - i10 > i11 - i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f39784a) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(this, 26));
            this.f39784a = z10;
        }
    }
}
