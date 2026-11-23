package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n70 implements DialogInterface.OnDismissListener {
    public final int f37826a;
    public final Object f37827b;
    public final boolean f37828c;

    public n70(int i7, Object obj, boolean z10) {
        this.f37826a = i7;
        this.f37827b = obj;
        this.f37828c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37826a) {
            case 0:
                r70 r70Var = (r70) this.f37827b;
                r70.K0(r70Var.getContext(), r70Var.f39107o1, r70Var.f39112t1, this.f37828c);
                return;
            case 1:
                r70 r70Var2 = (r70) this.f37827b;
                r70.K0(r70Var2.getContext(), r70Var2.f39107o1, r70Var2.f39112t1, this.f37828c);
                return;
            default:
                hi.sa saVar = (hi.sa) this.f37827b;
                saVar.A2 = false;
                saVar.Y0.x(7, true);
                if (this.f37828c) {
                    saVar.p(true);
                    return;
                }
                return;
        }
    }
}
