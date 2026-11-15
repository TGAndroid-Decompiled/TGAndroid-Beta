package org.telegram.ui;

import android.content.DialogInterface;
public final class ge implements DialogInterface.OnDismissListener {
    public final int f47432a;
    public final an f47433b;

    public ge(an anVar, int i7) {
        this.f47432a = i7;
        this.f47433b = anVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f47432a) {
            case 0:
                lj ljVar = this.f47433b.f45279m2;
                if (ljVar != null) {
                    ljVar.c(false);
                    return;
                }
                return;
            case 1:
                an.j1(this.f47433b);
                return;
            case 2:
                this.f47433b.x8(false, true, 0.0f);
                return;
            case 3:
                this.f47433b.x8(false, true, 0.0f);
                return;
            case 4:
                this.f47433b.x8(false, true, 0.0f);
                return;
            case 5:
                this.f47433b.x8(false, true, 0.0f);
                return;
            case 6:
                this.f47433b.x8(false, true, 0.0f);
                return;
            case 7:
                this.f47433b.x8(false, true, 0.0f);
                return;
            default:
                this.f47433b.f45251jc = null;
                return;
        }
    }
}
