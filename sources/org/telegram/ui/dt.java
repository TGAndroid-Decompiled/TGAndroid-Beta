package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dt implements r0.n, org.telegram.ui.Components.rk0 {
    public final rt f35877a;

    public dt(rt rtVar) {
        this.f35877a = rtVar;
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public boolean K() {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f35877a.f40257q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        if (m0Var != null) {
            rt rtVar = this.f35877a;
            zg.z reactionsWindow = rtVar.P.getReactionsWindow();
            if (rtVar.f40255o.contains(m0Var.f53471f)) {
                if (rtVar.f40255o.size() > 1) {
                    rtVar.f40255o.remove(m0Var.f53471f);
                } else {
                    return;
                }
            } else {
                rtVar.f40255o.add(m0Var.f53471f);
                if (rtVar.f40255o.size() > 7) {
                    rtVar.f40255o.remove(0);
                }
            }
            rtVar.P.setSelectedEmojis(rtVar.f40255o);
            if (reactionsWindow != null) {
                zg.v vVar = reactionsWindow.f53560m;
                rtVar.P.p(null, null, false);
                if (vVar != null) {
                    vVar.setSelectedReactions(rtVar.f40255o);
                    vVar.setRecentReactions(rtVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public void I() {
    }

    @Override
    public void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
