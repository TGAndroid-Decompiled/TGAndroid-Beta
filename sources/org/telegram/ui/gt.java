package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gt implements r0.n, org.telegram.ui.Components.ok0 {
    public final tt f33176a;

    public gt(tt ttVar) {
        this.f33176a = ttVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f33176a.f37031q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
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
    public void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            tt ttVar = this.f33176a;
            yg.c0 reactionsWindow = ttVar.P.getReactionsWindow();
            if (ttVar.f37029o.contains(p0Var.f47101f)) {
                if (ttVar.f37029o.size() > 1) {
                    ttVar.f37029o.remove(p0Var.f47101f);
                } else {
                    return;
                }
            } else {
                ttVar.f37029o.add(p0Var.f47101f);
                if (ttVar.f37029o.size() > 7) {
                    ttVar.f37029o.remove(0);
                }
            }
            ttVar.P.setSelectedEmojis(ttVar.f37029o);
            if (reactionsWindow != null) {
                yg.y yVar = reactionsWindow.f46959m;
                ttVar.P.p(null, null, false);
                if (yVar != null) {
                    yVar.setSelectedReactions(ttVar.f37029o);
                    yVar.setRecentReactions(ttVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public void s() {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
