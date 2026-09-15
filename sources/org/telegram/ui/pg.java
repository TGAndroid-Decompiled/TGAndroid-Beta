package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class pg implements DialogInterface.OnCancelListener {
    public final int f36573a;
    public final Object f36574b;

    public pg(Object obj, int i10) {
        this.f36573a = i10;
        this.f36574b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f36573a) {
            case 0:
                bo boVar = (bo) this.f36574b;
                boVar.f32258b9 = true;
                boVar.Z8 = 0;
                boVar.f32443qb = 0;
                boVar.N4 = 0;
                boVar.r9();
                boVar.Nb(false);
                return;
            case 1:
                wo woVar = (wo) this.f36574b;
                woVar.M0 = false;
                woVar.f39271b = null;
                woVar.N0 = false;
                return;
            case 2:
                ((wp) this.f36574b).f39351n = null;
                return;
            default:
                fc0 fc0Var = (fc0) this.f36574b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f33535b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
