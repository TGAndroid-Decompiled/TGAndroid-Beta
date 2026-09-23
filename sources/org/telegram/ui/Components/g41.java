package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g41 implements Runnable {
    public final int f24161a;
    public final org.telegram.ui.ActionBar.f3[] f24162b;
    public final Context f24163c;

    public g41(Context context, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f24161a = 3;
        this.f24163c = context;
        this.f24162b = f3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f3 f3Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        switch (this.f24161a) {
            case 0:
                this.f24162b[0].dismiss();
                nf.f.s(this.f24163c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f24162b[0].dismiss();
                nf.f.u(this.f24163c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f24162b[0].dismiss();
                nf.f.s(this.f24163c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                ew0 ew0Var = new ew0(this.f24163c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.f3[] f3VarArr = this.f24162b;
                    if (!AndroidUtilities.hasDialogOnTop(f3VarArr[0].attachedFragment) && (f3Var = f3VarArr[0]) != null && (n2Var = f3Var.attachedFragment) != null) {
                        ew0Var.makeAttached(n2Var);
                    }
                }
                ew0Var.show();
                return;
        }
    }

    public g41(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, int i10) {
        this.f24161a = i10;
        this.f24162b = f3VarArr;
        this.f24163c = context;
    }
}
