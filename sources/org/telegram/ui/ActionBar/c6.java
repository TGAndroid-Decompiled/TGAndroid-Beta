package org.telegram.ui.ActionBar;

import android.graphics.Point;
import org.telegram.messenger.zs;
public final class c6 extends w7.y5 {
    @Override
    public final void b(int i10, int i11) {
        boolean z10;
        Point point = org.telegram.messenger.i0.f16026q;
        boolean z11 = true;
        if (point.x <= point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 > i11) {
            z11 = false;
        }
        if (z10 == z11) {
            zs.e().k(zs.f19735z4, new Object[0]);
        }
    }
}
