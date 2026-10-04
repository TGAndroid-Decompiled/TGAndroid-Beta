package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class lb0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ow0 {
    public final int f38219a;
    public final vb0 f38220b;

    public lb0(vb0 vb0Var, int i10) {
        this.f38219a = i10;
        this.f38220b = vb0Var;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        this.f38220b.T(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        vb0 vb0Var = this.f38220b;
        vb0Var.T.a(vb0Var.f41682e);
        vb0Var.finishFragment();
    }

    @Override
    public void j(int i10) {
        switch (this.f38219a) {
            case 2:
                vb0 vb0Var = this.f38220b;
                ArrayList arrayList = vb0Var.P;
                if (i10 < arrayList.size()) {
                    vb0Var.f41687w.setText(LocaleController.formatDateAudio(vb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                vb0Var.f41687w.setText("");
                return;
            default:
                vb0 vb0Var2 = this.f38220b;
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
        int i10 = this.f38219a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
