package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dt implements r0.o, org.telegram.ui.Components.ok0 {
    public final rt f33529a;

    public dt(rt rtVar) {
        this.f33529a = rtVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        this.f33529a.f38045q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        if (q0Var != null) {
            rt rtVar = this.f33529a;
            mg.d0 reactionsWindow = rtVar.P.getReactionsWindow();
            if (rtVar.f38043o.contains(q0Var.f14095f)) {
                if (rtVar.f38043o.size() > 1) {
                    rtVar.f38043o.remove(q0Var.f14095f);
                } else {
                    return;
                }
            } else {
                rtVar.f38043o.add(q0Var.f14095f);
                if (rtVar.f38043o.size() > 7) {
                    rtVar.f38043o.remove(0);
                }
            }
            rtVar.P.setSelectedEmojis(rtVar.f38043o);
            if (reactionsWindow != null) {
                mg.z zVar = reactionsWindow.f13969m;
                rtVar.P.p(null, null, false);
                if (zVar != null) {
                    zVar.setSelectedReactions(rtVar.f38043o);
                    zVar.setRecentReactions(rtVar.P.S);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void m() {
    }

    @Override
    public void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
