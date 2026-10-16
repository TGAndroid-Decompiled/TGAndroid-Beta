package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class av implements DialogInterface.OnShowListener {
    public final hv f23308a;

    public av(hv hvVar) {
        this.f23308a = hvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        da1 da1Var = this.f23308a.f25406c;
        if (fh0.f24733p0.P && da1Var.f()) {
            da1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
