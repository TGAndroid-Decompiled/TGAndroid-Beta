package org.telegram.ui;

import android.view.View;
public final class hw extends org.telegram.ui.Components.us {
    public final ey E;

    public hw(ay ayVar, ey eyVar) {
        super(ayVar);
        this.E = eyVar;
    }

    @Override
    public final void y() {
        ey eyVar = this.E;
        if (eyVar.f37923c.L0() == 0) {
            View m10 = eyVar.f37923c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (eyVar.v == 2) {
                eyVar.v = 1;
            }
            mw mwVar = eyVar.f37926n;
            if (mwVar != null) {
                mwVar.b();
            }
        }
    }
}
