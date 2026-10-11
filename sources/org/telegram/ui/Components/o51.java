package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o51 implements Runnable {
    public final int f29391a;
    public final org.telegram.ui.ActionBar.e3[] f29392b;
    public final Context f29393c;

    public o51(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f29391a = 3;
        this.f29393c = context;
        this.f29392b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f29391a) {
            case 0:
                this.f29392b[0].dismiss();
                of.f.s(this.f29393c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f29392b[0].dismiss();
                of.f.u(this.f29393c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f29392b[0].dismiss();
                of.f.s(this.f29393c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                ix0 ix0Var = new ix0(this.f29393c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f29392b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        ix0Var.makeAttached(m2Var);
                    }
                }
                ix0Var.show();
                return;
        }
    }

    public o51(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f29391a = i10;
        this.f29392b = e3VarArr;
        this.f29393c = context;
    }
}
