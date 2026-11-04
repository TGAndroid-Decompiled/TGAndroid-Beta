package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ot implements DialogInterface.OnShowListener {
    public final ut f36945a;

    public ot(ut utVar) {
        this.f36945a = utVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        d71 d71Var = this.f36945a.k1;
        if (ie0.f34683q0.Q && d71Var.f()) {
            d71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.g1(this, 2));
        }
    }
}
