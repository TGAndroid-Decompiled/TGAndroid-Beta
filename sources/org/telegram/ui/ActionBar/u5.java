package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u5 extends k7.z5 {
    public final boolean f22312a;
    public final View f22313b;

    public u5(View view, boolean z4) {
        this.f22312a = z4;
        this.f22313b = view;
    }

    @Override
    public final void b(int i10, int i11) {
        boolean z4;
        boolean z10 = this.f22312a;
        View view = this.f22313b;
        if (!z10) {
            Point point = AndroidUtilities.displaySize;
            boolean z11 = false;
            if (point.x <= point.y) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i10 <= i11) {
                z11 = true;
            }
            if (z4 == z11) {
                view.invalidate();
                return;
            }
            return;
        }
        view.invalidate();
    }
}
