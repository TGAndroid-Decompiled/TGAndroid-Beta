package org.telegram.ui;

import android.view.View;
public final class cv extends org.telegram.ui.Components.es {
    public final xw E;

    public cv(uw uwVar, xw xwVar) {
        super(uwVar);
        this.E = xwVar;
    }

    @Override
    public final void y() {
        xw xwVar = this.E;
        if (xwVar.f51774c.L0() == 0) {
            View m10 = xwVar.f51774c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (xwVar.f51780w == 2) {
                xwVar.f51780w = 1;
            }
            hv hvVar = xwVar.f51777n;
            if (hvVar != null) {
                hvVar.b();
            }
        }
    }
}
