package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lx implements org.telegram.ui.Components.ap0, org.telegram.ui.Components.dm0, fi.jb, org.telegram.ui.Components.l20 {
    public final ey f41273a;

    public lx(ey eyVar) {
        this.f41273a = eyVar;
    }

    @Override
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41273a.movePreviewFragment(f7);
        }
    }

    @Override
    public fi.nb b(long j10) {
        di.q qVar;
        sw swVar = this.f41273a.E0;
        if (swVar != null) {
            qVar = swVar.e(j10);
        } else {
            qVar = null;
        }
        return fi.nb.c(qVar);
    }

    @Override
    public void c(long j10, bi.r3 r3Var) {
        ey eyVar = this.f41273a;
        if (eyVar.E0 != null) {
            eyVar.F4(false, true);
            eyVar.Q = true;
            eyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != eyVar.getUserConfig().getClientUserId()) {
                eyVar.E0.k(j10);
            } else {
                eyVar.E0.S.h1(0, 0);
            }
            eyVar.f38998e0[0].f38702a.getViewTreeObserver().addOnPreDrawListener(new bm(1, this, r3Var));
            return;
        }
        r3Var.run();
    }

    @Override
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        this.f41273a.P4(p2Var);
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.m6;
        ey eyVar = this.f41273a;
        if (z10) {
            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            if (m6Var.f24468n0) {
                eyVar.V4(m6Var.getDialogId(), view);
                return true;
            }
        }
        mx mxVar = eyVar.C0;
        bi.r1 r1Var = mxVar.f28241a0;
        return eyVar.w4(view, i10, f7, mxVar.f28244d0);
    }

    public void f(ig.p0 p0Var) {
        ey eyVar = this.f41273a;
        if (!eyVar.f39060q3) {
            return;
        }
        mx mxVar = eyVar.C0;
        if (mxVar != null) {
            mxVar.C0.remove(p0Var);
            mx mxVar2 = eyVar.C0;
            String obj = eyVar.f39024j0.getSearchField().getText().toString();
            View currentView = mxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !mxVar2.f28247g0;
            if (!TextUtils.isEmpty(mxVar2.M0)) {
                z10 = z11;
            }
            mxVar2.M0 = obj;
            mxVar2.P(currentView, mxVar2.getCurrentPosition(), obj, z10);
        }
        eyVar.f5(true, null, null, false, true);
        eyVar.Y.f1381a.l(eyVar.X.f30347r);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41273a.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41273a.finishPreviewFragment();
        }
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f41273a.movePreviewFragment(f7);
        }
    }
}
