package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ct implements r0.o, org.telegram.ui.Components.pk0 {
    public final qt f35857a;

    public ct(qt qtVar) {
        this.f35857a = qtVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        this.f35857a.f40662q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        if (q0Var != null) {
            qt qtVar = this.f35857a;
            ng.d0 reactionsWindow = qtVar.P.getReactionsWindow();
            if (qtVar.f40660o.contains(q0Var.f16180f)) {
                if (qtVar.f40660o.size() > 1) {
                    qtVar.f40660o.remove(q0Var.f16180f);
                } else {
                    return;
                }
            } else {
                qtVar.f40660o.add(q0Var.f16180f);
                if (qtVar.f40660o.size() > 7) {
                    qtVar.f40660o.remove(0);
                }
            }
            qtVar.P.setSelectedEmojis(qtVar.f40660o);
            if (reactionsWindow != null) {
                ng.z zVar = reactionsWindow.f16045m;
                qtVar.P.p(null, null, false);
                if (zVar != null) {
                    zVar.setSelectedReactions(qtVar.f40660o);
                    zVar.setRecentReactions(qtVar.P.S);
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
    public void m() {
    }

    @Override
    public void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
