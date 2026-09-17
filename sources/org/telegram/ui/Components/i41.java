package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i41 implements Runnable {
    public final int f24818a;
    public final org.telegram.ui.ActionBar.g3[] f24819b;
    public final Context f24820c;

    public i41(Context context, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f24818a = 3;
        this.f24820c = context;
        this.f24819b = g3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g3 g3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f24818a) {
            case 0:
                this.f24819b[0].dismiss();
                nf.f.s(this.f24820c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f24819b[0].dismiss();
                nf.f.u(this.f24820c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f24819b[0].dismiss();
                nf.f.s(this.f24820c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                fw0 fw0Var = new fw0(this.f24820c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.g3[] g3VarArr = this.f24819b;
                    if (!AndroidUtilities.hasDialogOnTop(g3VarArr[0].attachedFragment) && (g3Var = g3VarArr[0]) != null && (o2Var = g3Var.attachedFragment) != null) {
                        fw0Var.makeAttached(o2Var);
                    }
                }
                fw0Var.show();
                return;
        }
    }

    public i41(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, int i10) {
        this.f24818a = i10;
        this.f24819b = g3VarArr;
        this.f24820c = context;
    }
}
