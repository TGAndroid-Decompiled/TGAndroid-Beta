package org.telegram.ui;

import android.content.DialogInterface;
public final class ee implements DialogInterface.OnDismissListener {
    public final int f45323a;
    public final an f45324b;

    public ee(an anVar, int i7) {
        this.f45323a = i7;
        this.f45324b = anVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45323a) {
            case 0:
                lj ljVar = this.f45324b.f43862l2;
                if (ljVar != null) {
                    ljVar.c(false);
                    return;
                }
                return;
            case 1:
                an.c1(this.f45324b);
                return;
            case 2:
                this.f45324b.v8(false, true, 0.0f);
                return;
            case 3:
                this.f45324b.v8(false, true, 0.0f);
                return;
            case 4:
                this.f45324b.v8(false, true, 0.0f);
                return;
            case 5:
                this.f45324b.v8(false, true, 0.0f);
                return;
            case 6:
                this.f45324b.v8(false, true, 0.0f);
                return;
            case 7:
                this.f45324b.v8(false, true, 0.0f);
                return;
            default:
                this.f45324b.f43810gc = null;
                return;
        }
    }
}
