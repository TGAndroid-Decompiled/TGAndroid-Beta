package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

public final class gp0 implements zp0 {

    public final HashMap f38460a;

    public final ArrayList f38461b;

    public final jp0 f38462c;

    public gp0(jp0 jp0Var, HashMap map, ArrayList arrayList) {
        this.f38462c = jp0Var;
        this.f38460a = map;
        this.f38461b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jp0 jp0Var = this.f38462c;
        org.telegram.ui.Components.tt ttVar = jp0Var.I;
        jp0Var.f39461a = editable;
        ttVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        jp0 jp0Var = this.f38462c;
        jp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        jp0Var.V(this.f38460a, this.f38461b, z11, i10);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void h() {
    }
}
