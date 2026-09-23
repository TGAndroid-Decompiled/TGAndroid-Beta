package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class ng implements DialogInterface.OnCancelListener {
    public final int f35519a;
    public final Object f35520b;

    public ng(Object obj, int i10) {
        this.f35519a = i10;
        this.f35520b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f35519a) {
            case 0:
                xn xnVar = (xn) this.f35520b;
                xnVar.f39331b9 = true;
                xnVar.Z8 = 0;
                xnVar.f39503pb = 0;
                xnVar.N4 = 0;
                xnVar.r9();
                xnVar.Nb(false);
                return;
            case 1:
                so soVar = (so) this.f35520b;
                soVar.M0 = false;
                soVar.f37345b = null;
                soVar.N0 = false;
                return;
            case 2:
                ((sp) this.f35520b).f37384n = null;
                return;
            default:
                ac0 ac0Var = (ac0) this.f35520b;
                if (ac0Var.h >= 0) {
                    ConnectionsManager.getInstance(ac0Var.f31732b).cancelRequest(ac0Var.h, true);
                    ac0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
