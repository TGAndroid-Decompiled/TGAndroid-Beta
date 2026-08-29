package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class ap0 implements yp0 {
    public final HashMap f36582a;
    public final ArrayList f36583b;
    public final hp0 f36584c;

    public ap0(hp0 hp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f36584c = hp0Var;
        this.f36582a = hashMap;
        this.f36583b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        hp0 hp0Var = this.f36584c;
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
        hp0 hp0Var = this.f36584c;
        hp0Var.removeSelfFromStack();
        if (!z10) {
            hp0Var.V(this.f36582a, this.f36583b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
