package org.telegram.ui;

import android.content.DialogInterface;
public final class of implements DialogInterface.OnShowListener {
    public final int f39186a;
    public final yn f39187b;

    public of(yn ynVar, int i10) {
        this.f39186a = i10;
        this.f39187b = ynVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39186a) {
            case 0:
                this.f39187b.Mb(false);
                return;
            default:
                this.f39187b.Mb(false);
                return;
        }
    }
}
