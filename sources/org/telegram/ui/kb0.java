package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class kb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.xw0 {
    public final int f39256a;
    public final ub0 f39257b;

    public kb0(ub0 ub0Var, int i10) {
        this.f39256a = i10;
        this.f39257b = ub0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f39257b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ub0 ub0Var = this.f39257b;
        ub0Var.T.a(ub0Var.f42507e);
        ub0Var.finishFragment();
    }

    @Override
    public void g(int i10) {
        switch (this.f39256a) {
            case 2:
                ub0 ub0Var = this.f39257b;
                ArrayList arrayList = ub0Var.P;
                if (i10 < arrayList.size()) {
                    ub0Var.f42512w.setText(LocaleController.formatDateAudio(ub0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                ub0Var.f42512w.setText("");
                return;
            default:
                ub0 ub0Var2 = this.f39257b;
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
        int i10 = this.f39256a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
