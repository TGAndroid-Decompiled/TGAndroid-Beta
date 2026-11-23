package org.telegram.ui.Components;

import android.view.View;
public final class ne0 implements View.OnClickListener {
    public final int f37817a;
    public final pe0 f37818b;
    public final Runnable f37819c;

    public ne0(pe0 pe0Var, Runnable runnable, int i7) {
        this.f37817a = i7;
        this.f37818b = pe0Var;
        this.f37819c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37817a) {
            case 0:
                pe0 pe0Var = this.f37818b;
                org.telegram.ui.ActionBar.j5 j5Var = pe0Var.d;
                if (j5Var.I) {
                    pe0Var.I = this.f37819c;
                    j5Var.a(true);
                    return;
                }
                return;
            default:
                pe0 pe0Var2 = this.f37818b;
                org.telegram.ui.ActionBar.j5 j5Var2 = pe0Var2.d;
                if (j5Var2.I) {
                    pe0Var2.I = this.f37819c;
                    j5Var2.a(true);
                    return;
                }
                return;
        }
    }
}
