package org.telegram.ui.Components;

import android.graphics.Point;
public final class jq0 implements ij0 {
    public final zp0 f35169a;
    public final ws0 f35170b;

    public jq0(ws0 ws0Var, zp0 zp0Var) {
        this.f35170b = ws0Var;
        this.f35169a = zp0Var;
    }

    @Override
    public final boolean mo20b(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jq0.mo20b(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f35170b.f40142y1;
        if (d2Var != null) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                d2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void r(float f10) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f35170b.f40142y1;
        if (d2Var != null) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                d2Var.movePreviewFragment(f10);
            }
        }
    }
}
