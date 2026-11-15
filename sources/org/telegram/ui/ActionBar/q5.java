package org.telegram.ui.ActionBar;

import android.graphics.Point;
import c8.ga;
import org.telegram.messenger.ns;
public final class q5 extends ga {
    @Override
    public final void b(int i7, int i10) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f23609q;
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
            ns.e().k(ns.f25618z4, new Object[0]);
        }
    }
}
