package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class hx extends ai.b0 {
    public final ty O0;

    public hx(ty tyVar, Context context, ty tyVar2, int i10, int i11) {
        super(context, tyVar2, i10, i11);
        this.O0 = tyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.O0).actionBar;
        if (!lVar.t() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
