package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb1;
public final class j6 extends gb1 {
    public final boolean f22744c;
    public final View d;

    public j6(View view, boolean z10) {
        this.f22744c = z10;
        this.d = view;
    }

    @Override
    public final void P(int i10, int i11) {
        boolean z10;
        boolean z11 = this.f22744c;
        View view = this.d;
        if (!z11) {
            Point point = AndroidUtilities.displaySize;
            boolean z12 = false;
            if (point.x <= point.y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 <= i11) {
                z12 = true;
            }
            if (z10 == z12) {
                view.invalidate();
                return;
            }
            return;
        }
        view.invalidate();
    }
}
