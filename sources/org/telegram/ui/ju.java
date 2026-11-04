package org.telegram.ui;

import android.content.DialogInterface;
public final class ju implements DialogInterface.OnDismissListener {
    public final int f46688a;
    public final uw f46689b;

    public ju(uw uwVar, int i3) {
        this.f46688a = i3;
        this.f46689b = uwVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f46688a) {
            case 0:
                uw uwVar = this.f46689b;
                if (uwVar.S3 != null) {
                    uwVar.getMessagesController().k4(0L, uwVar.S3);
                    uwVar.S3 = null;
                    uwVar.X4();
                    return;
                }
                return;
            case 1:
                this.f46689b.n4(true);
                return;
            case 2:
                this.f46689b.n4(true);
                return;
            default:
                uw.l0(this.f46689b);
                return;
        }
    }
}
