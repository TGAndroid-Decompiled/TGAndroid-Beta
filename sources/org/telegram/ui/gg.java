package org.telegram.ui;

import android.content.DialogInterface;
public final class gg implements DialogInterface.OnDismissListener {
    public final int f33918a;
    public final wn f33919b;

    public gg(wn wnVar, int i10) {
        this.f33918a = i10;
        this.f33919b = wnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33918a) {
            case 0:
                wn.Q0(this.f33919b);
                return;
            case 1:
                this.f33919b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f33919b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f33919b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f33919b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f33919b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f33919b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f33919b.Fb = null;
                return;
            default:
                ek ekVar = this.f33919b.X1;
                if (ekVar != null) {
                    ekVar.c(false);
                    return;
                }
                return;
        }
    }
}
