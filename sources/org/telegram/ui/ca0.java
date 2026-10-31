package org.telegram.ui;

import java.util.ArrayList;
public final class ca0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.xu0 {
    public final int f36425a;
    public final ma0 f36426b;

    public ca0(ma0 ma0Var, int i10) {
        this.f36425a = i10;
        this.f36426b = ma0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        this.f36426b.Z(i10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ma0 ma0Var = this.f36426b;
        ma0Var.S.a(ma0Var.e);
        ma0Var.finishFragment();
    }

    @Override
    public void m(int i10) {
        switch (this.f36425a) {
            case 2:
                ma0 ma0Var = this.f36426b;
                ArrayList arrayList = ma0Var.O;
                if (i10 < arrayList.size()) {
                    ma0Var.f39618x.setText(org.telegram.messenger.cd.s(ma0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                ma0Var.f39618x.setText("");
                return;
            default:
                ma0 ma0Var2 = this.f36426b;
                ma0Var2.F.clearFocus();
                ma0Var2.N = true;
                ArrayList arrayList2 = ma0Var2.Q;
                if (i10 < arrayList2.size()) {
                    ma0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    ma0Var2.F.setText("");
                }
                ma0Var2.N = false;
                return;
        }
    }

    @Override
    public void s() {
        int i10 = this.f36425a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
