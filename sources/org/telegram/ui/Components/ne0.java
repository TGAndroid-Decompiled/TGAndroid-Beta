package org.telegram.ui.Components;

import android.view.View;
public final class ne0 implements View.OnClickListener {
    public final int f37861a;
    public final pe0 f37862b;
    public final Runnable f37863c;

    public ne0(pe0 pe0Var, Runnable runnable, int i7) {
        this.f37861a = i7;
        this.f37862b = pe0Var;
        this.f37863c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37861a) {
            case 0:
                pe0 pe0Var = this.f37862b;
                org.telegram.ui.ActionBar.j5 j5Var = pe0Var.d;
                if (j5Var.I) {
                    pe0Var.I = this.f37863c;
                    j5Var.a(true);
                    return;
                }
                return;
            default:
                pe0 pe0Var2 = this.f37862b;
                org.telegram.ui.ActionBar.j5 j5Var2 = pe0Var2.d;
                if (j5Var2.I) {
                    pe0Var2.I = this.f37863c;
                    j5Var2.a(true);
                    return;
                }
                return;
        }
    }
}
