package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class cy implements ah.k, org.telegram.ui.Components.vn0, org.telegram.ui.Components.dl0, ci.fc, org.telegram.ui.Components.a20 {
    public final int f32971a;
    public final wy f32972b;

    public cy(wy wyVar, int i10) {
        this.f32971a = i10;
        this.f32972b = wyVar;
    }

    @Override
    public ci.jc a(long j3) {
        ai.a0 a0Var;
        nx nxVar = this.f32972b.E0;
        if (nxVar != null) {
            a0Var = nxVar.e(j3);
        } else {
            a0Var = null;
        }
        return ci.jc.c(a0Var);
    }

    @Override
    public void b(Canvas canvas) {
        fg1 fg1Var;
        fh.d dVar;
        fg1 fg1Var2;
        fh.d dVar2;
        switch (this.f32971a) {
            case 0:
                wy wyVar = this.f32972b;
                int measuredWidth = wyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = wyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18863d6));
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    if (qxVar != null && (qxVar.getFragment() instanceof fg1)) {
                        fg1Var = (fg1) wyVar.F3.getFragment();
                    } else {
                        fg1Var = null;
                    }
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !wyVar.f39249j2 && (dVar = fg1Var.f33657g1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var.getFragmentView().getTranslationX(), fg1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    wyVar.f39255k4.b(canvas, -3);
                    return;
                }
                return;
            default:
                wy wyVar2 = this.f32972b;
                int measuredWidth2 = wyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = wyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(wyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f18863d6));
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar2 = wyVar2.F3;
                    if (qxVar2 != null && (qxVar2.getFragment() instanceof fg1)) {
                        fg1Var2 = (fg1) wyVar2.F3.getFragment();
                    } else {
                        fg1Var2 = null;
                    }
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !wyVar2.f39249j2 && (dVar2 = fg1Var2.f33659h1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var2.getFragmentView().getTranslationX(), fg1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    wyVar2.f39255k4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        wy wyVar = this.f32972b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f20208n0) {
                wyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        gy gyVar = wyVar.C0;
        ai.w0 w0Var = gyVar.W;
        return wyVar.o4(view, i10, f7, gyVar.f30551c0);
    }

    @Override
    public void d(long j3, ai.j jVar) {
        wy wyVar = this.f32972b;
        if (wyVar.E0 != null) {
            wyVar.x4(false, true);
            wyVar.Q = true;
            wyVar.fragmentView.invalidate();
            if (j3 != 0 && j3 != wyVar.getUserConfig().getClientUserId()) {
                wyVar.E0.k(j3);
            } else {
                wyVar.E0.S.h1(0, 0);
            }
            wyVar.f39221e0[0].f38527a.getViewTreeObserver().addOnPreDrawListener(new hm(1, this, jVar));
            return;
        }
        jVar.run();
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f32972b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f32972b.H4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f32972b.finishPreviewFragment();
        }
    }

    @Override
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f32972b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        wy wyVar = this.f32972b;
        if (!wyVar.f39277p3) {
            return;
        }
        gy gyVar = wyVar.C0;
        if (gyVar != null) {
            gyVar.B0.remove(q0Var);
            gy gyVar2 = wyVar.C0;
            String obj = wyVar.f39247j0.getSearchField().getText().toString();
            View currentView = gyVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !gyVar2.f30554f0;
            if (!TextUtils.isEmpty(gyVar2.L0)) {
                z10 = z11;
            }
            gyVar2.L0 = obj;
            gyVar2.P(currentView, gyVar2.getCurrentPosition(), obj, z10);
        }
        wyVar.W4(true, null, null, false, true);
        wyVar.Y.f46848a.q(wyVar.X.f22546r);
    }

    @Override
    public void m(ah.a aVar) {
        fg1 fg1Var;
        fg1 fg1Var2;
        switch (this.f32971a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.f18863d6;
                wy wyVar = this.f32972b;
                aVar.a(wyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar = wyVar.F3;
                    if (qxVar != null && (qxVar.getFragment() instanceof fg1)) {
                        fg1Var = (fg1) wyVar.F3.getFragment();
                    } else {
                        fg1Var = null;
                    }
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !wyVar.f39249j2) {
                        aVar.f417a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.f18863d6;
                wy wyVar2 = this.f32972b;
                aVar.a(wyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    qx qxVar2 = wyVar2.F3;
                    if (qxVar2 != null && (qxVar2.getFragment() instanceof fg1)) {
                        fg1Var2 = (fg1) wyVar2.F3.getFragment();
                    } else {
                        fg1Var2 = null;
                    }
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !wyVar2.f39249j2) {
                        aVar.f417a = true;
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
            this.f32972b.movePreviewFragment(f7);
        }
    }
}
