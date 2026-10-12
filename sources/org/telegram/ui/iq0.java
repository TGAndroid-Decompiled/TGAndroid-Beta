package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class iq0 implements gr0 {
    public final HashMap f37191a;
    public final ArrayList f37192b;
    public final qq0 f37193c;

    public iq0(qq0 qq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37193c = qq0Var;
        this.f37191a = hashMap;
        this.f37192b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        qq0 qq0Var = this.f37193c;
        org.telegram.ui.Components.vu vuVar = qq0Var.M;
        qq0Var.f39516a = editable;
        vuVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        qq0 qq0Var = this.f37193c;
        qq0Var.removeSelfFromStack();
        if (!z10) {
            qq0Var.V(this.f37191a, this.f37192b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
