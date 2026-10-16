package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class mv extends org.telegram.ui.Components.lm0 {
    public final ov f38074c;

    public mv(ov ovVar) {
        this.f38074c = ovVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f38074c.f38757g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        ov ovVar = this.f38074c;
        if (i10 == 0) {
            view = ovVar.f38754d0;
        } else if (i10 == 2) {
            view = ovVar.f38755e0;
            s4.o0 o0Var = new s4.o0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.e3) ovVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.e3) ovVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i12;
            view.setLayoutParams(o0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false)), org.telegram.ui.ActionBar.g6.W0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19563b7));
            crVar.f23883w = true;
            e9Var.setBackgroundDrawable(crVar);
            view = e9Var;
        }
        return new s4.b1(view);
    }

    @Override
    public final int j(int i10) {
        return i10;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
    }
}
