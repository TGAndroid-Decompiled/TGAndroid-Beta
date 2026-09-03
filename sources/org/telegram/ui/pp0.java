package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class pp0 implements lq0 {
    public final HashMap f37205a;
    public final ArrayList f37206b;
    public final wp0 f37207c;

    public pp0(wp0 wp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37207c = wp0Var;
        this.f37205a = hashMap;
        this.f37206b = arrayList;
    }

    @Override
    public final void c(Editable editable) {
        wp0 wp0Var = this.f37207c;
        org.telegram.ui.Components.cu cuVar = wp0Var.J;
        wp0Var.f39747a = editable;
        cuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        wp0 wp0Var = this.f37207c;
        wp0Var.removeSelfFromStack();
        if (!z4) {
            wp0Var.V(this.f37205a, this.f37206b, z10, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d() {
    }
}
