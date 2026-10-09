package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class nx extends l41 {
    public boolean S;
    public sy T;
    public final my U;
    public final Context V;
    public final ty W;

    public nx(ty tyVar, Context context, my myVar, Context context2) {
        super(context);
        this.W = tyVar;
        this.U = myVar;
        this.V = context2;
        this.f39428e = 0.0f;
        this.f39430n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        sy syVar = this.T;
        syVar.f41792c.G = true;
        syVar.d.O(this.T.f41790a, c());
        sy syVar2 = this.T;
        syVar2.d.G = false;
        syVar2.G.G = false;
        ty tyVar = this.W;
        tyVar.x4(false, true);
        this.T.f41790a.setClipChildren(true);
        this.T.f41790a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f41790a.z1(null, 0.0f, z10);
        tyVar.f42274y = false;
        this.U.requestLayout();
        if (!c()) {
            tyVar.Q = true;
            tyVar.R = true;
            View view = tyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        dy dyVar = tyVar.C0;
        if (dyVar != null) {
            dyVar.R();
        }
        tyVar.S4(false, true);
        tyVar.A3();
        tyVar.R4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        ty tyVar = this.W;
        tyVar.f42274y = true;
        tyVar.E = z10;
        this.U.requestLayout();
        sy syVar = tyVar.f42174e0[0];
        this.T = syVar;
        if (syVar.F == null) {
            syVar.F = new org.telegram.ui.Components.qm0(this.V, null);
            this.T.F.setLayoutManager(new mx(this, this.T));
            sy syVar2 = this.T;
            int i11 = this.T.f41797s;
            int i12 = tyVar.V2;
            boolean z11 = tyVar.f42210l2;
            ArrayList arrayList = tyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
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
            tyVar.z4(-tyVar.Q3());
        }
        this.T.f41790a.B0();
        sy syVar5 = this.T;
        gg.m mVar2 = syVar5.G;
        mVar2.h = syVar5.f41797s;
        mVar2.l();
        sy syVar6 = this.T;
        syVar6.d.O(syVar6.f41790a, false);
        sy syVar7 = this.T;
        syVar7.d.G = true;
        syVar7.G.G = true;
        syVar7.f41792c.H = false;
        tyVar.x4(true, true);
        tyVar.Z3(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = tyVar.N;
        } else {
            f7 = -tyVar.N;
        }
        sy syVar8 = this.T;
        syVar8.f41790a.z1(syVar8.F, f7, false);
        this.T.f41790a.setClipChildren(false);
        this.T.f41790a.B0();
        tyVar.A3();
        tyVar.R4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ty tyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
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
        py pyVar;
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
        ty tyVar = this.W;
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (tyVar.V2 != 0 || tyVar.X2 != 0) {
            Paint paint = tyVar.f42181f1;
            int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
            paint.setColor(i0.a.d(f7, tyVar.getThemedColor(i10), tyVar.getThemedColor(i10)));
        }
        sy syVar = this.T;
        if (syVar != null) {
            syVar.f41790a.setOpenRightFragmentProgress(f7);
        }
        tyVar.z3();
        tyVar.E3();
        tyVar.r3();
        tyVar.B3();
        sy syVar2 = tyVar.f42174e0[0];
        if (syVar2 != null && (pyVar = syVar2.f41790a) != null) {
            pyVar.requestLayout();
        }
        View view2 = tyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
