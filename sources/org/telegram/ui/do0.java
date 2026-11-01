package org.telegram.ui;

import android.view.View;
public final class do0 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.xk0 {
    public final jo0 f36641a;

    public do0(jo0 jo0Var) {
        this.f36641a = jo0Var;
    }

    @Override
    public void b(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        jo0 jo0Var = this.f36641a;
        jo0Var.W = z10 ? 1 : 0;
        if (z10) {
            z4Var = ((org.telegram.ui.ActionBar.k2) jo0Var).parentLayout;
            z4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        jo0Var.K.d1(true);
    }

    @Override
    public boolean d(int i10) {
        if (this.f36641a.L.d(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void e() {
        int i10;
        int i11;
        jo0 jo0Var = this.f36641a;
        org.telegram.ui.ActionBar.b1 b1Var = jo0Var.Q;
        if (jo0Var.Y) {
            i10 = 2131745364;
        } else {
            i10 = 2131745363;
        }
        b1Var.setText(org.telegram.messenger.dd.L0(i10, null));
        org.telegram.ui.ActionBar.b1 b1Var2 = jo0Var.Q;
        if (jo0Var.Y) {
            i11 = 2131232218;
        } else {
            i11 = 2131232207;
        }
        b1Var2.setIcon(i11);
    }

    @Override
    public void h(View view, boolean z10) {
        if (z10 == this.f36641a.X && (view instanceof org.telegram.ui.Cells.v5)) {
            org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
            v5Var.f23316x.d(v5Var);
        }
    }

    @Override
    public boolean j(int i10) {
        Object obj;
        jo0 jo0Var = this.f36641a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        if (xeVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ff) xeVar.e.get(i10)).C);
        } else {
            obj = ((org.telegram.messenger.jf) jo0Var.f38490f.get(i10)).B;
        }
        return jo0Var.f38484b.containsKey(obj);
    }

    @Override
    public void a() {
    }
}
