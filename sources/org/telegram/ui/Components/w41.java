package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w41 implements Runnable {
    public final int f29862a;
    public final org.telegram.ui.ActionBar.f3[] f29863b;
    public final Context f29864c;

    public w41(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f29862a = 3;
        this.f29864c = context;
        this.f29863b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f29862a) {
            case 0:
                this.f29863b[0].dismiss();
                nf.f.s(this.f29864c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f29863b[0].dismiss();
                nf.f.u(this.f29864c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f29863b[0].dismiss();
                nf.f.s(this.f29864c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                qw0 qw0Var = new qw0(this.f29864c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f29863b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        qw0Var.makeAttached(n2Var);
                    }
                }
                qw0Var.show();
                return;
        }
    }

    public w41(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f29862a = i10;
        this.f29863b = f3VarArr;
        this.f29864c = context;
    }
}
