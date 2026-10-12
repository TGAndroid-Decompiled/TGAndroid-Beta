package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class hv implements DialogInterface.OnShowListener {
    public final ov f26913a;

    public hv(ov ovVar) {
        this.f26913a = ovVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ma1 ma1Var = this.f26913a.f29297c;
        if (jh0.f27503p0.P && ma1Var.f()) {
            ma1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
