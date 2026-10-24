package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class tu implements DialogInterface.OnShowListener {
    public final av f30887a;

    public tu(av avVar) {
        this.f30887a = avVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        da1 da1Var = this.f30887a.f24811c;
        if (ch0.f25313p0.P && da1Var.f()) {
            da1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
