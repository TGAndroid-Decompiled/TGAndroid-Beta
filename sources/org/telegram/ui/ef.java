package org.telegram.ui;

import android.content.DialogInterface;
public final class ef implements DialogInterface.OnShowListener {
    public final int f37924a;
    public final qn f37925b;

    public ef(qn qnVar, int i9) {
        this.f37924a = i9;
        this.f37925b = qnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37924a) {
            case 0:
                this.f37925b.Nb(false);
                return;
            default:
                this.f37925b.Nb(false);
                return;
        }
    }
}
