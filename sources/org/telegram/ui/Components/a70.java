package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class a70 implements DialogInterface.OnDismissListener {
    public final int f32909a;
    public final Object f32910b;
    public final boolean f32911c;

    public a70(int i7, Object obj, boolean z10) {
        this.f32909a = i7;
        this.f32910b = obj;
        this.f32911c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32909a) {
            case 0:
                e70 e70Var = (e70) this.f32910b;
                e70.J0(e70Var.getContext(), e70Var.f34230o1, e70Var.f34235t1, this.f32911c);
                return;
            case 1:
                e70 e70Var2 = (e70) this.f32910b;
                e70.J0(e70Var2.getContext(), e70Var2.f34230o1, e70Var2.f34235t1, this.f32911c);
                return;
            default:
                hi.sa saVar = (hi.sa) this.f32910b;
                saVar.A2 = false;
                saVar.Y0.x(7, true);
                if (this.f32911c) {
                    saVar.p(true);
                    return;
                }
                return;
        }
    }
}
