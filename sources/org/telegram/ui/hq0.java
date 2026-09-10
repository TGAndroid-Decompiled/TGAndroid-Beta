package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class hq0 implements ar0 {
    public final HashMap f33438a;
    public final ArrayList f33439b;
    public final kq0 f33440c;

    public hq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f33440c = kq0Var;
        this.f33438a = hashMap;
        this.f33439b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f33440c;
        org.telegram.ui.Components.nu nuVar = kq0Var.M;
        kq0Var.f34438a = editable;
        nuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f33440c;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(this.f33438a, this.f33439b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
