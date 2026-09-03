package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class kg implements DialogInterface.OnCancelListener {
    public final int f35532a;
    public final Object f35533b;

    public kg(Object obj, int i10) {
        this.f35532a = i10;
        this.f35533b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35532a) {
            case 0:
                zn znVar = (zn) this.f35533b;
                znVar.Y8 = true;
                znVar.W8 = 0;
                znVar.f40685nb = 0;
                znVar.K4 = 0;
                znVar.r9();
                znVar.Nb(false);
                return;
            case 1:
                ro roVar = (ro) this.f35533b;
                roVar.J0 = false;
                roVar.f37902b = null;
                roVar.K0 = false;
                return;
            case 2:
                ((sp) this.f35533b).f38285n = null;
                return;
            default:
                yb0 yb0Var = (yb0) this.f35533b;
                if (yb0Var.h >= 0) {
                    ConnectionsManager.getInstance(yb0Var.f40222b).cancelRequest(yb0Var.h, true);
                    yb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
