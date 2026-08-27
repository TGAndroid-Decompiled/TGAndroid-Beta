package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

public final class cp0 implements zp0 {

    public final HashMap f37126a;

    public final ArrayList f37127b;

    public final jp0 f37128c;

    public cp0(jp0 jp0Var, HashMap map, ArrayList arrayList) {
        this.f37128c = jp0Var;
        this.f37126a = map;
        this.f37127b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jp0 jp0Var = this.f37128c;
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
        jp0 jp0Var = this.f37128c;
        jp0Var.removeSelfFromStack();
        if (z10) {
            return;
        }
        jp0Var.V(this.f37126a, this.f37127b, z11, i10);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void h() {
    }
}
