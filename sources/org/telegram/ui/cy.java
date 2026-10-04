package org.telegram.ui;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class cy implements org.telegram.ui.Components.mo0, org.telegram.ui.Components.pl0, ci.bc, org.telegram.ui.Components.e20 {
    public final uy f35568a;

    public cy(uy uyVar) {
        this.f35568a = uyVar;
    }

    @Override
    public ci.fc a(long j3) {
        ai.a0 a0Var;
        jx jxVar = this.f35568a.E0;
        if (jxVar != null) {
            a0Var = jxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.fc.c(a0Var);
    }

    @Override
    public void b(long j3, ai.j jVar) {
        uy uyVar = this.f35568a;
        if (uyVar.E0 != null) {
            uyVar.G4(false, true);
            uyVar.Q = true;
            uyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != uyVar.getUserConfig().getClientUserId()) {
                uyVar.E0.k(j3);
            } else {
                uyVar.E0.S.h1(0, 0);
            }
            uyVar.f41393e0[0].f40984a.getViewTreeObserver().addOnPreDrawListener(new dm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        uy uyVar = this.f35568a;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f22258n0) {
                uyVar.W4(i6Var.getDialogId(), view);
                return true;
            }
        }
        dy dyVar = uyVar.C0;
        ai.w0 w0Var = dyVar.W;
        return uyVar.x4(view, i10, f7, dyVar.f30118c0);
    }

    public void d(gg.q0 q0Var) {
        uy uyVar = this.f35568a;
        if (!uyVar.f41449p3) {
            return;
        }
        dy dyVar = uyVar.C0;
        if (dyVar != null) {
            dyVar.B0.remove(q0Var);
            dy dyVar2 = uyVar.C0;
            String obj = uyVar.f41419j0.getSearchField().getText().toString();
            View currentView = dyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !dyVar2.f30121f0;
            if (!TextUtils.isEmpty(dyVar2.L0)) {
                z10 = z11;
            }
            dyVar2.L0 = obj;
            dyVar2.Q(currentView, dyVar2.getCurrentPosition(), obj, z10);
        }
        uyVar.f5(true, null, null, false, true);
        uyVar.Y.f50939a.q(uyVar.X.f26247r);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35568a.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f35568a.Q4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35568a.finishPreviewFragment();
        }
    }

    @Override
    public void i() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35568a.finishPreviewFragment();
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35568a.movePreviewFragment(f7);
        }
    }
}
