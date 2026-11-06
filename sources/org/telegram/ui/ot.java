package org.telegram.ui;

import android.content.DialogInterface;
public final class ot implements DialogInterface.OnClickListener {
    public final int f48548a;
    public final int f48549b;

    public ot(int i7, int i10) {
        this.f48548a = i10;
        this.f48549b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f48548a) {
            case 0:
                int i10 = 2 - i7;
                if (i10 == this.f48549b) {
                    org.telegram.messenger.iz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.iz.w(i10);
                    return;
                }
            default:
                int i11 = 2 - i7;
                if (i11 == this.f48549b) {
                    org.telegram.messenger.iz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.iz.w(i11);
                    return;
                }
        }
    }
}
