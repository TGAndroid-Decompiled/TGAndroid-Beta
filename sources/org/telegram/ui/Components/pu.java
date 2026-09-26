package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class pu implements DialogInterface.OnShowListener {
    public final wu f27434a;

    public pu(wu wuVar) {
        this.f27434a = wuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        o91 o91Var = this.f27434a.f30184c;
        if (og0.f27046p0.P && o91Var.f()) {
            o91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
