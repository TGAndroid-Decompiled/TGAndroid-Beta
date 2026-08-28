package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class zt implements DialogInterface.OnShowListener {
    public final gu f35375a;

    public zt(gu guVar) {
        this.f35375a = guVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        g81 g81Var = this.f35375a.f28869c;
        if (pf0.f31622l0.L && g81Var.f()) {
            g81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ca(this, 1));
        }
    }
}
