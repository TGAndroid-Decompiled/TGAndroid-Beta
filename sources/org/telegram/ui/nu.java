package org.telegram.ui;

import android.content.DialogInterface;
public final class nu implements DialogInterface.OnDismissListener {
    public final int f50320a;
    public final cx f50321b;

    public nu(cx cxVar, int i7) {
        this.f50320a = i7;
        this.f50321b = cxVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50320a) {
            case 0:
                cx cxVar = this.f50321b;
                if (cxVar.W3 != null) {
                    cxVar.getMessagesController().s4(0L, cxVar.W3);
                    cxVar.W3 = null;
                    cxVar.f5();
                    return;
                }
                return;
            case 1:
                this.f50321b.p4(true);
                return;
            case 2:
                this.f50321b.p4(true);
                return;
            default:
                cx.h0(this.f50321b);
                return;
        }
    }
}
