package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class ev extends org.telegram.ui.Components.rl0 {
    public final gv f34096c;

    public ev(gv gvVar) {
        this.f34096c = gvVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f34096c.f34688d0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        gv gvVar = this.f34096c;
        if (i10 == 0) {
            view = gvVar.f34685a0;
        } else if (i10 == 2) {
            view = gvVar.f34686b0;
            f2.w0 w0Var = new f2.w0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.g3) gvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.g3) gvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = i12;
            view.setLayoutParams(w0Var);
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
            a9Var.setFixedSize(12);
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
            nqVar.f27342w = true;
            a9Var.setBackgroundDrawable(nqVar);
            view = a9Var;
        }
        return new f2.l1(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
    }
}
