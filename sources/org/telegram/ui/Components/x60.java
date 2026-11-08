package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class x60 implements DialogInterface.OnDismissListener {
    public final int f40234a;
    public final Object f40235b;
    public final boolean f40236c;

    public x60(int i7, Object obj, boolean z9) {
        this.f40234a = i7;
        this.f40235b = obj;
        this.f40236c = z9;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40234a) {
            case 0:
                b70 b70Var = (b70) this.f40235b;
                b70.J0(b70Var.getContext(), b70Var.f32074k1, b70Var.f32077p1, this.f40236c);
                return;
            case 1:
                b70 b70Var2 = (b70) this.f40235b;
                b70.J0(b70Var2.getContext(), b70Var2.f32074k1, b70Var2.f32077p1, this.f40236c);
                return;
            default:
                fi.va vaVar = (fi.va) this.f40235b;
                vaVar.f13018z2 = false;
                vaVar.X0.x(7, true);
                if (this.f40236c) {
                    vaVar.p(true);
                    return;
                }
                return;
        }
    }
}
