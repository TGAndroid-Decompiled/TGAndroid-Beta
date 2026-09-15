package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class gq0 implements zq0 {
    public final HashMap f33984a;
    public final ArrayList f33985b;
    public final jq0 f33986c;

    public gq0(jq0 jq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f33986c = jq0Var;
        this.f33984a = hashMap;
        this.f33985b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jq0 jq0Var = this.f33986c;
        org.telegram.ui.Components.ju juVar = jq0Var.M;
        jq0Var.f34951a = editable;
        juVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.f33986c;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(this.f33984a, this.f33985b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
