package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class mp0 implements kq0 {
    public final HashMap f39213a;
    public final ArrayList f39214b;
    public final up0 f39215c;

    public mp0(up0 up0Var, HashMap hashMap, ArrayList arrayList) {
        this.f39215c = up0Var;
        this.f39213a = hashMap;
        this.f39214b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        up0 up0Var = this.f39215c;
        org.telegram.ui.Components.qu quVar = up0Var.M;
        up0Var.f41999a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.f39215c;
        up0Var.removeSelfFromStack();
        if (!z10) {
            up0Var.V(this.f39213a, this.f39214b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
