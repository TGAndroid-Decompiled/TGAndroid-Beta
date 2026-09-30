package org.telegram.ui;

import android.content.DialogInterface;
public final class gg implements DialogInterface.OnDismissListener {
    public final int f34074a;
    public final wn f34075b;

    public gg(wn wnVar, int i10) {
        this.f34074a = i10;
        this.f34075b = wnVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34074a) {
            case 0:
                wn.Q0(this.f34075b);
                return;
            case 1:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 2:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 3:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 4:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 5:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 6:
                this.f34075b.g8(false, true, 0.0f);
                return;
            case 7:
                this.f34075b.Fb = null;
                return;
            default:
                ek ekVar = this.f34075b.X1;
                if (ekVar != null) {
                    ekVar.c(false);
                    return;
                }
                return;
        }
    }
}
