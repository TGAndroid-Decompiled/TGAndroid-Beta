package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class hx implements bh.h, org.telegram.ui.Components.so0, org.telegram.ui.Components.am0, ei.mb, org.telegram.ui.Components.j20 {
    public final int f37816a;
    public final cy f37817b;

    public hx(cy cyVar, int i10) {
        this.f37816a = i10;
        this.f37817b = cyVar;
    }

    @Override
    public void J(bh.a aVar) {
        re1 re1Var;
        re1 re1Var2;
        switch (this.f37816a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.f20993d6;
                cy cyVar = this.f37817b;
                aVar.a(cyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar = cyVar.G3;
                    if (wwVar != null && (wwVar.getFragment() instanceof re1)) {
                        re1Var = (re1) cyVar.G3.getFragment();
                    } else {
                        re1Var = null;
                    }
                    if (re1Var != null && re1Var.getFragmentView() != null && !cyVar.f36123j2) {
                        aVar.f4353a = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.f20993d6;
                cy cyVar2 = this.f37817b;
                aVar.a(cyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar2 = cyVar2.G3;
                    if (wwVar2 != null && (wwVar2.getFragment() instanceof re1)) {
                        re1Var2 = (re1) cyVar2.G3.getFragment();
                    } else {
                        re1Var2 = null;
                    }
                    if (re1Var2 != null && re1Var2.getFragmentView() != null && !cyVar2.f36123j2) {
                        aVar.f4353a = true;
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
        tw twVar = this.f37817b.E0;
        if (twVar != null) {
            qVar = twVar.e(j10);
        } else {
            qVar = null;
        }
        return ei.qb.c(qVar);
    }

    @Override
    public void b(Canvas canvas) {
        re1 re1Var;
        gh.d dVar;
        re1 re1Var2;
        gh.d dVar2;
        switch (this.f37816a) {
            case 0:
                cy cyVar = this.f37817b;
                int measuredWidth = cyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = cyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar = cyVar.G3;
                    if (wwVar != null && (wwVar.getFragment() instanceof re1)) {
                        re1Var = (re1) cyVar.G3.getFragment();
                    } else {
                        re1Var = null;
                    }
                    if (re1Var != null && re1Var.getFragmentView() != null && !cyVar.f36123j2 && (dVar = re1Var.f41168g1) != null) {
                        canvas.save();
                        canvas.translate(re1Var.getFragmentView().getTranslationX(), re1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    cyVar.l4.b(canvas, -3);
                    return;
                }
                return;
            default:
                cy cyVar2 = this.f37817b;
                int measuredWidth2 = cyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = cyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(cyVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ww wwVar2 = cyVar2.G3;
                    if (wwVar2 != null && (wwVar2.getFragment() instanceof re1)) {
                        re1Var2 = (re1) cyVar2.G3.getFragment();
                    } else {
                        re1Var2 = null;
                    }
                    if (re1Var2 != null && re1Var2.getFragmentView() != null && !cyVar2.f36123j2 && (dVar2 = re1Var2.f41170h1) != null) {
                        canvas.save();
                        canvas.translate(re1Var2.getFragmentView().getTranslationX(), re1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    cyVar2.l4.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public void c(long j10, ai.v3 v3Var) {
        cy cyVar = this.f37817b;
        if (cyVar.E0 != null) {
            cyVar.v4(false, true);
            cyVar.Q = true;
            cyVar.fragmentView.invalidate();
            if (j10 != 0 && j10 != cyVar.getUserConfig().getClientUserId()) {
                cyVar.E0.k(j10);
            } else {
                cyVar.E0.S.h1(0, 0);
            }
            cyVar.f36095e0[0].f35446a.getViewTreeObserver().addOnPreDrawListener(new xl(1, this, v3Var));
            return;
        }
        v3Var.run();
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        cy cyVar = this.f37817b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.f22354n0) {
                cyVar.L4(h6Var.getDialogId(), view);
                return true;
            }
        }
        lx lxVar = cyVar.C0;
        ai.u1 u1Var = lxVar.V;
        return cyVar.m4(view, i10, f7, lxVar.f32182b0);
    }

    @Override
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f37817b.movePreviewFragment(f7);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.f37817b.F4(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f37817b.finishPreviewFragment();
        }
    }

    public void g(hg.o0 o0Var) {
        cy cyVar = this.f37817b;
        if (!cyVar.f36157q3) {
            return;
        }
        lx lxVar = cyVar.C0;
        if (lxVar != null) {
            lxVar.A0.remove(o0Var);
            lx lxVar2 = cyVar.C0;
            String obj = cyVar.f36121j0.getSearchField().getText().toString();
            View currentView = lxVar2.getCurrentView();
            boolean z10 = true;
            boolean z11 = !lxVar2.f32185e0;
            if (!TextUtils.isEmpty(lxVar2.K0)) {
                z10 = z11;
            }
            lxVar2.K0 = obj;
            lxVar2.O(currentView, lxVar2.getCurrentPosition(), obj, z10);
        }
        cyVar.U4(true, null, null, false, true);
        cyVar.Y.f51576a.q(cyVar.X.f27729r);
    }

    @Override
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f37817b.finishPreviewFragment();
        }
    }

    @Override
    public void o(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.f37817b.movePreviewFragment(f7);
        }
    }
}
