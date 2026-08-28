package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class fp0 implements yp0 {
    public final HashMap f38329a;
    public final ArrayList f38330b;
    public final ip0 f38331c;

    public fp0(ip0 ip0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38331c = ip0Var;
        this.f38329a = hashMap;
        this.f38330b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        ip0 ip0Var = this.f38331c;
        org.telegram.ui.Components.ut utVar = ip0Var.I;
        ip0Var.f39239a = editable;
        utVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i9, boolean z10, boolean z11) {
        ip0 ip0Var = this.f38331c;
        ip0Var.removeSelfFromStack();
        if (!z10) {
            ip0Var.U(this.f38329a, this.f38330b, z11, i9);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void h() {
    }
}
