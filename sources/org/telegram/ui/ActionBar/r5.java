package org.telegram.ui.ActionBar;

import android.graphics.Point;
import b8.jf;
import org.telegram.messenger.hs;
public final class r5 extends jf {
    @Override
    public final void b(int i3, int i10) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f22608q;
        boolean z11 = true;
        if (point.x <= point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 > i10) {
            z11 = false;
        }
        if (z10 == z11) {
            hs.e().k(hs.f23351z4, new Object[0]);
        }
    }
}
