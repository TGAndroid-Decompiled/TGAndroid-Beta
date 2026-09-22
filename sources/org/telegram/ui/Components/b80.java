package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f22703a;
    public final Object f22704b;
    public final boolean f22705c;

    public b80(int i10, Object obj, boolean z10) {
        this.f22703a = i10;
        this.f22704b = obj;
        this.f22705c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f22703a) {
            case 0:
                g80 g80Var = (g80) this.f22704b;
                g80.w(g80Var.getContext(), g80Var.f24248c, g80Var.f24250n, this.f22705c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f22704b;
                g80.w(g80Var2.getContext(), g80Var2.f24248c, g80Var2.f24250n, this.f22705c);
                return;
            default:
                ci.oc ocVar = (ci.oc) this.f22704b;
                ocVar.f5285z2 = false;
                ocVar.X0.x(7, true);
                if (this.f22705c) {
                    ocVar.q(true);
                    return;
                }
                return;
        }
    }
}
