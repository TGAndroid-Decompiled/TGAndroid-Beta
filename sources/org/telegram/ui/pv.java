package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class pv extends my0 {
    public boolean T;
    public tw U;
    public final mw V;
    public final Context W;
    public final uw f48673a0;

    public pv(uw uwVar, Context context, mw mwVar, Context context2) {
        super(context);
        this.f48673a0 = uwVar;
        this.V = mwVar;
        this.W = context2;
        this.f47828e = 0.0f;
        this.f47830n = new g2.g((int[]) null);
        this.N = true;
    }

    @Override
    public final void d(boolean z10) {
        tw twVar = this.U;
        twVar.f49899c.G = true;
        twVar.d.P(this.U.f49897a, c());
        tw twVar2 = this.U;
        twVar2.d.H = false;
        twVar2.H.H = false;
        uw uwVar = this.f48673a0;
        uwVar.M4(false, true);
        this.U.f49897a.setClipChildren(true);
        this.U.f49897a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.f49897a.B1(null, 0.0f, z10);
        uwVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            uwVar.R = true;
            if (uwVar.O != 0.0f) {
                uwVar.S = true;
            }
            View view = uwVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        cw cwVar = uwVar.D0;
        if (cwVar != null) {
            cwVar.S();
        }
        uwVar.i5(false, true);
        uwVar.P3();
        uwVar.g5();
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        int i3;
        float f11;
        pi.q qVar;
        int i10;
        uw uwVar = this.f48673a0;
        uwVar.E = true;
        uwVar.F = z10;
        this.V.requestLayout();
        tw twVar = uwVar.f50230f0[0];
        this.U = twVar;
        if (twVar.G == null) {
            twVar.G = new org.telegram.ui.Components.tj0(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.d2) uwVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new ov(this, this.U));
            tw twVar2 = this.U;
            int i11 = this.U.f49904s;
            int i12 = uwVar.X2;
            boolean z11 = uwVar.f50263m2;
            ArrayList arrayList = uwVar.J2;
            i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            twVar2.H = new kg.m(uwVar, this.W, i11, i12, z11, arrayList, i10, uwVar.H);
            tw twVar3 = this.U;
            kg.m mVar = twVar3.H;
            mVar.T = true;
            twVar3.G.setAdapter(mVar);
            tw twVar4 = this.U;
            twVar4.addView(twVar4.G);
        }
        if (!z10) {
            uwVar.R = false;
            if (uwVar.l4() && this.U.f49904s == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            u4.d1 L = this.U.f49897a.L(i3, false);
            if (L != null && L.f55540a.getTop() >= this.U.f49897a.getPaddingTop()) {
                f11 = 0.0f;
            } else {
                f11 = -uwVar.f4();
            }
            uwVar.O4(f11);
        }
        this.U.f49897a.C0();
        tw twVar5 = this.U;
        kg.m mVar2 = twVar5.H;
        mVar2.h = twVar5.f49904s;
        mVar2.f();
        tw twVar6 = this.U;
        twVar6.d.P(twVar6.f49897a, false);
        tw twVar7 = this.U;
        twVar7.d.H = true;
        twVar7.H.H = true;
        twVar7.f49899c.H = false;
        uwVar.M4(true, true);
        uwVar.o4(this.T);
        this.U.d.f();
        this.U.H.f();
        if (!z10) {
            f10 = uwVar.O;
        } else {
            f10 = -uwVar.O;
        }
        tw twVar8 = this.U;
        twVar8.f49897a.B1(twVar8.G, f10, false);
        this.U.f49897a.setClipChildren(false);
        this.U.f49897a.C0();
        uwVar.P3();
        uwVar.g5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uw uwVar = this.f48673a0;
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f10) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        pw pwVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.T != z10) {
            this.T = z10;
        }
        uw uwVar = this.f48673a0;
        View view = uwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (uwVar.X2 != 0 || uwVar.Z2 != 0) {
            Paint paint = uwVar.f50236g1;
            int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
            paint.setColor(i0.a.f(f10, uwVar.getThemedColor(i3), uwVar.getThemedColor(i3)));
        }
        tw twVar = this.U;
        if (twVar != null) {
            twVar.f49897a.setOpenRightFragmentProgress(f10);
        }
        uwVar.O3();
        uwVar.T3();
        uwVar.G3();
        uwVar.Q3();
        tw twVar2 = uwVar.f50230f0[0];
        if (twVar2 != null && (pwVar = twVar2.f49897a) != null) {
            pwVar.requestLayout();
        }
        View view2 = uwVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
