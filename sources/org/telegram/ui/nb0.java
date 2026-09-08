package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class nb0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.rv0 {
    public final int f38936a;
    public final xb0 f38937b;

    public nb0(xb0 xb0Var, int i10) {
        this.f38936a = i10;
        this.f38937b = xb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f38937b.V(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xb0 xb0Var = this.f38937b;
        xb0Var.T.a(xb0Var.f42701e);
        xb0Var.finishFragment();
    }

    @Override
    public void i(int i10) {
        switch (this.f38936a) {
            case 2:
                xb0 xb0Var = this.f38937b;
                ArrayList arrayList = xb0Var.P;
                if (i10 < arrayList.size()) {
                    xb0Var.f42706w.setText(LocaleController.formatDateAudio(xb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                xb0Var.f42706w.setText("");
                return;
            default:
                xb0 xb0Var2 = this.f38937b;
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
        int i10 = this.f38936a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
