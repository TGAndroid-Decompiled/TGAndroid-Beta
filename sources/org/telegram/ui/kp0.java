package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class kp0 implements iq0 {
    public final HashMap f38652a;
    public final ArrayList f38653b;
    public final sp0 f38654c;

    public kp0(sp0 sp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38654c = sp0Var;
        this.f38652a = hashMap;
        this.f38653b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        sp0 sp0Var = this.f38654c;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.f41509a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.f38654c;
        sp0Var.removeSelfFromStack();
        if (!z10) {
            sp0Var.V(this.f38652a, this.f38653b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
