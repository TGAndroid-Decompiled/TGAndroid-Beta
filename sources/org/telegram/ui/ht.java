package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ht implements r0.n, org.telegram.ui.Components.fk0 {
    public final ut f34336a;

    public ht(ut utVar) {
        this.f34336a = utVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f34336a.f38213q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            ut utVar = this.f34336a;
            zg.c0 reactionsWindow = utVar.P.getReactionsWindow();
            if (utVar.f38211o.contains(p0Var.f49150f)) {
                if (utVar.f38211o.size() > 1) {
                    utVar.f38211o.remove(p0Var.f49150f);
                } else {
                    return;
                }
            } else {
                utVar.f38211o.add(p0Var.f49150f);
                if (utVar.f38211o.size() > 7) {
                    utVar.f38211o.remove(0);
                }
            }
            utVar.P.setSelectedEmojis(utVar.f38211o);
            if (reactionsWindow != null) {
                zg.y yVar = reactionsWindow.f49015m;
                utVar.P.p(null, null, false);
                if (yVar != null) {
                    yVar.setSelectedReactions(utVar.f38211o);
                    yVar.setRecentReactions(utVar.P.V);
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
    public boolean q() {
        return false;
    }

    @Override
    public void o() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
