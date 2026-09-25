package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class dv extends org.telegram.ui.Components.vl0 {
    public final fv f33199c;

    public dv(fv fvVar) {
        this.f33199c = fvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f33199c.f33771g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        fv fvVar = this.f33199c;
        if (i10 == 0) {
            view = fvVar.f33768d0;
        } else if (i10 == 2) {
            view = fvVar.f33769e0;
            s4.p0 p0Var = new s4.p0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.e3) fvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.e3) fvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i12;
            view.setLayoutParams(p0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false)), org.telegram.ui.ActionBar.h6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19024b7));
            qqVar.f27740w = true;
            e9Var.setBackgroundDrawable(qqVar);
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
