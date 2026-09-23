package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class ib0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.sv0 {
    public final int f34091a;
    public final sb0 f34092b;

    public ib0(sb0 sb0Var, int i10) {
        this.f34091a = i10;
        this.f34092b = sb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f34092b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        sb0 sb0Var = this.f34092b;
        sb0Var.T.a(sb0Var.e);
        sb0Var.finishFragment();
    }

    @Override
    public void g(int i10) {
        switch (this.f34091a) {
            case 2:
                sb0 sb0Var = this.f34092b;
                ArrayList arrayList = sb0Var.P;
                if (i10 < arrayList.size()) {
                    sb0Var.f37233w.setText(LocaleController.formatDateAudio(sb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                sb0Var.f37233w.setText("");
                return;
            default:
                sb0 sb0Var2 = this.f34092b;
                sb0Var2.F.clearFocus();
                sb0Var2.O = true;
                ArrayList arrayList2 = sb0Var2.R;
                if (i10 < arrayList2.size()) {
                    sb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    sb0Var2.F.setText("");
                }
                sb0Var2.O = false;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f34091a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
