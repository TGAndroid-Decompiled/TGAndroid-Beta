package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class pu implements DialogInterface.OnShowListener {
    public final wu f27135a;

    public pu(wu wuVar) {
        this.f27135a = wuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        b91 b91Var = this.f27135a.f29811c;
        if (eg0.f23661p0.P && b91Var.f()) {
            b91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ga(this, 1));
        }
    }
}
