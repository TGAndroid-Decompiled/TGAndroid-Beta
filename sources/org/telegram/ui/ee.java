package org.telegram.ui;

import android.content.DialogInterface;
public final class ee implements DialogInterface.OnDismissListener {
    public final int f45282a;
    public final an f45283b;

    public ee(an anVar, int i7) {
        this.f45282a = i7;
        this.f45283b = anVar;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f45282a) {
            case 0:
                lj ljVar = this.f45283b.f43868l2;
                if (ljVar != null) {
                    ljVar.c(false);
                    return;
                }
                return;
            case 1:
                an.c1(this.f45283b);
                return;
            case 2:
                this.f45283b.v8(false, true, 0.0f);
                return;
            case 3:
                this.f45283b.v8(false, true, 0.0f);
                return;
            case 4:
                this.f45283b.v8(false, true, 0.0f);
                return;
            case 5:
                this.f45283b.v8(false, true, 0.0f);
                return;
            case 6:
                this.f45283b.v8(false, true, 0.0f);
                return;
            case 7:
                this.f45283b.v8(false, true, 0.0f);
                return;
            default:
                this.f45283b.f43816gc = null;
                return;
        }
    }
}
