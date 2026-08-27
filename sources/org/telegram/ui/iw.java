package org.telegram.ui;

import android.view.View;

public final class iw extends org.telegram.ui.Components.os {
    public final fy E;

    public iw(cy cyVar, fy fyVar) {
        super(cyVar);
        this.E = fyVar;
    }

    @Override
    public final void y() {
        fy fyVar = this.E;
        if (fyVar.f38227c.L0() == 0) {
            View viewM = fyVar.f38227c.m(0);
            if (viewM != null) {
                viewM.invalidate();
            }
            if (fyVar.v == 2) {
                fyVar.v = 1;
            }
            nw nwVar = fyVar.f38230n;
            if (nwVar != null) {
                nwVar.b();
            }
        }
    }
}
