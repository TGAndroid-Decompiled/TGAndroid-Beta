package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class jx extends t31 {
    public boolean P;
    public ny Q;
    public final hy R;
    public final Context S;
    public final oy T;

    public jx(oy oyVar, Context context, hy hyVar, Context context2) {
        super(context);
        this.T = oyVar;
        this.R = hyVar;
        this.S = context2;
        this.e = 0.0f;
        this.f38532n = new AnimationNotificationsLocker();
        this.J = true;
    }

    @Override
    public final void d(boolean z4) {
        ny nyVar = this.Q;
        nyVar.f36743c.G = true;
        nyVar.d.O(this.Q.f36741a, c());
        ny nyVar2 = this.Q;
        nyVar2.d.D = false;
        nyVar2.D.D = false;
        oy oyVar = this.T;
        oyVar.A4(false, true);
        this.Q.f36741a.setClipChildren(true);
        this.Q.f36741a.invalidate();
        this.Q.d.l();
        this.Q.D.l();
        this.Q.f36741a.y1(null, 0.0f, z4);
        oyVar.f37124y = false;
        this.R.requestLayout();
        if (!c()) {
            oyVar.N = true;
            oyVar.O = true;
            View view = oyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        xx xxVar = oyVar.f37129z0;
        if (xxVar != null) {
            xxVar.R();
        }
        oyVar.V4(false, true);
        oyVar.D3();
        oyVar.U4();
    }

    @Override
    public final void e(boolean z4) {
        float f10;
        int i10;
        oy oyVar = this.T;
        oyVar.f37124y = true;
        oyVar.B = z4;
        this.R.requestLayout();
        ny nyVar = oyVar.f37009b0[0];
        this.Q = nyVar;
        if (nyVar.C == null) {
            nyVar.C = new org.telegram.ui.Components.sl0(this.S, null);
            this.Q.C.setLayoutManager(new ix(this, this.Q));
            ny nyVar2 = this.Q;
            int i11 = this.Q.f36747s;
            int i12 = oyVar.S2;
            boolean z10 = oyVar.f37047i2;
            ArrayList arrayList = oyVar.F2;
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            nyVar2.D = new tf.k(oyVar, this.S, i11, i12, z10, arrayList, i10, oyVar.D);
            ny nyVar3 = this.Q;
            tf.k kVar = nyVar3.D;
            kVar.P = true;
            nyVar3.C.setAdapter(kVar);
            ny nyVar4 = this.Q;
            nyVar4.addView(nyVar4.C);
        }
        if (!z4) {
            oyVar.N = false;
            oyVar.C4(-oyVar.T3());
        }
        this.Q.f36741a.B0();
        ny nyVar5 = this.Q;
        tf.k kVar2 = nyVar5.D;
        kVar2.h = nyVar5.f36747s;
        kVar2.l();
        ny nyVar6 = this.Q;
        nyVar6.d.O(nyVar6.f36741a, false);
        ny nyVar7 = this.Q;
        nyVar7.d.D = true;
        nyVar7.D.D = true;
        nyVar7.f36743c.H = false;
        oyVar.A4(true, true);
        oyVar.c4(this.P);
        this.Q.d.l();
        this.Q.D.l();
        if (!z4) {
            f10 = oyVar.K;
        } else {
            f10 = -oyVar.K;
        }
        ny nyVar8 = this.Q;
        nyVar8.f36741a.y1(nyVar8.C, f10, false);
        this.Q.f36741a.setClipChildren(false);
        this.Q.f36741a.B0();
        oyVar.D3();
        oyVar.U4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        oy oyVar = this.T;
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
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
        ky kyVar;
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
        oy oyVar = this.T;
        View view = oyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (oyVar.S2 != 0 || oyVar.U2 != 0) {
            Paint paint = oyVar.f37016c1;
            int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
            paint.setColor(i0.a.d(f10, oyVar.getThemedColor(i10), oyVar.getThemedColor(i10)));
        }
        ny nyVar = this.Q;
        if (nyVar != null) {
            nyVar.f36741a.setOpenRightFragmentProgress(f10);
        }
        oyVar.C3();
        oyVar.H3();
        oyVar.u3();
        oyVar.E3();
        ny nyVar2 = oyVar.f37009b0[0];
        if (nyVar2 != null && (kyVar = nyVar2.f36741a) != null) {
            kyVar.requestLayout();
        }
        View view2 = oyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
