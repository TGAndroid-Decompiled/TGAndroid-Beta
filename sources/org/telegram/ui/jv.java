package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class jv extends org.telegram.ui.Components.ul0 {
    public final lv f34164c;

    public jv(lv lvVar) {
        this.f34164c = lvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f34164c.f34785g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        lv lvVar = this.f34164c;
        if (i10 == 0) {
            view = lvVar.f34782d0;
        } else if (i10 == 2) {
            view = lvVar.f34783e0;
            s4.p0 p0Var = new s4.p0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.h3) lvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.h3) lvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i12;
            view.setLayoutParams(p0Var);
        } else {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(viewGroup.getContext());
            f9Var.setFixedSize(12);
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
            vqVar.f28580w = true;
            f9Var.setBackgroundDrawable(vqVar);
            view = f9Var;
        }
        return new s4.c1(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
    }
}
