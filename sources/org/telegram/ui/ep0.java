package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class ep0 implements yp0 {
    public final HashMap f37880a;
    public final ArrayList f37881b;
    public final hp0 f37882c;

    public ep0(hp0 hp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37882c = hp0Var;
        this.f37880a = hashMap;
        this.f37881b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        hp0 hp0Var = this.f37882c;
        org.telegram.ui.Components.au auVar = hp0Var.I;
        hp0Var.f38984a = editable;
        auVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        hp0 hp0Var = this.f37882c;
        hp0Var.removeSelfFromStack();
        if (!z10) {
            hp0Var.V(this.f37880a, this.f37881b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
