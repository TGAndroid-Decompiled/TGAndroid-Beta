package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bt implements r0.o, org.telegram.ui.Components.ok0 {
    public final pt f33028a;

    public bt(pt ptVar) {
        this.f33028a = ptVar;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        this.f33028a.f37529q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        if (q0Var != null) {
            pt ptVar = this.f33028a;
            mg.d0 reactionsWindow = ptVar.P.getReactionsWindow();
            if (ptVar.f37527o.contains(q0Var.f14107f)) {
                if (ptVar.f37527o.size() > 1) {
                    ptVar.f37527o.remove(q0Var.f14107f);
                } else {
                    return;
                }
            } else {
                ptVar.f37527o.add(q0Var.f14107f);
                if (ptVar.f37527o.size() > 7) {
                    ptVar.f37527o.remove(0);
                }
            }
            ptVar.P.setSelectedEmojis(ptVar.f37527o);
            if (reactionsWindow != null) {
                mg.z zVar = reactionsWindow.f13981m;
                ptVar.P.p(null, null, false);
                if (zVar != null) {
                    zVar.setSelectedReactions(ptVar.f37527o);
                    zVar.setRecentReactions(ptVar.P.S);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public void o() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
