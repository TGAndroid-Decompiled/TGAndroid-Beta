package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s51 implements Runnable {
    public final int f30419a;
    public final org.telegram.ui.ActionBar.e3[] f30420b;
    public final Context f30421c;

    public s51(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f30419a = 3;
        this.f30421c = context;
        this.f30420b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f30419a) {
            case 0:
                this.f30420b[0].dismiss();
                of.f.s(this.f30421c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f30420b[0].dismiss();
                of.f.u(this.f30421c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f30420b[0].dismiss();
                of.f.s(this.f30421c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                nx0 nx0Var = new nx0(this.f30421c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f30420b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        nx0Var.makeAttached(m2Var);
                    }
                }
                nx0Var.show();
                return;
        }
    }

    public s51(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f30419a = i10;
        this.f30420b = e3VarArr;
        this.f30421c = context;
    }
}
