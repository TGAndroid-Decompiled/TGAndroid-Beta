package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ct implements r0.n, org.telegram.ui.Components.ll0 {
    public final qt f36818a;

    public ct(qt qtVar) {
        this.f36818a = qtVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        this.f36818a.f41249q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override
    public void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var != null) {
            qt qtVar = this.f36818a;
            zg.a0 reactionsWindow = qtVar.P.getReactionsWindow();
            if (qtVar.f41247o.contains(n0Var.f54704f)) {
                if (qtVar.f41247o.size() > 1) {
                    qtVar.f41247o.remove(n0Var.f54704f);
                } else {
                    return;
                }
            } else {
                qtVar.f41247o.add(n0Var.f54704f);
                if (qtVar.f41247o.size() > 7) {
                    qtVar.f41247o.remove(0);
                }
            }
            qtVar.P.setSelectedEmojis(qtVar.f41247o);
            if (reactionsWindow != null) {
                zg.w wVar = reactionsWindow.f54546m;
                qtVar.P.p(null, null, false);
                if (wVar != null) {
                    wVar.setSelectedReactions(qtVar.f41247o);
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
