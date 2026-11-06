package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class x60 implements DialogInterface.OnDismissListener {
    public final int f40213a;
    public final Object f40214b;
    public final boolean f40215c;

    public x60(int i7, Object obj, boolean z9) {
        this.f40213a = i7;
        this.f40214b = obj;
        this.f40215c = z9;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40213a) {
            case 0:
                b70 b70Var = (b70) this.f40214b;
                b70.J0(b70Var.getContext(), b70Var.f32053k1, b70Var.f32056p1, this.f40215c);
                return;
            case 1:
                b70 b70Var2 = (b70) this.f40214b;
                b70.J0(b70Var2.getContext(), b70Var2.f32053k1, b70Var2.f32056p1, this.f40215c);
                return;
            default:
                fi.va vaVar = (fi.va) this.f40214b;
                vaVar.f13018z2 = false;
                vaVar.X0.x(7, true);
                if (this.f40215c) {
                    vaVar.p(true);
                    return;
                }
                return;
        }
    }
}
