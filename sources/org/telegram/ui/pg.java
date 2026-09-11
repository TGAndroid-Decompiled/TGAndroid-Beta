package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f39505a;
    public final Object f39506b;

    public pg(Object obj, int i10) {
        this.f39505a = i10;
        this.f39506b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39505a) {
            case 0:
                co coVar = (co) this.f39506b;
                coVar.f35207b9 = true;
                coVar.Z8 = 0;
                coVar.f35392qb = 0;
                coVar.N4 = 0;
                coVar.r9();
                coVar.Nb(false);
                return;
            case 1:
                xo xoVar = (xo) this.f39506b;
                xoVar.M0 = false;
                xoVar.f42769b = null;
                xoVar.N0 = false;
                return;
            case 2:
                ((xp) this.f39506b).f42852n = null;
                return;
            default:
                fc0 fc0Var = (fc0) this.f39506b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f36368b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
