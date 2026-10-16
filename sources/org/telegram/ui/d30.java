package org.telegram.ui;

import android.content.DialogInterface;
public final class d30 implements DialogInterface.OnDismissListener {
    public final int f34865a;
    public final n60 f34866b;

    public d30(n60 n60Var, int i10) {
        this.f34865a = i10;
        this.f34866b = n60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34865a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f34866b.f38253x0 && (U instanceof fo)) {
                    ((fo) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f34866b.dismiss();
                return;
            case 2:
                this.f34866b.E1 = null;
                return;
            default:
                this.f34866b.f38226r0 = null;
                return;
        }
    }
}
