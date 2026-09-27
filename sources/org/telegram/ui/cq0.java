package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class cq0 implements vq0 {
    public final HashMap f32781a;
    public final ArrayList f32782b;
    public final fq0 f32783c;

    public cq0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f32783c = fq0Var;
        this.f32781a = hashMap;
        this.f32782b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f32783c;
        org.telegram.ui.Components.lu luVar = fq0Var.M;
        fq0Var.f33607a = editable;
        luVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f32783c;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.V(this.f32781a, this.f32782b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
