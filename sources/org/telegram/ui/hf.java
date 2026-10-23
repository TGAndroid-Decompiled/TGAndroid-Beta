package org.telegram.ui;

import android.content.DialogInterface;
public final class hf implements DialogInterface.OnShowListener {
    public final int f37594a;
    public final qn f37595b;

    public hf(qn qnVar, int i10) {
        this.f37594a = i10;
        this.f37595b = qnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f37594a) {
            case 0:
                this.f37595b.Sb(false);
                return;
            default:
                this.f37595b.Sb(false);
                return;
        }
    }
}
