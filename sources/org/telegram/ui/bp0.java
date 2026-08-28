package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class bp0 implements yp0 {
    public final HashMap f36916a;
    public final ArrayList f36917b;
    public final ip0 f36918c;

    public bp0(ip0 ip0Var, HashMap hashMap, ArrayList arrayList) {
        this.f36918c = ip0Var;
        this.f36916a = hashMap;
        this.f36917b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        ip0 ip0Var = this.f36918c;
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
        ip0 ip0Var = this.f36918c;
        ip0Var.removeSelfFromStack();
        if (!z10) {
            ip0Var.U(this.f36916a, this.f36917b, z11, i9);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void h() {
    }
}
