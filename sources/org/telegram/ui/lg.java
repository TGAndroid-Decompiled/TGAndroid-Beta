package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class lg implements DialogInterface.OnCancelListener {
    public final int f35355a;
    public final Object f35356b;

    public lg(Object obj, int i10) {
        this.f35355a = i10;
        this.f35356b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35355a) {
            case 0:
                wn wnVar = (wn) this.f35356b;
                wnVar.f39430b9 = true;
                wnVar.Z8 = 0;
                wnVar.f39602pb = 0;
                wnVar.N4 = 0;
                wnVar.r9();
                wnVar.Nb(false);
                return;
            case 1:
                ro roVar = (ro) this.f35356b;
                roVar.M0 = false;
                roVar.f37391b = null;
                roVar.N0 = false;
                return;
            case 2:
                ((rp) this.f35356b).f37430n = null;
                return;
            default:
                zb0 zb0Var = (zb0) this.f35356b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.f40435b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
