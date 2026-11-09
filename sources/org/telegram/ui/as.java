package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class as implements r0.m, org.telegram.ui.Components.ii0 {
    public final ms f43772a;

    public as(ms msVar) {
        this.f43772a = msVar;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        this.f43772a.f47975q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        if (o0Var != null) {
            ms msVar = this.f43772a;
            ch.b0 reactionsWindow = msVar.P.getReactionsWindow();
            if (msVar.f47973o.contains(o0Var.f6354f)) {
                if (msVar.f47973o.size() > 1) {
                    msVar.f47973o.remove(o0Var.f6354f);
                } else {
                    return;
                }
            } else {
                msVar.f47973o.add(o0Var.f6354f);
                if (msVar.f47973o.size() > 7) {
                    msVar.f47973o.remove(0);
                }
            }
            msVar.P.setSelectedEmojis(msVar.f47973o);
            if (reactionsWindow != null) {
                ch.w wVar = reactionsWindow.f6191m;
                msVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(msVar.f47973o);
                    wVar.setRecentReactions(msVar.P.V);
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
