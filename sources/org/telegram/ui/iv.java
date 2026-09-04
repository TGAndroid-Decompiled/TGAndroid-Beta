package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.R;
public final class iv extends org.telegram.ui.Components.kl0 {
    public final kv f37442c;

    public iv(kv kvVar) {
        this.f37442c = kvVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        if (this.f37442c.f38140g0.h()) {
            return 1;
        }
        return 3;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        int i12;
        kv kvVar = this.f37442c;
        if (i10 == 0) {
            view = kvVar.f38137d0;
        } else if (i10 == 2) {
            view = kvVar.f38138e0;
            s4.p0 p0Var = new s4.p0(-1, -2);
            i11 = ((org.telegram.ui.ActionBar.f3) kvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i11;
            i12 = ((org.telegram.ui.ActionBar.f3) kvVar).backgroundPaddingLeft;
            ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i12;
            view.setLayoutParams(p0Var);
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(viewGroup.getContext());
            e9Var.setFixedSize(12);
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20627b7));
            oqVar.f29167w = true;
            e9Var.setBackgroundDrawable(oqVar);
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
