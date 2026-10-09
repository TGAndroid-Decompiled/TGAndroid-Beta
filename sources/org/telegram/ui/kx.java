package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class kx extends ai.b0 {
    public final ty O0;

    public kx(ty tyVar, Context context, ty tyVar2, int i10, int i11) {
        super(context, tyVar2, i10, i11);
        this.O0 = tyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        if (!kVar.t() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
