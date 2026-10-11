package org.telegram.ui;

import android.content.DialogInterface;
public final class pe implements DialogInterface.OnDismissListener {
    public final int f40867a;
    public final zn f40868b;

    public pe(zn znVar, int i10) {
        this.f40867a = i10;
        this.f40868b = znVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40867a) {
            case 0:
                ik ikVar = this.f40868b.X1;
                if (ikVar != null) {
                    ikVar.c(false);
                    return;
                }
                return;
            case 1:
                zn.a1(this.f40868b);
                return;
            case 2:
                this.f40868b.j8(false, true, 0.0f);
                return;
            case 3:
                this.f40868b.j8(false, true, 0.0f);
                return;
            case 4:
                this.f40868b.j8(false, true, 0.0f);
                return;
            case 5:
                this.f40868b.j8(false, true, 0.0f);
                return;
            case 6:
                this.f40868b.j8(false, true, 0.0f);
                return;
            case 7:
                this.f40868b.j8(false, true, 0.0f);
                return;
            default:
                this.f40868b.Gb = null;
                return;
        }
    }
}
