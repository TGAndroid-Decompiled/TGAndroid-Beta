package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class b80 implements DialogInterface.OnDismissListener {
    public final int f22659a;
    public final Object f22660b;
    public final boolean f22661c;

    public b80(int i10, Object obj, boolean z10) {
        this.f22659a = i10;
        this.f22660b = obj;
        this.f22661c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f22659a) {
            case 0:
                g80 g80Var = (g80) this.f22660b;
                g80.w(g80Var.getContext(), g80Var.f24117c, g80Var.f24119n, this.f22661c);
                return;
            case 1:
                g80 g80Var2 = (g80) this.f22660b;
                g80.w(g80Var2.getContext(), g80Var2.f24117c, g80Var2.f24119n, this.f22661c);
                return;
            default:
                ci.oc ocVar = (ci.oc) this.f22660b;
                ocVar.f5288z2 = false;
                ocVar.X0.x(7, true);
                if (this.f22661c) {
                    ocVar.q(true);
                    return;
                }
                return;
        }
    }
}
