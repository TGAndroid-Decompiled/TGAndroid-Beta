package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ft implements r0.n, org.telegram.ui.Components.ek0 {
    public final st f36492a;

    public ft(st stVar) {
        this.f36492a = stVar;
    }

    @Override
    public void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        if (j1Var != null) {
            st stVar = this.f36492a;
            ah.u0 reactionsWindow = stVar.P.getReactionsWindow();
            if (stVar.f40569o.contains(j1Var.f609f)) {
                if (stVar.f40569o.size() > 1) {
                    stVar.f40569o.remove(j1Var.f609f);
                } else {
                    return;
                }
            } else {
                stVar.f40569o.add(j1Var.f609f);
                if (stVar.f40569o.size() > 7) {
                    stVar.f40569o.remove(0);
                }
            }
            stVar.P.setSelectedEmojis(stVar.f40569o);
            if (reactionsWindow != null) {
                ah.o0 o0Var = reactionsWindow.f707m;
                stVar.P.p(null, null, false);
                if (o0Var != null) {
                    o0Var.setSelectedReactions(stVar.f40569o);
                    o0Var.setRecentReactions(stVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        this.f36492a.f40571q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public void J() {
    }

    @Override
    public void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
