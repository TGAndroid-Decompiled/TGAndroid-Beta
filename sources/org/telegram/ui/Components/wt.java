package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class wt implements DialogInterface.OnShowListener {
    public final bu f41434a;

    public wt(bu buVar) {
        this.f41434a = buVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        bu buVar = this.f41434a;
        m71 m71Var = buVar.n1;
        if (buVar.M0() && m71Var.f()) {
            m71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
