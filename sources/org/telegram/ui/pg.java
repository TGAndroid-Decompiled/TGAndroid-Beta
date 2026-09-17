package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f39533a;
    public final Object f39534b;

    public pg(Object obj, int i10) {
        this.f39533a = i10;
        this.f39534b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f39533a) {
            case 0:
                co coVar = (co) this.f39534b;
                coVar.f35235b9 = true;
                coVar.Z8 = 0;
                coVar.f35420qb = 0;
                coVar.N4 = 0;
                coVar.r9();
                coVar.Nb(false);
                return;
            case 1:
                xo xoVar = (xo) this.f39534b;
                xoVar.M0 = false;
                xoVar.f42797b = null;
                xoVar.N0 = false;
                return;
            case 2:
                ((xp) this.f39534b).f42880n = null;
                return;
            default:
                fc0 fc0Var = (fc0) this.f39534b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f36396b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
