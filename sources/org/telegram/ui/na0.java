package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class na0 implements View.OnLayoutChangeListener {
    public boolean f40765a;

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (i13 - i11 > i12 - i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f40765a) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(this, 28));
            this.f40765a = z10;
        }
    }
}
