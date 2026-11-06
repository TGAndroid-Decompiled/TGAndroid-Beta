package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class x60 implements DialogInterface.OnDismissListener {
    public final int f40176a;
    public final Object f40177b;
    public final boolean f40178c;

    public x60(int i7, Object obj, boolean z9) {
        this.f40176a = i7;
        this.f40177b = obj;
        this.f40178c = z9;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40176a) {
            case 0:
                b70 b70Var = (b70) this.f40177b;
                b70.J0(b70Var.getContext(), b70Var.f32019k1, b70Var.f32022p1, this.f40178c);
                return;
            case 1:
                b70 b70Var2 = (b70) this.f40177b;
                b70.J0(b70Var2.getContext(), b70Var2.f32019k1, b70Var2.f32022p1, this.f40178c);
                return;
            default:
                fi.va vaVar = (fi.va) this.f40177b;
                vaVar.f13018z2 = false;
                vaVar.X0.x(7, true);
                if (this.f40178c) {
                    vaVar.p(true);
                    return;
                }
                return;
        }
    }
}
