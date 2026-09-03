package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ig implements DialogInterface.OnCancelListener {
    public final int f37654a;
    public final Object f37655b;

    public ig(Object obj, int i10) {
        this.f37654a = i10;
        this.f37655b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37654a) {
            case 0:
                xn xnVar = (xn) this.f37655b;
                xnVar.Y8 = true;
                xnVar.W8 = 0;
                xnVar.f43266nb = 0;
                xnVar.K4 = 0;
                xnVar.r9();
                xnVar.Nb(false);
                return;
            case 1:
                po poVar = (po) this.f37655b;
                poVar.J0 = false;
                poVar.f40058b = null;
                poVar.K0 = false;
                return;
            case 2:
                ((rp) this.f37655b).f40898n = null;
                return;
            default:
                xb0 xb0Var = (xb0) this.f37655b;
                if (xb0Var.h >= 0) {
                    ConnectionsManager.getInstance(xb0Var.f43001b).cancelRequest(xb0Var.h, true);
                    xb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
