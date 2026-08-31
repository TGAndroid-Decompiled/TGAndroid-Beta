package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ct implements r0.o, org.telegram.ui.Components.qk0 {
    public final qt f35906a;

    public ct(qt qtVar) {
        this.f35906a = qtVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        this.f35906a.f40688q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
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
            qt qtVar = this.f35906a;
            ng.d0 reactionsWindow = qtVar.P.getReactionsWindow();
            if (qtVar.f40686o.contains(q0Var.f16178f)) {
                if (qtVar.f40686o.size() > 1) {
                    qtVar.f40686o.remove(q0Var.f16178f);
                } else {
                    return;
                }
            } else {
                qtVar.f40686o.add(q0Var.f16178f);
                if (qtVar.f40686o.size() > 7) {
                    qtVar.f40686o.remove(0);
                }
            }
            qtVar.P.setSelectedEmojis(qtVar.f40686o);
            if (reactionsWindow != null) {
                ng.z zVar = reactionsWindow.f16043m;
                qtVar.P.p(null, null, false);
                if (zVar != null) {
                    zVar.setSelectedReactions(qtVar.f40686o);
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
