package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import c8.ja;
public final class u5 extends ja {
    public final boolean f30070a;
    public final View f30071b;

    public u5(View view, boolean z10) {
        this.f30070a = z10;
        this.f30071b = view;
    }

    @Override
    public final void b(int i7, int i10) {
        boolean z10;
        boolean z11 = this.f30070a;
        View view = this.f30071b;
        if (!z11) {
            Point point = org.telegram.messenger.g0.f24010q;
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
