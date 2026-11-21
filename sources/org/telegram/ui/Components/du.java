package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class du implements DialogInterface.OnShowListener {
    public final iu f34577a;

    public du(iu iuVar) {
        this.f34577a = iuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        iu iuVar = this.f34577a;
        z71 z71Var = iuVar.n1;
        if (iuVar.N0() && z71Var.f()) {
            z71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
