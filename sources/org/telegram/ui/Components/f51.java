package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f51 implements Runnable {
    public final int f26286a;
    public final org.telegram.ui.ActionBar.f3[] f26287b;
    public final Context f26288c;

    public f51(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f26286a = 3;
        this.f26288c = context;
        this.f26287b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f26286a) {
            case 0:
                this.f26287b[0].dismiss();
                nf.f.s(this.f26288c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f26287b[0].dismiss();
                nf.f.u(this.f26288c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f26287b[0].dismiss();
                nf.f.s(this.f26288c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                ax0 ax0Var = new ax0(this.f26288c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f26287b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        ax0Var.makeAttached(n2Var);
                    }
                }
                ax0Var.show();
                return;
        }
    }

    public f51(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f26286a = i10;
        this.f26287b = f3VarArr;
        this.f26288c = context;
    }
}
