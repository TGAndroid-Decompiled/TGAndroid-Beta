package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ft implements r0.n, org.telegram.ui.Components.ok0 {
    public final st f33715a;

    public ft(st stVar) {
        this.f33715a = stVar;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        this.f33715a.f37542q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var != null) {
            st stVar = this.f33715a;
            zg.b0 reactionsWindow = stVar.P.getReactionsWindow();
            if (stVar.f37540o.contains(o0Var.f49423f)) {
                if (stVar.f37540o.size() > 1) {
                    stVar.f37540o.remove(o0Var.f49423f);
                } else {
                    return;
                }
            } else {
                stVar.f37540o.add(o0Var.f49423f);
                if (stVar.f37540o.size() > 7) {
                    stVar.f37540o.remove(0);
                }
            }
            stVar.P.setSelectedEmojis(stVar.f37540o);
            if (reactionsWindow != null) {
                zg.x xVar = reactionsWindow.f49281m;
                stVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(stVar.f37540o);
                    xVar.setRecentReactions(stVar.P.V);
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
    public boolean r() {
        return false;
    }

    @Override
    public void o() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
