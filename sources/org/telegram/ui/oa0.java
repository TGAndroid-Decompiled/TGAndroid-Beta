package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class oa0 implements View.OnLayoutChangeListener {

    public boolean f41046a;

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10 = i13 - i11 > i12 - i10;
        if (z10 != this.f41046a) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(this, 25));
            this.f41046a = z10;
        }
    }
}
