package org.telegram.ui;

import java.util.ArrayList;
public final class ba0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.yu0 {
    public final int f36015a;
    public final la0 f36016b;

    public ba0(la0 la0Var, int i10) {
        this.f36015a = i10;
        this.f36016b = la0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        this.f36016b.a0(i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        la0 la0Var = this.f36016b;
        la0Var.S.a(la0Var.e);
        la0Var.finishFragment();
    }

    @Override
    public void m(int i10) {
        switch (this.f36015a) {
            case 2:
                la0 la0Var = this.f36016b;
                ArrayList arrayList = la0Var.O;
                if (i10 < arrayList.size()) {
                    la0Var.f39175x.setText(org.telegram.messenger.dd.s(la0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                la0Var.f39175x.setText("");
                return;
            default:
                la0 la0Var2 = this.f36016b;
                la0Var2.F.clearFocus();
                la0Var2.N = true;
                ArrayList arrayList2 = la0Var2.Q;
                if (i10 < arrayList2.size()) {
                    la0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    la0Var2.F.setText("");
                }
                la0Var2.N = false;
                return;
        }
    }

    @Override
    public void r() {
        int i10 = this.f36015a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
