package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class cq0 implements zq0 {
    public final HashMap f32848a;
    public final ArrayList f32849b;
    public final jq0 f32850c;

    public cq0(jq0 jq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f32850c = jq0Var;
        this.f32848a = hashMap;
        this.f32849b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jq0 jq0Var = this.f32850c;
        org.telegram.ui.Components.ju juVar = jq0Var.M;
        jq0Var.f34964a = editable;
        juVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.f32850c;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(this.f32848a, this.f32849b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
