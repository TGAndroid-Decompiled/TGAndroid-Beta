package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x41 implements Runnable {
    public final int f30219a;
    public final org.telegram.ui.ActionBar.f3[] f30220b;
    public final Context f30221c;

    public x41(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f30219a = 3;
        this.f30221c = context;
        this.f30220b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f30219a) {
            case 0:
                this.f30220b[0].dismiss();
                nf.f.s(this.f30221c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f30220b[0].dismiss();
                nf.f.u(this.f30221c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f30220b[0].dismiss();
                nf.f.s(this.f30221c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                rw0 rw0Var = new rw0(this.f30221c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f30220b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        rw0Var.makeAttached(n2Var);
                    }
                }
                rw0Var.show();
                return;
        }
    }

    public x41(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f30219a = i10;
        this.f30220b = f3VarArr;
        this.f30221c = context;
    }
}
