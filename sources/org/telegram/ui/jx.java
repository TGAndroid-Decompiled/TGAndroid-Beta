package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class jx implements bh.h, org.telegram.ui.Components.vo0, org.telegram.ui.Components.dm0, ei.mb, org.telegram.ui.Components.j20 {
    public final int f38719a;
    public final ey f38720b;

    public jx(ey eyVar, int i10) {
        this.f38719a = i10;
        this.f38720b = eyVar;
    }

    @Override
    public void J(bh.a aVar) {
        ye1 ye1Var;
        ye1 ye1Var2;
        switch (this.f38719a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
                ey eyVar = this.f38720b;
                aVar.a(eyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = eyVar.G3;
                    if (ywVar != null && (ywVar.getFragment() instanceof ye1)) {
                        ye1Var = (ye1) eyVar.G3.getFragment();
                    } else {
                        ye1Var = null;
                    }
                    if (ye1Var != null && ye1Var.getFragmentView() != null && !eyVar.f37087j2) {
                        aVar.f4360a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.k6.f21183d6;
                ey eyVar2 = this.f38720b;
                aVar.a(eyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = eyVar2.G3;
                    if (ywVar2 != null && (ywVar2.getFragment() instanceof ye1)) {
                        ye1Var2 = (ye1) eyVar2.G3.getFragment();
                    } else {
                        ye1Var2 = null;
                    }
                    if (ye1Var2 != null && ye1Var2.getFragmentView() != null && !eyVar2.f37087j2) {
                        aVar.f4360a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public ei.qb a(long j10) {
        ci.q qVar;
        vw vwVar = this.f38720b.E0;
        if (vwVar != null) {
            qVar = vwVar.e(j10);
        } else {
            qVar = null;
        }
        return ei.qb.c(qVar);
    }

    @Override
    public void b(long j10, ai.v3 v3Var) {
        ey eyVar = this.f38720b;
        if (eyVar.E0 != null) {
            eyVar.v4(false, true);
            eyVar.Q = true;
            eyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != eyVar.getUserConfig().getClientUserId()) {
                eyVar.E0.k(j10);
            } else {
                eyVar.E0.S.h1(0, 0);
            }
            eyVar.f37059e0[0].f36750a.getViewTreeObserver().addOnPreDrawListener(new yl(1, this, v3Var));
            return;
        }
        v3Var.run();
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        ey eyVar = this.f38720b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f22521n0) {
                eyVar.L4(i6Var.getDialogId(), view);
                return true;
            }
        }
        nx nxVar = eyVar.C0;
        ai.u1 u1Var = nxVar.V;
        return eyVar.m4(view, i10, f7, nxVar.f24799b0);
    }

    @Override
    public void d(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38720b.movePreviewFragment(f7);
        }
    }

    @Override
    public void e(org.telegram.ui.Cells.q2 q2Var) {
        this.f38720b.F4(q2Var);
    }

    public void f(hg.o0 o0Var) {
        ey eyVar = this.f38720b;
        if (!eyVar.f37121q3) {
            return;
        }
        nx nxVar = eyVar.C0;
        if (nxVar != null) {
            nxVar.A0.remove(o0Var);
            nx nxVar2 = eyVar.C0;
            String obj = eyVar.f37085j0.getSearchField().getText().toString();
            View currentView = nxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !nxVar2.f24802e0;
            if (!TextUtils.isEmpty(nxVar2.K0)) {
                z10 = z11;
            }
            nxVar2.K0 = obj;
            nxVar2.N(currentView, nxVar2.getCurrentPosition(), obj, z10);
        }
        eyVar.V4(true, null, null, false, true);
        eyVar.Y.f52039a.q(eyVar.X.f27836r);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38720b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38720b.finishPreviewFragment();
        }
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38720b.movePreviewFragment(f7);
        }
    }

    @Override
    public void z(Canvas canvas) {
        ye1 ye1Var;
        gh.d dVar;
        ye1 ye1Var2;
        gh.d dVar2;
        switch (this.f38719a) {
            case 0:
                ey eyVar = this.f38720b;
                int measuredWidth = eyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = eyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = eyVar.G3;
                    if (ywVar != null && (ywVar.getFragment() instanceof ye1)) {
                        ye1Var = (ye1) eyVar.G3.getFragment();
                    } else {
                        ye1Var = null;
                    }
                    if (ye1Var != null && ye1Var.getFragmentView() != null && !eyVar.f37087j2 && (dVar = ye1Var.f43811h1) != null) {
                        canvas.save();
                        canvas.translate(ye1Var.getFragmentView().getTranslationX(), ye1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    eyVar.l4.b(canvas, -3);
                    return;
                }
                return;
            default:
                ey eyVar2 = this.f38720b;
                int measuredWidth2 = eyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = eyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(eyVar2.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = eyVar2.G3;
                    if (ywVar2 != null && (ywVar2.getFragment() instanceof ye1)) {
                        ye1Var2 = (ye1) eyVar2.G3.getFragment();
                    } else {
                        ye1Var2 = null;
                    }
                    if (ye1Var2 != null && ye1Var2.getFragmentView() != null && !eyVar2.f37087j2 && (dVar2 = ye1Var2.f43813i1) != null) {
                        canvas.save();
                        canvas.translate(ye1Var2.getFragmentView().getTranslationX(), ye1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    eyVar2.l4.b(canvas, -2);
                    return;
                }
                return;
        }
    }
}
