package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class nb0 implements org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.dw0 {
    public final int f35199a;
    public final xb0 f35200b;

    public nb0(xb0 xb0Var, int i10) {
        this.f35199a = i10;
        this.f35200b = xb0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        this.f35200b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        xb0 xb0Var = this.f35200b;
        xb0Var.T.a(xb0Var.e);
        xb0Var.finishFragment();
    }

    @Override
    public void h(int i10) {
        switch (this.f35199a) {
            case 2:
                xb0 xb0Var = this.f35200b;
                ArrayList arrayList = xb0Var.P;
                if (i10 < arrayList.size()) {
                    xb0Var.f38668w.setText(LocaleController.formatDateAudio(xb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                xb0Var.f38668w.setText("");
                return;
            default:
                xb0 xb0Var2 = this.f35200b;
                xb0Var2.F.clearFocus();
                xb0Var2.O = true;
                ArrayList arrayList2 = xb0Var2.R;
                if (i10 < arrayList2.size()) {
                    xb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    xb0Var2.F.setText("");
                }
                xb0Var2.O = false;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f35199a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
