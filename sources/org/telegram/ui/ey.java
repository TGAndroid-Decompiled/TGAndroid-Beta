package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ey implements bh.h, org.telegram.ui.Components.vo0, org.telegram.ui.Components.dm0, di.bc, org.telegram.ui.Components.n20 {
    public final int f35689a;
    public final yy f35690b;

    public ey(yy yyVar, int i10) {
        this.f35689a = i10;
        this.f35690b = yyVar;
    }

    @Override
    public di.fc a(long j10) {
        bi.u uVar;
        px pxVar = this.f35690b.E0;
        if (pxVar != null) {
            uVar = pxVar.e(j10);
        } else {
            uVar = null;
        }
        return di.fc.c(uVar);
    }

    @Override
    public void b(long j10, bi.g gVar) {
        yy yyVar = this.f35690b;
        if (yyVar.E0 != null) {
            yyVar.u4(false, true);
            yyVar.Q = true;
            yyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != yyVar.getUserConfig().getClientUserId()) {
                yyVar.E0.k(j10);
            } else {
                yyVar.E0.S.h1(0, 0);
            }
            yyVar.f42325e0[0].f41980a.getViewTreeObserver().addOnPreDrawListener(new lm(1, this, gVar));
            return;
        }
        gVar.run();
    }

    public void c(hg.p0 p0Var) {
        yy yyVar = this.f35690b;
        if (!yyVar.f42382p3) {
            return;
        }
        iy iyVar = yyVar.C0;
        if (iyVar != null) {
            iyVar.A0.remove(p0Var);
            iy iyVar2 = yyVar.C0;
            String obj = yyVar.f42351j0.getSearchField().getText().toString();
            View currentView = iyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !iyVar2.f31918e0;
            if (!TextUtils.isEmpty(iyVar2.K0)) {
                z10 = z11;
            }
            iyVar2.K0 = obj;
            iyVar2.O(currentView, iyVar2.getCurrentPosition(), obj, z10);
        }
        yyVar.T4(true, null, null, false, true);
        yyVar.Y.f50179a.q(yyVar.X.f27815r);
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        yy yyVar = this.f35690b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f21329n0) {
                yyVar.K4(i6Var.getDialogId(), view);
                return true;
            }
        }
        iy iyVar = yyVar.C0;
        bi.o0 o0Var = iyVar.V;
        return yyVar.l4(view, i10, f7, iyVar.f31915b0);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35690b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f35690b.E4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35690b.finishPreviewFragment();
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35690b.finishPreviewFragment();
        }
    }

    @Override
    public void m0(bh.a aVar) {
        lg1 lg1Var;
        lg1 lg1Var2;
        switch (this.f35689a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
                yy yyVar = this.f35690b;
                aVar.a(yyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar = yyVar.F3;
                    if (sxVar != null && (sxVar.getFragment() instanceof lg1)) {
                        lg1Var = (lg1) yyVar.F3.getFragment();
                    } else {
                        lg1Var = null;
                    }
                    if (lg1Var != null && lg1Var.getFragmentView() != null && !yyVar.f42353j2) {
                        aVar.f2740a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.g6.f19901d6;
                yy yyVar2 = this.f35690b;
                aVar.a(yyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar2 = yyVar2.F3;
                    if (sxVar2 != null && (sxVar2.getFragment() instanceof lg1)) {
                        lg1Var2 = (lg1) yyVar2.F3.getFragment();
                    } else {
                        lg1Var2 = null;
                    }
                    if (lg1Var2 != null && lg1Var2.getFragmentView() != null && !yyVar2.f42353j2) {
                        aVar.f2740a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35690b.movePreviewFragment(f7);
        }
    }

    @Override
    public void v(Canvas canvas) {
        lg1 lg1Var;
        gh.d dVar;
        lg1 lg1Var2;
        gh.d dVar2;
        switch (this.f35689a) {
            case 0:
                yy yyVar = this.f35690b;
                int measuredWidth = yyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = yyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar = yyVar.F3;
                    if (sxVar != null && (sxVar.getFragment() instanceof lg1)) {
                        lg1Var = (lg1) yyVar.F3.getFragment();
                    } else {
                        lg1Var = null;
                    }
                    if (lg1Var != null && lg1Var.getFragmentView() != null && !yyVar.f42353j2 && (dVar = lg1Var.f37974g1) != null) {
                        canvas.save();
                        canvas.translate(lg1Var.getFragmentView().getTranslationX(), lg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    yyVar.f42360k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                yy yyVar2 = this.f35690b;
                int measuredWidth2 = yyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = yyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(yyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sx sxVar2 = yyVar2.F3;
                    if (sxVar2 != null && (sxVar2.getFragment() instanceof lg1)) {
                        lg1Var2 = (lg1) yyVar2.F3.getFragment();
                    } else {
                        lg1Var2 = null;
                    }
                    if (lg1Var2 != null && lg1Var2.getFragmentView() != null && !yyVar2.f42353j2 && (dVar2 = lg1Var2.f37976h1) != null) {
                        canvas.save();
                        canvas.translate(lg1Var2.getFragmentView().getTranslationX(), lg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    yyVar2.f42360k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }
}
