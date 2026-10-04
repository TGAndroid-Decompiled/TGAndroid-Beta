package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class cq0 implements vq0 {
    public final HashMap f35533a;
    public final ArrayList f35534b;
    public final fq0 f35535c;

    public cq0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f35535c = fq0Var;
        this.f35533a = hashMap;
        this.f35534b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f35535c;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.f36361a = editable;
        muVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f35535c;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.T(this.f35533a, this.f35534b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
