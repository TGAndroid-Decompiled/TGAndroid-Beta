package org.telegram.ui;

import android.content.DialogInterface;
public final class jg implements DialogInterface.OnDismissListener {
    public final int f34733a;
    public final xn f34734b;

    public jg(xn xnVar, int i10) {
        this.f34733a = i10;
        this.f34734b = xnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34733a) {
            case 0:
                xn.Q0(this.f34734b);
                return;
            case 1:
                this.f34734b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34734b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34734b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34734b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34734b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34734b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34734b.Fb = null;
                return;
            default:
                gk gkVar = this.f34734b.X1;
                if (gkVar != null) {
                    gkVar.c(false);
                    return;
                }
                return;
        }
    }
}
