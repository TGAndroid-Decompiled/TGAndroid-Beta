package org.telegram.ui;

import android.view.View;
public final class nm0 implements org.telegram.ui.ActionBar.n0, org.telegram.ui.Components.wj0 {
    public final sm0 f48023a;

    public nm0(sm0 sm0Var) {
        this.f48023a = sm0Var;
    }

    @Override
    public void b(boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        sm0 sm0Var = this.f48023a;
        sm0Var.X = z10 ? 1 : 0;
        if (z10) {
            q4Var = ((org.telegram.ui.ActionBar.d2) sm0Var).parentLayout;
            q4Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        sm0Var.L.d1(true);
    }

    @Override
    public boolean c(int i3) {
        if (this.f48023a.M.d(i3) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void f(View view, boolean z10) {
        if (z10 == this.f48023a.Y && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f30216y.c(q5Var);
        }
    }

    @Override
    public void g() {
        int i3;
        int i10;
        sm0 sm0Var = this.f48023a;
        org.telegram.ui.ActionBar.y0 y0Var = sm0Var.R;
        if (sm0Var.Z) {
            i3 = 2131745356;
        } else {
            i3 = 2131745355;
        }
        y0Var.setText(org.telegram.messenger.bd.M0(i3, null));
        org.telegram.ui.ActionBar.y0 y0Var2 = sm0Var.R;
        if (sm0Var.Z) {
            i10 = 2131232219;
        } else {
            i10 = 2131232208;
        }
        y0Var2.setIcon(i10);
    }

    @Override
    public boolean m(int i3) {
        Object obj;
        sm0 sm0Var = this.f48023a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        if (peVar != null) {
            obj = Integer.valueOf(((org.telegram.messenger.ye) peVar.f24738e.get(i3)).C);
        } else {
            obj = ((org.telegram.messenger.bf) sm0Var.f49547f.get(i3)).B;
        }
        return sm0Var.f49540b.containsKey(obj);
    }

    @Override
    public void e() {
    }
}
