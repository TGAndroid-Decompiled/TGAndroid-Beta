package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class kp0 implements iq0 {
    public final HashMap f38649a;
    public final ArrayList f38650b;
    public final sp0 f38651c;

    public kp0(sp0 sp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38651c = sp0Var;
        this.f38649a = hashMap;
        this.f38650b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        sp0 sp0Var = this.f38651c;
        org.telegram.ui.Components.qu quVar = sp0Var.M;
        sp0Var.f41506a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        sp0 sp0Var = this.f38651c;
        sp0Var.removeSelfFromStack();
        if (!z10) {
            sp0Var.V(this.f38649a, this.f38650b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
