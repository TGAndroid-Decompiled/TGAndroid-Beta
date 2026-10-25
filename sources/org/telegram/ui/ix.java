package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ix implements org.telegram.ui.Components.zo0, org.telegram.ui.Components.cm0, fi.jb, org.telegram.ui.Components.l20 {
    public final cy f40361a;

    public ix(cy cyVar) {
        this.f40361a = cyVar;
    }

    @Override
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40361a.movePreviewFragment(f7);
        }
    }

    @Override
    public fi.nb b(long j10) {
        di.q qVar;
        qw qwVar = this.f40361a.E0;
        if (qwVar != null) {
            qVar = qwVar.e(j10);
        } else {
            qVar = null;
        }
        return fi.nb.c(qVar);
    }

    @Override
    public void c(long j10, bi.r3 r3Var) {
        cy cyVar = this.f40361a;
        if (cyVar.E0 != null) {
            cyVar.F4(false, true);
            cyVar.Q = true;
            cyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != cyVar.getUserConfig().getClientUserId()) {
                cyVar.E0.k(j10);
            } else {
                cyVar.E0.S.h1(0, 0);
            }
            cyVar.f38583e0[0].f37910a.getViewTreeObserver().addOnPreDrawListener(new zl(1, this, r3Var));
            return;
        }
        r3Var.run();
    }

    @Override
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        this.f40361a.P4(p2Var);
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.m6;
        cy cyVar = this.f40361a;
        if (z10) {
            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            if (m6Var.f24464n0) {
                cyVar.V4(m6Var.getDialogId(), view);
                return true;
            }
        }
        jx jxVar = cyVar.C0;
        bi.r1 r1Var = jxVar.f27931a0;
        return cyVar.w4(view, i10, f7, jxVar.f27934d0);
    }

    public void f(ig.p0 p0Var) {
        cy cyVar = this.f40361a;
        if (!cyVar.f38645q3) {
            return;
        }
        jx jxVar = cyVar.C0;
        if (jxVar != null) {
            jxVar.C0.remove(p0Var);
            jx jxVar2 = cyVar.C0;
            String obj = cyVar.f38609j0.getSearchField().getText().toString();
            View currentView = jxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !jxVar2.f27937g0;
            if (!TextUtils.isEmpty(jxVar2.M0)) {
                z10 = z11;
            }
            jxVar2.M0 = obj;
            jxVar2.P(currentView, jxVar2.getCurrentPosition(), obj, z10);
        }
        cyVar.f5(true, null, null, false, true);
        cyVar.Y.f1381a.l(cyVar.X.f30365r);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40361a.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40361a.finishPreviewFragment();
        }
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40361a.movePreviewFragment(f7);
        }
    }
}
