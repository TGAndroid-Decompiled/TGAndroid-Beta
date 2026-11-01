package org.telegram.ui;

import android.content.DialogInterface;
public final class pu implements DialogInterface.OnClickListener {
    public final int f40614a;
    public final int f40615b;

    public pu(int i10, int i11) {
        this.f40614a = i11;
        this.f40615b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f40614a) {
            case 0:
                int i11 = 2 - i10;
                if (i11 == this.f40615b) {
                    org.telegram.messenger.uz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.uz.w(i11);
                    return;
                }
            default:
                int i12 = 2 - i10;
                if (i12 == this.f40615b) {
                    org.telegram.messenger.uz.w(-1);
                    return;
                } else {
                    org.telegram.messenger.uz.w(i12);
                    return;
                }
        }
    }
}
