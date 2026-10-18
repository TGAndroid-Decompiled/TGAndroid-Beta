package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class jx implements bh.h, org.telegram.ui.Components.ro0, org.telegram.ui.Components.zl0, ei.mb, org.telegram.ui.Components.j20 {
    public final int f38353a;
    public final ey f38354b;

    public jx(ey eyVar, int i10) {
        this.f38353a = i10;
        this.f38354b = eyVar;
    }

    @Override
    public void H(bh.a aVar) {
        te1 te1Var;
        te1 te1Var2;
        switch (this.f38353a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
                ey eyVar = this.f38354b;
                aVar.a(eyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = eyVar.G3;
                    if (ywVar != null && (ywVar.getFragment() instanceof te1)) {
                        te1Var = (te1) eyVar.G3.getFragment();
                    } else {
                        te1Var = null;
                    }
                    if (te1Var != null && te1Var.getFragmentView() != null && !eyVar.f36665j2) {
                        aVar.f4357a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
                ey eyVar2 = this.f38354b;
                aVar.a(eyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = eyVar2.G3;
                    if (ywVar2 != null && (ywVar2.getFragment() instanceof te1)) {
                        te1Var2 = (te1) eyVar2.G3.getFragment();
                    } else {
                        te1Var2 = null;
                    }
                    if (te1Var2 != null && te1Var2.getFragmentView() != null && !eyVar2.f36665j2) {
                        aVar.f4357a = true;
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
        vw vwVar = this.f38354b.E0;
        if (vwVar != null) {
            qVar = vwVar.e(j10);
        } else {
            qVar = null;
        }
        return ei.qb.c(qVar);
    }

    @Override
    public void b(long j10, ai.t3 t3Var) {
        ey eyVar = this.f38354b;
        if (eyVar.E0 != null) {
            eyVar.v4(false, true);
            eyVar.Q = true;
            eyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != eyVar.getUserConfig().getClientUserId()) {
                eyVar.E0.k(j10);
            } else {
                eyVar.E0.S.h1(0, 0);
            }
            eyVar.f36637e0[0].f36300a.getViewTreeObserver().addOnPreDrawListener(new zl(1, this, t3Var));
            return;
        }
        t3Var.run();
    }

    public void c(hg.o0 o0Var) {
        ey eyVar = this.f38354b;
        if (!eyVar.f36699q3) {
            return;
        }
        nx nxVar = eyVar.C0;
        if (nxVar != null) {
            nxVar.A0.remove(o0Var);
            nx nxVar2 = eyVar.C0;
            String obj = eyVar.f36663j0.getSearchField().getText().toString();
            View currentView = nxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !nxVar2.f31343e0;
            if (!TextUtils.isEmpty(nxVar2.K0)) {
                z10 = z11;
            }
            nxVar2.K0 = obj;
            nxVar2.O(currentView, nxVar2.getCurrentPosition(), obj, z10);
        }
        eyVar.U4(true, null, null, false, true);
        eyVar.Y.f51566a.q(eyVar.X.f27712r);
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        ey eyVar = this.f38354b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f22347n0) {
                eyVar.L4(h6Var.getDialogId(), view);
                return true;
            }
        }
        nx nxVar = eyVar.C0;
        ai.u1 u1Var = nxVar.V;
        return eyVar.m4(view, i10, f7, nxVar.f31340b0);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38354b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f38354b.F4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38354b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38354b.finishPreviewFragment();
        }
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f38354b.movePreviewFragment(f7);
        }
    }

    @Override
    public void r(Canvas canvas) {
        te1 te1Var;
        gh.d dVar;
        te1 te1Var2;
        gh.d dVar2;
        switch (this.f38353a) {
            case 0:
                ey eyVar = this.f38354b;
                int measuredWidth = eyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = eyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = eyVar.G3;
                    if (ywVar != null && (ywVar.getFragment() instanceof te1)) {
                        te1Var = (te1) eyVar.G3.getFragment();
                    } else {
                        te1Var = null;
                    }
                    if (te1Var != null && te1Var.getFragmentView() != null && !eyVar.f36665j2 && (dVar = te1Var.f41687g1) != null) {
                        canvas.save();
                        canvas.translate(te1Var.getFragmentView().getTranslationX(), te1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    eyVar.l4.b(canvas, -3);
                    return;
                }
                return;
            default:
                ey eyVar2 = this.f38354b;
                int measuredWidth2 = eyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = eyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(eyVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = eyVar2.G3;
                    if (ywVar2 != null && (ywVar2.getFragment() instanceof te1)) {
                        te1Var2 = (te1) eyVar2.G3.getFragment();
                    } else {
                        te1Var2 = null;
                    }
                    if (te1Var2 != null && te1Var2.getFragmentView() != null && !eyVar2.f36665j2 && (dVar2 = te1Var2.f41689h1) != null) {
                        canvas.save();
                        canvas.translate(te1Var2.getFragmentView().getTranslationX(), te1Var2.getFragmentView().getTranslationY());
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
