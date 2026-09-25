package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class pu implements DialogInterface.OnShowListener {
    public final wu f27435a;

    public pu(wu wuVar) {
        this.f27435a = wuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        o91 o91Var = this.f27435a.f30185c;
        if (og0.f27047p0.P && o91Var.f()) {
            o91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
