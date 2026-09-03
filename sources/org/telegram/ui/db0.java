package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class db0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.tv0 {
    public final int f36142a;
    public final ob0 f36143b;

    public db0(ob0 ob0Var, int i10) {
        this.f36142a = i10;
        this.f36143b = ob0Var;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        this.f36143b.V(i10);
    }

    @Override
    public void i(int i10) {
        switch (this.f36142a) {
            case 2:
                ob0 ob0Var = this.f36143b;
                ArrayList arrayList = ob0Var.M;
                if (i10 < arrayList.size()) {
                    ob0Var.f39647w.setText(LocaleController.formatDateAudio(ob0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                ob0Var.f39647w.setText("");
                return;
            default:
                ob0 ob0Var2 = this.f36143b;
                ob0Var2.C.clearFocus();
                ob0Var2.L = true;
                ArrayList arrayList2 = ob0Var2.O;
                if (i10 < arrayList2.size()) {
                    ob0Var2.C.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    ob0Var2.C.setText("");
                }
                ob0Var2.L = false;
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ob0 ob0Var = this.f36143b;
        ob0Var.Q.a(ob0Var.f39642e);
        ob0Var.finishFragment();
    }

    @Override
    public void m() {
        int i10 = this.f36142a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
