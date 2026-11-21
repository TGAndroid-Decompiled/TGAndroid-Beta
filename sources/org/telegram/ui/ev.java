package org.telegram.ui;

import android.view.View;
public final class ev extends org.telegram.ui.Components.ts {
    public final bx F;

    public ev(yw ywVar, bx bxVar) {
        super(ywVar);
        this.F = bxVar;
    }

    @Override
    public final void y() {
        bx bxVar = this.F;
        if (bxVar.f46323c.L0() == 0) {
            View m10 = bxVar.f46323c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (bxVar.f46329w == 2) {
                bxVar.f46329w = 1;
            }
            jv jvVar = bxVar.f46326n;
            if (jvVar != null) {
                jvVar.b();
            }
        }
    }
}
