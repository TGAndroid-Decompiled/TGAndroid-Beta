package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
public final class qb0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.rw0 {
    public final int f39370a;
    public final ac0 f39371b;

    public qb0(ac0 ac0Var, int i10) {
        this.f39370a = i10;
        this.f39371b = ac0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        this.f39371b.V(i10);
    }

    @Override
    public void f(int i10) {
        switch (this.f39370a) {
            case 2:
                ac0 ac0Var = this.f39371b;
                ArrayList arrayList = ac0Var.P;
                if (i10 < arrayList.size()) {
                    ac0Var.f34172w.setText(LocaleController.formatDateAudio(ac0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i10)).intValue(), false));
                    return;
                }
                ac0Var.f34172w.setText("");
                return;
            default:
                ac0 ac0Var2 = this.f39371b;
                ac0Var2.F.clearFocus();
                ac0Var2.O = true;
                ArrayList arrayList2 = ac0Var2.R;
                if (i10 < arrayList2.size()) {
                    ac0Var2.F.setText(((Integer) arrayList2.get(i10)).toString());
                } else {
                    ac0Var2.F.setText("");
                }
                ac0Var2.O = false;
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ac0 ac0Var = this.f39371b;
        ac0Var.T.a(ac0Var.e);
        ac0Var.finishFragment();
    }

    @Override
    public void m() {
        int i10 = this.f39370a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
