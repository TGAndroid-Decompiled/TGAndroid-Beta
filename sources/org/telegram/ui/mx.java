package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class mx extends f41 {
    public boolean S;
    public ty T;
    public final ny U;
    public final Context V;
    public final uy W;

    public mx(uy uyVar, Context context, ny nyVar, Context context2) {
        super(context);
        this.W = uyVar;
        this.U = nyVar;
        this.V = context2;
        this.f36181e = 0.0f;
        this.f36183n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        ty tyVar = this.T;
        tyVar.f40986c.G = true;
        tyVar.d.O(this.T.f40984a, c());
        ty tyVar2 = this.T;
        tyVar2.d.G = false;
        tyVar2.G.G = false;
        uy uyVar = this.W;
        uyVar.J4(false, true);
        this.T.f40984a.setClipChildren(true);
        this.T.f40984a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f40984a.A1(null, 0.0f, z10);
        uyVar.f41492y = false;
        this.U.requestLayout();
        if (!c()) {
            uyVar.Q = true;
            uyVar.R = true;
            View view = uyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        dy dyVar = uyVar.C0;
        if (dyVar != null) {
            dyVar.T();
        }
        uyVar.e5(false, true);
        uyVar.M3();
        uyVar.d5();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        li.m mVar;
        int i10;
        uy uyVar = this.W;
        uyVar.f41492y = true;
        uyVar.E = z10;
        this.U.requestLayout();
        ty tyVar = uyVar.f41393e0[0];
        this.T = tyVar;
        if (tyVar.F == null) {
            tyVar.F = new org.telegram.ui.Components.zl0(this.V, null);
            mVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
            mVar.b(this.T.F);
            this.T.F.setLayoutManager(new lx(this, this.T));
            ty tyVar2 = this.T;
            int i11 = this.T.f40991s;
            int i12 = uyVar.V2;
            boolean z11 = uyVar.f41429l2;
            ArrayList arrayList = uyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            tyVar2.G = new gg.m(uyVar, this.V, i11, i12, z11, arrayList, i10, uyVar.G);
            ty tyVar3 = this.T;
            gg.m mVar2 = tyVar3.G;
            mVar2.S = true;
            tyVar3.F.setAdapter(mVar2);
            ty tyVar4 = this.T;
            tyVar4.addView(tyVar4.F);
        }
        if (!z10) {
            uyVar.Q = false;
            uyVar.L4(-uyVar.c4());
        }
        this.T.f40984a.C0();
        ty tyVar5 = this.T;
        gg.m mVar3 = tyVar5.G;
        mVar3.h = tyVar5.f40991s;
        mVar3.l();
        ty tyVar6 = this.T;
        tyVar6.d.O(tyVar6.f40984a, false);
        ty tyVar7 = this.T;
        tyVar7.d.G = true;
        tyVar7.G.G = true;
        tyVar7.f40986c.H = false;
        uyVar.J4(true, true);
        uyVar.l4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = uyVar.N;
        } else {
            f7 = -uyVar.N;
        }
        ty tyVar8 = this.T;
        tyVar8.f40984a.A1(tyVar8.F, f7, false);
        this.T.f40984a.setClipChildren(false);
        this.T.f40984a.C0();
        uyVar.M3();
        uyVar.d5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f7) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.S != z10) {
            this.S = z10;
        }
        uy uyVar = this.W;
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (uyVar.V2 != 0 || uyVar.X2 != 0) {
            Paint paint = uyVar.f41400f1;
            int i10 = org.telegram.ui.ActionBar.i6.f20818d6;
            paint.setColor(i0.a.d(f7, uyVar.getThemedColor(i10), uyVar.getThemedColor(i10)));
        }
        ty tyVar = this.T;
        if (tyVar != null) {
            tyVar.f40984a.setOpenRightFragmentProgress(f7);
        }
        uyVar.L3();
        uyVar.Q3();
        uyVar.D3();
        uyVar.N3();
        ty tyVar2 = uyVar.f41393e0[0];
        if (tyVar2 != null && (qyVar = tyVar2.f40984a) != null) {
            qyVar.requestLayout();
        }
        View view2 = uyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
