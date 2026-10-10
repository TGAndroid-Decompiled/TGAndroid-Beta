package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class gq0 implements ar0 {
    public final HashMap f38123a;
    public final ArrayList f38124b;
    public final kq0 f38125c;

    public gq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38125c = kq0Var;
        this.f38123a = hashMap;
        this.f38124b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f38125c;
        org.telegram.ui.Components.av avVar = kq0Var.M;
        kq0Var.f39373a = editable;
        avVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f38125c;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(this.f38123a, this.f38124b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
