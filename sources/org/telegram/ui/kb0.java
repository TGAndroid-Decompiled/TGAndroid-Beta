package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class kb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ww0 {
    public final int f39290a;
    public final ub0 f39291b;

    public kb0(ub0 ub0Var, int i10) {
        this.f39290a = i10;
        this.f39291b = ub0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f39291b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ub0 ub0Var = this.f39291b;
        ub0Var.T.a(ub0Var.f42541e);
        ub0Var.finishFragment();
    }

    @Override
    public void g(int i10) {
        switch (this.f39290a) {
            case 2:
                ub0 ub0Var = this.f39291b;
                ArrayList arrayList = ub0Var.P;
                if (i10 < arrayList.size()) {
                    ub0Var.f42546w.setText(LocaleController.formatDateAudio(ub0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                ub0Var.f42546w.setText("");
                return;
            default:
                ub0 ub0Var2 = this.f39291b;
                ub0Var2.F.clearFocus();
                ub0Var2.O = true;
                ArrayList arrayList2 = ub0Var2.R;
                if (i10 < arrayList2.size()) {
                    ub0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    ub0Var2.F.setText("");
                }
                ub0Var2.O = false;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f39290a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
