package org.telegram.ui;

import java.util.ArrayList;
public final class a90 implements org.telegram.ui.Components.s4, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.vt0 {
    public final int f43616a;
    public final k90 f43617b;

    public a90(k90 k90Var, int i7) {
        this.f43616a = i7;
        this.f43617b = k90Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        this.f43617b.a0(i7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        k90 k90Var = this.f43617b;
        k90Var.S.a(k90Var.f47227e);
        k90Var.finishFragment();
    }

    @Override
    public void m(int i7) {
        switch (this.f43616a) {
            case 2:
                k90 k90Var = this.f43617b;
                ArrayList arrayList = k90Var.O;
                if (i7 < arrayList.size()) {
                    k90Var.f47233x.setText(org.telegram.messenger.id.s(k90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i7)).intValue(), false));
                    return;
                }
                k90Var.f47233x.setText("");
                return;
            default:
                k90 k90Var2 = this.f43617b;
                k90Var2.F.clearFocus();
                k90Var2.N = true;
                ArrayList arrayList2 = k90Var2.Q;
                if (i7 < arrayList2.size()) {
                    k90Var2.F.setText(((Integer) arrayList2.get(i7)).toString());
                } else {
                    k90Var2.F.setText("");
                }
                k90Var2.N = false;
                return;
        }
    }

    @Override
    public void n() {
        int i7 = this.f43616a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
