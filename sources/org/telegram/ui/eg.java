package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class eg implements DialogInterface.OnCancelListener {
    public final int f37930a;
    public final Object f37931b;

    public eg(Object obj, int i9) {
        this.f37930a = i9;
        this.f37931b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37930a) {
            case 0:
                qn qnVar = (qn) this.f37931b;
                qnVar.X8 = true;
                qnVar.V8 = 0;
                qnVar.mb = 0;
                qnVar.J4 = 0;
                qnVar.r9();
                qnVar.Nb(false);
                return;
            case 1:
                ho hoVar = (ho) this.f37931b;
                hoVar.I0 = false;
                hoVar.f38837b = null;
                hoVar.J0 = false;
                return;
            case 2:
                ((hp) this.f37931b).f38886n = null;
                return;
            default:
                kb0 kb0Var = (kb0) this.f37931b;
                if (kb0Var.h >= 0) {
                    ConnectionsManager.getInstance(kb0Var.f39791b).cancelRequest(kb0Var.h, true);
                    kb0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
