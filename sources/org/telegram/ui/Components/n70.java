package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class n70 implements DialogInterface.OnDismissListener {
    public final int f37825a;
    public final Object f37826b;
    public final boolean f37827c;

    public n70(int i7, Object obj, boolean z10) {
        this.f37825a = i7;
        this.f37826b = obj;
        this.f37827c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37825a) {
            case 0:
                r70 r70Var = (r70) this.f37826b;
                r70.K0(r70Var.getContext(), r70Var.f39106o1, r70Var.f39111t1, this.f37827c);
                return;
            case 1:
                r70 r70Var2 = (r70) this.f37826b;
                r70.K0(r70Var2.getContext(), r70Var2.f39106o1, r70Var2.f39111t1, this.f37827c);
                return;
            default:
                hi.sa saVar = (hi.sa) this.f37826b;
                saVar.A2 = false;
                saVar.Y0.x(7, true);
                if (this.f37827c) {
                    saVar.p(true);
                    return;
                }
                return;
        }
    }
}
