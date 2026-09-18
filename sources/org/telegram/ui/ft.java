package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ft implements r0.n, org.telegram.ui.Components.pk0 {
    public final st f33604a;

    public ft(st stVar) {
        this.f33604a = stVar;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        this.f33604a.f37487q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var != null) {
            st stVar = this.f33604a;
            zg.b0 reactionsWindow = stVar.P.getReactionsWindow();
            if (stVar.f37485o.contains(o0Var.f49377f)) {
                if (stVar.f37485o.size() > 1) {
                    stVar.f37485o.remove(o0Var.f49377f);
                } else {
                    return;
                }
            } else {
                stVar.f37485o.add(o0Var.f49377f);
                if (stVar.f37485o.size() > 7) {
                    stVar.f37485o.remove(0);
                }
            }
            stVar.P.setSelectedEmojis(stVar.f37485o);
            if (reactionsWindow != null) {
                zg.x xVar = reactionsWindow.f49235m;
                stVar.P.p(null, null, false);
                if (xVar != null) {
                    xVar.setSelectedReactions(stVar.f37485o);
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
    public void p() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
