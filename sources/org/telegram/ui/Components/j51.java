package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j51 implements Runnable {
    public final int f26192a;
    public final org.telegram.ui.ActionBar.e3[] f26193b;
    public final Context f26194c;

    public j51(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f26192a = 3;
        this.f26194c = context;
        this.f26193b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f26192a) {
            case 0:
                this.f26193b[0].dismiss();
                pf.d.s(this.f26194c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f26193b[0].dismiss();
                pf.d.u(this.f26194c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f26193b[0].dismiss();
                pf.d.s(this.f26194c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                dx0 dx0Var = new dx0(this.f26194c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f26193b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        dx0Var.makeAttached(m2Var);
                    }
                }
                dx0Var.show();
                return;
        }
    }

    public j51(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f26192a = i10;
        this.f26193b = e3VarArr;
        this.f26194c = context;
    }
}
