package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ix implements ig.g, org.telegram.ui.Components.dn0, org.telegram.ui.Components.pk0, kh.nb, org.telegram.ui.Components.l10 {
    public final int f39312a;
    public final dy f39313b;

    public ix(dy dyVar, int i9) {
        this.f39312a = i9;
        this.f39313b = dyVar;
    }

    @Override
    public kh.rb a(long j10) {
        ih.q qVar;
        vw vwVar = this.f39313b.A0;
        if (vwVar != null) {
            qVar = vwVar.e(j10);
        } else {
            qVar = null;
        }
        return kh.rb.c(qVar);
    }

    @Override
    public void b(long j10, bg.i2 i2Var) {
        dy dyVar = this.f39313b;
        if (dyVar.A0 != null) {
            dyVar.x4(false, true);
            dyVar.M = true;
            dyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != dyVar.getUserConfig().getClientUserId()) {
                dyVar.A0.k(j10);
            } else {
                dyVar.A0.O.h1(0, 0);
            }
            dyVar.f37629a0[0].f37350a.getViewTreeObserver().addOnPreDrawListener(new ch.f(2, this, i2Var));
            return;
        }
        i2Var.run();
    }

    @Override
    public boolean mo5c(float f10, float f11, int i9, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        dy dyVar = this.f39313b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f24449j0) {
                dyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        mx mxVar = dyVar.f37750y0;
        gh.f1 f1Var = mxVar.R;
        return dyVar.o4(view, i9, f10, mxVar.U);
    }

    @Override
    public void d(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39313b.movePreviewFragment(f10);
        }
    }

    public void e(of.m0 m0Var) {
        dy dyVar = this.f39313b;
        if (!dyVar.f37688l3) {
            return;
        }
        mx mxVar = dyVar.f37750y0;
        if (mxVar != null) {
            mxVar.f29156w0.remove(m0Var);
            mx mxVar2 = dyVar.f37750y0;
            String obj = dyVar.f37656f0.getSearchField().getText().toString();
            View currentView = mxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !mxVar2.f29135a0;
            if (!TextUtils.isEmpty(mxVar2.G0)) {
                z10 = z11;
            }
            mxVar2.G0 = obj;
            mxVar2.O(currentView, mxVar2.getCurrentPosition(), obj, z10);
        }
        dyVar.W4(true, null, null, false, true);
        dyVar.U.f6243a.q(dyVar.T.f30664r);
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f39313b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39313b.finishPreviewFragment();
        }
    }

    @Override
    public void j() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39313b.finishPreviewFragment();
        }
    }

    @Override
    public void k(Canvas canvas) {
        we1 we1Var;
        ng.d dVar;
        we1 we1Var2;
        ng.d dVar2;
        switch (this.f39312a) {
            case 0:
                dy dyVar = this.f39313b;
                int measuredWidth = dyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = dyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = dyVar.B3;
                    if (ywVar != null && (ywVar.getFragment() instanceof we1)) {
                        we1Var = (we1) dyVar.B3.getFragment();
                    } else {
                        we1Var = null;
                    }
                    if (we1Var != null && we1Var.getFragmentView() != null && !dyVar.f37658f2 && (dVar = we1Var.f43749c1) != null) {
                        canvas.save();
                        canvas.translate(we1Var.getFragmentView().getTranslationX(), we1Var.getFragmentView().getTranslationY());
                        dVar.T0(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    dyVar.f37670h4.b(canvas, -3);
                    return;
                }
                return;
            default:
                dy dyVar2 = this.f39313b;
                int measuredWidth2 = dyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = dyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(dyVar2.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = dyVar2.B3;
                    if (ywVar2 != null && (ywVar2.getFragment() instanceof we1)) {
                        we1Var2 = (we1) dyVar2.B3.getFragment();
                    } else {
                        we1Var2 = null;
                    }
                    if (we1Var2 != null && we1Var2.getFragmentView() != null && !dyVar2.f37658f2 && (dVar2 = we1Var2.f43751d1) != null) {
                        canvas.save();
                        canvas.translate(we1Var2.getFragmentView().getTranslationX(), we1Var2.getFragmentView().getTranslationY());
                        dVar2.T0(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    dyVar2.f37670h4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void u(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f39313b.movePreviewFragment(f10);
        }
    }

    @Override
    public void x0(g.x xVar) {
        we1 we1Var;
        we1 we1Var2;
        switch (this.f39312a) {
            case 0:
                int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
                dy dyVar = this.f39313b;
                xVar.a(dyVar.getThemedColor(i9));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar = dyVar.B3;
                    if (ywVar != null && (ywVar.getFragment() instanceof we1)) {
                        we1Var = (we1) dyVar.B3.getFragment();
                    } else {
                        we1Var = null;
                    }
                    if (we1Var != null && we1Var.getFragmentView() != null && !dyVar.f37658f2) {
                        xVar.f7046b = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
                dy dyVar2 = this.f39313b;
                xVar.a(dyVar2.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    yw ywVar2 = dyVar2.B3;
                    if (ywVar2 != null && (ywVar2.getFragment() instanceof we1)) {
                        we1Var2 = (we1) dyVar2.B3.getFragment();
                    } else {
                        we1Var2 = null;
                    }
                    if (we1Var2 != null && we1Var2.getFragmentView() != null && !dyVar2.f37658f2) {
                        xVar.f7046b = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
