package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AnimationNotificationsLocker;

public final class bx extends g31 {
    public boolean N;
    public fy O;
    public final yx P;
    public final Context Q;
    public final gy R;

    public bx(gy gyVar, Context context, yx yxVar, Context context2) {
        super(context);
        this.R = gyVar;
        this.P = yxVar;
        this.Q = context2;
        this.f38299e = 0.0f;
        this.f38301n = new AnimationNotificationsLocker();
        this.I = true;
    }

    @Override
    public final void d(boolean z10) {
        fy fyVar = this.O;
        fyVar.f38227c.G = true;
        fyVar.d.O(this.O.f38225a, c());
        fy fyVar2 = this.O;
        fyVar2.d.C = false;
        fyVar2.C.C = false;
        gy gyVar = this.R;
        gyVar.A4(false, true);
        this.O.f38225a.setClipChildren(true);
        this.O.f38225a.invalidate();
        this.O.d.l();
        this.O.C.l();
        this.O.f38225a.y1(null, 0.0f, z10);
        gyVar.f38618y = false;
        this.P.requestLayout();
        if (!c()) {
            gyVar.M = true;
            gyVar.N = true;
            View view = gyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        px pxVar = gyVar.f38619y0;
        if (pxVar != null) {
            pxVar.R();
        }
        gyVar.V4(false, true);
        gyVar.D3();
        gyVar.U4();
    }

    @Override
    public final void e(boolean z10) {
        gy gyVar = this.R;
        gyVar.f38618y = true;
        gyVar.A = z10;
        this.P.requestLayout();
        fy fyVar = gyVar.f38498a0[0];
        this.O = fyVar;
        if (fyVar.B == null) {
            fyVar.B = new zw(this.Q, null);
            this.O.B.setLayoutManager(new ax(this, this.O));
            this.O.C = new pf.k(gyVar, this.Q, this.O.f38232s, gyVar.R2, gyVar.f38537h2, gyVar.E2, ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, gyVar.C);
            fy fyVar2 = this.O;
            pf.k kVar = fyVar2.C;
            kVar.O = true;
            fyVar2.B.setAdapter(kVar);
            fy fyVar3 = this.O;
            fyVar3.addView(fyVar3.B);
        }
        if (!z10) {
            gyVar.M = false;
            gyVar.C4(-gyVar.T3());
        }
        this.O.f38225a.B0();
        fy fyVar4 = this.O;
        pf.k kVar2 = fyVar4.C;
        kVar2.h = fyVar4.f38232s;
        kVar2.l();
        fy fyVar5 = this.O;
        fyVar5.d.O(fyVar5.f38225a, false);
        fy fyVar6 = this.O;
        fyVar6.d.C = true;
        fyVar6.C.C = true;
        fyVar6.f38227c.H = false;
        gyVar.A4(true, true);
        gyVar.c4(this.N);
        this.O.d.l();
        this.O.C.l();
        float f10 = !z10 ? gyVar.J : -gyVar.J;
        fy fyVar7 = this.O;
        fyVar7.f38225a.y1(fyVar7.B, f10, false);
        this.O.f38225a.setClipChildren(false);
        this.O.f38225a.B0();
        gyVar.D3();
        gyVar.U4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        gy gyVar = this.R;
        return ((org.telegram.ui.ActionBar.n2) gyVar).actionBar != null && ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getOccupyStatusBar();
    }

    @Override
    public final void setOpenProgress(float f10) {
        cy cyVar;
        boolean z10 = f10 > 0.0f;
        if (this.N != z10) {
            this.N = z10;
        }
        gy gyVar = this.R;
        View view = gyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getTitleTextView() != null) {
            ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getTitleTextView().setAlpha(1.0f - f10);
            if (((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getTitleTextView().getAlpha() > 0.0f) {
                ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getTitleTextView().setVisibility(0);
            }
        }
        if (((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getBackButton() != null) {
            ((org.telegram.ui.ActionBar.n2) gyVar).actionBar.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (gyVar.R2 != 0 || gyVar.T2 != 0) {
            Paint paint = gyVar.f38503b1;
            int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
            paint.setColor(i0.b.d(f10, gyVar.getThemedColor(i10), gyVar.getThemedColor(i10)));
        }
        fy fyVar = this.O;
        if (fyVar != null) {
            fyVar.f38225a.setOpenRightFragmentProgress(f10);
        }
        gyVar.C3();
        gyVar.H3();
        gyVar.u3();
        gyVar.E3();
        fy fyVar2 = gyVar.f38498a0[0];
        if (fyVar2 != null && (cyVar = fyVar2.f38225a) != null) {
            cyVar.requestLayout();
        }
        View view2 = gyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
