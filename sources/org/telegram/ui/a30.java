package org.telegram.ui;

import android.content.DialogInterface;
public final class a30 implements DialogInterface.OnDismissListener {
    public final int f30789a;
    public final j60 f30790b;

    public a30(j60 j60Var, int i10) {
        this.f30789a = i10;
        this.f30790b = j60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f30789a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (this.f30790b.f34031x0 && (U instanceof eo)) {
                    ((eo) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f30790b.dismiss();
                return;
            case 2:
                this.f30790b.E1 = null;
                return;
            default:
                this.f30790b.f34004r0 = null;
                return;
        }
    }
}
