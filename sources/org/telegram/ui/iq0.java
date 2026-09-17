package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class iq0 implements br0 {
    public final HashMap f34652a;
    public final ArrayList f34653b;
    public final lq0 f34654c;

    public iq0(lq0 lq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f34654c = lq0Var;
        this.f34652a = hashMap;
        this.f34653b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        lq0 lq0Var = this.f34654c;
        org.telegram.ui.Components.ju juVar = lq0Var.M;
        lq0Var.f35600a = editable;
        juVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        lq0 lq0Var = this.f34654c;
        lq0Var.removeSelfFromStack();
        if (!z10) {
            lq0Var.V(this.f34652a, this.f34653b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
