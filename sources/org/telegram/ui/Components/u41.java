package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u41 implements Runnable {
    public final int f28697a;
    public final org.telegram.ui.ActionBar.e3[] f28698b;
    public final Context f28699c;

    public u41(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f28697a = 3;
        this.f28699c = context;
        this.f28698b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f28697a) {
            case 0:
                this.f28698b[0].dismiss();
                nf.f.s(this.f28699c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f28698b[0].dismiss();
                nf.f.u(this.f28699c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f28698b[0].dismiss();
                nf.f.s(this.f28699c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                pw0 pw0Var = new pw0(this.f28699c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f28698b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        pw0Var.makeAttached(m2Var);
                    }
                }
                pw0Var.show();
                return;
        }
    }

    public u41(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f28697a = i10;
        this.f28698b = e3VarArr;
        this.f28699c = context;
    }
}
