package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class lx extends a41 {
    public boolean P;
    public py Q;
    public final jy R;
    public final Context S;
    public final qy T;

    public lx(qy qyVar, Context context, jy jyVar, Context context2) {
        super(context);
        this.T = qyVar;
        this.R = jyVar;
        this.S = context2;
        this.e = 0.0f;
        this.f32457n = new AnimationNotificationsLocker();
        this.J = true;
    }

    @Override
    public final void d(boolean z4) {
        py pyVar = this.Q;
        pyVar.f37248c.G = true;
        pyVar.d.O(this.Q.f37246a, c());
        py pyVar2 = this.Q;
        pyVar2.d.D = false;
        pyVar2.D.D = false;
        qy qyVar = this.T;
        qyVar.A4(false, true);
        this.Q.f37246a.setClipChildren(true);
        this.Q.f37246a.invalidate();
        this.Q.d.l();
        this.Q.D.l();
        this.Q.f37246a.x1(null, 0.0f, z4);
        qyVar.f37642y = false;
        this.R.requestLayout();
        if (!c()) {
            qyVar.N = true;
            qyVar.O = true;
            View view = qyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        zx zxVar = qyVar.f37647z0;
        if (zxVar != null) {
            zxVar.R();
        }
        qyVar.V4(false, true);
        qyVar.D3();
        qyVar.U4();
    }

    @Override
    public final void e(boolean z4) {
        float f10;
        int i10;
        qy qyVar = this.T;
        qyVar.f37642y = true;
        qyVar.B = z4;
        this.R.requestLayout();
        py pyVar = qyVar.f37527b0[0];
        this.Q = pyVar;
        if (pyVar.C == null) {
            pyVar.C = new org.telegram.ui.Components.rl0(this.S, null);
            this.Q.C.setLayoutManager(new kx(this, this.Q));
            py pyVar2 = this.Q;
            int i11 = this.Q.f37252s;
            int i12 = qyVar.S2;
            boolean z10 = qyVar.f37565i2;
            ArrayList arrayList = qyVar.F2;
            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).currentAccount;
            pyVar2.D = new tf.k(qyVar, this.S, i11, i12, z10, arrayList, i10, qyVar.D);
            py pyVar3 = this.Q;
            tf.k kVar = pyVar3.D;
            kVar.P = true;
            pyVar3.C.setAdapter(kVar);
            py pyVar4 = this.Q;
            pyVar4.addView(pyVar4.C);
        }
        if (!z4) {
            qyVar.N = false;
            qyVar.C4(-qyVar.T3());
        }
        this.Q.f37246a.B0();
        py pyVar5 = this.Q;
        tf.k kVar2 = pyVar5.D;
        kVar2.h = pyVar5.f37252s;
        kVar2.l();
        py pyVar6 = this.Q;
        pyVar6.d.O(pyVar6.f37246a, false);
        py pyVar7 = this.Q;
        pyVar7.d.D = true;
        pyVar7.D.D = true;
        pyVar7.f37248c.H = false;
        qyVar.A4(true, true);
        qyVar.c4(this.P);
        this.Q.d.l();
        this.Q.D.l();
        if (!z4) {
            f10 = qyVar.K;
        } else {
            f10 = -qyVar.K;
        }
        py pyVar8 = this.Q;
        pyVar8.f37246a.x1(pyVar8.C, f10, false);
        this.Q.f37246a.setClipChildren(false);
        this.Q.f37246a.B0();
        qyVar.D3();
        qyVar.U4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.T;
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
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
        my myVar;
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
        qy qyVar = this.T;
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (qyVar.S2 != 0 || qyVar.U2 != 0) {
            Paint paint = qyVar.f37534c1;
            int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
            paint.setColor(i0.a.d(f10, qyVar.getThemedColor(i10), qyVar.getThemedColor(i10)));
        }
        py pyVar = this.Q;
        if (pyVar != null) {
            pyVar.f37246a.setOpenRightFragmentProgress(f10);
        }
        qyVar.C3();
        qyVar.H3();
        qyVar.u3();
        qyVar.E3();
        py pyVar2 = qyVar.f37527b0[0];
        if (pyVar2 != null && (myVar = pyVar2.f37246a) != null) {
            myVar.requestLayout();
        }
        View view2 = qyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
