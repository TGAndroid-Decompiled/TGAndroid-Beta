package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class gv extends org.telegram.ui.Components.pm0 {
    public final iv f38117c;

    public gv(iv ivVar) {
        this.f38117c = ivVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f38117c.f38767g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        iv ivVar = this.f38117c;
        if (i10 == 0) {
            view = ivVar.f38764d0;
        } else if (i10 == 2) {
            view = ivVar.f38765e0;
            s4.q0 q0Var = new s4.q0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i12;
            view.setLayoutParams(q0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false)), org.telegram.ui.ActionBar.i6.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20761b7));
            frVar.f26471w = true;
            e9Var.setBackgroundDrawable(frVar);
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
