package org.telegram.ui;

import android.view.View;
public final class bv extends org.telegram.ui.Components.ks {
    public final xw E;

    public bv(uw uwVar, xw xwVar) {
        super(uwVar);
        this.E = xwVar;
    }

    @Override
    public final void y() {
        xw xwVar = this.E;
        if (xwVar.f53337c.L0() == 0) {
            View m10 = xwVar.f53337c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (xwVar.f53343w == 2) {
                xwVar.f53343w = 1;
            }
            gv gvVar = xwVar.f53340n;
            if (gvVar != null) {
                gvVar.b();
            }
        }
    }
}
