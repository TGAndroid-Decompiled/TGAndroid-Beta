package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class lb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.vw0 {
    public final int f39494a;
    public final vb0 f39495b;

    public lb0(vb0 vb0Var, int i10) {
        this.f39494a = i10;
        this.f39495b = vb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f39495b.V(i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        vb0 vb0Var = this.f39495b;
        vb0Var.T.a(vb0Var.f42805e);
        vb0Var.finishFragment();
    }

    @Override
    public void g(int i10) {
        switch (this.f39494a) {
            case 2:
                vb0 vb0Var = this.f39495b;
                ArrayList arrayList = vb0Var.P;
                if (i10 < arrayList.size()) {
                    vb0Var.f42810w.setText(LocaleController.formatDateAudio(vb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                vb0Var.f42810w.setText("");
                return;
            default:
                vb0 vb0Var2 = this.f39495b;
                vb0Var2.F.clearFocus();
                vb0Var2.O = true;
                ArrayList arrayList2 = vb0Var2.R;
                if (i10 < arrayList2.size()) {
                    vb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    vb0Var2.F.setText("");
                }
                vb0Var2.O = false;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f39494a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
