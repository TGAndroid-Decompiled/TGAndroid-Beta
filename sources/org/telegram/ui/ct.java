package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ct implements r0.n, org.telegram.ui.Components.kl0 {
    public final qt f36852a;

    public ct(qt qtVar) {
        this.f36852a = qtVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.f36852a.f41283q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var != null) {
            qt qtVar = this.f36852a;
            zg.a0 reactionsWindow = qtVar.P.getReactionsWindow();
            if (qtVar.f41281o.contains(n0Var.f54738f)) {
                if (qtVar.f41281o.size() > 1) {
                    qtVar.f41281o.remove(n0Var.f54738f);
                } else {
                    return;
                }
            } else {
                qtVar.f41281o.add(n0Var.f54738f);
                if (qtVar.f41281o.size() > 7) {
                    qtVar.f41281o.remove(0);
                }
            }
            qtVar.P.setSelectedEmojis(qtVar.f41281o);
            if (reactionsWindow != null) {
                zg.w wVar = reactionsWindow.f54580m;
                qtVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(qtVar.f41281o);
                    wVar.setRecentReactions(qtVar.P.V);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void s() {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
