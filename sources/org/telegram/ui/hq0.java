package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class hq0 implements ar0 {
    public final HashMap f37120a;
    public final ArrayList f37121b;
    public final kq0 f37122c;

    public hq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37122c = kq0Var;
        this.f37120a = hashMap;
        this.f37121b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f37122c;
        org.telegram.ui.Components.hu huVar = kq0Var.M;
        kq0Var.f38132a = editable;
        huVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f37122c;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(this.f37120a, this.f37121b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
