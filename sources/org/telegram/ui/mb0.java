package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class mb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.bx0 {
    public final int f39987a;
    public final wb0 f39988b;

    public mb0(wb0 wb0Var, int i10) {
        this.f39987a = i10;
        this.f39988b = wb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f39988b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        wb0 wb0Var = this.f39988b;
        wb0Var.T.a(wb0Var.f43122e);
        wb0Var.finishFragment();
    }

    @Override
    public void g(int i10) {
        switch (this.f39987a) {
            case 2:
                wb0 wb0Var = this.f39988b;
                ArrayList arrayList = wb0Var.P;
                if (i10 < arrayList.size()) {
                    wb0Var.f43127w.setText(LocaleController.formatDateAudio(wb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                wb0Var.f43127w.setText("");
                return;
            default:
                wb0 wb0Var2 = this.f39988b;
                wb0Var2.F.clearFocus();
                wb0Var2.O = true;
                ArrayList arrayList2 = wb0Var2.R;
                if (i10 < arrayList2.size()) {
                    wb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    wb0Var2.F.setText("");
                }
                wb0Var2.O = false;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f39987a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
