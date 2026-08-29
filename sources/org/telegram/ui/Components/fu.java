package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class fu implements DialogInterface.OnShowListener {
    public final mu f28533a;

    public fu(mu muVar) {
        this.f28533a = muVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        s81 s81Var = this.f28533a.f30765c;
        if (bg0.f27076l0.L && s81Var.f()) {
            s81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.z9(this, 1));
        }
    }
}
