package org.telegram.ui;

import android.view.View;
public final class dv extends org.telegram.ui.Components.ds {
    public final yw E;

    public dv(vw vwVar, yw ywVar) {
        super(vwVar);
        this.E = ywVar;
    }

    @Override
    public final void y() {
        yw ywVar = this.E;
        if (ywVar.f52127c.L0() == 0) {
            View m10 = ywVar.f52127c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (ywVar.f52133w == 2) {
                ywVar.f52133w = 1;
            }
            iv ivVar = ywVar.f52130n;
            if (ivVar != null) {
                ivVar.b();
            }
        }
    }
}
