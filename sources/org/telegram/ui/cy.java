package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class cy implements zg.g, org.telegram.ui.Components.do0, org.telegram.ui.Components.ml0, bi.sd, org.telegram.ui.Components.j20 {
    public final int f31786a;
    public final wy f31787b;

    public cy(wy wyVar, int i10) {
        this.f31786a = i10;
        this.f31787b = wyVar;
    }

    @Override
    public bi.xd a(long j3) {
        zh.k kVar;
        nx nxVar = this.f31787b.E0;
        if (nxVar != null) {
            kVar = nxVar.e(j3);
        } else {
            kVar = null;
        }
        return bi.xd.c(kVar);
    }

    @Override
    public void b(long j3, bi.va vaVar) {
        wy wyVar = this.f31787b;
        if (wyVar.E0 != null) {
            wyVar.x4(false, true);
            wyVar.Q = true;
            wyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != wyVar.getUserConfig().getClientUserId()) {
                wyVar.E0.k(j3);
            } else {
                wyVar.E0.S.h1(0, 0);
            }
            wyVar.f38431e0[0].f37645a.getViewTreeObserver().addOnPreDrawListener(new jm(1, this, vaVar));
            return;
        }
        vaVar.run();
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.j6;
        wy wyVar = this.f31787b;
        if (z10) {
            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
            if (j6Var.f19371n0) {
                wyVar.N4(j6Var.getDialogId(), view);
                return true;
            }
        }
        gy gyVar = wyVar.C0;
        bi.y1 y1Var = gyVar.V;
        return wyVar.o4(view, i10, f7, gyVar.f23713b0);
    }

    @Override
    public void d(Canvas canvas) {
        ig1 ig1Var;
        eh.d dVar;
        ig1 ig1Var2;
        eh.d dVar2;
        switch (this.f31786a) {
            case 0:
                wy wyVar = this.f31787b;
                int measuredWidth = wyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = wyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    if (qxVar != null && (qxVar.getFragment() instanceof ig1)) {
                        ig1Var = (ig1) wyVar.F3.getFragment();
                    } else {
                        ig1Var = null;
                    }
                    if (ig1Var != null && ig1Var.getFragmentView() != null && !wyVar.f38459j2 && (dVar = ig1Var.f33698g1) != null) {
                        canvas.save();
                        canvas.translate(ig1Var.getFragmentView().getTranslationX(), ig1Var.getFragmentView().getTranslationY());
                        dVar.u(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    wyVar.l4.b(canvas, -3);
                    return;
                }
                return;
            default:
                wy wyVar2 = this.f31787b;
                int measuredWidth2 = wyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = wyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(wyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar2 = wyVar2.F3;
                    if (qxVar2 != null && (qxVar2.getFragment() instanceof ig1)) {
                        ig1Var2 = (ig1) wyVar2.F3.getFragment();
                    } else {
                        ig1Var2 = null;
                    }
                    if (ig1Var2 != null && ig1Var2.getFragmentView() != null && !wyVar2.f38459j2 && (dVar2 = ig1Var2.f33700h1) != null) {
                        canvas.save();
                        canvas.translate(ig1Var2.getFragmentView().getTranslationX(), ig1Var2.getFragmentView().getTranslationY());
                        dVar2.u(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    wyVar2.l4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f31787b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f31787b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f31787b.finishPreviewFragment();
        }
    }

    public void g(fg.q0 q0Var) {
        wy wyVar = this.f31787b;
        if (!wyVar.f38487p3) {
            return;
        }
        gy gyVar = wyVar.C0;
        if (gyVar != null) {
            gyVar.A0.remove(q0Var);
            gy gyVar2 = wyVar.C0;
            String obj = wyVar.f38457j0.getSearchField().getText().toString();
            View currentView = gyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !gyVar2.f23716e0;
            if (!TextUtils.isEmpty(gyVar2.K0)) {
                z10 = z11;
            }
            gyVar2.K0 = obj;
            gyVar2.O(currentView, gyVar2.getCurrentPosition(), obj, z10);
        }
        wyVar.W4(true, null, null, false, true);
        wyVar.Y.f45144a.q(wyVar.X.f24572r);
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f31787b.finishPreviewFragment();
        }
    }

    @Override
    public void p(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f31787b.movePreviewFragment(f7);
        }
    }

    @Override
    public void u(g.z zVar) {
        ig1 ig1Var;
        ig1 ig1Var2;
        switch (this.f31786a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
                wy wyVar = this.f31787b;
                zVar.a(wyVar.getThemedColor(i10));
                zVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    if (qxVar != null && (qxVar.getFragment() instanceof ig1)) {
                        ig1Var = (ig1) wyVar.F3.getFragment();
                    } else {
                        ig1Var = null;
                    }
                    if (ig1Var != null && ig1Var.getFragmentView() != null && !wyVar.f38459j2) {
                        zVar.f8456b = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.f17928d6;
                wy wyVar2 = this.f31787b;
                zVar.a(wyVar2.getThemedColor(i11));
                zVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar2 = wyVar2.F3;
                    if (qxVar2 != null && (qxVar2.getFragment() instanceof ig1)) {
                        ig1Var2 = (ig1) wyVar2.F3.getFragment();
                    } else {
                        ig1Var2 = null;
                    }
                    if (ig1Var2 != null && ig1Var2.getFragmentView() != null && !wyVar2.f38459j2) {
                        zVar.f8456b = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
