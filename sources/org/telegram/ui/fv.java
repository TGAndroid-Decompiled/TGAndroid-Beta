package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class fv extends org.telegram.ui.Components.xl0 {
    public final hv f33636c;

    public fv(hv hvVar) {
        this.f33636c = hvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f33636c.f34294g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        hv hvVar = this.f33636c;
        if (i10 == 0) {
            view = hvVar.f34291d0;
        } else if (i10 == 2) {
            view = hvVar.f34292e0;
            s4.p0 p0Var = new s4.p0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.g3) hvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.g3) hvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i12;
            view.setLayoutParams(p0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false)), org.telegram.ui.ActionBar.i6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f19021b7));
            rqVar.f28069w = true;
            e9Var.setBackgroundDrawable(rqVar);
            view = e9Var;
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
