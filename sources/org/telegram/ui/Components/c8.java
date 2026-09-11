package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class c8 extends fo0 {
    public final k8 f24918l0;

    public c8(k8 k8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.f24918l0 = k8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f24918l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
