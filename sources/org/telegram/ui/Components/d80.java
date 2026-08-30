package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class d80 implements DialogInterface.OnDismissListener {
    public final int f24202a;
    public final Object f24203b;
    public final boolean f24204c;

    public d80(int i10, Object obj, boolean z4) {
        this.f24202a = i10;
        this.f24203b = obj;
        this.f24204c = z4;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24202a) {
            case 0:
                h80 h80Var = (h80) this.f24203b;
                h80.w(h80Var.getContext(), h80Var.f25351c, h80Var.f25353n, this.f24204c);
                return;
            case 1:
                h80 h80Var2 = (h80) this.f24203b;
                h80.w(h80Var2.getContext(), h80Var2.f25351c, h80Var2.f25353n, this.f24204c);
                return;
            default:
                ph.da daVar = (ph.da) this.f24203b;
                daVar.f41545w2 = false;
                daVar.U0.x(7, true);
                if (this.f24204c) {
                    daVar.q(true);
                    return;
                }
                return;
        }
    }
}
