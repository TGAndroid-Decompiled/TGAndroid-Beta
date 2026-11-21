package org.telegram.ui;

import android.content.DialogInterface;
public final class nu implements DialogInterface.OnDismissListener {
    public final int f50316a;
    public final cx f50317b;

    public nu(cx cxVar, int i7) {
        this.f50316a = i7;
        this.f50317b = cxVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50316a) {
            case 0:
                cx cxVar = this.f50317b;
                if (cxVar.W3 != null) {
                    cxVar.getMessagesController().s4(0L, cxVar.W3);
                    cxVar.W3 = null;
                    cxVar.f5();
                    return;
                }
                return;
            case 1:
                this.f50317b.p4(true);
                return;
            case 2:
                this.f50317b.p4(true);
                return;
            default:
                cx.h0(this.f50317b);
                return;
        }
    }
}
