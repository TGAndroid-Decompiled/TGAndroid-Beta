package org.telegram.ui;

import android.view.View;
public final class fw extends org.telegram.ui.Components.kt {
    public final dy E;

    public fw(zx zxVar, dy dyVar) {
        super(zxVar);
        this.E = dyVar;
    }

    @Override
    public final void y() {
        dy dyVar = this.E;
        if (dyVar.f36752c.L0() == 0) {
            View m10 = dyVar.f36752c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (dyVar.v == 2) {
                dyVar.v = 1;
            }
            kw kwVar = dyVar.f36754n;
            if (kwVar != null) {
                kwVar.b();
            }
        }
    }
}
