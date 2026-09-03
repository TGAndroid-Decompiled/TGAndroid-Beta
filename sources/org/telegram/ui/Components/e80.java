package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class e80 implements DialogInterface.OnDismissListener {
    public final int f24508a;
    public final Object f24509b;
    public final boolean f24510c;

    public e80(int i10, Object obj, boolean z4) {
        this.f24508a = i10;
        this.f24509b = obj;
        this.f24510c = z4;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24508a) {
            case 0:
                i80 i80Var = (i80) this.f24509b;
                i80.w(i80Var.getContext(), i80Var.f25640c, i80Var.f25642n, this.f24510c);
                return;
            case 1:
                i80 i80Var2 = (i80) this.f24509b;
                i80.w(i80Var2.getContext(), i80Var2.f25640c, i80Var2.f25642n, this.f24510c);
                return;
            default:
                ph.da daVar = (ph.da) this.f24509b;
                daVar.f41583w2 = false;
                daVar.U0.x(7, true);
                if (this.f24510c) {
                    daVar.q(true);
                    return;
                }
                return;
        }
    }
}
