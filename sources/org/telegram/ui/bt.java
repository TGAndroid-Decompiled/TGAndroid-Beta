package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class bt implements r0.n, org.telegram.ui.Components.fk0 {
    public final pt f32175a;

    public bt(pt ptVar) {
        this.f32175a = ptVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f32175a.f36198q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            pt ptVar = this.f32175a;
            zg.c0 reactionsWindow = ptVar.P.getReactionsWindow();
            if (ptVar.f36196o.contains(p0Var.f49071f)) {
                if (ptVar.f36196o.size() > 1) {
                    ptVar.f36196o.remove(p0Var.f49071f);
                } else {
                    return;
                }
            } else {
                ptVar.f36196o.add(p0Var.f49071f);
                if (ptVar.f36196o.size() > 7) {
                    ptVar.f36196o.remove(0);
                }
            }
            ptVar.P.setSelectedEmojis(ptVar.f36196o);
            if (reactionsWindow != null) {
                zg.y yVar = reactionsWindow.f48936m;
                ptVar.P.p(null, null, false);
                if (yVar != null) {
                    yVar.setSelectedReactions(ptVar.f36196o);
                    yVar.setRecentReactions(ptVar.P.V);
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
