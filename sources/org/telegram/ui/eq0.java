package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class eq0 implements br0 {
    public final HashMap f33340a;
    public final ArrayList f33341b;
    public final lq0 f33342c;

    public eq0(lq0 lq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f33342c = lq0Var;
        this.f33340a = hashMap;
        this.f33341b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        lq0 lq0Var = this.f33342c;
        org.telegram.ui.Components.ju juVar = lq0Var.M;
        lq0Var.f35431a = editable;
        juVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        lq0 lq0Var = this.f33342c;
        lq0Var.removeSelfFromStack();
        if (!z10) {
            lq0Var.V(this.f33340a, this.f33341b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
