package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ct implements r0.n, org.telegram.ui.Components.rk0 {
    public final qt f32789a;

    public ct(qt qtVar) {
        this.f32789a = qtVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.f32789a.f36901q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override
    public void i(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        if (p0Var != null) {
            qt qtVar = this.f32789a;
            zg.c0 reactionsWindow = qtVar.P.getReactionsWindow();
            if (qtVar.f36899o.contains(p0Var.f49444f)) {
                if (qtVar.f36899o.size() > 1) {
                    qtVar.f36899o.remove(p0Var.f49444f);
                } else {
                    return;
                }
            } else {
                qtVar.f36899o.add(p0Var.f49444f);
                if (qtVar.f36899o.size() > 7) {
                    qtVar.f36899o.remove(0);
                }
            }
            qtVar.P.setSelectedEmojis(qtVar.f36899o);
            if (reactionsWindow != null) {
                zg.y yVar = reactionsWindow.f49308m;
                qtVar.P.p(null, null, false);
                if (yVar != null) {
                    yVar.setSelectedReactions(qtVar.f36899o);
                    yVar.setRecentReactions(qtVar.P.V);
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
    public boolean t() {
        return false;
    }

    @Override
    public void p() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
