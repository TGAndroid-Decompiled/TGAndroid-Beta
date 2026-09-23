package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
public final class ix extends ai.b0 {
    public final ry O0;

    public ix(ry ryVar, Context context, ry ryVar2, int i10, int i11) {
        super(context, ryVar2, i10, i11);
        this.O0 = ryVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.O0).actionBar;
        if (!kVar.s() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
