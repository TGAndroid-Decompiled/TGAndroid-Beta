package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kt implements r0.o, org.telegram.ui.Components.fl0 {
    public final xt f37728a;

    public kt(xt xtVar) {
        this.f37728a = xtVar;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f37728a.f41948q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var != null) {
            xt xtVar = this.f37728a;
            ah.t0 reactionsWindow = xtVar.P.getReactionsWindow();
            if (xtVar.f41946o.contains(i1Var.f779f)) {
                if (xtVar.f41946o.size() > 1) {
                    xtVar.f41946o.remove(i1Var.f779f);
                } else {
                    return;
                }
            } else {
                xtVar.f41946o.add(i1Var.f779f);
                if (xtVar.f41946o.size() > 7) {
                    xtVar.f41946o.remove(0);
                }
            }
            xtVar.P.setSelectedEmojis(xtVar.f41946o);
            if (reactionsWindow != null) {
                ah.n0 n0Var = reactionsWindow.f873m;
                xtVar.P.p(null, null, false);
                if (n0Var != null) {
                    n0Var.setSelectedReactions(xtVar.f41946o);
                    n0Var.setRecentReactions(xtVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public void y() {
    }

    @Override
    public void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
