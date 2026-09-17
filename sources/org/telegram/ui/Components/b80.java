package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f22656a;
    public final Object f22657b;
    public final boolean f22658c;

    public b80(int i10, Object obj, boolean z10) {
        this.f22656a = i10;
        this.f22657b = obj;
        this.f22658c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f22656a) {
            case 0:
                g80 g80Var = (g80) this.f22657b;
                g80.w(g80Var.getContext(), g80Var.f24114c, g80Var.f24116n, this.f22658c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f22657b;
                g80.w(g80Var2.getContext(), g80Var2.f24114c, g80Var2.f24116n, this.f22658c);
                return;
            default:
                ci.oc ocVar = (ci.oc) this.f22657b;
                ocVar.f5288z2 = false;
                ocVar.X0.x(7, true);
                if (this.f22658c) {
                    ocVar.q(true);
                    return;
                }
                return;
        }
    }
}
