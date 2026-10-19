package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class op0 implements iq0 {
    public final HashMap f39947a;
    public final ArrayList f39948b;
    public final sp0 f39949c;

    public op0(sp0 sp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f39949c = sp0Var;
        this.f39947a = hashMap;
        this.f39948b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        sp0 sp0Var = this.f39949c;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.f41500a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.f39949c;
        sp0Var.removeSelfFromStack();
        if (!z10) {
            sp0Var.V(this.f39947a, this.f39948b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
