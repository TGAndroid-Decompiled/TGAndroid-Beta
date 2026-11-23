package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class bs implements r0.m, org.telegram.ui.Components.wi0 {
    public final ns f46496a;

    public bs(ns nsVar) {
        this.f46496a = nsVar;
    }

    @Override
    public void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            ns nsVar = this.f46496a;
            ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
            if (nsVar.f50417o.contains(p0Var.f5470f)) {
                if (nsVar.f50417o.size() > 1) {
                    nsVar.f50417o.remove(p0Var.f5470f);
                } else {
                    return;
                }
            } else {
                nsVar.f50417o.add(p0Var.f5470f);
                if (nsVar.f50417o.size() > 7) {
                    nsVar.f50417o.remove(0);
                }
            }
            nsVar.P.setSelectedEmojis(nsVar.f50417o);
            if (reactionsWindow != null) {
                ch.x xVar = reactionsWindow.f5299m;
                nsVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(nsVar.f50417o);
                    xVar.setRecentReactions(nsVar.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        this.f46496a.f50419q = org.telegram.messenger.g0.I0(l1Var, false);
        return l1Var;
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public void r() {
    }

    @Override
    public void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
