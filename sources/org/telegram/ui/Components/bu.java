package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class bu implements DialogInterface.OnShowListener {
    public final hu f24922a;

    public bu(hu huVar) {
        this.f24922a = huVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        n81 n81Var = this.f24922a.f26921j1;
        if (jf0.f27400p0.P && n81Var.f()) {
            n81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.l1(this, 2));
        }
    }
}
