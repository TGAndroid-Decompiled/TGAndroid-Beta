package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class pu implements DialogInterface.OnShowListener {
    public final wu f27420a;

    public pu(wu wuVar) {
        this.f27420a = wuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        o91 o91Var = this.f27420a.f30164c;
        if (og0.f27042p0.P && o91Var.f()) {
            o91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
