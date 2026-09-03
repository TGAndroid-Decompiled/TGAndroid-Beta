package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class hu implements DialogInterface.OnShowListener {
    public final ou f25496a;

    public hu(ou ouVar) {
        this.f25496a = ouVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        e91 e91Var = this.f25496a.f27652c;
        if (mg0.m0.M && e91Var.f()) {
            e91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.aa(this, 1));
        }
    }
}
