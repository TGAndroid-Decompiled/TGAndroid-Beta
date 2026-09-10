package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u41 implements Runnable {
    public final int f27560a;
    public final org.telegram.ui.ActionBar.h3[] f27561b;
    public final Context f27562c;

    public u41(Context context, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f27560a = 3;
        this.f27562c = context;
        this.f27561b = h3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h3 h3Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        switch (this.f27560a) {
            case 0:
                this.f27561b[0].dismiss();
                nf.f.s(this.f27562c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f27561b[0].dismiss();
                nf.f.u(this.f27562c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f27561b[0].dismiss();
                nf.f.s(this.f27562c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                pw0 pw0Var = new pw0(this.f27562c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.h3[] h3VarArr = this.f27561b;
                    if (!AndroidUtilities.hasDialogOnTop(h3VarArr[0].attachedFragment) && (h3Var = h3VarArr[0]) != null && (p2Var = h3Var.attachedFragment) != null) {
                        pw0Var.makeAttached(p2Var);
                    }
                }
                pw0Var.show();
                return;
        }
    }

    public u41(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, int i10) {
        this.f27560a = i10;
        this.f27561b = h3VarArr;
        this.f27562c = context;
    }
}
