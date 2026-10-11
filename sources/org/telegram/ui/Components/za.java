package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class za extends org.telegram.ui.ActionBar.k {
    public final tw0 f33592u1;
    public final db f33593v1;

    public za(db dbVar, Context context, tw0 tw0Var) {
        super(context, null);
        this.f33593v1 = dbVar;
        this.f33592u1 = tw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        db dbVar = this.f33593v1;
        if (dbVar.L && dbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f33592u1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f33593v1.N();
    }
}
