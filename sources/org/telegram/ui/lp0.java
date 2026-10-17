package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class lp0 implements jq0 {
    public final HashMap f38913a;
    public final ArrayList f38914b;
    public final tp0 f38915c;

    public lp0(tp0 tp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38915c = tp0Var;
        this.f38913a = hashMap;
        this.f38914b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        tp0 tp0Var = this.f38915c;
        org.telegram.ui.Components.qu quVar = tp0Var.M;
        tp0Var.f41798a = editable;
        quVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        tp0 tp0Var = this.f38915c;
        tp0Var.removeSelfFromStack();
        if (!z10) {
            tp0Var.V(this.f38913a, this.f38914b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
