package org.telegram.ui.Components;

import android.graphics.Point;
public final class uq0 implements tj0 {
    public final jq0 f40441a;
    public final it0 f40442b;

    public uq0(it0 it0Var, jq0 jq0Var) {
        this.f40442b = it0Var;
        this.f40441a = jq0Var;
    }

    @Override
    public final boolean mo24g(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uq0.mo24g(float, float, int, android.view.View):boolean");
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f40442b.f36166y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                g2Var.finishPreviewFragment();
            }
        }
    }

    @Override
    public final void l(float f10) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f40442b.f36166y1;
        if (g2Var != null) {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x > point.y) {
                g2Var.movePreviewFragment(f10);
            }
        }
    }
}
