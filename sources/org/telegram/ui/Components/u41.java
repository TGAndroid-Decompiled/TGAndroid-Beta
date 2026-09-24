package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u41 implements Runnable {
    public final int f28684a;
    public final org.telegram.ui.ActionBar.e3[] f28685b;
    public final Context f28686c;

    public u41(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f28684a = 3;
        this.f28686c = context;
        this.f28685b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f28684a) {
            case 0:
                this.f28685b[0].dismiss();
                nf.f.s(this.f28686c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f28685b[0].dismiss();
                nf.f.u(this.f28686c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f28685b[0].dismiss();
                nf.f.s(this.f28686c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                pw0 pw0Var = new pw0(this.f28686c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f28685b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        pw0Var.makeAttached(m2Var);
                    }
                }
                pw0Var.show();
                return;
        }
    }

    public u41(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f28684a = i10;
        this.f28685b = e3VarArr;
        this.f28686c = context;
    }
}
