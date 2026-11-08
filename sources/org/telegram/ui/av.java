package org.telegram.ui;

import android.view.View;
public final class av extends org.telegram.ui.Components.es {
    public final vw E;

    public av(sw swVar, vw vwVar) {
        super(swVar);
        this.E = vwVar;
    }

    @Override
    public final void y() {
        vw vwVar = this.E;
        if (vwVar.f50784c.L0() == 0) {
            View m10 = vwVar.f50784c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (vwVar.f50790w == 2) {
                vwVar.f50790w = 1;
            }
            fv fvVar = vwVar.f50787n;
            if (fvVar != null) {
                fvVar.b();
            }
        }
    }
}
