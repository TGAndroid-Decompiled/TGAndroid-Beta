package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v41 implements Runnable {
    public final int f28931a;
    public final org.telegram.ui.ActionBar.f3[] f28932b;
    public final Context f28933c;

    public v41(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f28931a = 3;
        this.f28933c = context;
        this.f28932b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f28931a) {
            case 0:
                this.f28932b[0].dismiss();
                nf.f.s(this.f28933c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f28932b[0].dismiss();
                nf.f.u(this.f28933c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f28932b[0].dismiss();
                nf.f.s(this.f28933c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                pw0 pw0Var = new pw0(this.f28933c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f28932b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        pw0Var.makeAttached(n2Var);
                    }
                }
                pw0Var.show();
                return;
        }
    }

    public v41(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f28931a = i10;
        this.f28932b = f3VarArr;
        this.f28933c = context;
    }
}
