package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v41 implements Runnable {
    public final int f28983a;
    public final org.telegram.ui.ActionBar.e3[] f28984b;
    public final Context f28985c;

    public v41(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f28983a = 3;
        this.f28985c = context;
        this.f28984b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f28983a) {
            case 0:
                this.f28984b[0].dismiss();
                nf.f.s(this.f28985c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f28984b[0].dismiss();
                nf.f.u(this.f28985c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f28984b[0].dismiss();
                nf.f.s(this.f28985c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                qw0 qw0Var = new qw0(this.f28985c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f28984b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        qw0Var.makeAttached(m2Var);
                    }
                }
                qw0Var.show();
                return;
        }
    }

    public v41(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f28983a = i10;
        this.f28984b = e3VarArr;
        this.f28985c = context;
    }
}
