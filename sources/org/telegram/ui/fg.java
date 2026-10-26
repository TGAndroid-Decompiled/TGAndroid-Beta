package org.telegram.ui;

import android.content.DialogInterface;
public final class fg implements DialogInterface.OnCancelListener {
    public final int f39359a;
    public final Object f39360b;

    public fg(Object obj, int i10) {
        this.f39359a = i10;
        this.f39360b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39359a) {
            case 0:
                un unVar = (un) this.f39360b;
                unVar.f44352n9 = true;
                unVar.f44326l9 = 0;
                unVar.Mb = 0;
                unVar.Z4 = 0;
                unVar.z9();
                unVar.Zb(false);
                return;
            case 1:
                mo moVar = (mo) this.f39360b;
                moVar.L0 = false;
                moVar.f41599b = null;
                moVar.M0 = false;
                return;
            case 2:
                ((np) this.f39360b).f41965n = null;
                return;
            default:
                ((lb0) this.f39360b).b();
                return;
        }
    }
}
