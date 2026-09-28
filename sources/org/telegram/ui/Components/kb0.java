package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class kb0 extends p81 {
    public final Context f25668a;
    public final hc0 f25669b;

    public kb0(hc0 hc0Var, Context context) {
        this.f25669b = hc0Var;
        this.f25668a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        bc0 bc0Var = (bc0) view;
        bc0Var.h();
        bc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new bc0(this.f25669b, this.f25668a, i10);
    }

    @Override
    public final int e() {
        return this.f25669b.e.f24212a.size();
    }

    @Override
    public final int h(int i10) {
        return ((ec0) this.f25669b.e.f24212a.get(i10)).f23982a;
    }
}
