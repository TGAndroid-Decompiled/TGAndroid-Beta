package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class fb0 extends o81 {
    public final Context f24116a;
    public final ec0 f24117b;

    public fb0(ec0 ec0Var, Context context) {
        this.f24117b = ec0Var;
        this.f24116a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        yb0 yb0Var = (yb0) view;
        yb0Var.h();
        yb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new yb0(this.f24117b, this.f24116a, i10);
    }

    @Override
    public final int e() {
        return this.f24117b.e.f23248a.size();
    }

    @Override
    public final int h(int i10) {
        return ((bc0) this.f24117b.e.f23248a.get(i10)).f22952a;
    }
}
