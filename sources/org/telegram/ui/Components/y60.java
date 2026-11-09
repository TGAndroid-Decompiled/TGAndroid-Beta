package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class y60 implements DialogInterface.OnDismissListener {
    public final int f40621a;
    public final Object f40622b;
    public final boolean f40623c;

    public y60(int i7, Object obj, boolean z9) {
        this.f40621a = i7;
        this.f40622b = obj;
        this.f40623c = z9;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40621a) {
            case 0:
                c70 c70Var = (c70) this.f40622b;
                c70.J0(c70Var.getContext(), c70Var.f32558k1, c70Var.f32561p1, this.f40623c);
                return;
            case 1:
                c70 c70Var2 = (c70) this.f40622b;
                c70.J0(c70Var2.getContext(), c70Var2.f32558k1, c70Var2.f32561p1, this.f40623c);
                return;
            default:
                fi.va vaVar = (fi.va) this.f40622b;
                vaVar.f13018z2 = false;
                vaVar.X0.x(7, true);
                if (this.f40623c) {
                    vaVar.p(true);
                    return;
                }
                return;
        }
    }
}
