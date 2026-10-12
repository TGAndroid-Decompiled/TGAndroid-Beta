package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ay implements ah.j, org.telegram.ui.Components.fp0, org.telegram.ui.Components.nm0, ci.cc, org.telegram.ui.Components.u20 {
    public final int f35993a;
    public final vy f35994b;

    public ay(vy vyVar, int i10) {
        this.f35993a = i10;
        this.f35994b = vyVar;
    }

    @Override
    public ci.gc a(long j3) {
        ai.a0 a0Var;
        mx mxVar = this.f35994b.E0;
        if (mxVar != null) {
            a0Var = mxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.gc.c(a0Var);
    }

    @Override
    public void b(long j3, ai.j jVar) {
        vy vyVar = this.f35994b;
        if (vyVar.E0 != null) {
            vyVar.u4(false, true);
            vyVar.Q = true;
            vyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != vyVar.getUserConfig().getClientUserId()) {
                vyVar.E0.k(j3);
            } else {
                vyVar.E0.S.h1(0, 0);
            }
            vyVar.f42903e0[0].f42611a.getViewTreeObserver().addOnPreDrawListener(new km(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        vy vyVar = this.f35994b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.f22019n0) {
                vyVar.K4(i6Var.getDialogId(), view);
                return true;
            }
        }
        fy fyVar = vyVar.C0;
        ai.w0 w0Var = fyVar.V;
        return vyVar.l4(view, i10, f7, fyVar.f27591b0);
    }

    public void d(gg.p0 p0Var) {
        vy vyVar = this.f35994b;
        if (!vyVar.f42959p3) {
            return;
        }
        fy fyVar = vyVar.C0;
        if (fyVar != null) {
            fyVar.A0.remove(p0Var);
            fy fyVar2 = vyVar.C0;
            String obj = vyVar.f42929j0.getSearchField().getText().toString();
            View currentView = fyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !fyVar2.f27594e0;
            if (!TextUtils.isEmpty(fyVar2.K0)) {
                z10 = z11;
            }
            fyVar2.K0 = obj;
            fyVar2.O(currentView, fyVar2.getCurrentPosition(), obj, z10);
        }
        vyVar.T4(true, null, null, false, true);
        vyVar.Y.f52381a.q(vyVar.X.f31362r);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35994b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.f35994b.E4(s2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35994b.finishPreviewFragment();
        }
    }

    @Override
    public void g0(ah.a aVar) {
        hg1 hg1Var;
        hg1 hg1Var2;
        switch (this.f35993a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.f20559d6;
                vy vyVar = this.f35994b;
                aVar.a(vyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    px pxVar = vyVar.F3;
                    if (pxVar != null && (pxVar.getFragment() instanceof hg1)) {
                        hg1Var = (hg1) vyVar.F3.getFragment();
                    } else {
                        hg1Var = null;
                    }
                    if (hg1Var != null && hg1Var.getFragmentView() != null && !vyVar.f42931j2) {
                        aVar.f538a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.f20559d6;
                vy vyVar2 = this.f35994b;
                aVar.a(vyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    px pxVar2 = vyVar2.F3;
                    if (pxVar2 != null && (pxVar2.getFragment() instanceof hg1)) {
                        hg1Var2 = (hg1) vyVar2.F3.getFragment();
                    } else {
                        hg1Var2 = null;
                    }
                    if (hg1Var2 != null && hg1Var2.getFragmentView() != null && !vyVar2.f42931j2) {
                        aVar.f538a = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35994b.finishPreviewFragment();
        }
    }

    @Override
    public void l(Canvas canvas) {
        hg1 hg1Var;
        fh.d dVar;
        hg1 hg1Var2;
        fh.d dVar2;
        switch (this.f35993a) {
            case 0:
                vy vyVar = this.f35994b;
                int measuredWidth = vyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = vyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(vyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
                if (SharedConfig.chatBlurEnabled()) {
                    px pxVar = vyVar.F3;
                    if (pxVar != null && (pxVar.getFragment() instanceof hg1)) {
                        hg1Var = (hg1) vyVar.F3.getFragment();
                    } else {
                        hg1Var = null;
                    }
                    if (hg1Var != null && hg1Var.getFragmentView() != null && !vyVar.f42931j2 && (dVar = hg1Var.f38394g1) != null) {
                        canvas.save();
                        canvas.translate(hg1Var.getFragmentView().getTranslationX(), hg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    vyVar.f42937k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                vy vyVar2 = this.f35994b;
                int measuredWidth2 = vyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = vyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(vyVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
                if (SharedConfig.chatBlurEnabled()) {
                    px pxVar2 = vyVar2.F3;
                    if (pxVar2 != null && (pxVar2.getFragment() instanceof hg1)) {
                        hg1Var2 = (hg1) vyVar2.F3.getFragment();
                    } else {
                        hg1Var2 = null;
                    }
                    if (hg1Var2 != null && hg1Var2.getFragmentView() != null && !vyVar2.f42931j2 && (dVar2 = hg1Var2.f38396h1) != null) {
                        canvas.save();
                        canvas.translate(hg1Var2.getFragmentView().getTranslationX(), hg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    vyVar2.f42937k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f35994b.movePreviewFragment(f7);
        }
    }
}
