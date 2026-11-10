package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ea;
public final class v5 extends ea {
    public final boolean f28626a;
    public final View f28627b;

    public v5(View view, boolean z9) {
        this.f28626a = z9;
        this.f28627b = view;
    }

    @Override
    public final void b(int i7, int i10) {
        boolean z9;
        boolean z10 = this.f28626a;
        View view = this.f28627b;
        if (!z10) {
            Point point = org.telegram.messenger.g0.f22567q;
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
