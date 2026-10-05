package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class cq0 implements vq0 {
    public final HashMap f35530a;
    public final ArrayList f35531b;
    public final fq0 f35532c;

    public cq0(fq0 fq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f35532c = fq0Var;
        this.f35530a = hashMap;
        this.f35531b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        fq0 fq0Var = this.f35532c;
        org.telegram.ui.Components.mu muVar = fq0Var.M;
        fq0Var.f36374a = editable;
        muVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        fq0 fq0Var = this.f35532c;
        fq0Var.removeSelfFromStack();
        if (!z10) {
            fq0Var.T(this.f35530a, this.f35531b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
