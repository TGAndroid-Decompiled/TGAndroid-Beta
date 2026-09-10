package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class su implements DialogInterface.OnShowListener {
    public final zu f27216a;

    public su(zu zuVar) {
        this.f27216a = zuVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        o91 o91Var = this.f27216a.f29811c;
        if (og0.f25781p0.P && o91Var.f()) {
            o91Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Cells.ha(this, 1));
        }
    }
}
