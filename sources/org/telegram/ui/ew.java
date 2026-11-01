package org.telegram.ui;

import android.view.View;
public final class ew extends org.telegram.ui.Components.ps {
    public final yx E;

    public ew(vx vxVar, yx yxVar) {
        super(vxVar);
        this.E = yxVar;
    }

    @Override
    public final void y() {
        yx yxVar = this.E;
        if (yxVar.f43735c.L0() == 0) {
            View m10 = yxVar.f43735c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (yxVar.f43740w == 2) {
                yxVar.f43740w = 1;
            }
            jw jwVar = yxVar.f43737n;
            if (jwVar != null) {
                jwVar.b();
            }
        }
    }
}
