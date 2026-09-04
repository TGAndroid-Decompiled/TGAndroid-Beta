package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class hq0 implements ar0 {
    public final HashMap f37092a;
    public final ArrayList f37093b;
    public final kq0 f37094c;

    public hq0(kq0 kq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37094c = kq0Var;
        this.f37092a = hashMap;
        this.f37093b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        kq0 kq0Var = this.f37094c;
        org.telegram.ui.Components.hu huVar = kq0Var.M;
        kq0Var.f38104a = editable;
        huVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void h(int i10, boolean z10, boolean z11) {
        kq0 kq0Var = this.f37094c;
        kq0Var.removeSelfFromStack();
        if (!z10) {
            kq0Var.V(this.f37092a, this.f37093b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
