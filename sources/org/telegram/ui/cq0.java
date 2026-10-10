package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class cq0 implements ar0 {
    public final HashMap f36767a;
    public final ArrayList f36768b;
    public final kq0 f36769c;

    public cq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f36769c = kq0Var;
        this.f36767a = hashMap;
        this.f36768b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f36769c;
        org.telegram.ui.Components.av avVar = kq0Var.M;
        kq0Var.f39373a = editable;
        avVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f36769c;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(this.f36767a, this.f36768b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
