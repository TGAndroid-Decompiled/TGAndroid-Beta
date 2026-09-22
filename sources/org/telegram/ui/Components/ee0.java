package org.telegram.ui.Components;

import androidx.core.widget.NestedScrollView;
public final class ee0 implements u0.g, b5 {
    public final pe0 f23626a;

    public ee0(pe0 pe0Var) {
        this.f23626a = pe0Var;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        pe0 pe0Var = this.f23626a;
        pe0Var.K.a(pe0Var.N, z10, i10, 0L);
        pe0Var.dismiss();
    }

    @Override
    public void a(NestedScrollView nestedScrollView) {
        pe0 pe0Var = this.f23626a;
        pe0Var.H(!pe0Var.f27025s);
    }
}
