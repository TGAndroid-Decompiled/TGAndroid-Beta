package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class wu implements DialogInterface.OnShowListener {
    public final dv f34575a;

    public wu(dv dvVar) {
        this.f34575a = dvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        na1 na1Var = this.f34575a.f27551c;
        if (dh0.f27444p0.P && na1Var.f()) {
            na1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 1));
        }
    }
}
