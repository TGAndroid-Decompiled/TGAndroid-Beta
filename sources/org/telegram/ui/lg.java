package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class lg implements DialogInterface.OnCancelListener {
    public final int f35323a;
    public final Object f35324b;

    public lg(Object obj, int i10) {
        this.f35323a = i10;
        this.f35324b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35323a) {
            case 0:
                wn wnVar = (wn) this.f35324b;
                wnVar.f39415b9 = true;
                wnVar.Z8 = 0;
                wnVar.f39587pb = 0;
                wnVar.N4 = 0;
                wnVar.r9();
                wnVar.Nb(false);
                return;
            case 1:
                ro roVar = (ro) this.f35324b;
                roVar.M0 = false;
                roVar.f37378b = null;
                roVar.N0 = false;
                return;
            case 2:
                ((rp) this.f35324b).f37417n = null;
                return;
            default:
                zb0 zb0Var = (zb0) this.f35324b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.f40419b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
