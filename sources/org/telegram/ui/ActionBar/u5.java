package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ea;
public final class u5 extends ea {
    public final boolean f28598a;
    public final View f28599b;

    public u5(View view, boolean z9) {
        this.f28598a = z9;
        this.f28599b = view;
    }

    @Override
    public final void b(int i7, int i10) {
        boolean z9;
        boolean z10 = this.f28598a;
        View view = this.f28599b;
        if (!z10) {
            Point point = org.telegram.messenger.g0.f22563q;
            boolean z11 = false;
            if (point.x <= point.y) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i7 <= i10) {
                z11 = true;
            }
            if (z9 == z11) {
                view.invalidate();
                return;
            }
            return;
        }
        view.invalidate();
    }
}
