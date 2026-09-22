package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ft implements r0.n, org.telegram.ui.Components.ek0 {
    public final st f33672a;

    public ft(st stVar) {
        this.f33672a = stVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f33672a.f37478q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            st stVar = this.f33672a;
            zg.c0 reactionsWindow = stVar.P.getReactionsWindow();
            if (stVar.f37476o.contains(p0Var.f49120f)) {
                if (stVar.f37476o.size() > 1) {
                    stVar.f37476o.remove(p0Var.f49120f);
                } else {
                    return;
                }
            } else {
                stVar.f37476o.add(p0Var.f49120f);
                if (stVar.f37476o.size() > 7) {
                    stVar.f37476o.remove(0);
                }
            }
            stVar.P.setSelectedEmojis(stVar.f37476o);
            if (reactionsWindow != null) {
                zg.y yVar = reactionsWindow.f48985m;
                stVar.P.p(null, null, false);
                if (yVar != null) {
                    yVar.setSelectedReactions(stVar.f37476o);
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
