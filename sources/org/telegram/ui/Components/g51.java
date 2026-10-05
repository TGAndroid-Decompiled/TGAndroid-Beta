package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g51 implements Runnable {
    public final int f26699a;
    public final org.telegram.ui.ActionBar.f3[] f26700b;
    public final Context f26701c;

    public g51(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f26699a = 3;
        this.f26701c = context;
        this.f26700b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f26699a) {
            case 0:
                this.f26700b[0].dismiss();
                nf.f.s(this.f26701c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f26700b[0].dismiss();
                nf.f.u(this.f26701c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f26700b[0].dismiss();
                nf.f.s(this.f26701c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                bx0 bx0Var = new bx0(this.f26701c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f26700b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        bx0Var.makeAttached(n2Var);
                    }
                }
                bx0Var.show();
                return;
        }
    }

    public g51(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f26699a = i10;
        this.f26700b = f3VarArr;
        this.f26701c = context;
    }
}
