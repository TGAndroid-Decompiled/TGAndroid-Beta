package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

public final class fg implements DialogInterface.OnCancelListener {

    public final int f38123a;

    public final Object f38124b;

    public fg(Object obj, int i10) {
        this.f38123a = i10;
        this.f38124b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38123a) {
            case 0:
                rn rnVar = (rn) this.f38124b;
                rnVar.X8 = true;
                rnVar.V8 = 0;
                rnVar.f42136mb = 0;
                rnVar.J4 = 0;
                rnVar.r9();
                rnVar.Nb(false);
                break;
            case 1:
                jo joVar = (jo) this.f38124b;
                joVar.I0 = false;
                joVar.f39405b = null;
                joVar.J0 = false;
                break;
            case 2:
                ((jp) this.f38124b).f39455n = null;
                break;
            default:
                ob0 ob0Var = (ob0) this.f38124b;
                if (ob0Var.h >= 0) {
                    ConnectionsManager.getInstance(ob0Var.f41051b).cancelRequest(ob0Var.h, true);
                    ob0Var.h = -1;
                }
                break;
        }
    }
}
