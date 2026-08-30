package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class mp0 implements eq0 {
    public final HashMap f36366a;
    public final ArrayList f36367b;
    public final pp0 f36368c;

    public mp0(pp0 pp0Var, HashMap hashMap, ArrayList arrayList) {
        this.f36368c = pp0Var;
        this.f36366a = hashMap;
        this.f36367b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        pp0 pp0Var = this.f36368c;
        org.telegram.ui.Components.du duVar = pp0Var.J;
        pp0Var.f37427a = editable;
        duVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(int i10, boolean z4, boolean z10) {
        pp0 pp0Var = this.f36368c;
        pp0Var.removeSelfFromStack();
        if (!z4) {
            pp0Var.V(this.f36366a, this.f36367b, z10, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }
}
