package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class bs implements r0.m, org.telegram.ui.Components.hi0 {
    public final ns f44122a;

    public bs(ns nsVar) {
        this.f44122a = nsVar;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        this.f44122a.f48272q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        if (o0Var != null) {
            ns nsVar = this.f44122a;
            ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
            if (nsVar.f48270o.contains(o0Var.f6359f)) {
                if (nsVar.f48270o.size() > 1) {
                    nsVar.f48270o.remove(o0Var.f6359f);
                } else {
                    return;
                }
            } else {
                nsVar.f48270o.add(o0Var.f6359f);
                if (nsVar.f48270o.size() > 7) {
                    nsVar.f48270o.remove(0);
                }
            }
            nsVar.P.setSelectedEmojis(nsVar.f48270o);
            if (reactionsWindow != null) {
                ch.w wVar = reactionsWindow.f6196m;
                nsVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(nsVar.f48270o);
                    wVar.setRecentReactions(nsVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void M() {
    }

    @Override
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
