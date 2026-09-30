package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x41 implements Runnable {
    public final int f30119a;
    public final org.telegram.ui.ActionBar.e3[] f30120b;
    public final Context f30121c;

    public x41(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f30119a = 3;
        this.f30121c = context;
        this.f30120b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f30119a) {
            case 0:
                this.f30120b[0].dismiss();
                nf.f.s(this.f30121c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f30120b[0].dismiss();
                nf.f.u(this.f30121c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f30120b[0].dismiss();
                nf.f.s(this.f30121c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                sw0 sw0Var = new sw0(this.f30121c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f30120b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        sw0Var.makeAttached(m2Var);
                    }
                }
                sw0Var.show();
                return;
        }
    }

    public x41(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f30119a = i10;
        this.f30120b = e3VarArr;
        this.f30121c = context;
    }
}
