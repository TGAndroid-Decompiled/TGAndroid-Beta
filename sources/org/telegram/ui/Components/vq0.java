package org.telegram.ui.Components;

import android.graphics.Point;
public final class vq0 implements tj0 {
    public final kq0 f41541a;
    public final jt0 f41542b;

    public vq0(jt0 jt0Var, kq0 kq0Var) {
        this.f41542b = jt0Var;
        this.f41541a = kq0Var;
    }

    @Override
    public final boolean mo23f(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vq0.mo23f(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void j() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f41542b.f36684y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.f24046q;
            if (point.x > point.y) {
                g2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void r(float f10) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f41542b.f36684y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.f24046q;
            if (point.x > point.y) {
                g2Var.movePreviewFragment(f10);
            }
        }
    }
}
