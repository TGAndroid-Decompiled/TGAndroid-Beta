package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class pp0 implements jq0 {
    public final HashMap f40213a;
    public final ArrayList f40214b;
    public final tp0 f40215c;

    public pp0(tp0 tp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f40215c = tp0Var;
        this.f40213a = hashMap;
        this.f40214b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        tp0 tp0Var = this.f40215c;
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
        tp0 tp0Var = this.f40215c;
        tp0Var.removeSelfFromStack();
        if (!z10) {
            tp0Var.V(this.f40213a, this.f40214b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
