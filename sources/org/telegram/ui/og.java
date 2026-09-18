package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class og implements DialogInterface.OnCancelListener {
    public final int f36191a;
    public final Object f36192b;

    public og(Object obj, int i10) {
        this.f36191a = i10;
        this.f36192b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36191a) {
            case 0:
                zn znVar = (zn) this.f36192b;
                znVar.f40222b9 = true;
                znVar.Z8 = 0;
                znVar.f40395pb = 0;
                znVar.N4 = 0;
                znVar.r9();
                znVar.Nb(false);
                return;
            case 1:
                uo uoVar = (uo) this.f36192b;
                uoVar.M0 = false;
                uoVar.f38036b = null;
                uoVar.N0 = false;
                return;
            case 2:
                ((up) this.f36192b).f38074n = null;
                return;
            default:
                gc0 gc0Var = (gc0) this.f36192b;
                if (gc0Var.h >= 0) {
                    ConnectionsManager.getInstance(gc0Var.f33804b).cancelRequest(gc0Var.h, true);
                    gc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
