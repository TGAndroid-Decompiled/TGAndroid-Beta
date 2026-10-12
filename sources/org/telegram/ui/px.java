package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class px extends n41 {
    public boolean S;
    public uy T;
    public final oy U;
    public final Context V;
    public final vy W;

    public px(vy vyVar, Context context, oy oyVar, Context context2) {
        super(context);
        this.W = vyVar;
        this.U = oyVar;
        this.V = context2;
        this.f40207e = 0.0f;
        this.f40209n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        uy uyVar = this.T;
        uyVar.f42615c.G = true;
        uyVar.d.O(this.T.f42613a, c());
        uy uyVar2 = this.T;
        uyVar2.d.G = false;
        uyVar2.G.G = false;
        vy vyVar = this.W;
        vyVar.x4(false, true);
        this.T.f42613a.setClipChildren(true);
        this.T.f42613a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f42613a.z1(null, 0.0f, z10);
        vyVar.f43005y = false;
        this.U.requestLayout();
        if (!c()) {
            vyVar.Q = true;
            vyVar.R = true;
            View view = vyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        fy fyVar = vyVar.C0;
        if (fyVar != null) {
            fyVar.R();
        }
        vyVar.S4(false, true);
        vyVar.A3();
        vyVar.R4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        vy vyVar = this.W;
        vyVar.f43005y = true;
        vyVar.E = z10;
        this.U.requestLayout();
        uy uyVar = vyVar.f42905e0[0];
        this.T = uyVar;
        if (uyVar.F == null) {
            uyVar.F = new org.telegram.ui.Components.wm0(this.V, null);
            this.T.F.setLayoutManager(new ox(this, this.T));
            uy uyVar2 = this.T;
            int i11 = this.T.f42620s;
            int i12 = vyVar.V2;
            boolean z11 = vyVar.f42941l2;
            ArrayList arrayList = vyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.m2) vyVar).currentAccount;
            uyVar2.G = new gg.m(vyVar, this.V, i11, i12, z11, arrayList, i10, vyVar.G);
            uy uyVar3 = this.T;
            gg.m mVar = uyVar3.G;
            mVar.S = true;
            uyVar3.F.setAdapter(mVar);
            uy uyVar4 = this.T;
            uyVar4.addView(uyVar4.F);
        }
        if (!z10) {
            vyVar.Q = false;
            vyVar.z4(-vyVar.Q3());
        }
        this.T.f42613a.B0();
        uy uyVar5 = this.T;
        gg.m mVar2 = uyVar5.G;
        mVar2.h = uyVar5.f42620s;
        mVar2.l();
        uy uyVar6 = this.T;
        uyVar6.d.O(uyVar6.f42613a, false);
        uy uyVar7 = this.T;
        uyVar7.d.G = true;
        uyVar7.G.G = true;
        uyVar7.f42615c.H = false;
        vyVar.x4(true, true);
        vyVar.Z3(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = vyVar.N;
        } else {
            f7 = -vyVar.N;
        }
        uy uyVar8 = this.T;
        uyVar8.f42613a.z1(uyVar8.F, f7, false);
        this.T.f42613a.setClipChildren(false);
        this.T.f42613a.B0();
        vyVar.A3();
        vyVar.R4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        vy vyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
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
        ry ryVar;
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
        vy vyVar = this.W;
        View view = vyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.m2) vyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (vyVar.V2 != 0 || vyVar.X2 != 0) {
            Paint paint = vyVar.f42912f1;
            int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
            paint.setColor(i0.a.d(f7, vyVar.getThemedColor(i10), vyVar.getThemedColor(i10)));
        }
        uy uyVar = this.T;
        if (uyVar != null) {
            uyVar.f42613a.setOpenRightFragmentProgress(f7);
        }
        vyVar.z3();
        vyVar.E3();
        vyVar.r3();
        vyVar.B3();
        uy uyVar2 = vyVar.f42905e0[0];
        if (uyVar2 != null && (ryVar = uyVar2.f42613a) != null) {
            ryVar.requestLayout();
        }
        View view2 = vyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
