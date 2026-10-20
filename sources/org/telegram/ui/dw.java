package org.telegram.ui;

import android.view.View;
public final class dw extends org.telegram.ui.Components.kt {
    public final ay E;

    public dw(xx xxVar, ay ayVar) {
        super(xxVar);
        this.E = ayVar;
    }

    @Override
    public final void y() {
        ay ayVar = this.E;
        if (ayVar.f35444c.L0() == 0) {
            View m10 = ayVar.f35444c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (ayVar.v == 2) {
                ayVar.v = 1;
            }
            iw iwVar = ayVar.f35446n;
            if (iwVar != null) {
                iwVar.b();
            }
        }
    }
}
