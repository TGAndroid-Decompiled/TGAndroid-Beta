package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
public final class am0 extends org.telegram.ui.Cells.aa {
    public final int I = 1;

    public am0(Context context, org.telegram.ui.ActionBar.s4 s4Var, int i7) {
        super(context, s4Var, i7);
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

    public am0(Context context, org.telegram.ui.ActionBar.s4 s4Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, s4Var, i7, j3, i6Var);
    }
}
