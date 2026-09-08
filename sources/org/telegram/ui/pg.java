package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f39532a;
    public final Object f39533b;

    public pg(Object obj, int i10) {
        this.f39532a = i10;
        this.f39533b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39532a) {
            case 0:
                co coVar = (co) this.f39533b;
                coVar.f35234b9 = true;
                coVar.Z8 = 0;
                coVar.f35419qb = 0;
                coVar.N4 = 0;
                coVar.r9();
                coVar.Nb(false);
                return;
            case 1:
                xo xoVar = (xo) this.f39533b;
                xoVar.M0 = false;
                xoVar.f42796b = null;
                xoVar.N0 = false;
                return;
            case 2:
                ((xp) this.f39533b).f42879n = null;
                return;
            default:
                fc0 fc0Var = (fc0) this.f39533b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f36395b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
