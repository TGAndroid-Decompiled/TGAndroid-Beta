package org.telegram.ui;

import android.content.DialogInterface;
public final class gf implements DialogInterface.OnShowListener {
    public final int f39606a;
    public final wn f39607b;

    public gf(wn wnVar, int i10) {
        this.f39606a = i10;
        this.f39607b = wnVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f39606a) {
            case 0:
                this.f39607b.dc(false);
                return;
            default:
                this.f39607b.dc(false);
                return;
        }
    }
}
