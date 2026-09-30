package org.telegram.ui;

import android.content.DialogInterface;
public final class mf implements DialogInterface.OnShowListener {
    public final int f35637a;
    public final wn f35638b;

    public mf(wn wnVar, int i10) {
        this.f35637a = i10;
        this.f35638b = wnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f35637a) {
            case 0:
                this.f35638b.Nb(false);
                return;
            default:
                this.f35638b.Nb(false);
                return;
        }
    }
}
