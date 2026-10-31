package org.telegram.ui;

import android.view.View;
public final class fo0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.wk0 {
    public final lo0 f37306a;

    public fo0(lo0 lo0Var) {
        this.f37306a = lo0Var;
    }

    @Override
    public void b(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        lo0 lo0Var = this.f37306a;
        lo0Var.W = z10 ? 1 : 0;
        if (z10) {
            z4Var = ((org.telegram.ui.ActionBar.k2) lo0Var).parentLayout;
            z4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        lo0Var.K.d1(true);
    }

    @Override
    public boolean d(int i10) {
        if (this.f37306a.L.d(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void e() {
        int i10;
        int i11;
        lo0 lo0Var = this.f37306a;
        org.telegram.ui.ActionBar.b1 b1Var = lo0Var.Q;
        if (lo0Var.Y) {
            i10 = 2131745364;
        } else {
            i10 = 2131745363;
        }
        b1Var.setText(org.telegram.messenger.cd.L0(i10, null));
        org.telegram.ui.ActionBar.b1 b1Var2 = lo0Var.Q;
        if (lo0Var.Y) {
            i11 = 2131232218;
        } else {
            i11 = 2131232207;
        }
        b1Var2.setIcon(i11);
    }

    @Override
    public void h(View view, boolean z10) {
        if (z10 == this.f37306a.X && (view instanceof org.telegram.ui.Cells.v5)) {
            org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
            v5Var.f23315x.d(v5Var);
        }
    }

    @Override
    public boolean j(int i10) {
        Object obj;
        lo0 lo0Var = this.f37306a;
        org.telegram.messenger.we weVar = lo0Var.J;
        if (weVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ef) weVar.e.get(i10)).C);
        } else {
            obj = ((org.telegram.messenger.hf) lo0Var.f39335f.get(i10)).B;
        }
        return lo0Var.f39329b.containsKey(obj);
    }

    @Override
    public void a() {
    }
}
