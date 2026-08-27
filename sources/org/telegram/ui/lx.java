package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class lx implements jg.g, org.telegram.ui.Components.fn0, org.telegram.ui.Components.sk0, lh.jb, org.telegram.ui.Components.o10 {

    public final int f40260a;

    public final gy f40261b;

    public lx(gy gyVar, int i10) {
        this.f40260a = i10;
        this.f40261b = gyVar;
    }

    @Override
    public void A(g.y yVar) {
        switch (this.f40260a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
                gy gyVar = this.f40261b;
                yVar.a(gyVar.getThemedColor(i10));
                yVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    bx bxVar = gyVar.B3;
                    we1 we1Var = (bxVar == null || !(bxVar.getFragment() instanceof we1)) ? null : (we1) gyVar.B3.getFragment();
                    if (we1Var != null && we1Var.getFragmentView() != null && !gyVar.f38527f2) {
                        yVar.f6327b = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
                gy gyVar2 = this.f40261b;
                yVar.a(gyVar2.getThemedColor(i11));
                yVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    bx bxVar2 = gyVar2.B3;
                    we1 we1Var2 = (bxVar2 == null || !(bxVar2.getFragment() instanceof we1)) ? null : (we1) gyVar2.B3.getFragment();
                    if (we1Var2 != null && we1Var2.getFragmentView() != null && !gyVar2.f38527f2) {
                        yVar.f6327b = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public lh.nb a(long j10) {
        yw ywVar = this.f40261b.A0;
        return lh.nb.c(ywVar != null ? ywVar.e(j10) : null);
    }

    @Override
    public void b(long j10, cg.b2 b2Var) {
        gy gyVar = this.f40261b;
        if (gyVar.A0 == null) {
            b2Var.run();
            return;
        }
        gyVar.x4(false, true);
        gyVar.M = true;
        gyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == gyVar.getUserConfig().getClientUserId()) {
            gyVar.A0.O.h1(0, 0);
        } else {
            gyVar.A0.k(j10);
        }
        gyVar.f38498a0[0].f38225a.getViewTreeObserver().addOnPreDrawListener(new dh.f(2, this, b2Var));
    }

    @Override
    public boolean mo5c(float f10, float f11, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.e6;
        gy gyVar = this.f40261b;
        if (z10) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            if (e6Var.f24278j0) {
                gyVar.N4(e6Var.getDialogId(), view);
                return true;
            }
        }
        px pxVar = gyVar.f38619y0;
        hh.f1 f1Var = pxVar.R;
        return gyVar.o4(view, i10, f10, pxVar.U);
    }

    @Override
    public void d(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40261b.movePreviewFragment(f10);
        }
    }

    public void e(pf.e0 e0Var) {
        gy gyVar = this.f40261b;
        if (gyVar.f38557l3) {
            px pxVar = gyVar.f38619y0;
            if (pxVar != null) {
                pxVar.f29763w0.remove(e0Var);
                px pxVar2 = gyVar.f38619y0;
                String string = gyVar.f38525f0.getSearchField().getText().toString();
                View currentView = pxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(pxVar2.G0) ? true : !pxVar2.f29742a0;
                pxVar2.G0 = string;
                pxVar2.O(currentView, pxVar2.getCurrentPosition(), string, z10);
            }
            gyVar.W4(true, null, null, false, true);
            gyVar.U.f7043a.q(gyVar.T.f31468r);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.p2 p2Var) {
        this.f40261b.H4(p2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40261b.finishPreviewFragment();
        }
    }

    @Override
    public void i() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40261b.finishPreviewFragment();
        }
    }

    @Override
    public void n(Canvas canvas) {
        og.d dVar;
        og.d dVar2;
        switch (this.f40260a) {
            case 0:
                gy gyVar = this.f40261b;
                int measuredWidth = gyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = gyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(gyVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                if (SharedConfig.chatBlurEnabled()) {
                    bx bxVar = gyVar.B3;
                    we1 we1Var = (bxVar == null || !(bxVar.getFragment() instanceof we1)) ? null : (we1) gyVar.B3.getFragment();
                    if (we1Var != null && we1Var.getFragmentView() != null && !gyVar.f38527f2 && (dVar = we1Var.f43727c1) != null) {
                        canvas.save();
                        canvas.translate(we1Var.getFragmentView().getTranslationX(), we1Var.getFragmentView().getTranslationY());
                        dVar.T0(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    gyVar.f38539h4.b(canvas, -3);
                }
                break;
            default:
                gy gyVar2 = this.f40261b;
                int measuredWidth2 = gyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = gyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(gyVar2.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                if (SharedConfig.chatBlurEnabled()) {
                    bx bxVar2 = gyVar2.B3;
                    we1 we1Var2 = (bxVar2 == null || !(bxVar2.getFragment() instanceof we1)) ? null : (we1) gyVar2.B3.getFragment();
                    if (we1Var2 != null && we1Var2.getFragmentView() != null && !gyVar2.f38527f2 && (dVar2 = we1Var2.f43729d1) != null) {
                        canvas.save();
                        canvas.translate(we1Var2.getFragmentView().getTranslationX(), we1Var2.getFragmentView().getTranslationY());
                        dVar2.T0(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    gyVar2.f38539h4.b(canvas, -2);
                }
                break;
        }
    }

    @Override
    public void s(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f40261b.movePreviewFragment(f10);
        }
    }
}
