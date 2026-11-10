package org.telegram.ui;

import android.content.DialogInterface;
public final class ou implements DialogInterface.OnDismissListener {
    public final int f48579a;
    public final zw f48580b;

    public ou(zw zwVar, int i7) {
        this.f48579a = i7;
        this.f48580b = zwVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f48579a) {
            case 0:
                zw zwVar = this.f48580b;
                if (zwVar.S3 != null) {
                    zwVar.getMessagesController().k4(0L, zwVar.S3);
                    zwVar.S3 = null;
                    zwVar.X4();
                    return;
                }
                return;
            case 1:
                this.f48580b.n4(true);
                return;
            case 2:
                this.f48580b.n4(true);
                return;
            default:
                zw.l0(this.f48580b);
                return;
        }
    }
}
