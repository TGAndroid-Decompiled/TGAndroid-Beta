package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w41 implements Runnable {
    public final int f29850a;
    public final org.telegram.ui.ActionBar.g3[] f29851b;
    public final Context f29852c;

    public w41(Context context, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f29850a = 3;
        this.f29852c = context;
        this.f29851b = g3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g3 g3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f29850a) {
            case 0:
                this.f29851b[0].dismiss();
                nf.f.s(this.f29852c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f29851b[0].dismiss();
                nf.f.u(this.f29852c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f29851b[0].dismiss();
                nf.f.s(this.f29852c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                rw0 rw0Var = new rw0(this.f29852c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.g3[] g3VarArr = this.f29851b;
                    if (!AndroidUtilities.hasDialogOnTop(g3VarArr[0].attachedFragment) && (g3Var = g3VarArr[0]) != null && (o2Var = g3Var.attachedFragment) != null) {
                        rw0Var.makeAttached(o2Var);
                    }
                }
                rw0Var.show();
                return;
        }
    }

    public w41(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, int i10) {
        this.f29850a = i10;
        this.f29851b = g3VarArr;
        this.f29852c = context;
    }
}
