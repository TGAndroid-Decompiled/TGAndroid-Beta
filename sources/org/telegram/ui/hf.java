package org.telegram.ui;

import android.content.DialogInterface;
public final class hf implements DialogInterface.OnShowListener {
    public final int f37609a;
    public final qn f37610b;

    public hf(qn qnVar, int i10) {
        this.f37609a = i10;
        this.f37610b = qnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37609a) {
            case 0:
                this.f37610b.Rb(false);
                return;
            default:
                this.f37610b.Rb(false);
                return;
        }
    }
}
