package org.telegram.ui;

import android.content.DialogInterface;
public final class mt implements DialogInterface.OnClickListener {
    public final int f47782a;
    public final int f47783b;

    public mt(int i3, int i10) {
        this.f47782a = i10;
        this.f47783b = i3;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        switch (this.f47782a) {
            case 0:
                int i10 = 2 - i3;
                if (i10 == this.f47783b) {
                    org.telegram.messenger.az.w(-1);
                    return;
                } else {
                    org.telegram.messenger.az.w(i10);
                    return;
                }
            default:
                int i11 = 2 - i3;
                if (i11 == this.f47783b) {
                    org.telegram.messenger.az.w(-1);
                    return;
                } else {
                    org.telegram.messenger.az.w(i11);
                    return;
                }
        }
    }
}
