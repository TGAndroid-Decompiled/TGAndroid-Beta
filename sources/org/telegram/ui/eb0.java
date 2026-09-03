package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class eb0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.tv0 {
    public final int f33762a;
    public final pb0 f33763b;

    public eb0(pb0 pb0Var, int i10) {
        this.f33762a = i10;
        this.f33763b = pb0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        this.f33763b.V(i10);
    }

    @Override
    public void g(int i10) {
        switch (this.f33762a) {
            case 2:
                pb0 pb0Var = this.f33763b;
                ArrayList arrayList = pb0Var.M;
                if (i10 < arrayList.size()) {
                    pb0Var.f37067w.setText(LocaleController.formatDateAudio(pb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                pb0Var.f37067w.setText("");
                return;
            default:
                pb0 pb0Var2 = this.f33763b;
                pb0Var2.C.clearFocus();
                pb0Var2.L = true;
                ArrayList arrayList2 = pb0Var2.O;
                if (i10 < arrayList2.size()) {
                    pb0Var2.C.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    pb0Var2.C.setText("");
                }
                pb0Var2.L = false;
                return;
        }
    }

    @Override
    public void j() {
        int i10 = this.f33762a;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        pb0 pb0Var = this.f33763b;
        pb0Var.Q.a(pb0Var.e);
        pb0Var.finishFragment();
    }

    private final void a() {
    }

    private final void b() {
    }
}
