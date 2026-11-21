package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class am0 extends org.telegram.ui.Cells.ba {
    public final int I = 1;

    public am0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7) {
        super(context, r4Var, i7);
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.I) {
            case 0:
                if (canvas.isHardwareAccelerated()) {
                    super.draw(canvas);
                    return;
                } else {
                    bg.u0.a(canvas, this, new r3(this, 18));
                    return;
                }
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.I) {
            case 1:
                if (getParent() != null && getParent().getParent() != null) {
                    getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public am0(Context context, org.telegram.ui.ActionBar.r4 r4Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, r4Var, i7, j3, h6Var);
    }
}
