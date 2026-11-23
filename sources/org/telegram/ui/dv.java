package org.telegram.ui;

import android.view.View;
public final class dv extends org.telegram.ui.Components.qs {
    public final ax F;

    public dv(xw xwVar, ax axVar) {
        super(xwVar);
        this.F = axVar;
    }

    @Override
    public final void y() {
        ax axVar = this.F;
        if (axVar.f45824c.L0() == 0) {
            View m10 = axVar.f45824c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (axVar.f45830w == 2) {
                axVar.f45830w = 1;
            }
            iv ivVar = axVar.f45827n;
            if (ivVar != null) {
                ivVar.b();
            }
        }
    }
}
