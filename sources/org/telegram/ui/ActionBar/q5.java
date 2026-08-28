package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends g7.b6 {
    public final boolean f23740a;
    public final View f23741b;

    public q5(View view, boolean z10) {
        this.f23740a = z10;
        this.f23741b = view;
    }

    @Override
    public final void b(int i9, int i10) {
        boolean z10;
        boolean z11 = this.f23740a;
        View view = this.f23741b;
        if (!z11) {
            Point point = AndroidUtilities.displaySize;
            boolean z12 = false;
            if (point.x <= point.y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i9 <= i10) {
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
