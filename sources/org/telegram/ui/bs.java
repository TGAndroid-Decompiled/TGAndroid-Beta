package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class bs implements r0.m, org.telegram.ui.Components.li0 {
    public final ns f45812a;

    public bs(ns nsVar) {
        this.f45812a = nsVar;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean L() {
        return false;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.f45812a.f49661q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override
    public void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            ns nsVar = this.f45812a;
            ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
            if (nsVar.f49659o.contains(p0Var.f5191f)) {
                if (nsVar.f49659o.size() > 1) {
                    nsVar.f49659o.remove(p0Var.f5191f);
                } else {
                    return;
                }
            } else {
                nsVar.f49659o.add(p0Var.f5191f);
                if (nsVar.f49659o.size() > 7) {
                    nsVar.f49659o.remove(0);
                }
            }
            nsVar.P.setSelectedEmojis(nsVar.f49659o);
            if (reactionsWindow != null) {
                ch.x xVar = reactionsWindow.f5021m;
                nsVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(nsVar.f49659o);
                    xVar.setRecentReactions(nsVar.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public void K() {
    }

    @Override
    public void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
