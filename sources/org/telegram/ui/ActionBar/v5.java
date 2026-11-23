package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ja;
public final class v5 extends ja {
    public final boolean f30198a;
    public final View f30199b;

    public v5(View view, boolean z10) {
        this.f30198a = z10;
        this.f30199b = view;
    }

    @Override
    public final void b(int i7, int i10) {
        boolean z10;
        boolean z11 = this.f30198a;
        View view = this.f30199b;
        if (!z11) {
            Point point = org.telegram.messenger.g0.f24226q;
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
