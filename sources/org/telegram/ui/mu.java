package org.telegram.ui;

import android.content.DialogInterface;
public final class mu implements DialogInterface.OnDismissListener {
    public final int f50114a;
    public final bx f50115b;

    public mu(bx bxVar, int i7) {
        this.f50114a = i7;
        this.f50115b = bxVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50114a) {
            case 0:
                bx bxVar = this.f50115b;
                if (bxVar.W3 != null) {
                    bxVar.getMessagesController().s4(0L, bxVar.W3);
                    bxVar.W3 = null;
                    bxVar.f5();
                    return;
                }
                return;
            case 1:
                this.f50115b.p4(true);
                return;
            case 2:
                this.f50115b.p4(true);
                return;
            default:
                bx.h0(this.f50115b);
                return;
        }
    }
}
