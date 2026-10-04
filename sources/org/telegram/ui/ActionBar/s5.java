package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s5 extends w7.w5 {
    public final boolean f21504a;
    public final View f21505b;

    public s5(View view, boolean z10) {
        this.f21504a = z10;
        this.f21505b = view;
    }

    @Override
    public final void b(int i10, int i11) {
        boolean z10;
        boolean z11 = this.f21504a;
        View view = this.f21505b;
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
