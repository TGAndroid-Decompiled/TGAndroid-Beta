package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fb0 implements View.OnLayoutChangeListener {
    public boolean f36389a;

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean z10;
        if (i13 - i11 > i12 - i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f36389a) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(this, 22));
            this.f36389a = z10;
        }
    }
}
