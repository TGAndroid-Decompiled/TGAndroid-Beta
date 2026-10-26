package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class wu implements DialogInterface.OnShowListener {
    public final dv f34535a;

    public wu(dv dvVar) {
        this.f34535a = dvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ma1 ma1Var = this.f34535a.f27608c;
        if (ch0.f27159p0.P && ma1Var.f()) {
            ma1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 1));
        }
    }
}
