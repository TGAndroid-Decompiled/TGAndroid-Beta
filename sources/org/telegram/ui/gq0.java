package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class gq0 implements er0 {
    public final HashMap f36291a;
    public final ArrayList f36292b;
    public final oq0 f36293c;

    public gq0(oq0 oq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f36293c = oq0Var;
        this.f36291a = hashMap;
        this.f36292b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        oq0 oq0Var = this.f36293c;
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
        oq0 oq0Var = this.f36293c;
        oq0Var.removeSelfFromStack();
        if (!z10) {
            oq0Var.V(this.f36291a, this.f36292b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
