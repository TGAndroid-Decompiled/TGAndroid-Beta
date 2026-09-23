package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class aq0 implements tq0 {
    public final HashMap f31860a;
    public final ArrayList f31861b;
    public final dq0 f31862c;

    public aq0(dq0 dq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f31862c = dq0Var;
        this.f31860a = hashMap;
        this.f31861b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        dq0 dq0Var = this.f31862c;
        org.telegram.ui.Components.ku kuVar = dq0Var.M;
        dq0Var.f32695a = editable;
        kuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        dq0 dq0Var = this.f31862c;
        dq0Var.removeSelfFromStack();
        if (!z10) {
            dq0Var.V(this.f31860a, this.f31861b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
