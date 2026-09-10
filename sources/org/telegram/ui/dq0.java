package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class dq0 implements ar0 {
    public final HashMap f31957a;
    public final ArrayList f31958b;
    public final kq0 f31959c;

    public dq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f31959c = kq0Var;
        this.f31957a = hashMap;
        this.f31958b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f31959c;
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
        kq0 kq0Var = this.f31959c;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(this.f31957a, this.f31958b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
