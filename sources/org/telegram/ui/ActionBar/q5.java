package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends i7.c6 {
    public final boolean f23762a;
    public final View f23763b;

    public q5(View view, boolean z10) {
        this.f23762a = z10;
        this.f23763b = view;
    }

    @Override
    public final void b(int i10, int i11) {
        boolean z10;
        boolean z11 = this.f23762a;
        View view = this.f23763b;
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
