package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class su implements DialogInterface.OnShowListener {
    public final zu f30950a;

    public su(zu zuVar) {
        this.f30950a = zuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        aa1 aa1Var = this.f30950a.f33643c;
        if (rg0.f30466p0.P && aa1Var.f()) {
            aa1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.fa(this, 1));
        }
    }
}
