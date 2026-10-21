package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class qa0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ow0 {
    public final int f40516a;
    public final ab0 f40517b;

    public qa0(ab0 ab0Var, int i10) {
        this.f40516a = i10;
        this.f40517b = ab0Var;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        this.f40517b.V(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ab0 ab0Var = this.f40517b;
        ab0Var.T.a(ab0Var.e);
        ab0Var.finishFragment();
    }

    @Override
    public void h(int i10) {
        switch (this.f40516a) {
            case 2:
                ab0 ab0Var = this.f40517b;
                ArrayList arrayList = ab0Var.P;
                if (i10 < arrayList.size()) {
                    ab0Var.f35335w.setText(LocaleController.formatDateAudio(ab0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                ab0Var.f35335w.setText("");
                return;
            default:
                ab0 ab0Var2 = this.f40517b;
                ab0Var2.F.clearFocus();
                ab0Var2.O = true;
                ArrayList arrayList2 = ab0Var2.R;
                if (i10 < arrayList2.size()) {
                    ab0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    ab0Var2.F.setText("");
                }
                ab0Var2.O = false;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f40516a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
