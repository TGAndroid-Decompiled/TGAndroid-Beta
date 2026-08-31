package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class kp0 implements gq0 {
    public final HashMap f38452a;
    public final ArrayList f38453b;
    public final rp0 f38454c;

    public kp0(rp0 rp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38454c = rp0Var;
        this.f38452a = hashMap;
        this.f38453b = arrayList;
    }

    @Override
    public final void c(Editable editable) {
        rp0 rp0Var = this.f38454c;
        org.telegram.ui.Components.fu fuVar = rp0Var.J;
        rp0Var.f41024a = editable;
        fuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        rp0 rp0Var = this.f38454c;
        rp0Var.removeSelfFromStack();
        if (!z4) {
            rp0Var.V(this.f38452a, this.f38453b, z10, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void d() {
    }
}
