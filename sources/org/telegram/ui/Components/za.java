package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class za extends org.telegram.ui.ActionBar.k {
    public final yw0 f33306u1;
    public final db f33307v1;

    public za(db dbVar, Context context, yw0 yw0Var) {
        super(context, null);
        this.f33307v1 = dbVar;
        this.f33306u1 = yw0Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        db dbVar = this.f33307v1;
        if (dbVar.L && dbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.f33306u1.invalidate();
        }
    }

    @Override
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.f33307v1.N();
    }
}
