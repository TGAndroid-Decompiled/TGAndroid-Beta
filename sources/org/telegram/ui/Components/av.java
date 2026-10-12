package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class av implements DialogInterface.OnShowListener {
    public final hv f23629a;

    public av(hv hvVar) {
        this.f23629a = hvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ca1 ca1Var = this.f23629a.f25752c;
        if (fh0.f25035p0.P && ca1Var.f()) {
            ca1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
