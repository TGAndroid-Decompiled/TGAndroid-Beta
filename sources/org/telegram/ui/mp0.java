package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class mp0 implements kq0 {
    public final HashMap f39254a;
    public final ArrayList f39255b;
    public final up0 f39256c;

    public mp0(up0 up0Var, HashMap hashMap, ArrayList arrayList) {
        this.f39256c = up0Var;
        this.f39254a = hashMap;
        this.f39255b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        up0 up0Var = this.f39256c;
        org.telegram.ui.Components.qu quVar = up0Var.M;
        up0Var.f42041a = editable;
        quVar.setText(editable);
    }

    @Override
    public final void d(int i10, boolean z10, boolean z11) {
        up0 up0Var = this.f39256c;
        up0Var.removeSelfFromStack();
        if (!z10) {
            up0Var.V(this.f39254a, this.f39255b, z11, i10);
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }
}
