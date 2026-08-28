package org.telegram.ui;

import android.view.View;
public final class fw extends org.telegram.ui.Components.ps {
    public final cy E;

    public fw(yx yxVar, cy cyVar) {
        super(yxVar);
        this.E = cyVar;
    }

    @Override
    public final void y() {
        cy cyVar = this.E;
        if (cyVar.f37352c.L0() == 0) {
            View m10 = cyVar.f37352c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (cyVar.v == 2) {
                cyVar.v = 1;
            }
            kw kwVar = cyVar.f37355n;
            if (kwVar != null) {
                kwVar.b();
            }
        }
    }
}
