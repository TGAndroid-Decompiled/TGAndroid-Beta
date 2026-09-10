package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class qg implements DialogInterface.OnCancelListener {
    public final int f36046a;
    public final Object f36047b;

    public qg(Object obj, int i10) {
        this.f36046a = i10;
        this.f36047b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36046a) {
            case 0:
                eo eoVar = (eo) this.f36047b;
                eoVar.f32277b9 = true;
                eoVar.Z8 = 0;
                eoVar.f32461qb = 0;
                eoVar.N4 = 0;
                eoVar.r9();
                eoVar.Nb(false);
                return;
            case 1:
                yo yoVar = (yo) this.f36047b;
                yoVar.M0 = false;
                yoVar.f39041b = null;
                yoVar.N0 = false;
                return;
            case 2:
                ((yp) this.f36047b).f39080n = null;
                return;
            default:
                fc0 fc0Var = (fc0) this.f36047b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f32779b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
