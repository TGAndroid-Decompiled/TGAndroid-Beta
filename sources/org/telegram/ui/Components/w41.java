package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class w41 implements Runnable {
    public final int f29809a;
    public final org.telegram.ui.ActionBar.e3[] f29810b;
    public final Context f29811c;

    public w41(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f29809a = 3;
        this.f29811c = context;
        this.f29810b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f29809a) {
            case 0:
                this.f29810b[0].dismiss();
                nf.f.s(this.f29811c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f29810b[0].dismiss();
                nf.f.u(this.f29811c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f29810b[0].dismiss();
                nf.f.s(this.f29811c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                rw0 rw0Var = new rw0(this.f29811c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f29810b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        rw0Var.makeAttached(m2Var);
                    }
                }
                rw0Var.show();
                return;
        }
    }

    public w41(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f29809a = i10;
        this.f29810b = e3VarArr;
        this.f29811c = context;
    }
}
