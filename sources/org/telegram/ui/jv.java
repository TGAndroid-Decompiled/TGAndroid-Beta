package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class jv extends org.telegram.ui.Components.vm0 {
    public final lv f39285c;

    public jv(lv lvVar) {
        this.f39285c = lvVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f39285c.f39851g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        lv lvVar = this.f39285c;
        if (i10 == 0) {
            view = lvVar.f39848d0;
        } else if (i10 == 2) {
            view = lvVar.f39849e0;
            s4.q0 q0Var = new s4.q0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.e3) lvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.e3) lvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i12;
            view.setLayoutParams(q0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false)), org.telegram.ui.ActionBar.h6.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20523b7));
            hrVar.f26897w = true;
            e9Var.setBackgroundDrawable(hrVar);
            view = e9Var;
        }
        return new s4.d1(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
    }
}
