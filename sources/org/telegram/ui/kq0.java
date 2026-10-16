package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class kq0 implements er0 {
    public final HashMap f37485a;
    public final ArrayList f37486b;
    public final oq0 f37487c;

    public kq0(oq0 oq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37487c = oq0Var;
        this.f37485a = hashMap;
        this.f37486b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        oq0 oq0Var = this.f37487c;
        org.telegram.ui.Components.vu vuVar = oq0Var.M;
        oq0Var.f38728a = editable;
        vuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        oq0 oq0Var = this.f37487c;
        oq0Var.removeSelfFromStack();
        if (!z10) {
            oq0Var.V(this.f37485a, this.f37486b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
