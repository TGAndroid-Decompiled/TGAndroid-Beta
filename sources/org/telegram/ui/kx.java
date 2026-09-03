package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class kx extends a41 {
    public boolean P;
    public oy Q;
    public final iy R;
    public final Context S;
    public final py T;

    public kx(py pyVar, Context context, iy iyVar, Context context2) {
        super(context);
        this.T = pyVar;
        this.R = iyVar;
        this.S = context2;
        this.f35015e = 0.0f;
        this.f35017n = new AnimationNotificationsLocker();
        this.J = true;
    }

    @Override
    public final void d(boolean z4) {
        oy oyVar = this.Q;
        oyVar.f39824c.G = true;
        oyVar.d.O(this.Q.f39822a, c());
        oy oyVar2 = this.Q;
        oyVar2.d.D = false;
        oyVar2.D.D = false;
        py pyVar = this.T;
        pyVar.A4(false, true);
        this.Q.f39822a.setClipChildren(true);
        this.Q.f39822a.invalidate();
        this.Q.d.l();
        this.Q.D.l();
        this.Q.f39822a.x1(null, 0.0f, z4);
        pyVar.f40271y = false;
        this.R.requestLayout();
        if (!c()) {
            pyVar.N = true;
            pyVar.O = true;
            View view = pyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        yx yxVar = pyVar.f40276z0;
        if (yxVar != null) {
            yxVar.R();
        }
        pyVar.V4(false, true);
        pyVar.D3();
        pyVar.U4();
    }

    @Override
    public final void e(boolean z4) {
        float f10;
        int i10;
        py pyVar = this.T;
        pyVar.f40271y = true;
        pyVar.B = z4;
        this.R.requestLayout();
        oy oyVar = pyVar.f40155b0[0];
        this.Q = oyVar;
        if (oyVar.C == null) {
            oyVar.C = new org.telegram.ui.Components.sl0(this.S, null);
            this.Q.C.setLayoutManager(new jx(this, this.Q));
            oy oyVar2 = this.Q;
            int i11 = this.Q.f39829s;
            int i12 = pyVar.S2;
            boolean z10 = pyVar.f40194i2;
            ArrayList arrayList = pyVar.F2;
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            oyVar2.D = new uf.k(pyVar, this.S, i11, i12, z10, arrayList, i10, pyVar.D);
            oy oyVar3 = this.Q;
            uf.k kVar = oyVar3.D;
            kVar.P = true;
            oyVar3.C.setAdapter(kVar);
            oy oyVar4 = this.Q;
            oyVar4.addView(oyVar4.C);
        }
        if (!z4) {
            pyVar.N = false;
            pyVar.C4(-pyVar.T3());
        }
        this.Q.f39822a.B0();
        oy oyVar5 = this.Q;
        uf.k kVar2 = oyVar5.D;
        kVar2.h = oyVar5.f39829s;
        kVar2.l();
        oy oyVar6 = this.Q;
        oyVar6.d.O(oyVar6.f39822a, false);
        oy oyVar7 = this.Q;
        oyVar7.d.D = true;
        oyVar7.D.D = true;
        oyVar7.f39824c.H = false;
        pyVar.A4(true, true);
        pyVar.c4(this.P);
        this.Q.d.l();
        this.Q.D.l();
        if (!z4) {
            f10 = pyVar.K;
        } else {
            f10 = -pyVar.K;
        }
        oy oyVar8 = this.Q;
        oyVar8.f39822a.x1(oyVar8.C, f10, false);
        this.Q.f39822a.setClipChildren(false);
        this.Q.f39822a.B0();
        pyVar.D3();
        pyVar.U4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        py pyVar = this.T;
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f10) {
        boolean z4;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ly lyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.P != z4) {
            this.P = z4;
        }
        py pyVar = this.T;
        View view = pyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (pyVar.S2 != 0 || pyVar.U2 != 0) {
            Paint paint = pyVar.f40162c1;
            int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
            paint.setColor(i0.a.d(f10, pyVar.getThemedColor(i10), pyVar.getThemedColor(i10)));
        }
        oy oyVar = this.Q;
        if (oyVar != null) {
            oyVar.f39822a.setOpenRightFragmentProgress(f10);
        }
        pyVar.C3();
        pyVar.H3();
        pyVar.u3();
        pyVar.E3();
        oy oyVar2 = pyVar.f40155b0[0];
        if (oyVar2 != null && (lyVar = oyVar2.f39822a) != null) {
            lyVar.requestLayout();
        }
        View view2 = pyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
