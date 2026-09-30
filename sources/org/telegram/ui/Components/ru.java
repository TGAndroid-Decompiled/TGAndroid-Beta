package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ru implements DialogInterface.OnShowListener {
    public final yu f28131a;

    public ru(yu yuVar) {
        this.f28131a = yuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        r91 r91Var = this.f28131a.f30810c;
        if (rg0.f27987p0.P && r91Var.f()) {
            r91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
