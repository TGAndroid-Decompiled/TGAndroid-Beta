package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class cq0 implements zq0 {
    public final HashMap f32841a;
    public final ArrayList f32842b;
    public final jq0 f32843c;

    public cq0(jq0 jq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f32843c = jq0Var;
        this.f32841a = hashMap;
        this.f32842b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jq0 jq0Var = this.f32843c;
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
        jq0 jq0Var = this.f32843c;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(this.f32841a, this.f32842b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
