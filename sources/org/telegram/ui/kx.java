package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class kx extends d41 {
    public boolean S;
    public py T;
    public final jy U;
    public final Context V;
    public final qy W;

    public kx(qy qyVar, Context context, jy jyVar, Context context2) {
        super(context);
        this.W = qyVar;
        this.U = jyVar;
        this.V = context2;
        this.e = 0.0f;
        this.f32898n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        py pyVar = this.T;
        pyVar.f36681c.G = true;
        pyVar.d.O(this.T.f36679a, c());
        py pyVar2 = this.T;
        pyVar2.d.G = false;
        pyVar2.G.G = false;
        qy qyVar = this.W;
        qyVar.A4(false, true);
        this.T.f36679a.setClipChildren(true);
        this.T.f36679a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f36679a.y1(null, 0.0f, z10);
        qyVar.f37121y = false;
        this.U.requestLayout();
        if (!c()) {
            qyVar.Q = true;
            qyVar.R = true;
            View view = qyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        zx zxVar = qyVar.C0;
        if (zxVar != null) {
            zxVar.R();
        }
        qyVar.V4(false, true);
        qyVar.D3();
        qyVar.U4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        qy qyVar = this.W;
        qyVar.f37121y = true;
        qyVar.E = z10;
        this.U.requestLayout();
        py pyVar = qyVar.f37021e0[0];
        this.T = pyVar;
        if (pyVar.F == null) {
            pyVar.F = new org.telegram.ui.Components.wl0(this.V, null);
            this.T.F.setLayoutManager(new jx(this, this.T));
            py pyVar2 = this.T;
            int i11 = this.T.f36685s;
            int i12 = qyVar.V2;
            boolean z11 = qyVar.f37057l2;
            ArrayList arrayList = qyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            pyVar2.G = new gg.m(qyVar, this.V, i11, i12, z11, arrayList, i10, qyVar.G);
            py pyVar3 = this.T;
            gg.m mVar = pyVar3.G;
            mVar.S = true;
            pyVar3.F.setAdapter(mVar);
            py pyVar4 = this.T;
            pyVar4.addView(pyVar4.F);
        }
        if (!z10) {
            qyVar.Q = false;
            qyVar.C4(-qyVar.T3());
        }
        this.T.f36679a.B0();
        py pyVar5 = this.T;
        gg.m mVar2 = pyVar5.G;
        mVar2.h = pyVar5.f36685s;
        mVar2.l();
        py pyVar6 = this.T;
        pyVar6.d.O(pyVar6.f36679a, false);
        py pyVar7 = this.T;
        pyVar7.d.G = true;
        pyVar7.G.G = true;
        pyVar7.f36681c.H = false;
        qyVar.A4(true, true);
        qyVar.c4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = qyVar.N;
        } else {
            f7 = -qyVar.N;
        }
        py pyVar8 = this.T;
        pyVar8.f36679a.y1(pyVar8.F, f7, false);
        this.T.f36679a.setClipChildren(false);
        this.T.f36679a.B0();
        qyVar.D3();
        qyVar.U4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
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
        my myVar;
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
        qy qyVar = this.W;
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (qyVar.V2 != 0 || qyVar.X2 != 0) {
            Paint paint = qyVar.f37028f1;
            int i10 = org.telegram.ui.ActionBar.h6.f19045d6;
            paint.setColor(i0.a.d(f7, qyVar.getThemedColor(i10), qyVar.getThemedColor(i10)));
        }
        py pyVar = this.T;
        if (pyVar != null) {
            pyVar.f36679a.setOpenRightFragmentProgress(f7);
        }
        qyVar.C3();
        qyVar.H3();
        qyVar.u3();
        qyVar.E3();
        py pyVar2 = qyVar.f37021e0[0];
        if (pyVar2 != null && (myVar = pyVar2.f36679a) != null) {
            myVar.requestLayout();
        }
        View view2 = qyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
