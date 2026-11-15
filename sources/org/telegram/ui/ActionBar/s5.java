package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ga;
public final class s5 extends ga {
    public final boolean f29595a;
    public final View f29596b;

    public s5(View view, boolean z10) {
        this.f29595a = z10;
        this.f29596b = view;
    }

    @Override
    public final void b(int i7, int i10) {
        boolean z10;
        boolean z11 = this.f29595a;
        View view = this.f29596b;
        if (!z11) {
            Point point = org.telegram.messenger.g0.f23611q;
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
