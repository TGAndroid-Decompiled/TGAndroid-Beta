package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class kx implements lg.g, org.telegram.ui.Components.pn0, org.telegram.ui.Components.cl0, nh.xa, org.telegram.ui.Components.w10 {
    public final int f40033a;
    public final fy f40034b;

    public kx(fy fyVar, int i10) {
        this.f40033a = i10;
        this.f40034b = fyVar;
    }

    @Override
    public nh.bb a(long j10) {
        lh.o oVar;
        xw xwVar = this.f40034b.A0;
        if (xwVar != null) {
            oVar = xwVar.e(j10);
        } else {
            oVar = null;
        }
        return nh.bb.c(oVar);
    }

    @Override
    public boolean mo17b(float f9, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.f6;
        fy fyVar = this.f40034b;
        if (z10) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.f24329j0) {
                fyVar.N4(f6Var.getDialogId(), view);
                return true;
            }
        }
        ox oxVar = fyVar.f38377y0;
        jh.e1 e1Var = oxVar.R;
        return fyVar.o4(view, i10, f9, oxVar.U);
    }

    @Override
    public void c(long j10, eg.z1 z1Var) {
        fy fyVar = this.f40034b;
        if (fyVar.A0 != null) {
            fyVar.x4(false, true);
            fyVar.M = true;
            fyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != fyVar.getUserConfig().getClientUserId()) {
                fyVar.A0.k(j10);
            } else {
                fyVar.A0.O.h1(0, 0);
            }
            fyVar.f38256a0[0].f37921a.getViewTreeObserver().addOnPreDrawListener(new fh.f(2, this, z1Var));
            return;
        }
        z1Var.run();
    }

    @Override
    public void d(Canvas canvas) {
        ze1 ze1Var;
        qg.d dVar;
        ze1 ze1Var2;
        qg.d dVar2;
        switch (this.f40033a) {
            case 0:
                fy fyVar = this.f40034b;
                int measuredWidth = fyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = fyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar = fyVar.B3;
                    if (axVar != null && (axVar.getFragment() instanceof ze1)) {
                        ze1Var = (ze1) fyVar.B3.getFragment();
                    } else {
                        ze1Var = null;
                    }
                    if (ze1Var != null && ze1Var.getFragmentView() != null && !fyVar.f38285f2 && (dVar = ze1Var.f45163c1) != null) {
                        canvas.save();
                        canvas.translate(ze1Var.getFragmentView().getTranslationX(), ze1Var.getFragmentView().getTranslationY());
                        dVar.E0(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    fyVar.f38297h4.b(canvas, -3);
                    return;
                }
                return;
            default:
                fy fyVar2 = this.f40034b;
                int measuredWidth2 = fyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = fyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(fyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar2 = fyVar2.B3;
                    if (axVar2 != null && (axVar2.getFragment() instanceof ze1)) {
                        ze1Var2 = (ze1) fyVar2.B3.getFragment();
                    } else {
                        ze1Var2 = null;
                    }
                    if (ze1Var2 != null && ze1Var2.getFragmentView() != null && !fyVar2.f38285f2 && (dVar2 = ze1Var2.f45165d1) != null) {
                        canvas.save();
                        canvas.translate(ze1Var2.getFragmentView().getTranslationX(), ze1Var2.getFragmentView().getTranslationY());
                        dVar2.E0(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    fyVar2.f38297h4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40034b.movePreviewFragment(f9);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.p2 p2Var) {
        this.f40034b.H4(p2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40034b.finishPreviewFragment();
        }
    }

    public void g(rf.f0 f0Var) {
        fy fyVar = this.f40034b;
        if (!fyVar.f38315l3) {
            return;
        }
        ox oxVar = fyVar.f38377y0;
        if (oxVar != null) {
            oxVar.f33009w0.remove(f0Var);
            ox oxVar2 = fyVar.f38377y0;
            String obj = fyVar.f38283f0.getSearchField().getText().toString();
            View currentView = oxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !oxVar2.f32988a0;
            if (!TextUtils.isEmpty(oxVar2.G0)) {
                z10 = z11;
            }
            oxVar2.G0 = obj;
            oxVar2.O(currentView, oxVar2.getCurrentPosition(), obj, z10);
        }
        fyVar.W4(true, null, null, false, true);
        fyVar.U.f11657a.q(fyVar.T.f34546r);
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40034b.finishPreviewFragment();
        }
    }

    @Override
    public void q(g.x xVar) {
        ze1 ze1Var;
        ze1 ze1Var2;
        switch (this.f40033a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
                fy fyVar = this.f40034b;
                xVar.a(fyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar = fyVar.B3;
                    if (axVar != null && (axVar.getFragment() instanceof ze1)) {
                        ze1Var = (ze1) fyVar.B3.getFragment();
                    } else {
                        ze1Var = null;
                    }
                    if (ze1Var != null && ze1Var.getFragmentView() != null && !fyVar.f38285f2) {
                        xVar.f6956b = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
                fy fyVar2 = this.f40034b;
                xVar.a(fyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ax axVar2 = fyVar2.B3;
                    if (axVar2 != null && (axVar2.getFragment() instanceof ze1)) {
                        ze1Var2 = (ze1) fyVar2.B3.getFragment();
                    } else {
                        ze1Var2 = null;
                    }
                    if (ze1Var2 != null && ze1Var2.getFragmentView() != null && !fyVar2.f38285f2) {
                        xVar.f6956b = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void r(float f9) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40034b.movePreviewFragment(f9);
        }
    }
}
