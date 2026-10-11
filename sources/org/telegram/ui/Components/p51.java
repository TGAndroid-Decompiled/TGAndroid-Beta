package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p51 implements Runnable {
    public final int f29619a;
    public final org.telegram.ui.ActionBar.e3[] f29620b;
    public final Context f29621c;

    public p51(Context context, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f29619a = 3;
        this.f29621c = context;
        this.f29620b = e3VarArr;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e3 e3Var;
        org.telegram.ui.ActionBar.m2 m2Var;
        switch (this.f29619a) {
            case 0:
                this.f29620b[0].dismiss();
                of.f.s(this.f29621c, LocaleController.getString(R.string.CocoonFeature1TextLink));
                return;
            case 1:
                this.f29620b[0].dismiss();
                of.f.u(this.f29621c, LocaleController.getString(R.string.CocoonFeature3TextLink));
                return;
            case 2:
                this.f29620b[0].dismiss();
                of.f.s(this.f29621c, LocaleController.getString(R.string.CocoonFooterLink));
                return;
            default:
                jx0 jx0Var = new jx0(this.f29621c);
                if (!AndroidUtilities.isTablet()) {
                    org.telegram.ui.ActionBar.e3[] e3VarArr = this.f29620b;
                    if (!AndroidUtilities.hasDialogOnTop(e3VarArr[0].attachedFragment) && (e3Var = e3VarArr[0]) != null && (m2Var = e3Var.attachedFragment) != null) {
                        jx0Var.makeAttached(m2Var);
                    }
                }
                jx0Var.show();
                return;
        }
    }

    public p51(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, int i10) {
        this.f29619a = i10;
        this.f29620b = e3VarArr;
        this.f29621c = context;
    }
}
