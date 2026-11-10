package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class x60 implements DialogInterface.OnDismissListener {
    public final int f40208a;
    public final Object f40209b;
    public final boolean f40210c;

    public x60(int i7, Object obj, boolean z9) {
        this.f40208a = i7;
        this.f40209b = obj;
        this.f40210c = z9;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40208a) {
            case 0:
                b70 b70Var = (b70) this.f40209b;
                b70.J0(b70Var.getContext(), b70Var.n1, b70Var.f32137s1, this.f40210c);
                return;
            case 1:
                b70 b70Var2 = (b70) this.f40209b;
                b70.J0(b70Var2.getContext(), b70Var2.n1, b70Var2.f32137s1, this.f40210c);
                return;
            default:
                fi.va vaVar = (fi.va) this.f40209b;
                vaVar.f13020z2 = false;
                vaVar.X0.x(7, true);
                if (this.f40210c) {
                    vaVar.p(true);
                    return;
                }
                return;
        }
    }
}
