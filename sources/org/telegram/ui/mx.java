package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class mx extends k41 {
    public boolean S;
    public ry T;
    public final ly U;
    public final Context V;
    public final sy W;

    public mx(sy syVar, Context context, ly lyVar, Context context2) {
        super(context);
        this.W = syVar;
        this.U = lyVar;
        this.V = context2;
        this.f39229e = 0.0f;
        this.f39231n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        ry ryVar = this.T;
        ryVar.f41566c.G = true;
        ryVar.d.O(this.T.f41564a, c());
        ry ryVar2 = this.T;
        ryVar2.d.G = false;
        ryVar2.G.G = false;
        sy syVar = this.W;
        syVar.x4(false, true);
        this.T.f41564a.setClipChildren(true);
        this.T.f41564a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f41564a.z1(null, 0.0f, z10);
        syVar.f42041y = false;
        this.U.requestLayout();
        if (!c()) {
            syVar.Q = true;
            syVar.R = true;
            View view = syVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        cy cyVar = syVar.C0;
        if (cyVar != null) {
            cyVar.R();
        }
        syVar.S4(false, true);
        syVar.A3();
        syVar.R4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        sy syVar = this.W;
        syVar.f42041y = true;
        syVar.E = z10;
        this.U.requestLayout();
        ry ryVar = syVar.f41941e0[0];
        this.T = ryVar;
        if (ryVar.F == null) {
            ryVar.F = new org.telegram.ui.Components.rm0(this.V, null);
            this.T.F.setLayoutManager(new lx(this, this.T));
            ry ryVar2 = this.T;
            int i11 = this.T.f41571s;
            int i12 = syVar.V2;
            boolean z11 = syVar.f41977l2;
            ArrayList arrayList = syVar.I2;
            i10 = ((org.telegram.ui.ActionBar.m2) syVar).currentAccount;
            ryVar2.G = new gg.m(syVar, this.V, i11, i12, z11, arrayList, i10, syVar.G);
            ry ryVar3 = this.T;
            gg.m mVar = ryVar3.G;
            mVar.S = true;
            ryVar3.F.setAdapter(mVar);
            ry ryVar4 = this.T;
            ryVar4.addView(ryVar4.F);
        }
        if (!z10) {
            syVar.Q = false;
            syVar.z4(-syVar.Q3());
        }
        this.T.f41564a.B0();
        ry ryVar5 = this.T;
        gg.m mVar2 = ryVar5.G;
        mVar2.h = ryVar5.f41571s;
        mVar2.l();
        ry ryVar6 = this.T;
        ryVar6.d.O(ryVar6.f41564a, false);
        ry ryVar7 = this.T;
        ryVar7.d.G = true;
        ryVar7.G.G = true;
        ryVar7.f41566c.H = false;
        syVar.x4(true, true);
        syVar.Z3(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = syVar.N;
        } else {
            f7 = -syVar.N;
        }
        ry ryVar8 = this.T;
        ryVar8.f41564a.z1(ryVar8.F, f7, false);
        this.T.f41564a.setClipChildren(false);
        this.T.f41564a.B0();
        syVar.A3();
        syVar.R4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        sy syVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
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
        oy oyVar;
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
        sy syVar = this.W;
        View view = syVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.m2) syVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (syVar.V2 != 0 || syVar.X2 != 0) {
            Paint paint = syVar.f41948f1;
            int i10 = org.telegram.ui.ActionBar.h6.f20822d6;
            paint.setColor(i0.a.d(f7, syVar.getThemedColor(i10), syVar.getThemedColor(i10)));
        }
        ry ryVar = this.T;
        if (ryVar != null) {
            ryVar.f41564a.setOpenRightFragmentProgress(f7);
        }
        syVar.z3();
        syVar.E3();
        syVar.r3();
        syVar.B3();
        ry ryVar2 = syVar.f41941e0[0];
        if (ryVar2 != null && (oyVar = ryVar2.f41564a) != null) {
            oyVar.requestLayout();
        }
        View view2 = syVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
