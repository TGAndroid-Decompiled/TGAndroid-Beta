package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class bs implements r0.m, org.telegram.ui.Components.wi0 {
    public final ns f46276a;

    public bs(ns nsVar) {
        this.f46276a = nsVar;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        this.f46276a.f50307q = org.telegram.messenger.g0.I0(l1Var, false);
        return l1Var;
    }

    @Override
    public void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            ns nsVar = this.f46276a;
            ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
            if (nsVar.f50305o.contains(p0Var.f5470f)) {
                if (nsVar.f50305o.size() > 1) {
                    nsVar.f50305o.remove(p0Var.f5470f);
                } else {
                    return;
                }
            } else {
                nsVar.f50305o.add(p0Var.f5470f);
                if (nsVar.f50305o.size() > 7) {
                    nsVar.f50305o.remove(0);
                }
            }
            nsVar.P.setSelectedEmojis(nsVar.f50305o);
            if (reactionsWindow != null) {
                ch.x xVar = reactionsWindow.f5299m;
                nsVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(nsVar.f50305o);
                    xVar.setRecentReactions(nsVar.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void z() {
    }

    @Override
    public void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
