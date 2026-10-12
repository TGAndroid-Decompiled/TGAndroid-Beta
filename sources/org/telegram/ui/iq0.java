package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class iq0 implements cr0 {
    public final HashMap f38972a;
    public final ArrayList f38973b;
    public final mq0 f38974c;

    public iq0(mq0 mq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f38974c = mq0Var;
        this.f38972a = hashMap;
        this.f38973b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        mq0 mq0Var = this.f38974c;
        org.telegram.ui.Components.cv cvVar = mq0Var.M;
        mq0Var.f40110a = editable;
        cvVar.setText(editable);
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void i(int i10, boolean z10, boolean z11) {
        mq0 mq0Var = this.f38974c;
        mq0Var.removeSelfFromStack();
        if (!z10) {
            mq0Var.V(this.f38972a, this.f38973b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
