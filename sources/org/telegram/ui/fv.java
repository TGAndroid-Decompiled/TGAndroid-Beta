package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class fv extends org.telegram.ui.Components.sl0 {
    public final hv f37023c;

    public fv(hv hvVar) {
        this.f37023c = hvVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f37023c.f37639d0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        hv hvVar = this.f37023c;
        if (i10 == 0) {
            view = hvVar.f37636a0;
        } else if (i10 == 2) {
            view = hvVar.f37637b0;
            f2.x0 x0Var = new f2.x0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.h3) hvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) x0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.h3) hvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) x0Var).rightMargin = i12;
            view.setLayoutParams(x0Var);
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
            a9Var.setFixedSize(12);
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false)), org.telegram.ui.ActionBar.k6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
            pqVar.f30173w = true;
            a9Var.setBackgroundDrawable(pqVar);
            view = a9Var;
        }
        return new f2.m1(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
    }
}
