package org.telegram.ui;

import android.view.View;
public final class fw extends org.telegram.ui.Components.ps {
    public final zx E;

    public fw(wx wxVar, zx zxVar) {
        super(wxVar);
        this.E = zxVar;
    }

    @Override
    public final void y() {
        zx zxVar = this.E;
        if (zxVar.f44241c.L0() == 0) {
            View m10 = zxVar.f44241c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (zxVar.f44246w == 2) {
                zxVar.f44246w = 1;
            }
            kw kwVar = zxVar.f44243n;
            if (kwVar != null) {
                kwVar.b();
            }
        }
    }
}
