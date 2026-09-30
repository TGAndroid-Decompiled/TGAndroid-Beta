package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class lg implements DialogInterface.OnCancelListener {
    public final int f35446a;
    public final Object f35447b;

    public lg(Object obj, int i10) {
        this.f35446a = i10;
        this.f35447b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35446a) {
            case 0:
                wn wnVar = (wn) this.f35447b;
                wnVar.f39523b9 = true;
                wnVar.Z8 = 0;
                wnVar.f39695pb = 0;
                wnVar.N4 = 0;
                wnVar.r9();
                wnVar.Nb(false);
                return;
            case 1:
                ro roVar = (ro) this.f35447b;
                roVar.M0 = false;
                roVar.f37484b = null;
                roVar.N0 = false;
                return;
            case 2:
                ((rp) this.f35447b).f37523n = null;
                return;
            default:
                zb0 zb0Var = (zb0) this.f35447b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.f40545b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
