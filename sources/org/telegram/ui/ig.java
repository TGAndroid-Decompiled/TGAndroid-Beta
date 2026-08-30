package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ig implements DialogInterface.OnCancelListener {
    public final int f35114a;
    public final Object f35115b;

    public ig(Object obj, int i10) {
        this.f35114a = i10;
        this.f35115b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35114a) {
            case 0:
                xn xnVar = (xn) this.f35115b;
                xnVar.Y8 = true;
                xnVar.W8 = 0;
                xnVar.f40119nb = 0;
                xnVar.K4 = 0;
                xnVar.r9();
                xnVar.Nb(false);
                return;
            case 1:
                po poVar = (po) this.f35115b;
                poVar.J0 = false;
                poVar.f37382b = null;
                poVar.K0 = false;
                return;
            case 2:
                ((qp) this.f35115b).f37807n = null;
                return;
            default:
                wb0 wb0Var = (wb0) this.f35115b;
                if (wb0Var.h >= 0) {
                    ConnectionsManager.getInstance(wb0Var.f39390b).cancelRequest(wb0Var.h, true);
                    wb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
