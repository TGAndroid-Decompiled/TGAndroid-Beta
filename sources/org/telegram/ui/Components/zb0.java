package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class zb0 extends g91 {
    public final Context f33565a;
    public final wc0 f33566b;

    public zb0(wc0 wc0Var, Context context) {
        this.f33566b = wc0Var;
        this.f33565a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        qc0 qc0Var = (qc0) view;
        qc0Var.h();
        qc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new qc0(this.f33566b, this.f33565a, i10);
    }

    @Override
    public final int e() {
        return this.f33566b.f32646e.f31450a.size();
    }

    @Override
    public final int h(int i10) {
        return ((tc0) this.f33566b.f32646e.f31450a.get(i10)).f31108a;
    }
}
