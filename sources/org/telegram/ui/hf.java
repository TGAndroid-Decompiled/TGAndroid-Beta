package org.telegram.ui;

import android.content.DialogInterface;
public final class hf implements DialogInterface.OnShowListener {
    public final int f37583a;
    public final qn f37584b;

    public hf(qn qnVar, int i10) {
        this.f37583a = i10;
        this.f37584b = qnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37583a) {
            case 0:
                this.f37584b.Rb(false);
                return;
            default:
                this.f37584b.Rb(false);
                return;
        }
    }
}
