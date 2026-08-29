package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class ax extends h31 {
    public boolean O;
    public ey P;
    public final xx Q;
    public final Context R;
    public final fy S;

    public ax(fy fyVar, Context context, xx xxVar, Context context2) {
        super(context);
        this.S = fyVar;
        this.Q = xxVar;
        this.R = context2;
        this.f38759e = 0.0f;
        this.f38761n = new AnimationNotificationsLocker();
        this.I = true;
    }

    @Override
    public final void d(boolean z10) {
        ey eyVar = this.P;
        eyVar.f37923c.G = true;
        eyVar.d.O(this.P.f37921a, c());
        ey eyVar2 = this.P;
        eyVar2.d.C = false;
        eyVar2.C.C = false;
        fy fyVar = this.S;
        fyVar.A4(false, true);
        this.P.f37921a.setClipChildren(true);
        this.P.f37921a.invalidate();
        this.P.d.l();
        this.P.C.l();
        this.P.f37921a.y1(null, 0.0f, z10);
        fyVar.f38376y = false;
        this.Q.requestLayout();
        if (!c()) {
            fyVar.M = true;
            fyVar.N = true;
            View view = fyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        ox oxVar = fyVar.f38377y0;
        if (oxVar != null) {
            oxVar.R();
        }
        fyVar.V4(false, true);
        fyVar.D3();
        fyVar.U4();
    }

    @Override
    public final void e(boolean z10) {
        float f9;
        int i10;
        fy fyVar = this.S;
        fyVar.f38376y = true;
        fyVar.A = z10;
        this.Q.requestLayout();
        ey eyVar = fyVar.f38256a0[0];
        this.P = eyVar;
        if (eyVar.B == null) {
            eyVar.B = new org.telegram.ui.Components.jl0(this.R, null);
            this.P.B.setLayoutManager(new zw(this, this.P));
            ey eyVar2 = this.P;
            int i11 = this.P.f37928s;
            int i12 = fyVar.R2;
            boolean z11 = fyVar.f38295h2;
            ArrayList arrayList = fyVar.E2;
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            eyVar2.C = new rf.l(fyVar, this.R, i11, i12, z11, arrayList, i10, fyVar.C);
            ey eyVar3 = this.P;
            rf.l lVar = eyVar3.C;
            lVar.O = true;
            eyVar3.B.setAdapter(lVar);
            ey eyVar4 = this.P;
            eyVar4.addView(eyVar4.B);
        }
        if (!z10) {
            fyVar.M = false;
            fyVar.C4(-fyVar.T3());
        }
        this.P.f37921a.B0();
        ey eyVar5 = this.P;
        rf.l lVar2 = eyVar5.C;
        lVar2.h = eyVar5.f37928s;
        lVar2.l();
        ey eyVar6 = this.P;
        eyVar6.d.O(eyVar6.f37921a, false);
        ey eyVar7 = this.P;
        eyVar7.d.C = true;
        eyVar7.C.C = true;
        eyVar7.f37923c.H = false;
        fyVar.A4(true, true);
        fyVar.c4(this.O);
        this.P.d.l();
        this.P.C.l();
        if (!z10) {
            f9 = fyVar.J;
        } else {
            f9 = -fyVar.J;
        }
        ey eyVar8 = this.P;
        eyVar8.f37921a.y1(eyVar8.B, f9, false);
        this.P.f37921a.setClipChildren(false);
        this.P.f37921a.B0();
        fyVar.D3();
        fyVar.U4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        fy fyVar = this.S;
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f9) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ay ayVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        float f10 = 0.0f;
        if (f9 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.O != z10) {
            this.O = z10;
        }
        fy fyVar = this.S;
        View view = fyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f9);
            lVar5 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            ImageView backButton = lVar3.getBackButton();
            if (f9 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (fyVar.R2 != 0 || fyVar.T2 != 0) {
            Paint paint = fyVar.f38262b1;
            int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
            paint.setColor(i0.a.d(f9, fyVar.getThemedColor(i10), fyVar.getThemedColor(i10)));
        }
        ey eyVar = this.P;
        if (eyVar != null) {
            eyVar.f37921a.setOpenRightFragmentProgress(f9);
        }
        fyVar.C3();
        fyVar.H3();
        fyVar.u3();
        fyVar.E3();
        ey eyVar2 = fyVar.f38256a0[0];
        if (eyVar2 != null && (ayVar = eyVar2.f37921a) != null) {
            ayVar.requestLayout();
        }
        View view2 = fyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
