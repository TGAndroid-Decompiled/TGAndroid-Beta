package org.telegram.ui;

import android.content.DialogInterface;
public final class nu implements DialogInterface.OnDismissListener {
    public final int f49686a;
    public final yw f49687b;

    public nu(yw ywVar, int i7) {
        this.f49686a = i7;
        this.f49687b = ywVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f49686a) {
            case 0:
                yw ywVar = this.f49687b;
                if (ywVar.T3 != null) {
                    ywVar.getMessagesController().k4(0L, ywVar.T3);
                    ywVar.T3 = null;
                    ywVar.X4();
                    return;
                }
                return;
            case 1:
                this.f49687b.n4(true);
                return;
            case 2:
                this.f49687b.n4(true);
                return;
            default:
                yw.l0(this.f49687b);
                return;
        }
    }
}
