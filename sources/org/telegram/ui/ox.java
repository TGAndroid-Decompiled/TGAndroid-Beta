package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class ox extends o41 {
    public boolean S;
    public ty T;
    public final ny U;
    public final Context V;
    public final uy W;

    public ox(uy uyVar, Context context, ny nyVar, Context context2) {
        super(context);
        this.W = uyVar;
        this.U = nyVar;
        this.V = context2;
        this.f39103e = 0.0f;
        this.f39105n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        ty tyVar = this.T;
        tyVar.f40860c.G = true;
        tyVar.d.O(this.T.f40858a, c());
        ty tyVar2 = this.T;
        tyVar2.d.G = false;
        tyVar2.G.G = false;
        uy uyVar = this.W;
        uyVar.A4(false, true);
        this.T.f40858a.setClipChildren(true);
        this.T.f40858a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f40858a.x1(null, 0.0f, z10);
        uyVar.f41360y = false;
        this.U.requestLayout();
        if (!c()) {
            uyVar.Q = true;
            uyVar.R = true;
            View view = uyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        ey eyVar = uyVar.C0;
        if (eyVar != null) {
            eyVar.R();
        }
        uyVar.V4(false, true);
        uyVar.D3();
        uyVar.U4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        uy uyVar = this.W;
        uyVar.f41360y = true;
        uyVar.E = z10;
        this.U.requestLayout();
        ty tyVar = uyVar.f41259e0[0];
        this.T = tyVar;
        if (tyVar.F == null) {
            tyVar.F = new org.telegram.ui.Components.ll0(this.V, null);
            this.T.F.setLayoutManager(new nx(this, this.T));
            ty tyVar2 = this.T;
            int i11 = this.T.f40865s;
            int i12 = uyVar.V2;
            boolean z11 = uyVar.f41295l2;
            ArrayList arrayList = uyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            tyVar2.G = new hg.m(uyVar, this.V, i11, i12, z11, arrayList, i10, uyVar.G);
            ty tyVar3 = this.T;
            hg.m mVar = tyVar3.G;
            mVar.S = true;
            tyVar3.F.setAdapter(mVar);
            ty tyVar4 = this.T;
            tyVar4.addView(tyVar4.F);
        }
        if (!z10) {
            uyVar.Q = false;
            uyVar.C4(-uyVar.T3());
        }
        this.T.f40858a.B0();
        ty tyVar5 = this.T;
        hg.m mVar2 = tyVar5.G;
        mVar2.h = tyVar5.f40865s;
        mVar2.l();
        ty tyVar6 = this.T;
        tyVar6.d.O(tyVar6.f40858a, false);
        ty tyVar7 = this.T;
        tyVar7.d.G = true;
        tyVar7.G.G = true;
        tyVar7.f40860c.H = false;
        uyVar.A4(true, true);
        uyVar.c4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = uyVar.N;
        } else {
            f7 = -uyVar.N;
        }
        ty tyVar8 = this.T;
        tyVar8.f40858a.x1(tyVar8.F, f7, false);
        this.T.f40858a.setClipChildren(false);
        this.T.f40858a.B0();
        uyVar.D3();
        uyVar.U4();
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
            Paint paint = uyVar.f41266f1;
            int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
            paint.setColor(i0.a.d(f7, uyVar.getThemedColor(i10), uyVar.getThemedColor(i10)));
        }
        ty tyVar = this.T;
        if (tyVar != null) {
            tyVar.f40858a.setOpenRightFragmentProgress(f7);
        }
        uyVar.C3();
        uyVar.H3();
        uyVar.u3();
        uyVar.E3();
        ty tyVar2 = uyVar.f41259e0[0];
        if (tyVar2 != null && (qyVar = tyVar2.f40858a) != null) {
            qyVar.requestLayout();
        }
        View view2 = uyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
