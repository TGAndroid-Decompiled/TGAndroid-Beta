package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g41 implements Runnable {
    public final int f26278a;
    public final org.telegram.ui.ActionBar.f3[] f26279b;
    public final Context f26280c;

    public g41(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f26278a = 3;
        this.f26280c = context;
        this.f26279b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f26278a) {
            case 0:
                this.f26279b[0].dismiss();
                of.f.s(this.f26280c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f26279b[0].dismiss();
                of.f.u(this.f26280c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f26279b[0].dismiss();
                of.f.s(this.f26280c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                dw0 dw0Var = new dw0(this.f26280c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f26279b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        dw0Var.makeAttached(n2Var);
                    }
                }
                dw0Var.show();
                return;
        }
    }

    public g41(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f26278a = i10;
        this.f26279b = f3VarArr;
        this.f26280c = context;
    }
}
