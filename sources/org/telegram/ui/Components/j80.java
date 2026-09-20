package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class j80 implements DialogInterface.OnDismissListener {
    public final int f25289a;
    public final Object f25290b;
    public final boolean f25291c;

    public j80(int i10, Object obj, boolean z10) {
        this.f25289a = i10;
        this.f25290b = obj;
        this.f25291c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f25289a) {
            case 0:
                o80 o80Var = (o80) this.f25290b;
                o80.w(o80Var.getContext(), o80Var.f26835c, o80Var.f26837n, this.f25291c);
                return;
            case 1:
                o80 o80Var2 = (o80) this.f25290b;
                o80.w(o80Var2.getContext(), o80Var2.f26835c, o80Var2.f26837n, this.f25291c);
                return;
            default:
                ci.oc ocVar = (ci.oc) this.f25290b;
                ocVar.f5289z2 = false;
                ocVar.X0.x(7, true);
                if (this.f25291c) {
                    ocVar.q(true);
                    return;
                }
                return;
        }
    }
}
