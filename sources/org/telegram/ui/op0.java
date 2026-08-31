package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class op0 implements gq0 {
    public final HashMap f39816a;
    public final ArrayList f39817b;
    public final rp0 f39818c;

    public op0(rp0 rp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f39818c = rp0Var;
        this.f39816a = hashMap;
        this.f39817b = arrayList;
    }

    @Override
    public final void c(Editable editable) {
        rp0 rp0Var = this.f39818c;
        org.telegram.ui.Components.fu fuVar = rp0Var.J;
        rp0Var.f41024a = editable;
        fuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        rp0 rp0Var = this.f39818c;
        rp0Var.removeSelfFromStack();
        if (!z4) {
            rp0Var.V(this.f39816a, this.f39817b, z10, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d() {
    }
}
