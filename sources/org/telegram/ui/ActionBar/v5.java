package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ia;
public final class v5 extends ia {
    public final boolean f30120a;
    public final View f30121b;

    public v5(View view, boolean z10) {
        this.f30120a = z10;
        this.f30121b = view;
    }

    @Override
    public final void b(int i7, int i10) {
        boolean z10;
        boolean z11 = this.f30120a;
        View view = this.f30121b;
        if (!z11) {
            Point point = org.telegram.messenger.g0.f24121q;
            boolean z12 = false;
            if (point.x <= point.y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i7 <= i10) {
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
