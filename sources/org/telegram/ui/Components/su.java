package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class su implements DialogInterface.OnShowListener {
    public final zu f30884a;

    public su(zu zuVar) {
        this.f30884a = zuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        z91 z91Var = this.f30884a.f33652c;
        if (rg0.f30384p0.P && z91Var.f()) {
            z91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
