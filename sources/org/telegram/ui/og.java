package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class og implements DialogInterface.OnCancelListener {
    public final int f36322a;
    public final Object f36323b;

    public og(Object obj, int i10) {
        this.f36322a = i10;
        this.f36323b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36322a) {
            case 0:
                zn znVar = (zn) this.f36323b;
                znVar.f40285b9 = true;
                znVar.Z8 = 0;
                znVar.f40458pb = 0;
                znVar.N4 = 0;
                znVar.r9();
                znVar.Nb(false);
                return;
            case 1:
                uo uoVar = (uo) this.f36323b;
                uoVar.M0 = false;
                uoVar.f38166b = null;
                uoVar.N0 = false;
                return;
            case 2:
                ((up) this.f36323b).f38204n = null;
                return;
            default:
                hc0 hc0Var = (hc0) this.f36323b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.f34181b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
