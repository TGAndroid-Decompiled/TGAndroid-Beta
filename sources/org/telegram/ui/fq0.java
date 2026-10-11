package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class fq0 implements zq0 {
    public final HashMap f37776a;
    public final ArrayList f37777b;
    public final jq0 f37778c;

    public fq0(jq0 jq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37778c = jq0Var;
        this.f37776a = hashMap;
        this.f37777b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jq0 jq0Var = this.f37778c;
        org.telegram.ui.Components.av avVar = jq0Var.M;
        jq0Var.f39133a = editable;
        avVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        jq0 jq0Var = this.f37778c;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(this.f37776a, this.f37777b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
