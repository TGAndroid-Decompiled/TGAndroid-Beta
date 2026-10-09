package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dt implements r0.n, org.telegram.ui.Components.jl0 {
    public final rt f37075a;

    public dt(rt rtVar) {
        this.f37075a = rtVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.f37075a.f41503q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var != null) {
            rt rtVar = this.f37075a;
            zg.a0 reactionsWindow = rtVar.P.getReactionsWindow();
            if (rtVar.f41501o.contains(n0Var.f54617f)) {
                if (rtVar.f41501o.size() > 1) {
                    rtVar.f41501o.remove(n0Var.f54617f);
                } else {
                    return;
                }
            } else {
                rtVar.f41501o.add(n0Var.f54617f);
                if (rtVar.f41501o.size() > 7) {
                    rtVar.f41501o.remove(0);
                }
            }
            rtVar.P.setSelectedEmojis(rtVar.f41501o);
            if (reactionsWindow != null) {
                zg.w wVar = reactionsWindow.f54459m;
                rtVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(rtVar.f41501o);
                    wVar.setRecentReactions(rtVar.P.V);
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
    public boolean v() {
        return false;
    }

    @Override
    public void s() {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
