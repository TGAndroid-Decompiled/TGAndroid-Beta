package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class gv extends org.telegram.ui.Components.ql0 {
    public final iv f34515c;

    public gv(iv ivVar) {
        this.f34515c = ivVar;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f34515c.f35034d0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        iv ivVar = this.f34515c;
        if (i10 == 0) {
            view = ivVar.f35031a0;
        } else if (i10 == 2) {
            view = ivVar.f35032b0;
            f2.w0 w0Var = new f2.w0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.g3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.g3) ivVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) w0Var).rightMargin = i12;
            view.setLayoutParams(w0Var);
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
            z8Var.setFixedSize(12);
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
            mqVar.f27116w = true;
            z8Var.setBackgroundDrawable(mqVar);
            view = z8Var;
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
