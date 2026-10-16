package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kt implements r0.n, org.telegram.ui.Components.fl0 {
    public final xt f37513a;

    public kt(xt xtVar) {
        this.f37513a = xtVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f37513a.f41652q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var != null) {
            xt xtVar = this.f37513a;
            ah.t0 reactionsWindow = xtVar.P.getReactionsWindow();
            if (xtVar.f41650o.contains(i1Var.f783f)) {
                if (xtVar.f41650o.size() > 1) {
                    xtVar.f41650o.remove(i1Var.f783f);
                } else {
                    return;
                }
            } else {
                xtVar.f41650o.add(i1Var.f783f);
                if (xtVar.f41650o.size() > 7) {
                    xtVar.f41650o.remove(0);
                }
            }
            xtVar.P.setSelectedEmojis(xtVar.f41650o);
            if (reactionsWindow != null) {
                ah.n0 n0Var = reactionsWindow.f877m;
                xtVar.P.p(null, null, false);
                if (n0Var != null) {
                    n0Var.setSelectedReactions(xtVar.f41650o);
                    n0Var.setRecentReactions(xtVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean z() {
        return false;
    }

    @Override
    public void y() {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
