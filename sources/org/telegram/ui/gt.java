package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gt implements r0.n, org.telegram.ui.Components.ml0 {
    public final ut f38132a;

    public gt(ut utVar) {
        this.f38132a = utVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.f38132a.f42583q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public void h(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var != null) {
            ut utVar = this.f38132a;
            zg.a0 reactionsWindow = utVar.P.getReactionsWindow();
            if (utVar.f42581o.contains(n0Var.f54841f)) {
                if (utVar.f42581o.size() > 1) {
                    utVar.f42581o.remove(n0Var.f54841f);
                } else {
                    return;
                }
            } else {
                utVar.f42581o.add(n0Var.f54841f);
                if (utVar.f42581o.size() > 7) {
                    utVar.f42581o.remove(0);
                }
            }
            utVar.P.setSelectedEmojis(utVar.f42581o);
            if (reactionsWindow != null) {
                zg.w wVar = reactionsWindow.f54683m;
                utVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(utVar.f42581o);
                    wVar.setRecentReactions(utVar.P.V);
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
    public void p() {
    }

    @Override
    public void o(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
