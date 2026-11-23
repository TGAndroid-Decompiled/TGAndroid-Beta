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
        if (bxVar.f46320c.L0() == 0) {
            View m10 = bxVar.f46320c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (bxVar.f46326w == 2) {
                bxVar.f46326w = 1;
            }
            jv jvVar = bxVar.f46323n;
            if (jvVar != null) {
                jvVar.b();
            }
        }
    }
}
