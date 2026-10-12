package org.telegram.ui;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class eq0 implements cr0 {
    public final HashMap f37534a;
    public final ArrayList f37535b;
    public final mq0 f37536c;

    public eq0(mq0 mq0Var, HashMap hashMap, ArrayList arrayList) {
        this.f37536c = mq0Var;
        this.f37534a = hashMap;
        this.f37535b = arrayList;
    }

    @Override
    public final void b(Editable editable) {
        mq0 mq0Var = this.f37536c;
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
        mq0 mq0Var = this.f37536c;
        mq0Var.removeSelfFromStack();
        if (!z10) {
            mq0Var.V(this.f37534a, this.f37535b, z11, i10);
        }
    }

    @Override
    public final void a() {
    }

    @Override
    public final void g() {
    }
}
