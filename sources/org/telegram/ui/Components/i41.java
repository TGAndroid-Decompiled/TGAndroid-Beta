package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i41 implements Runnable {
    public final int f24821a;
    public final org.telegram.ui.ActionBar.g3[] f24822b;
    public final Context f24823c;

    public i41(Context context, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f24821a = 3;
        this.f24823c = context;
        this.f24822b = g3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g3 g3Var;
        org.telegram.ui.ActionBar.o2 o2Var;
        switch (this.f24821a) {
            case 0:
                this.f24822b[0].dismiss();
                nf.f.s(this.f24823c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f24822b[0].dismiss();
                nf.f.u(this.f24823c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f24822b[0].dismiss();
                nf.f.s(this.f24823c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                fw0 fw0Var = new fw0(this.f24823c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.g3[] g3VarArr = this.f24822b;
                    if (!AndroidUtilities.hasDialogOnTop(g3VarArr[0].attachedFragment) && (g3Var = g3VarArr[0]) != null && (o2Var = g3Var.attachedFragment) != null) {
                        fw0Var.makeAttached(o2Var);
                    }
                }
                fw0Var.show();
                return;
        }
    }

    public i41(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, int i10) {
        this.f24821a = i10;
        this.f24822b = g3VarArr;
        this.f24823c = context;
    }
}
