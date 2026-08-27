package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class p70 implements DialogInterface.OnDismissListener {

    public final int f31539a;

    public final Object f31540b;

    public final boolean f31541c;

    public p70(int i10, Object obj, boolean z10) {
        this.f31539a = i10;
        this.f31540b = obj;
        this.f31541c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f31539a) {
            case 0:
                t70 t70Var = (t70) this.f31540b;
                t70.x(t70Var.getContext(), t70Var.f32677c, t70Var.f32680n, this.f31541c);
                break;
            case 1:
                t70 t70Var2 = (t70) this.f31540b;
                t70.x(t70Var2.getContext(), t70Var2.f32677c, t70Var2.f32680n, this.f31541c);
                break;
            default:
                lh.sb sbVar = (lh.sb) this.f31540b;
                sbVar.f16812v2 = false;
                sbVar.T0.x(7, true);
                if (this.f31541c) {
                    sbVar.q(true);
                }
                break;
        }
    }
}
