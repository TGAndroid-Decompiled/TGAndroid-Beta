package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class x80 implements DialogInterface.OnDismissListener {
    public final int f32478a;
    public final Object f32479b;
    public final boolean f32480c;

    public x80(int i10, Object obj, boolean z10) {
        this.f32478a = i10;
        this.f32479b = obj;
        this.f32480c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f32478a) {
            case 0:
                b90 b90Var = (b90) this.f32479b;
                b90.x(b90Var.getContext(), b90Var.d, b90Var.f25005r, this.f32480c);
                return;
            case 1:
                b90 b90Var2 = (b90) this.f32479b;
                b90.x(b90Var2.getContext(), b90Var2.d, b90Var2.f25005r, this.f32480c);
                return;
            default:
                ei.vb vbVar = (ei.vb) this.f32479b;
                vbVar.f10048z2 = false;
                vbVar.X0.x(7, true);
                if (this.f32480c) {
                    vbVar.p(true);
                    return;
                }
                return;
        }
    }
}
