package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class bq0 implements zq0 {
    public final HashMap f36471a;
    public final ArrayList f36472b;
    public final jq0 f36473c;

    public bq0(jq0 jq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f36473c = jq0Var;
        this.f36471a = hashMap;
        this.f36472b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        jq0 jq0Var = this.f36473c;
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
        jq0 jq0Var = this.f36473c;
        jq0Var.removeSelfFromStack();
        if (!z10) {
            jq0Var.V(this.f36471a, this.f36472b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
