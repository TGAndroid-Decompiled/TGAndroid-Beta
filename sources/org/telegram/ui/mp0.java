package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class mp0 implements kq0 {
    public final HashMap f39636a;
    public final ArrayList f39637b;
    public final up0 f39638c;

    public mp0(up0 up0Var, HashMap hashMap, ArrayList arrayList) {
        this.f39638c = up0Var;
        this.f39636a = hashMap;
        this.f39637b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        up0 up0Var = this.f39638c;
        org.telegram.ui.Components.ou ouVar = up0Var.M;
        up0Var.f42463a = editable;
        ouVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.f39638c;
        up0Var.removeSelfFromStack();
        if (!z10) {
            up0Var.V(this.f39636a, this.f39637b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
