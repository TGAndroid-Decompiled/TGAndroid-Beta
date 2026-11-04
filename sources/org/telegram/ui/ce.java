package org.telegram.ui;

import android.content.DialogInterface;
public final class ce implements DialogInterface.OnDismissListener {
    public final int f44322a;
    public final wm f44323b;

    public ce(wm wmVar, int i3) {
        this.f44322a = i3;
        this.f44323b = wmVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44322a) {
            case 0:
                hj hjVar = this.f44323b.f51395m2;
                if (hjVar != null) {
                    hjVar.c(false);
                    return;
                }
                return;
            case 1:
                wm.c1(this.f44323b);
                return;
            case 2:
                this.f44323b.v8(false, true, 0.0f);
                return;
            case 3:
                this.f44323b.v8(false, true, 0.0f);
                return;
            case 4:
                this.f44323b.v8(false, true, 0.0f);
                return;
            case 5:
                this.f44323b.v8(false, true, 0.0f);
                return;
            case 6:
                this.f44323b.v8(false, true, 0.0f);
                return;
            case 7:
                this.f44323b.v8(false, true, 0.0f);
                return;
            default:
                this.f44323b.f51344hc = null;
                return;
        }
    }
}
