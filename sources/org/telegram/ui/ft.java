package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ft implements r0.n, org.telegram.ui.Components.rk0 {
    public final st f33743a;

    public ft(st stVar) {
        this.f33743a = stVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        this.f33743a.f37566q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            st stVar = this.f33743a;
            zg.c0 reactionsWindow = stVar.P.getReactionsWindow();
            if (stVar.f37564o.contains(p0Var.f49447f)) {
                if (stVar.f37564o.size() > 1) {
                    stVar.f37564o.remove(p0Var.f49447f);
                } else {
                    return;
                }
            } else {
                stVar.f37564o.add(p0Var.f49447f);
                if (stVar.f37564o.size() > 7) {
                    stVar.f37564o.remove(0);
                }
            }
            stVar.P.setSelectedEmojis(stVar.f37564o);
            if (reactionsWindow != null) {
                zg.y yVar = reactionsWindow.f49312m;
                stVar.P.p(null, null, false);
                if (yVar != null) {
                    yVar.setSelectedReactions(stVar.f37564o);
                    yVar.setRecentReactions(stVar.P.V);
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
