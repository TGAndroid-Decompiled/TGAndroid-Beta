package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class cg implements DialogInterface.OnCancelListener {
    public final int f37099a;
    public final Object f37100b;

    public cg(Object obj, int i10) {
        this.f37099a = i10;
        this.f37100b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37099a) {
            case 0:
                tn tnVar = (tn) this.f37100b;
                tnVar.X8 = true;
                tnVar.V8 = 0;
                tnVar.f42896mb = 0;
                tnVar.J4 = 0;
                tnVar.r9();
                tnVar.Nb(false);
                return;
            case 1:
                ko koVar = (ko) this.f37100b;
                koVar.I0 = false;
                koVar.f39940b = null;
                koVar.J0 = false;
                return;
            case 2:
                ((kp) this.f37100b).f39982n = null;
                return;
            default:
                mb0 mb0Var = (mb0) this.f37100b;
                if (mb0Var.h >= 0) {
                    ConnectionsManager.getInstance(mb0Var.f40514b).cancelRequest(mb0Var.h, true);
                    mb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
