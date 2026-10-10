package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class ab extends org.telegram.ui.ActionBar.k {
    public final tw0 f24529u1;
    public final eb f24530v1;

    public ab(eb ebVar, Context context, tw0 tw0Var) {
        super(context, null);
        this.f24530v1 = ebVar;
        this.f24529u1 = tw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        eb ebVar = this.f24530v1;
        if (ebVar.L && ebVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f24529u1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f24530v1.N();
    }
}
