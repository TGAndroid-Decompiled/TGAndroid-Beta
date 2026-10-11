package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class bq0 implements zq0 {
    public final HashMap f36437a;
    public final ArrayList f36438b;
    public final jq0 f36439c;

    public bq0(jq0 jq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f36439c = jq0Var;
        this.f36437a = hashMap;
        this.f36438b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jq0 jq0Var = this.f36439c;
        org.telegram.ui.Components.av avVar = jq0Var.M;
        jq0Var.f39099a = editable;
        avVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.f36439c;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(this.f36437a, this.f36438b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
