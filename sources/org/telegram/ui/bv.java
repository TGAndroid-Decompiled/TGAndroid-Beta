package org.telegram.ui;

import android.view.View;
public final class bv extends org.telegram.ui.Components.ks {
    public final xw E;

    public bv(uw uwVar, xw xwVar) {
        super(uwVar);
        this.E = xwVar;
    }

    @Override
    public final void y() {
        xw xwVar = this.E;
        if (xwVar.f53333c.L0() == 0) {
            View m10 = xwVar.f53333c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (xwVar.f53339w == 2) {
                xwVar.f53339w = 1;
            }
            gv gvVar = xwVar.f53336n;
            if (gvVar != null) {
                gvVar.b();
            }
        }
    }
}
