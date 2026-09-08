package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class ee0 implements u0.g, d5 {
    public final pe0 f25695a;

    public ee0(pe0 pe0Var) {
        this.f25695a = pe0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        pe0 pe0Var = this.f25695a;
        pe0Var.K.b(pe0Var.N, z10, i10, 0L);
        pe0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        pe0 pe0Var = this.f25695a;
        pe0Var.H(!pe0Var.f29389s);
    }
}
