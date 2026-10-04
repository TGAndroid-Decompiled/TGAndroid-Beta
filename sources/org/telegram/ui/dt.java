package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dt implements r0.n, org.telegram.ui.Components.rk0 {
    public final rt f35838a;

    public dt(rt rtVar) {
        this.f35838a = rtVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f35838a.f40282q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var != null) {
            rt rtVar = this.f35838a;
            zg.b0 reactionsWindow = rtVar.P.getReactionsWindow();
            if (rtVar.f40280o.contains(o0Var.f53485f)) {
                if (rtVar.f40280o.size() > 1) {
                    rtVar.f40280o.remove(o0Var.f53485f);
                } else {
                    return;
                }
            } else {
                rtVar.f40280o.add(o0Var.f53485f);
                if (rtVar.f40280o.size() > 7) {
                    rtVar.f40280o.remove(0);
                }
            }
            rtVar.P.setSelectedEmojis(rtVar.f40280o);
            if (reactionsWindow != null) {
                zg.x xVar = reactionsWindow.f53332m;
                rtVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(rtVar.f40280o);
                    xVar.setRecentReactions(rtVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public void o() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
