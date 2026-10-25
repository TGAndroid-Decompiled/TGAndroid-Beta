package org.telegram.ui;

import android.view.View;
public final class aw extends org.telegram.ui.Components.mt {
    public final ay E;

    public aw(wx wxVar, ay ayVar) {
        super(wxVar);
        this.E = ayVar;
    }

    @Override
    public final void y() {
        ay ayVar = this.E;
        if (ayVar.f37912c.L0() == 0) {
            View m10 = ayVar.f37912c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (ayVar.v == 2) {
                ayVar.v = 1;
            }
            fw fwVar = ayVar.f37914n;
            if (fwVar != null) {
                fwVar.b();
            }
        }
    }
}
