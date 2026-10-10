package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dt implements r0.n, org.telegram.ui.Components.kl0 {
    public final rt f37119a;

    public dt(rt rtVar) {
        this.f37119a = rtVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.f37119a.f41547q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var != null) {
            rt rtVar = this.f37119a;
            zg.a0 reactionsWindow = rtVar.P.getReactionsWindow();
            if (rtVar.f41545o.contains(n0Var.f54661f)) {
                if (rtVar.f41545o.size() > 1) {
                    rtVar.f41545o.remove(n0Var.f54661f);
                } else {
                    return;
                }
            } else {
                rtVar.f41545o.add(n0Var.f54661f);
                if (rtVar.f41545o.size() > 7) {
                    rtVar.f41545o.remove(0);
                }
            }
            rtVar.P.setSelectedEmojis(rtVar.f41545o);
            if (reactionsWindow != null) {
                zg.w wVar = reactionsWindow.f54503m;
                rtVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(rtVar.f41545o);
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
