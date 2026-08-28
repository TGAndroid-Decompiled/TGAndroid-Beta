package org.telegram.ui;

import android.content.DialogInterface;
public final class ev implements DialogInterface.OnDismissListener {
    public final int f38029a;
    public final dy f38030b;

    public ev(dy dyVar, int i9) {
        this.f38029a = i9;
        this.f38030b = dyVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38029a) {
            case 0:
                dy.h0(this.f38030b);
                return;
            case 1:
                dy dyVar = this.f38030b;
                if (dyVar.O3 != null) {
                    dyVar.getMessagesController().removeSuggestion(0L, dyVar.O3);
                    dyVar.O3 = null;
                    dyVar.L4();
                    return;
                }
                return;
            case 2:
                this.f38030b.b4(true);
                return;
            default:
                this.f38030b.b4(true);
                return;
        }
    }
}
