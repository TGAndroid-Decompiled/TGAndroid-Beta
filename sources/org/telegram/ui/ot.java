package org.telegram.ui;

import android.content.DialogInterface;
public final class ot implements DialogInterface.OnClickListener {
    public final int f48536a;
    public final int f48537b;

    public ot(int i7, int i10) {
        this.f48536a = i10;
        this.f48537b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f48536a) {
            case 0:
                int i10 = 2 - i7;
                if (i10 == this.f48537b) {
                    org.telegram.messenger.iz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.iz.w(i10);
                    return;
                }
            default:
                int i11 = 2 - i7;
                if (i11 == this.f48537b) {
                    org.telegram.messenger.iz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.iz.w(i11);
                    return;
                }
        }
    }
}
