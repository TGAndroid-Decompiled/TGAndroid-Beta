package org.telegram.ui;

import android.view.View;
public final class cw extends org.telegram.ui.Components.mt {
    public final dy E;

    public cw(zx zxVar, dy dyVar) {
        super(zxVar);
        this.E = dyVar;
    }

    @Override
    public final void y() {
        dy dyVar = this.E;
        if (dyVar.f38704c.L0() == 0) {
            View m10 = dyVar.f38704c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (dyVar.v == 2) {
                dyVar.v = 1;
            }
            hw hwVar = dyVar.f38706n;
            if (hwVar != null) {
                hwVar.b();
            }
        }
    }
}
