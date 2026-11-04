package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import b8.jf;
public final class s5 extends jf {
    public final boolean f28575a;
    public final View f28576b;

    public s5(View view, boolean z10) {
        this.f28575a = z10;
        this.f28576b = view;
    }

    @Override
    public final void b(int i3, int i10) {
        boolean z10;
        boolean z11 = this.f28575a;
        View view = this.f28576b;
        if (!z11) {
            Point point = org.telegram.messenger.g0.f22608q;
            boolean z12 = false;
            if (point.x <= point.y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i3 <= i10) {
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
