package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class yt implements DialogInterface.OnShowListener {

    public final fu f34961a;

    public yt(fu fuVar) {
        this.f34961a = fuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        i81 i81Var = this.f34961a.f28451c;
        if (sf0.f32415l0.L && i81Var.f()) {
            i81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.y9(this, 1));
        }
    }
}
