package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class e90 implements DialogInterface.OnDismissListener {
    public final int f25934a;
    public final Object f25935b;
    public final boolean f25936c;

    public e90(int i10, Object obj, boolean z10) {
        this.f25934a = i10;
        this.f25935b = obj;
        this.f25936c = z10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f25934a) {
            case 0:
                j90 j90Var = (j90) this.f25935b;
                j90.y(j90Var.getContext(), j90Var.f27629c, j90Var.f27632n, this.f25936c);
                return;
            case 1:
                j90 j90Var2 = (j90) this.f25935b;
                j90.y(j90Var2.getContext(), j90Var2.f27629c, j90Var2.f27632n, this.f25936c);
                return;
            default:
                ci.lc lcVar = (ci.lc) this.f25935b;
                lcVar.f5542z2 = false;
                lcVar.X0.x(7, true);
                if (this.f25936c) {
                    lcVar.p(true);
                    return;
                }
                return;
        }
    }
}
