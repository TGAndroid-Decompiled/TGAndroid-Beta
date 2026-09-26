package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n80 implements DialogInterface.OnDismissListener {
    public final int f26713a;
    public final Object f26714b;
    public final boolean f26715c;

    public n80(int i10, Object obj, boolean z10) {
        this.f26713a = i10;
        this.f26714b = obj;
        this.f26715c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f26713a) {
            case 0:
                s80 s80Var = (s80) this.f26714b;
                s80.w(s80Var.getContext(), s80Var.f28197c, s80Var.f28199n, this.f26715c);
                return;
            case 1:
                s80 s80Var2 = (s80) this.f26714b;
                s80.w(s80Var2.getContext(), s80Var2.f28197c, s80Var2.f28199n, this.f26715c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f26714b;
                lcVar.f5110z2 = false;
                lcVar.X0.x(7, true);
                if (this.f26715c) {
                    lcVar.q(true);
                    return;
                }
                return;
        }
    }
}
