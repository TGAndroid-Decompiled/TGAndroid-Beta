package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class ev implements DialogInterface.OnShowListener {
    public final lv f26171a;

    public ev(lv lvVar) {
        this.f26171a = lvVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        ha1 ha1Var = this.f26171a.f28599c;
        if (gh0.f26700p0.P && ha1Var.f()) {
            ha1Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.da(this, 1));
        }
    }
}
