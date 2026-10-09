package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class gq0 implements ar0 {
    public final HashMap f38079a;
    public final ArrayList f38080b;
    public final kq0 f38081c;

    public gq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38081c = kq0Var;
        this.f38079a = hashMap;
        this.f38080b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f38081c;
        org.telegram.ui.Components.zu zuVar = kq0Var.M;
        kq0Var.f39329a = editable;
        zuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f38081c;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(this.f38079a, this.f38080b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
