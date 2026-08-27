package org.telegram.ui;

import android.content.DialogInterface;

public final class hv implements DialogInterface.OnDismissListener {

    public final int f38892a;

    public final gy f38893b;

    public hv(gy gyVar, int i10) {
        this.f38892a = i10;
        this.f38893b = gyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38892a) {
            case 0:
                gy.i0(this.f38893b);
                break;
            case 1:
                gy gyVar = this.f38893b;
                if (gyVar.O3 != null) {
                    gyVar.getMessagesController().removeSuggestion(0L, gyVar.O3);
                    gyVar.O3 = null;
                    gyVar.L4();
                    break;
                }
                break;
            case 2:
                this.f38893b.b4(true);
                break;
            default:
                this.f38893b.b4(true);
                break;
        }
    }
}
