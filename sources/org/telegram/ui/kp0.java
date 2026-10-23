package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class kp0 implements iq0 {
    public final HashMap f38653a;
    public final ArrayList f38654b;
    public final sp0 f38655c;

    public kp0(sp0 sp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38655c = sp0Var;
        this.f38653a = hashMap;
        this.f38654b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        sp0 sp0Var = this.f38655c;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.f41510a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.f38655c;
        sp0Var.removeSelfFromStack();
        if (!z10) {
            sp0Var.V(this.f38653a, this.f38654b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
