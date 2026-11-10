package org.telegram.ui.ActionBar;

import android.graphics.Point;
import c8.ea;
import org.telegram.messenger.qs;
public final class t5 extends ea {
    @Override
    public final void b(int i7, int i10) {
        boolean z9;
        Point point = org.telegram.messenger.g0.f22567q;
        boolean z10 = true;
        if (point.x <= point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 > i10) {
            z10 = false;
        }
        if (z9 == z10) {
            qs.e().k(qs.f25126z4, new Object[0]);
        }
    }
}
