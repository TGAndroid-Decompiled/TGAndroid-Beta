package org.telegram.ui;

import java.util.ArrayList;
public final class a90 implements org.telegram.ui.Components.a5, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.gu0 {
    public final int f45548a;
    public final k90 f45549b;

    public a90(k90 k90Var, int i7) {
        this.f45548a = i7;
        this.f45549b = k90Var;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        this.f45549b.a0(i7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        k90 k90Var = this.f45549b;
        k90Var.T.a(k90Var.f49253e);
        k90Var.finishFragment();
    }

    @Override
    public void k(int i7) {
        switch (this.f45548a) {
            case 2:
                k90 k90Var = this.f45549b;
                ArrayList arrayList = k90Var.P;
                if (i7 < arrayList.size()) {
                    k90Var.f49259x.setText(org.telegram.messenger.hd.s(k90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i7)).intValue(), false));
                    return;
                }
                k90Var.f49259x.setText("");
                return;
            default:
                k90 k90Var2 = this.f45549b;
                k90Var2.G.clearFocus();
                k90Var2.O = true;
                ArrayList arrayList2 = k90Var2.R;
                if (i7 < arrayList2.size()) {
                    k90Var2.G.setText(((Integer) arrayList2.get(i7)).toString());
                } else {
                    k90Var2.G.setText("");
                }
                k90Var2.O = false;
                return;
        }
    }

    @Override
    public void o() {
        int i7 = this.f45548a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
