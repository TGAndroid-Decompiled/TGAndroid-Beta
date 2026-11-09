package org.telegram.ui;

import android.content.DialogInterface;
public final class nu implements DialogInterface.OnDismissListener {
    public final int f48235a;
    public final yw f48236b;

    public nu(yw ywVar, int i7) {
        this.f48235a = i7;
        this.f48236b = ywVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48235a) {
            case 0:
                yw ywVar = this.f48236b;
                if (ywVar.S3 != null) {
                    ywVar.getMessagesController().k4(0L, ywVar.S3);
                    ywVar.S3 = null;
                    ywVar.X4();
                    return;
                }
                return;
            case 1:
                this.f48236b.n4(true);
                return;
            case 2:
                this.f48236b.n4(true);
                return;
            default:
                yw.l0(this.f48236b);
                return;
        }
    }
}
