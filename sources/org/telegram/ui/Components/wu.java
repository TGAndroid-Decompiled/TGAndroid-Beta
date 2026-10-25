package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class wu implements DialogInterface.OnShowListener {
    public final dv f34532a;

    public wu(dv dvVar) {
        this.f34532a = dvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ma1 ma1Var = this.f34532a.f27606c;
        if (ch0.f27157p0.P && ma1Var.f()) {
            ma1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 1));
        }
    }
}
