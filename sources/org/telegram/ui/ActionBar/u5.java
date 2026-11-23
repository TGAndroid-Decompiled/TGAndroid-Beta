package org.telegram.ui.ActionBar;

import android.graphics.Point;
import c8.ja;
import org.telegram.messenger.ks;
public final class u5 extends ja {
    @Override
    public final void b(int i7, int i10) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f24226q;
        boolean z11 = true;
        if (point.x <= point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 > i10) {
            z11 = false;
        }
        if (z10 == z11) {
            ks.e().k(ks.C4, new Object[0]);
        }
    }
}
