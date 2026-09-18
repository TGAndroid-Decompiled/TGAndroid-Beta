package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ht implements r0.n, org.telegram.ui.Components.fk0 {
    public final ut f34341a;

    public ht(ut utVar) {
        this.f34341a = utVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f34341a.f38218q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            ut utVar = this.f34341a;
            zg.c0 reactionsWindow = utVar.P.getReactionsWindow();
            if (utVar.f38216o.contains(p0Var.f49155f)) {
                if (utVar.f38216o.size() > 1) {
                    utVar.f38216o.remove(p0Var.f49155f);
                } else {
                    return;
                }
            } else {
                utVar.f38216o.add(p0Var.f49155f);
                if (utVar.f38216o.size() > 7) {
                    utVar.f38216o.remove(0);
                }
            }
            utVar.P.setSelectedEmojis(utVar.f38216o);
            if (reactionsWindow != null) {
                zg.y yVar = reactionsWindow.f49020m;
                utVar.P.p(null, null, false);
                if (yVar != null) {
                    yVar.setSelectedReactions(utVar.f38216o);
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
