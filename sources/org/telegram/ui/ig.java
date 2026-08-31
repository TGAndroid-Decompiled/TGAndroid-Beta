package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ig implements DialogInterface.OnCancelListener {
    public final int f37850a;
    public final Object f37851b;

    public ig(Object obj, int i10) {
        this.f37850a = i10;
        this.f37851b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37850a) {
            case 0:
                xn xnVar = (xn) this.f37851b;
                xnVar.Y8 = true;
                xnVar.W8 = 0;
                xnVar.f43288nb = 0;
                xnVar.K4 = 0;
                xnVar.r9();
                xnVar.Nb(false);
                return;
            case 1:
                po poVar = (po) this.f37851b;
                poVar.J0 = false;
                poVar.f40096b = null;
                poVar.K0 = false;
                return;
            case 2:
                ((rp) this.f37851b).f41018n = null;
                return;
            default:
                xb0 xb0Var = (xb0) this.f37851b;
                if (xb0Var.h >= 0) {
                    ConnectionsManager.getInstance(xb0Var.f43022b).cancelRequest(xb0Var.h, true);
                    xb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
