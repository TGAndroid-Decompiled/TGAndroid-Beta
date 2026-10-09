package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n51 implements Runnable {
    public final int f29040a;
    public final org.telegram.ui.ActionBar.f3[] f29041b;
    public final Context f29042c;

    public n51(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f29040a = 3;
        this.f29042c = context;
        this.f29041b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f29040a) {
            case 0:
                this.f29041b[0].dismiss();
                of.f.s(this.f29042c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f29041b[0].dismiss();
                of.f.u(this.f29042c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f29041b[0].dismiss();
                of.f.s(this.f29042c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                hx0 hx0Var = new hx0(this.f29042c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f29041b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        hx0Var.makeAttached(n2Var);
                    }
                }
                hx0Var.show();
                return;
        }
    }

    public n51(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f29040a = i10;
        this.f29041b = f3VarArr;
        this.f29042c = context;
    }
}
