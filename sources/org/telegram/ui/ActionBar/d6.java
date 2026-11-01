package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
public final class d6 extends w7.y5 {
    public final boolean f20274a;
    public final View f20275b;

    public d6(View view, boolean z10) {
        this.f20274a = z10;
        this.f20275b = view;
    }

    @Override
    public final void b(int i10, int i11) {
        boolean z10;
        boolean z11 = this.f20274a;
        View view = this.f20275b;
        if (!z11) {
            Point point = org.telegram.messenger.i0.f16172q;
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
