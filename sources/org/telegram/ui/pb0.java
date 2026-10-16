package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class pb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.rw0 {
    public final int f38868a;
    public final zb0 f38869b;

    public pb0(zb0 zb0Var, int i10) {
        this.f38868a = i10;
        this.f38869b = zb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f38869b.V(i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        zb0 zb0Var = this.f38869b;
        zb0Var.T.a(zb0Var.e);
        zb0Var.finishFragment();
    }

    @Override
    public void h(int i10) {
        switch (this.f38868a) {
            case 2:
                zb0 zb0Var = this.f38869b;
                ArrayList arrayList = zb0Var.P;
                if (i10 < arrayList.size()) {
                    zb0Var.f42268w.setText(LocaleController.formatDateAudio(zb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                zb0Var.f42268w.setText("");
                return;
            default:
                zb0 zb0Var2 = this.f38869b;
                zb0Var2.F.clearFocus();
                zb0Var2.O = true;
                ArrayList arrayList2 = zb0Var2.R;
                if (i10 < arrayList2.size()) {
                    zb0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    zb0Var2.F.setText("");
                }
                zb0Var2.O = false;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f38868a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
