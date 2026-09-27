package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class og implements DialogInterface.OnCancelListener {
    public final int f36203a;
    public final Object f36204b;

    public og(Object obj, int i10) {
        this.f36203a = i10;
        this.f36204b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36203a) {
            case 0:
                xn xnVar = (xn) this.f36204b;
                xnVar.f39711b9 = true;
                xnVar.Z8 = 0;
                xnVar.f39884pb = 0;
                xnVar.N4 = 0;
                xnVar.r9();
                xnVar.Nb(false);
                return;
            case 1:
                so soVar = (so) this.f36204b;
                soVar.M0 = false;
                soVar.f37505b = null;
                soVar.N0 = false;
                return;
            case 2:
                ((sp) this.f36204b).f37544n = null;
                return;
            default:
                cc0 cc0Var = (cc0) this.f36204b;
                if (cc0Var.h >= 0) {
                    ConnectionsManager.getInstance(cc0Var.f32655b).cancelRequest(cc0Var.h, true);
                    cc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
