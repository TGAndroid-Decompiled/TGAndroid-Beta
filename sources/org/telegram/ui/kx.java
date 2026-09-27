package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class kx extends f41 {
    public boolean S;
    public sy T;
    public final my U;
    public final Context V;
    public final ty W;

    public kx(ty tyVar, Context context, my myVar, Context context2) {
        super(context);
        this.W = tyVar;
        this.U = myVar;
        this.V = context2;
        this.e = 0.0f;
        this.f33415n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        sy syVar = this.T;
        syVar.f37595c.G = true;
        syVar.d.O(this.T.f37593a, c());
        sy syVar2 = this.T;
        syVar2.d.G = false;
        syVar2.G.G = false;
        ty tyVar = this.W;
        tyVar.J4(false, true);
        this.T.f37593a.setClipChildren(true);
        this.T.f37593a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f37593a.z1(null, 0.0f, z10);
        tyVar.f38075y = false;
        this.U.requestLayout();
        if (!c()) {
            tyVar.Q = true;
            tyVar.R = true;
            View view = tyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        ay ayVar = tyVar.C0;
        if (ayVar != null) {
            ayVar.S();
        }
        tyVar.e5(false, true);
        tyVar.M3();
        tyVar.d5();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        li.l lVar;
        int i10;
        ty tyVar = this.W;
        tyVar.f38075y = true;
        tyVar.E = z10;
        this.U.requestLayout();
        sy syVar = tyVar.f37976e0[0];
        this.T = syVar;
        if (syVar.F == null) {
            syVar.F = new org.telegram.ui.Components.yl0(this.V, null);
            lVar = ((org.telegram.ui.ActionBar.o2) tyVar).glassEngine;
            lVar.b(this.T.F);
            this.T.F.setLayoutManager(new jx(this, this.T));
            sy syVar2 = this.T;
            int i11 = this.T.f37599s;
            int i12 = tyVar.V2;
            boolean z11 = tyVar.f38012l2;
            ArrayList arrayList = tyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.o2) tyVar).currentAccount;
            syVar2.G = new gg.m(tyVar, this.V, i11, i12, z11, arrayList, i10, tyVar.G);
            sy syVar3 = this.T;
            gg.m mVar = syVar3.G;
            mVar.S = true;
            syVar3.F.setAdapter(mVar);
            sy syVar4 = this.T;
            syVar4.addView(syVar4.F);
        }
        if (!z10) {
            tyVar.Q = false;
            tyVar.L4(-tyVar.c4());
        }
        this.T.f37593a.C0();
        sy syVar5 = this.T;
        gg.m mVar2 = syVar5.G;
        mVar2.h = syVar5.f37599s;
        mVar2.l();
        sy syVar6 = this.T;
        syVar6.d.O(syVar6.f37593a, false);
        sy syVar7 = this.T;
        syVar7.d.G = true;
        syVar7.G.G = true;
        syVar7.f37595c.H = false;
        tyVar.J4(true, true);
        tyVar.l4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = tyVar.N;
        } else {
            f7 = -tyVar.N;
        }
        sy syVar8 = this.T;
        syVar8.f37593a.z1(syVar8.F, f7, false);
        this.T.f37593a.setClipChildren(false);
        this.T.f37593a.C0();
        tyVar.M3();
        tyVar.d5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ty tyVar = this.W;
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f7) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        py pyVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.S != z10) {
            this.S = z10;
        }
        ty tyVar = this.W;
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f7);
            lVar5 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.o2) tyVar).actionBar;
            ImageView backButton = lVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (tyVar.V2 != 0 || tyVar.X2 != 0) {
            Paint paint = tyVar.f37983f1;
            int i10 = org.telegram.ui.ActionBar.i6.f19057d6;
            paint.setColor(i0.a.d(f7, tyVar.getThemedColor(i10), tyVar.getThemedColor(i10)));
        }
        sy syVar = this.T;
        if (syVar != null) {
            syVar.f37593a.setOpenRightFragmentProgress(f7);
        }
        tyVar.L3();
        tyVar.Q3();
        tyVar.D3();
        tyVar.N3();
        sy syVar2 = tyVar.f37976e0[0];
        if (syVar2 != null && (pyVar = syVar2.f37593a) != null) {
            pyVar.requestLayout();
        }
        View view2 = tyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
