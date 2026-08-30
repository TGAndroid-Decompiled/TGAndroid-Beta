package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class cb0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.tv0 {
    public final int f33254a;
    public final nb0 f33255b;

    public cb0(nb0 nb0Var, int i10) {
        this.f33254a = i10;
        this.f33255b = nb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        this.f33255b.V(i10);
    }

    @Override
    public void h(int i10) {
        switch (this.f33254a) {
            case 2:
                nb0 nb0Var = this.f33255b;
                ArrayList arrayList = nb0Var.M;
                if (i10 < arrayList.size()) {
                    nb0Var.f36569w.setText(LocaleController.formatDateAudio(nb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                nb0Var.f36569w.setText("");
                return;
            default:
                nb0 nb0Var2 = this.f33255b;
                nb0Var2.C.clearFocus();
                nb0Var2.L = true;
                ArrayList arrayList2 = nb0Var2.O;
                if (i10 < arrayList2.size()) {
                    nb0Var2.C.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    nb0Var2.C.setText("");
                }
                nb0Var2.L = false;
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        nb0 nb0Var = this.f33255b;
        nb0Var.Q.a(nb0Var.e);
        nb0Var.finishFragment();
    }

    @Override
    public void m() {
        int i10 = this.f33254a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
